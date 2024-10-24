package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai02_MayTinh extends JFrame {
    private JLabel jLabel1, jLabel2, jLabel3;
    private JTextField jTextField1, jTextField2, jTextFieldRes;
    private JButton btnClear, btnAdd, btnSub, btnMul, btnDiv;

    public Bai02_MayTinh() {
        // Thiết lập giao diện
        setTitle("Máy Tính Bỏ Túi");
        setLayout(null); // Sử dụng layout null để tùy chỉnh vị trí
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        // Khởi tạo các thành phần giao diện
        jLabel1 = new JLabel("Số thứ nhất:");
        jLabel1.setBounds(20, 20, 100, 25);
        jTextField1 = new JTextField();
        jTextField1.setBounds(150, 20, 200, 25);

        jLabel2 = new JLabel("Số thứ hai:");
        jLabel2.setBounds(20, 60, 100, 25);
        jTextField2 = new JTextField();
        jTextField2.setBounds(150, 60, 200, 25);

        jLabel3 = new JLabel("Kết quả:");
        jLabel3.setBounds(20, 100, 100, 25);
        jTextFieldRes = new JTextField();
        jTextFieldRes.setBounds(150, 100, 200, 25);
        jTextFieldRes.setEditable(false);

        btnAdd = new JButton("Cộng");
        btnAdd.setBounds(20, 140, 80, 25);
        btnSub = new JButton("Trừ");
        btnSub.setBounds(110, 140, 80, 25);
        btnMul = new JButton("Nhân");
        btnMul.setBounds(200, 140, 80, 25);
        btnDiv = new JButton("Chia");
        btnDiv.setBounds(290, 140, 80, 25);
        btnClear = new JButton("Xóa");
        btnClear.setBounds(150, 180, 80, 25);

        // Thêm các thành phần vào JFrame
        add(jLabel1);
        add(jTextField1);
        add(jLabel2);
        add(jTextField2);
        add(jLabel3);
        add(jTextFieldRes);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(btnClear);

        // Sự kiện cho các nút
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextFieldRes.setText("");
            }
        });
        // Hiển thị cửa sổ
        setVisible(true);
    }

    private void calculate(char operator) {
        try {
            double num1 = Double.parseDouble(jTextField1.getText());
            double num2 = Double.parseDouble(jTextField2.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Không thể chia cho 0.");
                    }
                    result = num1 / num2;
                    break;
            }

            // Kiểm tra kết quả có lớn hơn 18 chữ số hay không
            if (String.valueOf(result).length() > 18) {
                throw new Exception("Kết quả lớn hơn 18 chữ số.");
            }

            jTextFieldRes.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Bai02_MayTinh();
    }
}
