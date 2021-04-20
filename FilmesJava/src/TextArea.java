import javax.swing.*;

public class TextArea extends JTextArea {

    private static final long serialVersionUID = 1L;

    private int colunas = 10;
    private int linhas = 3;

    public TextArea() {
        super();
        init();
    }

    private void init() {
        this.setColumns(colunas);
        this.setRows(linhas);
        this.setBorder(BorderFactory.criar());
    }
}