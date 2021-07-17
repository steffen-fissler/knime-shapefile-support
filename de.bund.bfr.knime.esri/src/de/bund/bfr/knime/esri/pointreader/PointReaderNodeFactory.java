package de.bund.bfr.knime.esri.pointreader;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "PointReader" Node.
 * 
 * 
 * @author Christian Thoens
 */
public class PointReaderNodeFactory extends NodeFactory<PointReaderNodeModel> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PointReaderNodeModel createNodeModel() {
		return new PointReaderNodeModel();
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
	public NodeView<PointReaderNodeModel> createNodeView(final int viewIndex, final PointReaderNodeModel nodeModel) {
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
		return new PointReaderNodeDialog();
	}

}
