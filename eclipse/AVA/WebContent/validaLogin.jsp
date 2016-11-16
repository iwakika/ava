<%@page import="java.io.File"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.IOException"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.ParseException"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<!DOCTYPE html>
<body>
	<p>Carregando, aguarde por favor...</p>
</body>

<%
	Thread.sleep(1000);
	try {
		String currentdir = "/home/siena/workspace/AVA/WebContent/data/";
		if (request.getParameter("usuario") == null || request.getParameter("senha") == null
				|| request.getParameter("usuario").isEmpty() || request.getParameter("senha").isEmpty()) {
			response.sendRedirect("index.jsp");
		} else {
			String user = request.getParameter("usuario");
			String pwd = request.getParameter("senha");

			File file = new File(currentdir + user);

			// Verifica se o usuario existe
			if (file.exists()) {
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(new FileReader(file.getPath() + "/passwd.json"));
				JSONObject json = (JSONObject) obj;

				// a senha fornecida é igual a senha cadastrada?
				if (json.get("senha").equals(pwd)) {
					response.sendRedirect("principal.jsp");
				} else {
					response.sendRedirect("index.jsp");
				}
			} else {
				response.sendRedirect("index.jsp");
			}
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</html>