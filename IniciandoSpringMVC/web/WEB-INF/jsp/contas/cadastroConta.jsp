<%-- 
    Document   : cadastroConta.jsp
    Created on : 02/12/2017, 13:29:21
    Author     : Bruno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
        <title>Cadastro Conta</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6">
        <h1>Tela de cadastro</h1>
        
        <div>
            <form action="action">
                <div class="form-group">
                    Nome
                    <input type="text" name="nome" id="nome" class="form-control" required="">
                </div>
                <div class="form-group">
                    Endereço
                    <input type="text" name="endereco" id="endereco" class="form-control"  required="">
                </div>
                <div class="form-group">
                    Telefone
                    <input type="number" name="telefone" id="telefone" class="form-control"  required="">
                </div>
                <div class="form-group">
                    Tipo da conta<br>
                    <select name="time">
                        <option value="bota">Conta Corrente</option>
                        <option value="fla">Conta Poupança</option>
                        
                     </select>
                </div>
                
                <div class="form-group">
                    <input type="submit" id="submit" class="btn btn-primary" value="Cadastrar">
                   
                </div>
            </form>
        </div>     
        </div>
    </body>
</html>
