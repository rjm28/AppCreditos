<%-- 
    Document   : menu
    Created on : 2/05/2018, 06:36:48 PM
    Author     : 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Menu</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
              rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppCursos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/creditos.jsp">
                            Creditos<span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/creditos.jsp">
                            Creditos</a>
                    </li>
                </ul>
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/CreditoServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtNumeroCredito" type="text" 
                                       class="form-control" 
                                       placeholder="Número crédito">
                            </div>
                            <div class="col"></div>                           
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtNumDoc" type="text" 
                                       class="form-control" 
                                       placeholder="Número de documento">
                            </div>
                            <div class="col">
                                <input name="txtNombreCompleto" type="text" 
                                       class="form-control" 
                                       placeholder="Nombre completo">
                            </div>                           
                        </div>  
                        <div class="form-row">
                            <div class="col">
                                <input name="txtMontoPrestamo" type="text" 
                                       class="form-control" 
                                       placeholder="Monto del prestamo">
                            </div>
                            <div class="col">
                                <div class="col">
                                <select name="txtTipoEmpleado" id="inputState" 
                                        class="form-control">
                                    <option value="Dependiente" selected>Dependiente</option>
                                    <option value="Independiente" >Independiente</option>
                                </select>
                            </div>
                            </div>                           
                        </div>   
                        <div class="form-row">
                            <div class="col">
                                <select name="txtTipoCredito" id="inputState" 
                                        class="form-control">
                                    <option value="Vivienda" selected>Vivienda</option>
                                    <option value="Estudio" >Estudio</option>
                                    <option value="Libre inversion" >Libre inversión</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txtTrabajaSiNo" id="inputState" 
                                        class="form-control">
                                    <option value="1" selected>Sí</option>
                                    <option value="0">No</option>
                                    
                                </select>
                            </div>                           
                        </div>  
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="crear" type="submit" 
                                        class="btn btn-primary">
                                    Registrar
                                </button>
                            </div>
                            <div class="col">
                                <button name="accion" value="listar" type="submit" 
                                        class="btn btn-primary">
                                    Listar Usuarios
                                </button>
                            </div>
                            
                            
                                <button name="accion" value="creditoMasUtilizado" type="submit" 
                                        class="btn btn-primary">
                                    Credito Más Utilizado
                                </button>
                            <button name="accion" value="AcumuladoMayor" type="submit" 
                                        class="btn btn-primary">
                                    Acumulado Mayor/Valor
                                </button>
                            
                            <button name="accion" value="personasPrestan" type="submit" 
                                        class="btn btn-primary">
                                    ¿Quien presta mas?
                                </button>
                            
                    </form>
                </div>
            </div>
        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    </body>
</html>
