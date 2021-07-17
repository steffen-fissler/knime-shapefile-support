package de.bund.bfr.knime.esri.polygonreader;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentBoolean;
import org.knime.core.node.defaultnodesettings.DialogComponentFileChooser;
import org.knime.core.node.defaultnodesettings.DialogComponentOptionalString;
import org.knime.core.node.defaultnodesettings.DialogComponentStringSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelBoolean;
import org.knime.core.node.defaultnodesettings.SettingsModelOptionalString;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import de.bund.bfr.knime.esri.EsriUtils;

/**
 * <code>NodeDialog</code> for the "PolygonReader" Node.
 * 
 * @author Christian Thoens
 */
public class PolygonReaderNodeDialog extends DefaultNodeSettingsPane implements ChangeListener {

	private DialogComponentFileChooser shpDialog;
	private DialogComponentOptionalString idPrefixDialog;
	private DialogComponentBoolean exteriorDialog;
	private DialogComponentBoolean splitDialog;
	private DialogComponentStringSelection charsetDialog;

	/**
	 * New pane for configuring the PolygonReader node.
	 */
	protected PolygonReaderNodeDialog() {
		shpDialog = new DialogComponentFileChooser(new SettingsModelString(PolygonReaderNodeModel.CFG_SHP_FILE, null),
				"ShpFileHistory", ".shp");
		shpDialog.setBorderTitle("SHP File");
		idPrefixDialog = new DialogComponentOptionalString(
				new SettingsModelOptionalString(PolygonReaderNodeModel.CFG_ROW_ID_PREFIX, null, false),
				"Row ID Prefix");
		exteriorDialog = new DialogComponentBoolean(
				new SettingsModelBoolean(PolygonReaderNodeModel.CFG_GET_EXTERIOR_POLYGON,
						PolygonReaderNodeModel.DEFAULT_GET_EXTERIOR_POLYGON),
				"Get Exterior Ring of Polygons");
		exteriorDialog.getModel().addChangeListener(this);
		splitDialog = new DialogComponentBoolean(
				new SettingsModelBoolean(PolygonReaderNodeModel.CFG_SPLIT_POLYGONS_WITH_HOLES,
						PolygonReaderNodeModel.DEFAULT_SPLIT_POLYGONS_WITH_HOLES),
				"Split Polygons to Remove Holes");
		splitDialog.getModel().addChangeListener(this);
		charsetDialog = new DialogComponentStringSelection(
				new SettingsModelString(PolygonReaderNodeModel.CFG_CHARSET, PolygonReaderNodeModel.DEFAULT_CHARSET),
				"Character Encoding", EsriUtils.CHARSETS);

		addDialogComponent(shpDialog);
		addDialogComponent(idPrefixDialog);
		addDialogComponent(exteriorDialog);
		addDialogComponent(splitDialog);
		addDialogComponent(charsetDialog);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		exteriorDialog.getModel().removeChangeListener(this);
		splitDialog.getModel().removeChangeListener(this);

		splitDialog.getModel().setEnabled(!exteriorDialog.isSelected());

		exteriorDialog.getModel().addChangeListener(this);
		splitDialog.getModel().addChangeListener(this);
	}
}
