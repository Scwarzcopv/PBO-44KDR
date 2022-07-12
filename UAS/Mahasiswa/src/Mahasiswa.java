import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Mahasiswa {
    private JPanel Main;
    private JTextField Nama;
    private JTextField NIM;
    private JTextField Matkul;
    private JButton Hapus;
    private JButton Edit;
    private JButton Simpan;
    private JTable tabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mahasiswa");
        frame.setContentPane(new Mahasiswa().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Connection con;
    PreparedStatement pst;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mhs_intellij", "root","");
            System.out.println("Berhasil tersambung ke dbs");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }













    public Mahasiswa() {
        connect();
        Simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama, nim, matkul;
                nama = Nama.getText();
                nim = NIM.getText();
                matkul = Matkul.getText();

                try {
                    pst = con.prepareStatement("INSERT INTO mhs(nama,nim,matkul)values(?,?,?)");
                    pst.setString(1, nama);
                    pst.setString(2, nim);
                    pst.setString(3, matkul);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                    //table_load();
                    Nama.setText("");
                    NIM.setText("");
                    Matkul.setText("");
                    Nama.requestFocus();
                }

                catch (SQLException e1)
                {

                    e1.printStackTrace();
                }

            }
        });
    }
}
