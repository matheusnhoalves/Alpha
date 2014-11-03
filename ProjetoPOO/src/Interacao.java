import javax.swing.*;
import java.util.*;

public class Interacao {
	Scanner ler = new Scanner(System.in);
	
	public void exibirMSG(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void lerResp(){
		ler.nextLine();
	}
	
}
