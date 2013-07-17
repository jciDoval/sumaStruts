<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html:html>
    <head>
        <title>Suma sumando Struts</title>
    </head> 
    <body>
        
    <html:form action="/Suma">
        Operando 1:<html:text name="OperandosForm" property="operando1" />
        Operando 2:<html:text name="OperandosForm" property="operando2" />
        <html:submit value="Suma" />
    </html:form>
        
    </body>
    
</html:html>