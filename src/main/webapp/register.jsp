<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
    <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
    <script src="resources/js/index.js" type="text/javascript"></script>
    <script src="resources/js/validation.js" type="text/javascript"></script>
    <link rel="stylesheet" href="resources/css/style.css">
    
    <title>Register</title>
<body>
 <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Register</h3>
                    </div>
                        
                      <div class="panel-body">
                        <div id="mess_alert" class="alert alert-danger" role="alert">
                            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                            <span class="sr-only">Error:</span>
                            Email or username already exists
                          </div>
                        <form accept-charset="UTF-8" role="form" id="validate_reg_form">
                        <fieldset>
                            <div class="form-group" >
                                <input class="form-control" placeholder="Username" name="username" type="text">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="E-mail" name="email" type="text">
                            </div>
                            <div class="form-group">
                                <input id="pass" class="form-control" placeholder="Password" name="password" type="password" value="">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Re Password" name="re-password" type="password" value="">
                            </div>
                            
                            <input class="btn btn-lg btn-success btn-block" type="submit" value="Register">
                            
                        </fieldset>
                          </form>
                          
                          <div class="click-register">
                            <a href="login.jsp">Click here to login</a>
                          </div>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>
</body>
</html>