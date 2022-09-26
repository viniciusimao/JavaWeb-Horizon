<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirHorizon</title>
<link rel="stylesheet" href="/styles/global.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-md bg">
      <a href="/index.html" class="nav-brand fs-3 ms-3 text-decoration-none text-white">AirHorizon</a>
      <button 
      type="button"
      class="navbar-toggler me-3 text-white"
      data-bs-target="#btn"
      data-bs-toggle="collapse"
      >
      <i class="fa-solid fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="btn">
          <div class="mx-auto"></div>
          <ul class="navbar-nav">
              <li class="nav-item ms">
                  <a href="/promocao.html" class="nav-link mx-3 text-white fs-6">Promoções</a>
              </li>
          </ul>
          <ul class="navbar-nav">
              <li class="nav-item">
                  <a href="/destino.html" class="nav-link mx-3 text-white fs-6">Destinos</a>
              </li>
          </ul>
          <ul class="navbar-nav">
              <li class="nav-item">
                  <a href="/contatos.html" class="nav-link mx-3 text-white fs-6">Contatos</a>
              </li>
          </ul>
          <ul class="navbar-nav">
              <li class="nav-item">
                  <a href="/login.html" class="nav-link mx-3 text-white fs-6">Login</a>
              </li>
          </ul>
      </div>
  </nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Voos Cadastrados</h3>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Locais</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${Voos}" var="voo">
							<tr>
								<td>${voo.idVoos}</td>
								<td>${voo.localVoos}</td>
								<td>
									<a href="VoosDelete?idVoos=${voo.idVoos}">deletar</a> |
									<a href="ClienteFindAndUpdate?idVoos=${voo.localVoos}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="index.html">Voltar</a></h5>
		</div>
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>