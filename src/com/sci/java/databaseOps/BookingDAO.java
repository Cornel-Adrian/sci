package com.sci.java.databaseOps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BookingDAO {
    Connection connection;


    public int getMaxNumberOfRooms() throws SQLException {

        String sqlGetSize = "SELECT COUNT(*) AS NUMBER FROM( SELECT DISTINCT id FROM accomodation)";
        PreparedStatement ps = connection.prepareStatement(sqlGetSize);

        int rs = ps.executeUpdate();

        return rs;
    }


    public int getLastBookin() throws SQLException {
        String sqlGetLast = "SELECT COUNT (*) AS NUMBER FROM (SELECT DISTINCT id FROM room_fair";
        PreparedStatement ps = connection.prepareStatement(sqlGetLast);

        ResultSet rs = ps.executeQuery();
        int result = rs.getInt("NUMBER");
        return result;
    }

    public int getLastRelationID() throws SQLException {
        String sqlGetLast = "SELECT COUNT (*) AS NUMBER FROM (SELECT DISTINCT id FROM accomodation_fair_relation)";
        PreparedStatement ps = connection.prepareStatement(sqlGetLast);
        int rs = ps.executeUpdate();
        return rs;

    }


    public List<Accomodation> getAll() throws SQLException {
        List<Accomodation> rooms = new LinkedList<>();

        String sqlGetAccomodation = "SELECT * FROM accomodation";
        PreparedStatement ps = connection.prepareStatement(sqlGetAccomodation);
        ResultSet rs = ps.executeQuery(sqlGetAccomodation);

        while (rs.next()) {
            Accomodation room = new Accomodation();

            room.setId(rs.getInt("id"));
            room.setType(rs.getString("type"));
            room.setBedType(rs.getString("bed_type"));
            room.setMaxGuests(rs.getInt("max_guests"));
            room.setDescription(rs.getString("description"));

            rooms.add(room);
        }


        return rooms;

    }


    public void addBooking(int room_number, float value, Season season) throws SQLException {

        int lastRoom = getMaxNumberOfRooms();
        int nextBooking = getLastBookin() + 1;
        int nextId = getLastRelationID() + 1;


        if (room_number == 0 || room_number > lastRoom) {
            System.out.println("Room non-existent");
            return;
        }


        String sql = "INSERT INTO room_fair (id, value, season) VALUES ( ?, ? , ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, nextBooking);
        ps.setFloat(2, value);
        ps.setString(3, season.toString());

        ps.executeUpdate();


        String sqlInsertOnRelationTabel = "INSERT INTO accomodation_fair_relation (id , id_accomodation, id_room_fair) VALUES ( ? , ? , ?)";
        PreparedStatement ps2 = connection.prepareStatement(sqlInsertOnRelationTabel);
        ps2.setInt(1, nextId);
        ps2.setInt(2, room_number);
        ps2.setInt(3, nextBooking);

        ps2.executeUpdate();


    }

    public void getRoomPrices() throws SQLException {
        String sql = "SELECT accomodation.id AS Id_Room, room_fair.value AS Price , room_fair.season FROM accomodation(RIGHT JOIN accomodation_fair_relation.id_accomodation=accomodation.id ) ";
    }


}
