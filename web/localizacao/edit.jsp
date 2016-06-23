<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <%@include file="../common/header.jsp" %>
    <body>  
        <%@include file="../common/navigator.jsp" %>
        <div class="container conteudo-pagina">
            <div id="conteudo" class="row conteudo-principal " style="height: 944px;">
                <div class="col-md-12">
                    <div class="row col-md-offset-3">
                        <h2 class="title-box">Editar Localização</h2>
                    </div>
                    <div class="row form col-md-6 col-md-offset-3">
                        <form action="./index?action=post" method="POST">
                            <input type="hidden" name="id" id="id" value="${localizacao.getId()}">
                            <div class="row">
                                <div class="form-group field-form">
                                    <label for="descricao">Descrição:</label>
                                    <input type="text" name="descricao" class="form-control" id="descricao" value="${localizacao.getDescricao()}">
                                </div>
                                <div class="form-group field-form">
                                    <label for="palavrasChaves">Palavras Chaves</label>
                                    <input type="text" name="palavrasChaves" class="form-control" id="palavrasChaves" value="${localizacao.getPalavrasChaves()}" data-role="tagsinput">
                                </div>
                            </div>
                            <div class="row">
                                <div class="text-center">
                                    <button type="submit" class="btn btn-success">Alterar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
