package com.kodilla.jdbc;

public class DbManagerTestSuite {

//    @Test
//    public void dtestConnect()throws SQLException {
//        //Given
//        //When
//        DbManager dbManager = DbManager.getInstace();
//        //Then
//        Assert.assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    public void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstace();
//
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ",  " + rs.getString("LASTNAME"));
//            counter++;
//        }
//
//        rs.close();
//        statement.close();
//
//        Assert.assertEquals(5, counter);
//    }
//
//    @Test
//    public void testSelectUsersAndPosts() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstace();
//
//        //When
//        String sqlQuer = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_QUANTITY FROM USERS U, POSTS P WHERE U.ID=P.USER_ID " +
//                "GROUP BY P.USER_ID HAVING COUNT(P.BODY)>2";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuer);
//
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME") + ", " +
//                                            rs.getInt("POSTS_QUANTITY"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//
//        //Then
//        Assert.assertEquals(1, counter);
//    }
}
