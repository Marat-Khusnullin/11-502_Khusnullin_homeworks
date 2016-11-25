import java.sql.*;
import java.util.LinkedList;

/**
 * Created by Марат on 25.11.2016.
 */
public class DataBase {

    String url;
    String name;
    String password;
    Connection connection;
    Statement statement;

    public DataBase() throws ClassNotFoundException, SQLException {
        url = "jdbc:postgresql://localhost:5432/postgres";
        name = "postgres";
        password = "1FrEyz";
        connection = null;
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, name, password);
        statement = connection.createStatement();
    }


    public String[][] getAllInfo(){
        try {
            LinkedList<String> list = new LinkedList();
            ResultSet result1 = statement.executeQuery("SELECT * FROM information ");

            while (result1.next()) {
                list.add("" +result1.getInt("id"));
                list.add( result1.getString("firststring"));
                list.add(result1.getString("secondstring"));
                list.add("" + result1.getInt("number"));
                list.add("" + result1.getBoolean("boolean"));
            }

        String [][] info = new String[list.size()/5][5];
            int k=0;
            for (int i = 0; i <list.size()/5 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    info[i][j]= list.get(k);
                    k++;
                }
            }
        return info;

        } catch (SQLException e) {
            e.printStackTrace();
        }

    return null;
    }


}
