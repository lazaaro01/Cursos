import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;

class Cursos {
    private String link;
    public Cursos(String titulo, String link) {
        this.link = link;
    }
    public void abrirLink() {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(link));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Faculdade {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seja Bem-vindo ao Sistema de seleção de cursos para sua carreira acadêmica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.setLayout(new GridLayout(8,1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));


        Cursos Curso1 = new Cursos("Análise e Desenvolvimento de Sistemas", "https://unifametro.edu.br/graduacao/analise-e-desenvolvimento-de-sistemas/?modalidade=presencial");
        Cursos Cursos2 = new Cursos("Administração", "https://unifametro.edu.br/graduacao/administracao/?modalidade=presencial");
        Cursos Curso3 = new Cursos("Direito", "https://unifametro.edu.br/graduacao/direito/?modalidade=presencial");
        Cursos Cursos4 = new Cursos("Odontologia", "https://unifametro.edu.br/graduacao/odontologia/?modalidade=presencial");
        Cursos Cursos5 = new Cursos("Psicologia", "https://unifametro.edu.br/graduacao/psicologia/?modalidade=presencial");
        Cursos Cursos6 = new Cursos("Nutrição",  "https://unifametro.edu.br/graduacao/nutricao/?modalidade=presencial");
        Cursos Cursos7 = new Cursos("Medicina Veterinária", "https://unifametro.edu.br/graduacao/medicina-veterinaria/?modalidade=presencial");

        JButton button1 = new JButton("Análise e Desenvolvimento de Sistemas");
        button1.setFont(new Font("Arial", Font.BOLD,20));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Curso1.abrirLink();
            }
        });
        JButton button2 = new JButton("Administração");
        button2.setFont(new Font("Arial", Font.BOLD,20));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cursos2.abrirLink();
            }
        });
        JButton button3 = new JButton("Direito");
        button3.setFont(new Font("Arial",Font.BOLD,20));
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Curso3.abrirLink();
            }
        });
        JButton button4 = new JButton("Odontologia");
        button4.setFont(new Font("Arial",Font.BOLD,20));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cursos4.abrirLink();
            }
        });
        JButton button5 = new JButton("Psicologia");
        button5.setFont(new Font("Arial",Font.BOLD,20));
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cursos5.abrirLink();
            }
        });
        JButton button6 = new JButton("Nutirição");
        button6.setFont(new Font("Arial",Font.BOLD,20));
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cursos6.abrirLink();
            }
        });
        JButton button7 = new JButton("Medicina Veterinária");
        button7.setFont(new Font("Arial",Font.BOLD,20));
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cursos7.abrirLink();
            }
        });
        JLabel label = new JLabel("Escolha o melhor para você:");
        label.setFont(new Font("Arial", Font.BOLD,30));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label, BorderLayout.NORTH);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.setVisible(true);
    }
}