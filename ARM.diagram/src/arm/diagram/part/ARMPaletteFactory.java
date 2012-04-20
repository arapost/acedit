/*
 * 
 */
package arm.diagram.part;

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

import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class ARMPaletteFactory {

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
		paletteContainer.add(createArgument1CreationTool());
		paletteContainer.add(createArgumentReasoning2CreationTool());
		paletteContainer.add(createCitiationElement3CreationTool());
		paletteContainer.add(createClaim4CreationTool());
		paletteContainer.add(createEvidenceAssertation5CreationTool());
		paletteContainer.add(createInformationElement6CreationTool());
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
		paletteContainer.add(createAssertedContext1CreationTool());
		paletteContainer.add(createAssertedEvidence2CreationTool());
		paletteContainer.add(createAssertedInference3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgument1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Argument1CreationTool_title,
				Messages.Argument1CreationTool_desc,
				Collections.singletonList(ARMElementTypes.Argument_2006));
		entry.setId("createArgument1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.Argument_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentReasoning2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgumentReasoning2CreationTool_title,
				Messages.ArgumentReasoning2CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.ArgumentReasoning_2003));
		entry.setId("createArgumentReasoning2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.ArgumentReasoning_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCitiationElement3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CitiationElement3CreationTool_title,
				Messages.CitiationElement3CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.CitiationElement_2005));
		entry.setId("createCitiationElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.CitiationElement_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaim4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Claim4CreationTool_title,
				Messages.Claim4CreationTool_desc,
				Collections.singletonList(ARMElementTypes.Claim_2002));
		entry.setId("createClaim4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.Claim_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvidenceAssertation5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EvidenceAssertation5CreationTool_title,
				Messages.EvidenceAssertation5CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.EvidenceAssertation_2001));
		entry.setId("createEvidenceAssertation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.EvidenceAssertation_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformationElement6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InformationElement6CreationTool_title,
				Messages.InformationElement6CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.InformationElement_2004));
		entry.setId("createInformationElement6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.InformationElement_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertedContext1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssertedContext1CreationTool_title,
				Messages.AssertedContext1CreationTool_desc,
				Collections.singletonList(ARMElementTypes.AssertedContext_4002));
		entry.setId("createAssertedContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.AssertedContext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertedEvidence2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssertedEvidence2CreationTool_title,
				Messages.AssertedEvidence2CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.AssertedEvidence_4003));
		entry.setId("createAssertedEvidence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.AssertedEvidence_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertedInference3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssertedInference3CreationTool_title,
				Messages.AssertedInference3CreationTool_desc,
				Collections
						.singletonList(ARMElementTypes.AssertedInference_4001));
		entry.setId("createAssertedInference3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ARMElementTypes
				.getImageDescriptor(ARMElementTypes.AssertedInference_4001));
		entry.setLargeIcon(entry.getSmallIcon());
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
