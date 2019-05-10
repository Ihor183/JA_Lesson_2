package ua.igorbendera.jdbs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgrammerMapper {
    public static Programmer map(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(Const.PROGRAMMER_ID);
        String name = resultSet.getString(Const.PROGRAMMER_NAME);
        String language = resultSet.getString(Const.PROGRAMMER_PROG_LANGUAGE);
        String company = resultSet.getString(Const.PROGRAMMER_COMPANY);
        int age = resultSet.getInt(Const.PROGRAMMER_AGE);

        return new Programmer(id, name, language, company, age);
    }
}
