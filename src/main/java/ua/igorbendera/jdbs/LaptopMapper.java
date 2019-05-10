package ua.igorbendera.jdbs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LaptopMapper {

    public static Laptop map(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(Const.LAPTOP_ID);
        String brand = resultSet.getString(Const.LAPTOP_BRAND);
        String model = resultSet.getString(Const.LAPTOP_MODEL);
        int RAM = resultSet.getInt(Const.LAPTOP_RAM);
        int programmerId = resultSet.getInt(Const.LAPTOP_PROGRAMMER_ID);

        return new Laptop(id, brand, model, RAM, programmerId);
    }
}
