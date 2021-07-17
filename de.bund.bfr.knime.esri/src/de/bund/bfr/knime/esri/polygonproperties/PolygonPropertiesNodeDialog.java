package de.bund.bfr.knime.esri.polygonproperties;

import org.knime.core.data.DoubleValue;
import org.knime.core.data.collection.ListDataValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * <code>NodeDialog</code> for the "PolygonProperties" Node.
 * 
 * 
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Christian Thoens
 */
public class PolygonPropertiesNodeDialog extends DefaultNodeSettingsPane {

	/**
	 * New pane for configuring the PolygonProperties node.
	 */
	@SuppressWarnings("unchecked")
	protected PolygonPropertiesNodeDialog() {
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(PolygonPropertiesNodeModel.CFG_POLYGON_COLUMN, null), "Polygon Column", 0,
				ListDataValue.class));
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(PolygonPropertiesNodeModel.CFG_LATITUDE_COLUMN, null), "Latitude Column", 1,
				DoubleValue.class));
		addDialogComponent(new DialogComponentColumnNameSelection(
				new SettingsModelString(PolygonPropertiesNodeModel.CFG_LONGITUDE_COLUMN, null), "Longitude Column", 1,
				DoubleValue.class));
	}
}
