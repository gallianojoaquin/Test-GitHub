<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'user.label', default: 'GrailGit')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center"> Login</h1>
            <div class="row" style="width: 600px">
                <div class="col-*-*">
                    <g:form resource="${this.grailGit}" method="POST" controller="grailGit" action="validation">
                        <fieldset class="form">
                            <g:if test="${flash.message}">
                                <div class="message">${flash.message}</div>
                            </g:if>
                            <div class="form-group">
                                <label for="user">Usuario:</label>
                                <input type="text" class="form-control" name="user" id="user" placeholder="Usuario" value= "EricDominguez" required/>
                            </div>
                            <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Password" value= "123456" required/>
                            </div>
                            <div class="form-group">
                                <button type="submit" value="Submit">Buscar</button>
                            </div>
                        </fieldset>
                    </g:form>
                </div>
            </div>
        </div>
    </body>
</html>