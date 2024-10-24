package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentFrame extends JFrame {
    private DefaultTableModel model;
    private JTable table; // Thêm bảng để hiển thị sinh viên

    public AddStudentFrame(DefaultTableModel model) {
        this.model = model; // Nhận model từ frame chính
        setTitle("Thêm Sinh Viên Mới");
        setLayout(null); // Tắt layout manager để dùng tọa độ tuyệt đối
        setSize(400, 400); // Kích thước frame
        setLocationRelativeTo(null); // Đặt frame ở giữa màn hình

        // Các trường nhập dữ liệu
        JLabel lblMSV = new JLabel("Mã sinh viên:");
        lblMSV.setBounds(20, 20, 120, 25);
        JTextField txtMSV = new JTextField();
        txtMSV.setBounds(150, 20, 200, 25);

        JLabel lblHoTen = new JLabel("Họ và tên:");
        lblHoTen.setBounds(20, 60, 120, 25);
        JTextField txtHoTen = new JTextField();
        txtHoTen.setBounds(150, 60, 200, 25);

        JLabel lblQueQuan = new JLabel("Quê quán:");
        lblQueQuan.setBounds(20, 100, 120, 25);
        JTextField txtQueQuan = new JTextField();
        txtQueQuan.setBounds(150, 100, 200, 25);

        JLabel lblLop = new JLabel("Lớp:");
        lblLop.setBounds(20, 140, 120, 25);
        JTextField txtLop = new JTextField();
        txtLop.setBounds(150, 140, 200, 25);

        JLabel lblGPA = new JLabel("GPA:");
        lblGPA.setBounds(20, 180, 120, 25);
        JTextField txtGPA = new JTextField();
        txtGPA.setBounds(150, 180, 200, 25);

        // Nút thêm
        JButton btnSubmit = new JButton("Thêm");
        btnSubmit.setBounds(150, 220, 100, 30);

        // Sự kiện khi nhấn nút thêm
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msv = txtMSV.getText().trim();
                String hoTen = txtHoTen.getText().trim();
                String queQuan = txtQueQuan.getText().trim();
                String lop = txtLop.getText().trim();
                String gpaStr = txtGPA.getText().trim();

                // Kiểm tra dữ liệu hợp lệ
                if (msv.isEmpty()) {
                    JOptionPane.showMessageDialog(AddStudentFrame.this, "Mã sinh viên không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Kiểm tra trùng mã sinh viên
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (model.getValueAt(i, 0).toString().equals(msv)) {
                        JOptionPane.showMessageDialog(AddStudentFrame.this, "Mã sinh viên đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                // Kiểm tra định dạng GPA
                double gpa;
                try {
                    gpa = Double.parseDouble(gpaStr);
                    if (gpa < 0.0 || gpa > 4.0) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AddStudentFrame.this, "GPA phải là số từ 0.0 đến 4.0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Nếu tất cả hợp lệ, thêm sinh viên mới vào bảng
                Object[] newStudent = {msv, hoTen, queQuan, lop, gpaStr};
                model.addRow(newStudent);
                JOptionPane.showMessageDialog(AddStudentFrame.this, "Thêm sinh viên thành công!");
                dispose(); // Đóng cửa sổ thêm sinh viên sau khi thêm
            }
        });

        // Thêm bảng để hiển thị sinh viên
        table = new JTable(model); // Tạo bảng với model hiện tại
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 260, 350, 100); // Đặt vị trí và kích thước cho bảng

        // Thêm các thành phần vào frame
        add(lblMSV);
        add(txtMSV);
        add(lblHoTen);
        add(txtHoTen);
        add(lblQueQuan);
        add(txtQueQuan);
        add(lblLop);
        add(txtLop);
        add(lblGPA);
        add(txtGPA);
        add(btnSubmit);
        add(scrollPane); // Thêm JScrollPane vào frame

        setVisible(true); // Hiển thị frame
    }

    public static void main(String[] args) {
        // Chạy chương trình thử nghiệm
        DefaultTableModel testModel = new DefaultTableModel(new Object[][] {}, new String[] {"Mã sinh viên", "Họ và tên", "Quê quán", "Lớp", "GPA"});
        new AddStudentFrame(testModel);
    }
}
