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
                    <c:choose>
                        <c:when test="${ pessoa eq null }"></c:when>
                        <c:otherwise>
                            <div class="row">
                                <h2 class="title-box">Criminalidade na região metropolitana de Belo Horizonte-MG</h2>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <form action="./index?action=post" method="POST">
                                        <div class="form-group">
                                            <label>Categoria</label>
                                            <select name="categoria" class="form-control">
                                                <c:if test="${not empty categorias}">
                                                    <c:forEach var="categoria" items="${categorias}">
                                                        <option value="${categoria.getId()}">${categoria.getDescricao()}</option>
                                                    </c:forEach>
                                                </c:if>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Localização</label>
                                            <select name="localizacao" class="form-control">
                                                 <c:if test="${not empty localizacoes}">
                                                    <c:forEach var="localizacao" items="${localizacoes}">
                                                        <option value="${localizacao.getId()}">${localizacao.getDescricao()}</option>
                                                    </c:forEach>
                                                </c:if>
                                            </select>
                                        </div>
                                        <button type="submit" class="btn btn-default btn-inicia-coleta">Iniciar Coleta</button>
                                    </form>
                                </div>
                                <div class="col-md-6"></div>
                            </div>
                            <div class="row graph">
                                <div class="col-md-6 graph-bar"></div>
                                <div class="col-md-6 graph-line"></div>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
    </body>
</html>
