package myeditorapp;

import javax.swing.*;

public class About extends JFrame {

    About() {
        setBounds(100, 100, 500, 400);
        setTitle("About My Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("content-creator.png"));
        setIconImage(icon.getImage());
        setLayout(null);
        
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("content-creator.png")));
        iconLabel.setBounds(100, 50, 80, 80);
        add(iconLabel);
        
        JLabel textLabel=new JLabel("<html>Welcome</html>");
        textLabel.setBounds(100,50,400,300);
        add(textLabel);

    }

    public static void main(String args[]) {
        new About().setVisible(true);

    }

}
