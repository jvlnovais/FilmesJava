import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
	
    private static final long serialVersionUID = 1L;

    private int size = 18;
    private Color cor = new Color(0,0,0);

    public Label(String texto) {
        super(texto);
        init();
    }

    private void init() {        
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(cor);        
        this.setFont(new Font(null, Font.BOLD,size));
    }


}