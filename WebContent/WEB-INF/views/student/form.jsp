<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Spring MVC</title>
	<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
	<form action="student.htm" method="post">
	<div>Nhập tênSV: </div>
	<input name="namesv"/>
	<div>	Nhập Điểm: </div>
    <input name="mark"/>
	<div>	ChuyênNgành: </div>
	<label><input name="major" type="radio" value="UD"/>
	UDPM
	</label>
	<label><input name="major" type="radio" value="TK"/>
	TKTW
	</label>
	<hr/>
	<button>Save</button>
	</form>
</body>
</html>
