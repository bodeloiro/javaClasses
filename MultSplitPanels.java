package projetoSplitPainel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JSplitPane;

public class MultSplitTabs extends JSplitPane{
	private ArrayList<JSplitPane> splitPaneEncapList = new ArrayList<JSplitPane>();
	private int numeroDeComponentes = 1;
	private int size = 6;
	
	public MultSplitTabs() {
		super();
		this.setLeftComponent(null);
		splitPaneEncapList.add(this);
		setBordas(size);
		

	}
	
	public void addComponent(Component comp){
		JSplitPane capsule = new JSplitPane();
		
		capsule.setRightComponent(null);
		capsule.setLeftComponent(comp);
		
		splitPaneEncapList.get(splitPaneEncapList.size() - 1).setRightComponent(capsule);
		splitPaneEncapList.add(capsule);
		numeroDeComponentes++;
		ajusta();
		setBordas(size);
	}
	
	public void setOrientacao(int orientation) {
		for (int i = 0; i < splitPaneEncapList.size(); i++) {
			splitPaneEncapList.get(i).setOrientation(orientation);
			
		}
	}
	
	public void ajusta(){
		splitPaneEncapList.get(0).setResizeWeight(1.0);
		for (int i = 1; i < numeroDeComponentes; i++) {
			double resize = (double)1 / (double)(i + 1);
			splitPaneEncapList.get(numeroDeComponentes - i -1).setResizeWeight(resize);
			
		}
		splitPaneEncapList.get(numeroDeComponentes - 1).setResizeWeight(0.0);
	}
	
	public void setBordas(int newSize){
		this.setDividerSize(newSize);
		for (int i = 0; i < splitPaneEncapList.size(); i++) {
			splitPaneEncapList.get(i).setDividerSize(newSize);
			splitPaneEncapList.get(i).setBorder(null);
			
		}
		
		
	}
	
	
	
}
