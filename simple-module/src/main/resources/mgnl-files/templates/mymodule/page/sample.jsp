<%@page import="no.java.portal.*"%>
<%@page import="info.magnolia.module.ModuleRegistry"%>
<html>
<head>
    <title>Magnolia Module Sample</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/.resources/mymodule/css/sample.css" type="text/css"/>
</head>
<body>
<p>This file will be extracted to the filesystem, in the webapp's root under /templates/mymodule/page). Can be useful for JSPs 
    or regular files that need to be present on the filesystem, although in most case, you should prefer resources.</p>
<p>In this case it is available through ${pageContext.request.contextPath}/docroot/mymodule/sample.jsp</p>

<p>This page also shows the usage of the module configuration. The following snippets prints the property 'someProperty' of the 
module configuration.</p>
<dl>
    <dt>/modules/mymodule/config.someProperty</dt>
    <dd>
    <%
      final MyModule myModuleConfigBean = (MyModule) ModuleRegistry.Factory.getInstance().getModuleInstance("mymodule");
      out.println(myModuleConfigBean.getSomeProperty());
    %>
    </dd>
</dl>
</body>
</html>
