package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = MysqlUtility.getConnection();

    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                list.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}