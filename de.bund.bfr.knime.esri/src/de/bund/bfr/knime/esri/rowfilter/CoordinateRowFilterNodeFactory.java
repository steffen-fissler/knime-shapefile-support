package de.bund.bfr.knime.esri.rowfilter;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "CoordinateRowFilter" Node.
 * 
 *
 * @author Christian Thoens
 */
public class CoordinateRowFilterNodeFactory extends NodeFactory<CoordinateRowFilterNodeModel> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoordinateRowFilterNodeModel createNodeModel() {
		return new CoordinateRowFilterNodeModel();
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
	public NodeView<CoordinateRowFilterNodeModel> createNodeView(final int viewIndex,
			final CoordinateRowFilterNodeModel nodeModel) {
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
		return new CoordinateRowFilterNodeDialog();
	}

}
