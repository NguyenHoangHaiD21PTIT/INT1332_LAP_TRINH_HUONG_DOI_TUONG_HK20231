package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Bai01_CacThanhPhanCoBan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BÀI TẬP");
        //Phần 1: Tạo khung cơ bản
        frame.setSize(300, 200);//Kích thước khung
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Khung tắt thì chương trình dừng
        frame.setLocationRelativeTo(null);//Căn giữa
        frame.setLayout(null);
        frame.setVisible(true);//Hiện hình
        //Phần 2: Button
//        JButton btn = new JButton("OK");
//        btn.setBounds(50, 20, 100, 30);
//        frame.add(btn);
//        JButton btn2 = new JButton("OK2");
//        btn2.setBounds(50, 60, 100, 30);
//        frame.add(btn2);
//        frame.setLayout(null);
//        //Phần 3: Xử lý sự kiện
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("OK001");
//            }
//        });
        //Phần 4: Nhãn
//        JLabel lbl = new JLabel("Tên đăng nhập");
//        lbl.setBounds(50, 50, 100, 30);
//        frame.add(lbl);
//        JLabel lbl2 = new JLabel("Mật khẩu");
//        lbl2.setBounds(50, 100, 100, 30);
//        frame.add(lbl2);
//        //Phần 5: TextField
//        JTextField dn = new JTextField("");
//        JTextField mk = new JTextField();
//        dn.setBounds(200, 50, 100, 30);
//        mk.setBounds(200, 100, 100, 30);
//        frame.add(dn);
//        frame.add(mk);
//        
//        JButton login = new JButton("OK");
//        login.setBounds(150, 150, 100, 30);
//        frame.add(login);
//        login.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(dn.getText());
//                System.out.println(mk.getText());
//            }
//        });
        //Phần 6: Text Area
//        JTextArea jta = new JTextArea();
//        jta.setBounds(50, 50, 200, 100);
//        frame.add(jta);
//        jta.setLineWrap(true);//Tự động xuống dòng khi văn bản không đủ chỗ
//        jta.setWrapStyleWord(true);//Nếu từ đó không đủ chỗ để viết thi tự xuống cả từ

        //Phần 7: Trường password
        JPasswordField jpf = new JPasswordField();
        jpf.setBounds(50, 50, 150, 30);
        frame.add(jpf);
        
        JButton btn2 = new JButton("OK2");
        btn2.setBounds(50, 100, 100, 30);
        frame.add(btn2);
        //Phần 8: JOptionPane
        JOptionPane jop = new JOptionPane();
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = String.valueOf(jpf.getPassword());
                if(s.equals("123")) JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
                else JOptionPane.showMessageDialog(frame, "Sai tài khoản hoặc mật khẩu");
            }
        }); 
    }
}
