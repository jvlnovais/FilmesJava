import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FilmesJava {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a aparencia");
        }
        JFrame frame = new JFrame();

        JPanel janela = new JPanel();
        janela.setLayout(new FlowLayout());

        janela.add(new TextArea());
        janela.add(new CheckBox("Aceito os termos do contrato"), BorderLayout.SOUTH);

        List<String> listaDeOpcoes = List.of("Boleto", "Cartão");
        MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
        janela.add(group);

        String[] cidades = {"São Paulo" , "Osasco" , "Diadema"};
        janela.add(new JComboBox<String>(cidades));

        janela.add(new StarRater(5));

        JButton botao = new JButton("Salvar");
        JPanel painelBotao = new JPanel(new FlowLayout());
        painelBotao.add(botao);

        JPanel cadastro = new JPanel();
        cadastro.add(new JLabel(new ImageIcon("C:\\Users\\jvlno\\Desktop\\Allahu\\Java\\Geralt.png")));

        JTabbedPane abas = new JTabbedPane();
        abas.add("Meu App", janela);
        abas.add("Cadastro", cadastro);
        abas.add("Perfil", painelBotao);
        frame.add(abas);

      
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       
        frame.setSize(1000,600);
        frame.setVisible(true);
    }
}