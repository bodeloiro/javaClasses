import javax.swing.*;     

import java.awt.*;     
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;      
    
public class Driver extends JFrame implements ActionListener{     

	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4;   
    private JLabel l1;     
    
    public Driver(){     
        setTitle("ACADEMIA FORÇA ATIVA");       
        getContentPane().setBackground(Color.CYAN);   
    
        // define o layout  
       setContentPane(getPainel()); 
       // Substitui o setSize e o setLocation   
       setBounds(400,200,700,500);  
       setVisible(true);        
         
    }  
      
    // Método que vai diagramar os componentes  
    private PanelGridBagLayout getPainel(){  
       PanelGridBagLayout container = new PanelGridBagLayout();        
       l1 = new JLabel ("ACADEMIA FORÇA ATIVA",SwingConstants.CENTER);  
       l1.setForeground(Color.red);     
  
       // Adiciona o "l1" na linha 0, coluna 0, ocupando 3 colunas e 1 linha de forma horizontal  
       container.addComponent(l1,0,0,3,1,container.horizontal);  
  
       b1 = new JButton("CADASTRAR ALUNOS");  
       b1.addActionListener(this);  
       // Adiciona o "b1" na linha 1, coluna 0, ocupando 1 coluna e 1 linha de forma horizontal  
       //container.addComponent(b1,1,0,1,1,container.horizontal); 
       container.addComponent(b1,1,0,1,1,container.horizontal);
            
       b2 = new JButton("FAZER CONSULTAS");  
       b2.addActionListener(this);  
       // Adiciona o "b2" na linha 2, coluna 0, ocupando 1 coluna e 1 linha de forma horizontal  
       container.addComponent(b2,2,1,1,1,container.horizontal);  
     
       b3 = new JButton("EXIBIR RELATÓRIOS");  
       b3.addActionListener(this);  
       // Adiciona o "b3" na linha 3, coluna 0, ocupando 1 coluna e 1 linha de forma horizontal  
       container.addComponent(b3,3,1,1,1,container.horizontal);  
     
       b4 = new JButton("SAIR DO SISTEMA");  
       b4.addActionListener(this);  
       // Adiciona o "b4" na linha 4, coluna 0, ocupando 1 coluna e 1 linha de forma horizontal  
       container.addComponent(b4,4,2,1,1,container.horizontal);  
  
       // Define a borda  
       container.setBorda(new Color(0,0,0), 3);  
         
       // retorna o layout montado do frame  
       return container;  
    }
    public static void main(String[] args){
    	Driver janela = new Driver();
    	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b4){
			System.out.println("Apertou o b4");
			
		}else if(e.getSource() == b3){
			System.out.println("Apertou o b3");
			
		}else if(e.getSource() == b2){
			System.out.println("Apertou o b2");
			
		}else if(e.getSource() == b1){
			System.out.println("Apertou o b1");
			
		}
		
	}     
}    
