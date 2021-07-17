package de.bund.bfr.knime.esri.pointreader;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentFileChooser;
import org.knime.core.node.defaultnodesettings.DialogComponentStringSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import de.bund.bfr.knime.esri.EsriUtils;

/**
 * <code>NodeDialog</code> for the "PointReader" Node.
 * 
 * 
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Christian Thoens
 */
public class PointReaderNodeDialog extends DefaultNodeSettingsPane {

	/**
	 * New pane for configuring the PointReader node.
	 */
	protected PointReaderNodeDialog() {
		DialogComponentFileChooser shpDialog = new DialogComponentFileChooser(
				new SettingsModelString(PointReaderNodeModel.CFG_SHP_FILE, null), "ShpFileHistory", ".shp");
		DialogComponentStringSelection charsetDialog = new DialogComponentStringSelection(
				new SettingsModelString(PointReaderNodeModel.CFG_CHARSET, PointReaderNodeModel.DEFAULT_CHARSET),
				"Character Encoding", EsriUtils.CHARSETS);

		shpDialog.setBorderTitle("SHP File");
		addDialogComponent(shpDialog);
		addDialogComponent(charsetDialog);
	}
}
