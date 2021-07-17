package de.bund.bfr.knime.esri.polygonproperties;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "PolygonProperties" Node.
 * 
 * 
 * @author Christian Thoens
 */
public class PolygonPropertiesNodeFactory extends NodeFactory<PolygonPropertiesNodeModel> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PolygonPropertiesNodeModel createNodeModel() {
		return new PolygonPropertiesNodeModel();
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
	public NodeView<PolygonPropertiesNodeModel> createNodeView(final int viewIndex,
			final PolygonPropertiesNodeModel nodeModel) {
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
		return new PolygonPropertiesNodeDialog();
	}

}
