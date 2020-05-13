<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
	<h1>Thông tin sinh viên:</h1>
	<ul>

		<li>Tên Sinh Viên:${namesv}</li>
		<li>Điểm Sinh Viên:${mark}</li>
		<li>Chuyên Ngành:${major}</li>
	</ul>
</body>
</html>
