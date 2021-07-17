package de.bund.bfr.knime.esri.polygonreader;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "EsriShapefileReader" Node.
 * 
 * 
 * @author Christian Thoens
 */
public class PolygonReaderNodeFactory extends NodeFactory<PolygonReaderNodeModel> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PolygonReaderNodeModel createNodeModel() {
		return new PolygonReaderNodeModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNrNodeViews() {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodeView<PolygonReaderNodeModel> createNodeView(final int viewIndex,
			final PolygonReaderNodeModel nodeModel) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean hasDialog() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodeDialogPane createNodeDialogPane() {
		return new PolygonReaderNodeDialog();
	}

}
