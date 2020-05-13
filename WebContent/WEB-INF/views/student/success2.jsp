<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
	<h1>Thông tin Sinh Viên Success2:</h1>
	<ul>

		<li>Tên Sinh Viên:${student.namesv}</li>
		<li>Điểm Sinh Viên:${student.mark}</li>
		<li>Chuyên Ngành:${student.major}</li>
	</ul>
</body>
</html>
