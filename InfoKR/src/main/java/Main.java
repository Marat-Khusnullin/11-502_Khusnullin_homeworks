import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * Created by Марат on 25.11.2016.
 */
public class Main {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel tablePanel = new JPanel();
        JPanel infoPanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(700,700));
        infoPanel.setPreferredSize(new Dimension(300,700));
        infoPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
        tablePanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
        frame.add(tablePanel, BorderLayout.WEST);
        frame.add(infoPanel, BorderLayout.EAST);

        String[] columnNames = {
                "ID",
                "First String",
                "Second String",
                "Number",
                "Boolean"
        };
        try {
            DataBase a = new DataBase();

            String[][] data = a.getAllInfo();
            JTable table = new JTable(data, columnNames);
            tablePanel.add(table);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
















        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
