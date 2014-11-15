import java.awt.Color;  
import java.awt.Component;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import java.awt.Insets;  
import javax.swing.BorderFactory;  
import javax.swing.JPanel;  
 /**
  * Class that gerenerates a panel with Grid Bag Layout Sytem
  * If you want help me to improve it, I would love it.
  * @author bodeloiro
  *
  */
public class PanelGridBagLayout extends JPanel {  
  
    // Definição do Layout e constraints do Layout  
	//Definition of Layout and layout constraints
    private GridBagLayout layout;  
    private GridBagConstraints constraints;  
    public final int horizontal = GridBagConstraints.HORIZONTAL;  
    public final int both = GridBagConstraints.BOTH;  
  
    //Construtor do objeto (como o mesmo nome da classe) 
    //Object Constructor (same names sa the class)
    public PanelGridBagLayout(){  
  
       layout = new GridBagLayout();  
       setLayout(layout);  
       constraints = new GridBagConstraints();  
       constraints.weightx = 0;  
       constraints.weighty = 0;  
       constraints.insets = new Insets(5,5,5,5);  
    }  
  
    // Método que posiciona o componente no Frame  
    // Method to place the component on the Frame
    public void addComponent(Component comp, int row, int column, int width, int height, int fill){  
        constraints.fill = fill;  
        constraints.gridx = column;  
        constraints.gridy = row;  
        constraints.gridwidth = width;  
        constraints.gridheight = height;
        layout.setConstraints(comp, constraints);  
        add(comp);  
    }  


	// Método que define a borda do Frame  
    // Method to define the Frame border
    public void setBorda(Color color, int thickness){  
        setBorder(BorderFactory.createLineBorder(color, thickness));  
    } 
    
    // Método que redefine os pesos x, y
    // Method to redefine the x, y weights
    public void setConstraintsWeight(double weightx, double weighty){
    	constraints.weightx = weightx;  
        constraints.weighty = weighty; 
    }
    
    //Método que redefine as distancias dentro da célula
    //Method to redefine the distances inside the cells
    public void setConstraintsInsets(int top, int left, int bottom, int right){
    	constraints.insets = new Insets(top, left, bottom, right);
    }
  
}  
