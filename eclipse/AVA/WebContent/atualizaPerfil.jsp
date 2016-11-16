<%@page import="java.io.File"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.IOException"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.ParseException"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%
	try {
		String info = "/home/siena/workspace/AVA/WebContent/data/ghramos/info.json";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(info));
		JSONObject json = (JSONObject) obj;

		if (request.getParameter("inputSkype") != null) {
			String skype = request.getParameter("inputSkype");
			json.put("skype", skype);
		}
		if (request.getParameter("inputFace") != null) {
			String face = request.getParameter("inputFace");
			json.put("facebook", face);
		}
		if (request.getParameter("inputTwitter") != null) {
			json.put("twitter", request.getParameter("inputTwitter"));
		}
		if (request.getParameter("inputHome") != null) {
			String home = request.getParameter("inputHome");
			json.put("homepage", home);
		}

		FileWriter file = new FileWriter(info);
		file.write(json.toJSONString());
		file.flush();
		file.close();

		response.sendRedirect("preferencia.jsp");

	} catch (Exception e) {
		e.printStackTrace();
	}
%>