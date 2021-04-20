import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotaoListener implements ActionListener, MouseListener {
    private MeuTextField tituloFilme;
    private TextArea sinopseFilme;
    private MeuRadioGroup group;
    private CheckBox assistido;
    private StarRater avaliacaoEstrelas;

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Título do filme: " + tituloFilme.getText() + "\nSinopse do Filme: " + sinopseFilme.getText()
        + "\nOnde assistir: " + group.getName() + "\nAssistido: " + assistido.getActionCommand() + "\nAvaliação: " + avaliacaoEstrelas.getSelection());
    }


    public BotaoListener(MeuTextField tituloFilme, TextArea sinopseFilme, MeuRadioGroup group, CheckBox assistido, StarRater avaliacaoEstrelas){
        this.tituloFilme = tituloFilme;
        this.sinopseFilme = sinopseFilme;
        this.group = group;
        this.assistido = assistido;
        this.avaliacaoEstrelas = avaliacaoEstrelas;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse in");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse out");
    }
}