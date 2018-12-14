<%-- 
    Document   : Admin_Create
    Created on : Dec 13, 2018, 11:28:53 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
xmlns="http://www.w3.org/1999/xhtml"
xmlns:h="http://xmlns.jcp.org/jsf/html"
xmlns:a="http://xmlns.jcp.org/jsf/passthrough">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin </title>
    </head>
    <body>
        <h1>Add Admin</h1>
        <form action="Product_Store" method="POST">
        Id_Admin : <input type="text" name="Id_Admin"><br><br>
        Nama_Admin : <input type="text" name="Nama_Admin"><br><br>
        Alamat : <input type="text" name="Alamat"><br><br>
        No_Telp: <input type="text" name="No_Telp"><br><br>
        <input type="submit" value="Simpan">
</form>
        
    </body>
</html>
