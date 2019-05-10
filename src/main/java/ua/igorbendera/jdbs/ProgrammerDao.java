package ua.igorbendera.jdbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProgrammerDao {
    private static String READ_ALL = "select * from " + Const.PROGRAMMER_TABLE;
    private static String READ_BY_ID = "select * from " + Const.PROGRAMMER_TABLE + " where " + Const.PROGRAMMER_ID + "=?";
    private static String DELETE_BY_ID = "delete from " + Const.PROGRAMMER_TABLE + " where " + Const.PROGRAMMER_ID + "=?";

    private static String UPDATE_BY_ID = "update " + Const.PROGRAMMER_TABLE + " set " +
            Const.PROGRAMMER_PROG_LANGUAGE + "=? where " + Const.PROGRAMMER_ID + "= ?";

    private static String CREATE = "insert into " + Const.PROGRAMMER_TABLE + "(" +
            Const.PROGRAMMER_NAME + ", " +
            Const.PROGRAMMER_PROG_LANGUAGE + ", " +
            Const.PROGRAMMER_COMPANY + ", " +
            Const.PROGRAMMER_AGE + ") values (?,?,?,?)";

    private Connection connection;
    private PreparedStatement preparedStatement;

    public ProgrammerDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Programmer programmer) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, programmer.getName());
        preparedStatement.setString(2, programmer.getProgrammingLanguage());
        preparedStatement.setString(3, programmer.getCompanyWorkFor());
        preparedStatement.setInt(4, programmer.getAge());
        preparedStatement.executeUpdate();
    }

    public Programmer read(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(READ_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet result = preparedStatement.executeQuery();
        result.next();
        return ProgrammerMapper.map(result);
    }

    public void update(String programLanguage, int id) throws SQLException {
        preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setString(1, programLanguage);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public void delete(int id, LaptopDao laptopDao) throws SQLException {
        laptopDao.deleteDependencyWithProgrammer(id);
        preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public List<Programmer> readAll() throws SQLException {
        List<Programmer> programmers = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            programmers.add(ProgrammerMapper.map(result));
        }
        return programmers;
    }
}
