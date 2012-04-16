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
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createArgumentModule1CreationTool());
		paletteContainer.add(createAssumption2CreationTool());
		paletteContainer.add(createContext3CreationTool());
		paletteContainer.add(createContract4CreationTool());
		paletteContainer.add(createGoal5CreationTool());
		paletteContainer.add(createJustification6CreationTool());
		paletteContainer.add(createSolution7CreationTool());
		paletteContainer.add(createStrategy8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInContextOf1CreationTool());
		paletteContainer.add(createSolvedBy2CreationTool());
		paletteContainer.add(createSolvedUsingContract3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentModule1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgumentModule1CreationTool_title,
				Messages.ArgumentModule1CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.ArgumentModule_2008));
		entry.setId("createArgumentModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1ElementTypes
				.getImageDescriptor(GSN1ElementTypes.ArgumentModule_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumption2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Assumption2CreationTool_title,
				Messages.Assumption2CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Assumption_2006));
		entry.setId("createAssumption2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Assumption.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Assumption.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Context3CreationTool_title,
				Messages.Context3CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Context_2004));
		entry.setId("createContext3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Context.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Context.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContract4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Contract4CreationTool_title,
				Messages.Contract4CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Contract_2007));
		entry.setId("createContract4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1ElementTypes
				.getImageDescriptor(GSN1ElementTypes.Contract_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Goal5CreationTool_title,
				Messages.Goal5CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Goal_2001));
		entry.setId("createGoal5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Goal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Goal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustification6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Justification6CreationTool_title,
				Messages.Justification6CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Justification_2005));
		entry.setId("createJustification6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Justification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Justification.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolution7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Solution7CreationTool_title,
				Messages.Solution7CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Solution_2003));
		entry.setId("createSolution7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Solution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Solution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategy8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Strategy8CreationTool_title,
				Messages.Strategy8CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.Strategy_2002));
		entry.setId("createStrategy8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Strategy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/Strategy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInContextOf1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InContextOf1CreationTool_title,
				Messages.InContextOf1CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.InContextOf_4003));
		entry.setId("createInContextOf1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/inTheContextOf.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolvedBy2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolvedBy2CreationTool_title,
				Messages.SolvedBy2CreationTool_desc,
				Collections.singletonList(GSN1ElementTypes.SolvedBy_4002));
		entry.setId("createSolvedBy2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolvedUsingContract3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolvedUsingContract3CreationTool_title,
				Messages.SolvedUsingContract3CreationTool_desc,
				Collections
						.singletonList(GSN1ElementTypes.SolvedUsingContract_4001));
		entry.setId("createSolvedUsingContract3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GSN1DiagramEditorPlugin
				.findImageDescriptor("/GSN/GSN_tooling_icons/solvedBy.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
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
