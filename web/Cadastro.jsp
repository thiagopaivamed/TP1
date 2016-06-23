<%-- 
    Document   : Cadastro
    Created on : 30/04/2015, 19:20:43
    Author     : Thiago
--%>
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
                    <div class="row">
                        <h2 class="title-box">Cadastre-se</h2>
                    </div>
                    <div class="row form">
                        <form action="./CadastrarPessoa?cmd=cadastrar" method="POST" class="" enctype="multipart/form-data">
                            <fieldset>
                                <div class="row col-md-6">
                                    <div class="form-group field-form">
                                        <label>Nome:</label>
                                        <input type="text" class="form-control" name="nome" required="true"/>
                                    </div>
                                    <div class="form-group field-form">
                                        <label>Nascimento:</label>
                                        <input type="text" class="form-control" id="datepicker" name="nascimento" required="true"/>
                                    </div>
                                </div>
                                <div class="row col-md-6">
                                    <div class="form-group field-form">
                                        <label>Foto:</label>
                                        <input type="file" class="form-control" id="foto" name="foto" required="true"/>
                                    </div>
                                    <div class="form-group field-form">
                                        <label>E-mail:</label>
                                        <input type="email" class="form-control" name="email" required="true"/>
                                    </div>
                                </div>
                                <div class="row col-md-6">
                                    <div class="form-group field-form">
                                        <label>Senha:</label>
                                        <input type="password" class="form-control" name="senha" required="true"/>
                                    </div>
                                </div>                    
                                <div class="row col-md-12">
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-success" value="Salvar">Salvar</button>
                                    </div>
                                </div>
                            </fieldset>           
                        </form>
                    </div>
                    <div class="row col-md-12" style="  padding-top: 10px; padding-left: 0px;">
                        Já possui uma conta? 
                        <a href="Login.jsp" title="Cadastre-se!">Faça seu login.</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

<script>
    $("#datepicker").datepicker({
        format: "dd/mm/yyyy",
        weekStart: 0,
        todayBtn: true,
        clearBtn: true,
        language: "pt-BR",
        forceParse: false,
        calendarWeeks: true,
        autoclose: true,
        todayHighlight: true
    });

    $("#foto").fileinput({
        'showUpload': false,
        'previewFileType': 'any'
    });
</script>
