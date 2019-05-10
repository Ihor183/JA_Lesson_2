package ua.igorbendera.jdbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaptopDao {
    private static String READ_ALL = "Select * from " + Const.LAPTOP_TABLE;
    private static String READ_BY_ID = "Select * from " + Const.LAPTOP_TABLE + " where " + Const.LAPTOP_ID + "=?";
    private static String DELETE_BY_ID = "Delete from " + Const.LAPTOP_TABLE + " where " + Const.LAPTOP_ID + "=?";

    private static String UPDATE_BY_ID = "Update " + Const.LAPTOP_TABLE + " set " +
            Const.LAPTOP_RAM + "=? where " + Const.LAPTOP_ID + "=?";

    private static String CREATE = "Insert into " + Const.LAPTOP_TABLE + " (" +
            Const.LAPTOP_BRAND + ", " + Const.LAPTOP_MODEL + ", " +
            Const.LAPTOP_RAM + ", " + Const.LAPTOP_PROGRAMMER_ID + ")  values (?,?,?,?)";

    private Connection connection;
    private PreparedStatement preparedStatement;

    public LaptopDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Laptop laptop) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, laptop.getBrand());
        preparedStatement.setString(2, laptop.getModel());
        preparedStatement.setInt(3, laptop.getRAM());
        preparedStatement.setInt(4, laptop.getProgrammerId());
        preparedStatement.executeUpdate();
    }

    public Laptop read(int id) throws SQLException {
       preparedStatement = connection.prepareStatement(READ_BY_ID);
       preparedStatement.setInt(1, id);
       ResultSet resultSet = preparedStatement.executeQuery();
       resultSet.next();

       return LaptopMapper.map(resultSet);
    }

    public void update(int RAM, int id) throws SQLException {
        preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setInt(1, RAM);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public void deleteDependencyWithProgrammer(int programmerId) throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM laptop where programmer_id =?");
        preparedStatement.setInt(1, programmerId);
        preparedStatement.executeUpdate();
    }

    public List<Laptop> readAll() throws SQLException {
        List<Laptop> laptops = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            laptops.add(LaptopMapper.map(result));
        }
        return laptops;
    }
}
