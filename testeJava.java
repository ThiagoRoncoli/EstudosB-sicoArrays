import javax.swing.JOptionPane;

public class testeJava {
    public static void main(String[] args){
        String[] carros;
        String mensagemFinal = "";

        String cadastroCarros = JOptionPane.showInputDialog("Digite os nomes dos carros para cadastrar! ");
        carros = cadastroCarros.split(",");
           

        for(int i = 0; i < carros.length; i++){
            mensagemFinal += carros[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, mensagemFinal);

    }
}
