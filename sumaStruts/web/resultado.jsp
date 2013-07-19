<%-- 
    Document   : resultado
    Created on : 19-jul-2013, 21:17:57
    Author     : alumno
--%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de la suma</title>
    </head>
    <body>
        El resultado de sumar <bean:write name="OperandosForm" property="operando1"></bean:write>
        y <bean:write name="OperandosForm" property="operando2"></bean:write> es
        <bean:write name="OperandosForm" property="resultado"></bean:write>
    </body>
</html>
