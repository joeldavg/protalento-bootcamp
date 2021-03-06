<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<jsp:include page="styles.jsp"></jsp:include>
	</head>
	
	<body>
		<jsp:include page="navbar.jsp"></jsp:include>
	
		<main>
		 	<div class="container">
				<div class="row">
		 			<jsp:include page="mensajeria.jsp"></jsp:include>
		 			<h2 class="text-primary">Archivos a Procesar</h2>
		 			<jsp:include page="./components/tablaArticulosPreview.jsp"></jsp:include>
					<div class="col">
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/controllers/CargarProductosServlet" role="button">Guardar</a>
					</div>
				</div>
			</div>
		</main>
	  <jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>
