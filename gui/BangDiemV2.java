package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class BangDiemV2 {
    private static DefaultTableModel model;
    private static JTable table;
    public static void main(String[] args) {
        JFrame frame = new JFrame("BẢNG ĐIỂM");
        frame.setLayout(null); // Tắt layout manager để dùng tọa độ tuyệt đối
        // Tạo tiêu đề cột
        String[] col = {"Mã sinh viên", "Họ và tên", "Quê quán", "Lớp", "GPA"};
        // Tạo dữ liệu cho bảng
        Object[][] rows = {
            {"B21DCCN001", "Nguyễn Văn A1", "Hà Nội", "D21HTTT1", "3.3"},
            {"B21DCCN002", "Nguyễn Văn A2", "Hồ Chí Minh", "D21HTTT2", "3.5"},
            {"B21DCCN003", "Nguyễn Văn A3", "Đà Nẵng", "D21HTTT3", "2.8"},
            {"B21DCCN004", "Nguyễn Văn A4", "Hải Phòng", "D21HTTT4", "3.9"},
            {"B21DCCN005", "Nguyễn Văn A5", "Cần Thơ", "D21HTTT5", "3.2"},
            {"B21DCCN006", "Nguyễn Văn A6", "Huế", "D21HTTT6", "3.4"},
            {"B21DCCN007", "Nguyễn Văn A7", "Nha Trang", "D21HTTT1", "3.1"},
            {"B21DCCN008", "Nguyễn Văn A8", "Buôn Ma Thuột", "D21HTTT2", "3.7"},
            {"B21DCCN009", "Nguyễn Văn A9", "Vũng Tàu", "D21HTTT3", "3.6"},
            {"B21DCCN010", "Nguyễn Văn A10", "Bình Dương", "D21HTTT4", "2.9"},
            {"B21DCCN011", "Nguyễn Văn A11", "Bình Phước", "D21HTTT5", "3.0"},
            {"B21DCCN012", "Nguyễn Văn A12", "Phú Thọ", "D21HTTT6", "3.8"},
            {"B21DCCN013", "Nguyễn Văn A13", "Lào Cai", "D21HTTT4", "2.7"},
            {"B21DCCN014", "Nguyễn Văn A14", "Yên Bái", "D21HTTT2", "3.1"},
            {"B21DCCN015", "Nguyễn Văn A15", "Quảng Ninh", "D21HTTT3", "3.5"},
        };
        // Sử dụng DefaultTableModel để quản lý dữ liệu bảng
        model = new DefaultTableModel(rows, col);
        table = new JTable(model);

        // Thêm JScrollPane để chứa JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 450, 250); // Đặt vị trí và kích thước cho bảng

        // Tạo nút "Xóa Sinh Viên"
        JButton btnDelete = new JButton("Xóa Sinh Viên");
        btnDelete.setBounds(200, 400, 120, 30); // Đặt vị trí và kích thước cho nút

        // Thêm sự kiện cho nút xóa
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy chỉ số hàng được chọn
                int stt = table.getSelectedRow();
                if (stt != -1) {
                    // Xóa hàng nếu hàng đã được chọn
                    model.removeRow(stt);
                    JOptionPane.showMessageDialog(frame, "Đã xóa sinh viên thành công.");
                } else {
                    // Hiển thị thông báo nếu chưa chọn hàng nào
                    JOptionPane.showMessageDialog(frame, "Vui lòng chọn một sinh viên để xóa.", "Lỗi", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Thêm bảng và nút vào frame
        frame.add(scrollPane); // Thêm bảng cuộn vào frame
        frame.add(btnDelete);  // Thêm nút vào frame

        // Thiết lập kích thước và hành vi của frame
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
