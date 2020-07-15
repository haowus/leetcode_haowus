package TEST;

import java.sql.*;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/14 16:57
 */
public class jdbc_test {
    public static void main(String[] args) throws SQLException {
        // JDBC连接的URL, 不同数据库有不同的格式:
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "root";
        // 获取连接:
        Connection conn = null;
        try {
            // TODO: 访问数据库...
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//            Statement statement = conn.createStatement();//Statement可能会引发SQL注入的问题
//            ResultSet rs = statement.executeQuery("SELECT * FROM students order BY score limit 0,3");
//            while (rs.next()) {
//
//                int id = rs.getInt(1); // 注意：索引从1开始
//                String name = rs.getString(2);
//                int gender = rs.getInt(3);
//                int grade = rs.getInt(4);
//                int score = rs.getInt(5);
//                System.out.println(id + "-"+grade+"-"+name+"-"+gender+"-"+score);
////                System.out.println(id+"-"+name);
//            }
            //PreparedStatement 可以防止SQL注入
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE gender=? AND grade=?");
            ps.setObject(1, 1); // 注意：索引从1开始   设置gender的值
            ps.setObject(2, 1);  //设置grade的值
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    long grade = rs.getLong("grade");
                    String name = rs.getString("name");
                    String gender = rs.getString("gender");
                    int score = rs.getInt("score");
                    System.out.println(id + "-"+grade+"-"+name+"-"+gender+"-"+score);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 关闭连接:
        conn.close();
    }
}
