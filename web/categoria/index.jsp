<%@page import="Models.Categoria"%>
<%@page import="java.util.List"%>
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
                    <div class="row btn-register">
                        <a href="./new.jsp"  title="Cadastrar">
                            <button type="button" class="btn btn-success btn-md">
                                <span class="glyphicon glyphicon-plus-sign icon" aria-hidden="true"></span> 
                                <span class="text">Criar uma Categoria</span>
                            </button>
                        </a>
                    </div>
                    <div class="table-container row">
                        <div class="header-table">
                            <h2>Categorias</h2>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th>Descrição</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty categorias}">
                                <c:forEach var="categoria" items="${categorias}">
                                   <tr id="${categoria.getId()}">
                                       <td class="descricao">${categoria.getDescricao()}</td>
                                       <td class="acoes">
                                            <a href="./index?action=edit&id=${categoria.getId()}"  title="Editar">
                                                <button type="button" class="btn btn-warning btn-sm">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </button>
                                            </a>
                                            <a href="./index?action=delete&id=${categoria.getId()}" onclick="return confirm('Você deseja realmente deletar este item?')" title="Deletar">
                                                <button type="button" class="btn btn-danger btn-sm">
                                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                                </button>
                                            </a>
                                       </td>
                                  </tr>
                                </c:forEach>
                              </c:if>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
