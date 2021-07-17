package de.bund.bfr.knime.esri.rowfilter;

import org.knime.core.data.DoubleValue;
import org.knime.core.data.collection.ListDataValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * <code>NodeDialog</code> for the "CoordinateRowFilter" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Christian Thoens
 */
public class CoordinateRowFilterNodeDialog extends DefaultNodeSettingsPane {

	/**
	 * New pane for configuring the CoordinateRowFilter node.
	 */
	@SuppressWarnings("unchecked")
	protected CoordinateRowFilterNodeDialog() {
		createNewGroup("Coordinates to filter");
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(CoordinateRowFilterNodeModel.CFG_LATITUDE_COLUMN, null), "Latitude Column", 0,
				DoubleValue.class));
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(CoordinateRowFilterNodeModel.CFG_LONGITUDE_COLUMN, null), "Longitude Column", 0,
				DoubleValue.class));
		createNewGroup("Polygon");
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(CoordinateRowFilterNodeModel.CFG_POLYGON_COLUMN, null), "Polygon Column", 1,
				ListDataValue.class));
		createNewGroup("Polygon Coordinates");
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(CoordinateRowFilterNodeModel.CFG_POLYGON_LATITUDE_COLUMN, null),
				"Latitude Column", 2, DoubleValue.class));
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(CoordinateRowFilterNodeModel.CFG_POLYGON_LONGITUDE_COLUMN, null),
				"Longitude Column", 2, DoubleValue.class));
	}
}
