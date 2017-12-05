<%-- 
    Document   : listagemConta
    Created on : 04/12/2017, 23:18:24
    Author     : Eduardo Rocha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
              <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <label for="nome">Nome:</label>
                    <input type="nome" class="form-control" id="nome">
                </div>
                <div class="col-md-6">
                    <label for="cpf">CPF:</label>
                    <input type="cpf" class="form-control" id="cpf">
                </div>
                <div class="col-md-6">
                    <label for="descricao">Descrição:</label>
                    <input type="descricao" class="form-control" id="descricao">
                </div>
                    <label for="datav">Data do Vencimento:</label>
                    <input type="datav" class="form-control" id="datav">
                </div>
            </div>
        </div>
    </body>
</html>
