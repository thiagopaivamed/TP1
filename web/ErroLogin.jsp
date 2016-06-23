<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <%@include file="./common/header.jsp" %>
    <body>  
        <%@include file="./common/navigator.jsp" %>
        <div class="container conteudo-pagina">
            <div class="alert alert-info">
                Usuário e/ou senha inválido(s). <a href="Login.jsp">Tente novamente.</a></div>
        </div>
    </body>
</html>
