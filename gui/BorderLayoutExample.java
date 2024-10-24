import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        // Thiết lập tiêu đề cho JFrame
        setTitle("Ví Dụ BorderLayout");
        setLayout(new BorderLayout()); // Sử dụng BorderLayout cho JFrame
        
        // Nút ở vị trí Bắc
        JButton buttonNorth = new JButton("Bắc");
        add(buttonNorth, BorderLayout.NORTH);

        // Nút ở vị trí Trung
        JPanel panelCenter = new JPanel(); // Tạo một JPanel để chứa 3 nút
        panelCenter.setLayout(new GridLayout(1, 3)); // Sử dụng GridLayout để chia đều 3 cột

        JButton buttonWest = new JButton("Tây");
        JButton buttonCenter = new JButton("Trung");
        JButton buttonEast = new JButton("Đông");

        panelCenter.add(buttonWest);
        panelCenter.add(buttonCenter);
        panelCenter.add(buttonEast);

        add(panelCenter, BorderLayout.CENTER); // Thêm JPanel vào vị trí Trung

        // Nút ở vị trí Nam
        JButton buttonSouth = new JButton("Nam");
        add(buttonSouth, BorderLayout.SOUTH);

        // Thiết lập kích thước và hiển thị
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
