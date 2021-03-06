<%@page import="ar.com.educacionit.web.enums.ViewKeysEnums"%>
<%@page import="ar.com.educacionit.domain.Users"%>
<%
	Users user = (Users) session.getAttribute(ViewKeysEnums.USER.getParam());
%>
<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="<%=request.getContextPath()%>/">Home</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <% if(user != null){ %>
		    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link" href="<%=request.getContextPath()%>/upload.jsp">Cargar Archivo</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">Nuevo Producto</a>
		        </li>
		      </ul>
		      <form class="d-flex" action="<%=request.getContextPath()%>/controllers/BuscarProductosServlet">
		        <input 
		        name="<%=ViewKeysEnums.CLAVE_BUSQUEDA.getParam() %>" 
		        class="form-control me-2" 
		        type="search" 
		        placeholder="Search" 
		        aria-label="Search">
		        <button class="btn btn-outline-success me-2" type="submit">Search</button>
		      </form>
		      <a class="btn btn-danger" href="<%=request.getContextPath()%>/LogoutServlet" role="button">Logout</a>
	    	</div>
	    <% } %>
	  </div>
	</nav>
</header>