<%-- 
    Document   : Admin_Edit
    Created on : Dec 14, 2018, 12:03:41 AM
    Author     : Lenovo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
</head>
<body>
        <h1>Edit Admin</h1>
        <form action="Admin_Update" method="POST">
      <%
        ResultSet rs = (ResultSet) request.getAttribute("data");
        if (rs.next()) {
      %>
            Id_Admin : <input readonly type="text" name="Id_Admin" value="<%
            out.println(rs.getString(1)); %>"><br><br>
            Nama_Admin : <input type="text" name="Nama_Admin" value="<% out.println(rs.getString(2));
%>"><br><br>
            Alamat : <input type="text" name="Alamat" value="<% out.println(rs.getString(3));
%>"><br><br>
            No_Telp : <input type="text" name="No_Telp" value="<% out.println(rs.getString(4));
%>"><br><br>
<%
}
%>
<input type="submit" value="Simpan">
</form>
</body>
</html>