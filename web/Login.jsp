<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <%@include file="./common/header.jsp" %>
    <body>  
        <%@include file="./common/navigator.jsp" %>
        <div class="container conteudo-pagina">
            <div id="conteudo" class="row conteudo-principal " style="height: 944px;">
                <div class="col-md-12">
                    <div class="row form col-md-6 col-md-offset-3">
                        <form action="./Login" method="POST" class="form-horizontal">   
                            <div class="form-group">
                                <legend class="title-box text-center">Efetuar Login</legend>                          
                                <center>
                                    <img src="Imagens/avatar_2x.png" alt="" class="img-circle img-thumbnail img-responsive"/>
                                </center>
                                <div class="row">
                                    <div class="input-group field-form">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input type="email" name="login"  class="form-control " placeholder="Email" required="true"/>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-group field-form">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input type="password" name="senha" class="form-control" placeholder="Senha" required="true"/>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="text-center">
                                        <button type="submit" value="Efetuar Login" class="btn btn-primary form-control">Efetuar Login</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="row col-md-12 col-md-offset-3" style="  padding-top: 10px; padding-left: 0px;">
                        Não possui uma conta? 
                        <a href="Cadastro.jsp" title="Cadastre-se!">Cadastre-se!</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
