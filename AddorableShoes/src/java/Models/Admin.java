/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import config.Koneksi;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class Admin {
Koneksi kon = new Koneksi();
String Id_Admin, Nama_Admin, Alamat, No_Telp;

public String getId_Admin(){return Id_Admin;}
public String getNama_Admin(){return Nama_Admin;}
public String getAlamat(){return Alamat;}
public String getNo_Telp(){return No_Telp;}

public void setId_Admin(String Id_Admin){this.Id_Admin=Id_Admin;}
public void setNama_Admin(String Nama_Admin){this.Nama_Admin=Nama_Admin;}
public void setAlamat(String Alamat){this.Alamat=Alamat;}
public void setNo_Telp(String No_Telp){this.No_Telp=No_Telp;}


public ResultSet readAll() {
try
{
    Connection con = kon.openConnection();
    String sql = "select * from Admin";
    Statement state = con.createStatement();
    ResultSet rs = state.executeQuery(sql);
        return rs;
}   catch (Exception e) {
    System.err.println(e);
    return null;
    }
}

public int store() {
try
{
    Connection con = kon.openConnection();
    String sql = "insert Admin values(Id_Admin, Nama_Admin, Alamat, No_Telp)";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, this.Id_Admin);
    ps.setString(2, this.Nama_Admin);
    ps.setString(3, this.Alamat);
    ps.setString(4, this.No_Telp);
    
    int res = ps.executeUpdate();
    return res;
} catch (Exception e) {
    System.err.println(e);
    return 0;
}
}
public ResultSet readByID() {
try
{
    Connection con = kon.openConnection();
    String sql = "select * from Admin where Id_Admin = ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, this.Id_Admin);
    ResultSet rs = ps.executeQuery();
    return rs;
} catch (Exception e) {
    System.err.println(e);
    return null;
}
}
public int update() {
    try
{
        Connection con = kon.openConnection();
        String sql = "update Admin set Nama_Admin=?, Alamat=?, No_Telp=? where Id_Admin=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.Nama_Admin);
        ps.setString(2, this.Alamat);
        ps.setString(3, this.No_Telp);
        ps.setString(4, this.Id_Admin);
        int res = ps.executeUpdate();
        return res;
} catch (Exception e) {
        System.err.println(e);
        return 0;
    }
}

public int destroy() {
try
{
    Connection con = kon.openConnection();
    String sql = "delete from Admin where Id_Admin = ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, this.Id_Admin);
    int res = ps.executeUpdate();
    return res;
} catch (Exception e) {
    System.err.println(e);
    return 0;
        }
    }
}
    

