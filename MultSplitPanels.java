package projetoSplitPainel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JSplitPane;

/**
 * This Components is based on the JSplitPane. JSplitPane is used to divide two
 * (and only two) Components. This class intend to manipulate the JSplitPane in
 * a way that can be placed as many Component as wanted.
 * 
 * @author Bode
 *
 */
public class JSplitPaneMultiTabs extends JSplitPane {
	private ArrayList<JSplitPane> ecanpsulationList = new ArrayList<JSplitPane>();
	private int numberOfComponents = 1;
	private int sizeOfDivision = 6;

	/**
	 * Builds the Pane
	 */
	public JSplitPaneMultiTabs() {
		super();
		this.setLeftComponent(null);
		this.setBorder(null);
		ecanpsulationList.add(this);
		setAllBorders(sizeOfDivision);
	}

	/**
	 * 
	 * @param comp - adds a Component to the Pane
	 */
	public void addComponent(Component comp) {
		JSplitPane capsule = new JSplitPane();

		capsule.setRightComponent(null);
		capsule.setLeftComponent(comp);
		capsule.setDividerSize(sizeOfDivision);
		capsule.setBorder(null);

		ecanpsulationList.get(numberOfComponents - 1).setRightComponent(capsule);
		ecanpsulationList.add(capsule);
		numberOfComponents++;
		this.fixWeights();
	}

	/**
	 * 
	 * @param orientation
	 *            JSplitPane.HORIZONTAL_SPLIT - sets the orientation of the
	 *            Components to horizontal alignment
	 * @param orientation
	 *            JSplitPane.VERTICAL_SPLIT - sets the orientation of the
	 *            Components to vertical alignment
	 */
	public void setAlignment(int orientation) {
		for (int i = 0; i < numberOfComponents; i++) {
			ecanpsulationList.get(i).setOrientation(orientation);

		}
	}

	/**
	 * 
	 * @param newSize - resizes the borders of the all the Components of the Screen
	 */
	public void setAllBorders(int newSize) {
		this.setDividerSize(newSize);
		for (int i = 0; i < numberOfComponents; i++) {
			ecanpsulationList.get(i).setDividerSize(newSize);
		}

	}

	/**
	 * each Component added needs to be readapteded to the screen
	 */
	private void fixWeights() {
		ecanpsulationList.get(0).setResizeWeight(1.0);
		for (int i = 1; i < numberOfComponents; i++) {
			double resize = (double) 1 / (double) (i + 1);
			ecanpsulationList.get(numberOfComponents - i - 1).setResizeWeight(
					resize);
		}
		ecanpsulationList.get(numberOfComponents - 1).setResizeWeight(0.0);
	}

}
