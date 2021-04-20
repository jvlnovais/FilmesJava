import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a aparencia");
        }

        JFrame frame = new JFrame("Java Theater");
        frame.setLayout(new BorderLayout());

        JPanel imagem = new JPanel();
        imagem.setLayout(new FlowLayout());
        imagem.add(new JLabel(new ImageIcon("C:\\Users\\jvlno\\Desktop\\Allahu\\Java\\AVG.png")));

        JPanel filme = new JPanel();
        MeuTextField tituloFilme = new MeuTextField();
        TextArea sinopseFilme = new TextArea();

        filme.setLayout(new GridLayout(6,0));
        filme.add(new Label("Titulo"));
        filme.add(tituloFilme);
        filme.add(new Label("Sinopse"));
        filme.add(sinopseFilme);
        filme.add(new Label("Genero"));
        String[] genero = {"Aventura" , "Ação" , "Romance"};
        filme.add(new JComboBox<String>(genero));

        JPanel cinema = new JPanel();
        CheckBox assistido = new CheckBox("Assistido");
        assistido.setSelected(true);
        StarRater avaliacaoEstrelas = new StarRater(5);

        cinema.setLayout(new GridLayout(5,0));
        cinema.add(new Label("Onde assistir"));
        List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Pirate Bay");
        MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
        cinema.add(group);
        cinema.add(assistido);
        cinema.add(new Label("Avaliação"));
        cinema.add(avaliacaoEstrelas);

        JPanel botaoPanel = new JPanel();

        JButton botao1 = new JButton("Salvar");
        JButton botao2 = new JButton("Cancelar");
        BotaoListener listener = new BotaoListener(tituloFilme, sinopseFilme, group, assistido, avaliacaoEstrelas);

        botaoPanel.setLayout(new FlowLayout());
        botao1.addActionListener(listener);
        botaoPanel.add(botao1);
        botaoPanel.add(botao2);

        frame.add(imagem, BorderLayout.LINE_START);
        frame.add(filme, BorderLayout.CENTER);
        frame.add(cinema, BorderLayout.LINE_END);
        frame.add(botaoPanel, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.pack();
    }
}