import javax.swing.JOptionPane;

public class CursoJava2 {
    
    public static void main(String[] args){
// array de vetor
        String [] nomes;
        // Entrada para o usuario informar o tamanho do vetor
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array: "));
        nomes = new String[tamanho];
        for(int contador =  0; contador < nomes.length; contador++){
        nomes[contador] = JOptionPane.showInputDialog("Digite o nome: ");
        }

        for(int contador = 0; contador < nomes.length; contador++){
            JOptionPane.showMessageDialog(null, nomes[contador]);
        }

        // System.out.print("Os nomes foram: \n");
        /* 
        isso pede uma entrada para o usuario digitar o nome! 
        nomes[1] = JOptionPane.showInputDialog("Digite o segundo nome: ");  
        nomes[2] = JOptionPane.showInputDialog("Digite o terceiro nome: ");
        nomes[3] = JOptionPane.showInputDialog("Digite o quarto nome: ");
        nomes[4] = JOptionPane.showInputDialog("Digite o quinto nome: ");
        System.out.print("Os nomes foram: \n");
        for(int i = 0; i < nomes.length; i++){
        System.out.println(nomes[i]);
        }
        */
        
    /*array de matriz 
    Usamos dois [] pois cada um defini uma dimensão da matriz
    sendo linha coluna, por isso dois. LINHA | COLUNA
    String nomesClientes[][];
    nomesClientes = new String[2][2];
    nomesClientes[0][0] = "Joâo";
    nomesClientes[0][1] = "Thiago";
    nomesClientes[1][0] = "Paula";
    nomesClientes[1][1] = "Ana";
    */

}


}
