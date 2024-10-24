import javax.swing.*;
import java.awt.*;
public class ChessBoard extends JFrame {
    public ChessBoard() {
        setTitle("Bàn Cờ Vua 8x8");
        setLayout(new GridLayout(8, 8)); // Sử dụng GridLayout cho bàn cờ 8x8

        // Tạo 64 nút (button) cho bàn cờ
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton();
                // Đặt màu nền cho ô
                if ((i + j) % 2 == 0) {
                    button.setBackground(Color.WHITE); // Ô màu trắng
                } else {
                    button.setBackground(Color.BLACK); // Ô màu đen
                }
                // Thêm nút vào bàn cờ
                add(button);
            }
        }

        setSize(400, 400); // Thiết lập kích thước cửa sổ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChessBoard();
            }
        });
    }
}
