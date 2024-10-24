package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableRowSorter;

public class BangDiem {
    private static DefaultTableModel model;
    private static JTable tbl;
    private static TableRowSorter<DefaultTableModel> sorter;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BẢNG ĐIỂM");

        // Tạo bảng với 15 bản ghi
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

        Object[] col = {"Mã sinh viên", "Họ và tên", "Quê quán", "Lớp", "GPA"};

        // Tạo bảng
        JTable table = new JTable(rows, col);
        table.setBounds(30, 30, 300, 300);

        // Thêm bảng vào JScrollPane để có thể cuộn
        JScrollPane scrollPane = new JScrollPane(table);

        frame.setLayout(new BorderLayout());
        frame.add(table.getTableHeader(), BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
