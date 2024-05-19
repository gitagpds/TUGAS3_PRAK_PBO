package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainPage extends JFrame implements ActionListener {
    JLabel judul = new JLabel("Data Mahasiswa dan Dosen");
    JButton tombolMahasiswa = new JButton("Mahasiswa");
    JButton tombolDosen = new JButton("Dosen");

    public MainPage() {
        setVisible(true);
        setSize(400, 250);
        setTitle("Main Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(70, 20, 400, 30);
        judul.setFont(new Font("Serif", Font.BOLD, 20));
        
        add(tombolMahasiswa);
        tombolMahasiswa.setBounds(30, 80, 330, 35);
        tombolMahasiswa.setBackground(Color.white);
        tombolMahasiswa.addActionListener(this);
        
        add(tombolDosen);
        tombolDosen.setBounds(30, 125, 330, 35);
        tombolDosen.setBackground(Color.white);
        tombolDosen.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolMahasiswa) {
            new View.Mahasiswa.ViewData();
            this.dispose();
        } else if (e.getSource() == tombolDosen) {
            new View.Dosen.ViewData();
            this.dispose();
        }
      
    }

}
