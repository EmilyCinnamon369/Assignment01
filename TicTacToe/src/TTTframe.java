import javax.swing.*;
import java.awt.*;

public class TTTframe extends JFrame {

    private static final int ROW = 3;
    private static final int COL = 3;
    private static String[][] board = new String[ROW][COL];

    public TTTframe() {

        /* Frame Setup + Fonts */
        setTitle("Fortune Teller");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.BOLD, 56);
        Font f2 = new Font("Times New Roman", Font.PLAIN, 18);
        Font f3 = new Font("Times New Roman", Font.PLAIN, 14);

        JButton butt1a = new JButton(" ");
        butt1a.setBounds(40, 515, 200, 25);
        butt1a.setFont(f1);

        JButton butt1b = new JButton(" ");
        butt1b.setBounds(40, 515, 200, 25);
        butt1b.setFont(f1);

        JButton butt1c = new JButton(" ");
        butt1c.setBounds(40, 515, 200, 25);
        butt1c.setFont(f1);

        JButton butt2a = new JButton(" ");
        butt2a.setBounds(40, 515, 200, 25);
        butt2a.setFont(f1);

        JButton butt2b = new JButton(" ");
        butt2b.setBounds(40, 515, 200, 25);
        butt2b.setFont(f1);

        JButton butt2c = new JButton(" ");
        butt2c.setBounds(40, 515, 200, 25);
        butt2c.setFont(f1);

        JButton butt3a = new JButton(" ");
        butt3a.setBounds(40, 515, 200, 25);
        butt3a.setFont(f1);

        JButton butt3b = new JButton(" ");
        butt3b.setBounds(40, 515, 200, 25);
        butt3b.setFont(f1);

        JButton butt3c = new JButton(" ");
        butt3c.setBounds(40, 515, 200, 25);
        butt3c.setFont(f1);


    }
}