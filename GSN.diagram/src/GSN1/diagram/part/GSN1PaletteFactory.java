/*
 * 
 */
package GSN1.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class GSN1PaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGSNcore1Group());
		paletteRoot.add(createGSNrelationships2Group());
		paletteRoot.add(createGSNmodularextensions3Group());
	}

	/**
	 * Creates "GSN core" palette tool group
	 * @generated
	 */
	private PaletteContainer createGSNcore1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.GSNcore1Group_title);
		paletteContainer.setId("createGSNcore1Group"); //$NON-NLS-1$
		paletteContainer.add(createAssumption1CreationTool());
		paletteContainer.add(createContext2CreationTool());
		paletteContainer.add(createGoal3CreationTool());
		paletteContainer.add(createJustification4CreationTool());
		paletteContainer.add(createSolution5CreationTool());
		paletteContainer.add(createStrategy6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "GSN relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createGSNrelationships2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.GSNrelationships2Group_title);
		paletteContainer.setId("createGSNrelationships2Group"); //$NON-NLS-1$
		paletteContainer.add(createSolvedBy1CreationTool());
		paletteContainer.add(createInContextOf2CreationTool());
		paletteContainer.add(createSolvedByModular3CreationTool());
		paletteContainer.add(createInContextOfModular4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "GSN modular extensions" palette tool group
	 * @generated
	 */
	private PaletteContainer createGSNmodularextensions3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.GSNmodularextensions3Group_title);
		paletteContainer.setId("createGSNmodularextensions3Group"); //$NON-NLS-1$
		paletteContainer.add(createArgumentModule1CreationTool());
		paletteContainer.add(createContractModule2CreationTool());
		paletteContainer.add(createAwayGoal3CreationTool());
		paletteContainer.add(createAwaySolution4CreationTool());
		paletteContainer.add(createAwayContext5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumption1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Assumption1CreationTool_title,
				Messages.Assumption1CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Assumption_2007));
		entry.setId("createAssumption1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Assumption.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Assumption.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Context2CreationTool_title,
				Messages.Context2CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Context_2005));
		entry.setId("createContext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Context.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Context.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Goal3CreationTool_title,
				Messages.Goal3CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Goal_2001));
		entry.setId("createGoal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Goal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Goal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustification4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Justification4CreationTool_title,
				Messages.Justification4CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Justification_2006));
		entry.setId("createJustification4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Justification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Justification.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolution5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Solution5CreationTool_title,
				Messages.Solution5CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Solution_2004));
		entry.setId("createSolution5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Solution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Solution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategy6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Strategy6CreationTool_title,
				Messages.Strategy6CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Strategy_2002));
		entry.setId("createStrategy6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Strategy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Strategy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolvedBy1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolvedBy1CreationTool_title,
				Messages.SolvedBy1CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.SolvedBy_4003));
		entry.setId("createSolvedBy1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInContextOf2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InContextOf2CreationTool_title,
				Messages.InContextOf2CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.InContextOf_4004));
		entry.setId("createInContextOf2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolvedByModular3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolvedByModular3CreationTool_title,
				Messages.SolvedByModular3CreationTool_desc,
				Collections
						.singletonList(GSN1ElementTypes.SolvedByModular_4001));
		entry.setId("createSolvedByModular3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInContextOfModular4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InContextOfModular4CreationTool_title,
				Messages.InContextOfModular4CreationTool_desc,
				Collections
						.singletonList(GSN1ElementTypes.InContextOfModular_4002));
		entry.setId("createInContextOfModular4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentModule1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgumentModule1CreationTool_title,
				Messages.ArgumentModule1CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.ArgumentModule_2010));
		entry.setId("createArgumentModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/ArgumentModule.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/ArgumentModule.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContractModule2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContractModule2CreationTool_title,
				Messages.ContractModule2CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.ContractModule_2011));
		entry.setId("createContractModule2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Contract.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Contract.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAwayGoal3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AwayGoal3CreationTool_title,
				Messages.AwayGoal3CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.AwayGoal_2003));
		entry.setId("createAwayGoal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwayGoal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwayGoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAwaySolution4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AwaySolution4CreationTool_title,
				Messages.AwaySolution4CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.AwaySolution_2009));
		entry.setId("createAwaySolution4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwaySolution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwaySolution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAwayContext5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AwayContext5CreationTool_title,
				Messages.AwayContext5CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.AwayContext_2008));
		entry.setId("createAwayContext5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwayContext.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/AwayContext.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	@SuppressWarnings("restriction")
	private static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
