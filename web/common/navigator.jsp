<nav class="navbar navbar-default" >
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display --> 
        <div class="navbar-header">
            <a href="<%=request.getContextPath()%>">
                <h1 class="logo-header">Web Crawler</h1>
            </a>

        </div>      
        
        <div class="collapse navbar-collapse navbar-right">
            <c:choose>
                <c:when test="${ pessoa eq null }">
                    <ul class="nav navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/Login.jsp" class="btn-navbar">Entrar</a></li>
                        <li><a href="<%=request.getContextPath()%>/Cadastro.jsp" class="btn-navbar">Cadastre-se</a></li>                        
                    </ul>
                </c:when>
                <c:otherwise>
                    <ul class="nav navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/categoria/index" class="btn-navbar">Categorias</a></li>
                        <li><a href="<%=request.getContextPath()%>/localizacao/index" class="btn-navbar">Localizações</a></li>
                        <li role="presentation" class="dropdown">
                            <a class="dropdown-toggle btn-navbar" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                ${ pessoa.getNome() } <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a class="navbar-brand btn btn-link" href="<%=request.getContextPath()%>/Logout">Logout</a>
                                </li>
                             </ul>
                        </li>
                    </ul>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</nav>   