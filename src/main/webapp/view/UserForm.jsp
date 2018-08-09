<%--
  Created by IntelliJ IDEA.
  User: Baharuddin Tambunan
  Date: 8/7/2018
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Data</title>
</head>
<body>
    <center>
        <h1>User</h1>
        <h2>

            <a href="/view">List All User</a>

        </h2>
    </center>
    <div >
        <form class="form-horizontal">
            <fieldset>

                <!-- Form Name -->
                <legend>Form Tambah User</legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="">ID</label>
                    <div class="col-md-2">
                        <input id="" name="" type="text" placeholder="" class="form-control input-md">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="textinput">Username</label>
                    <div class="col-md-4">
                        <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Password input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="passwordinput">Password</label>
                    <div class="col-md-4">
                        <input id="passwordinput" name="passwordinput" type="password" placeholder="" class="form-control input-md">

                    </div>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="save"></label>
                    <div class="col-md-4">
                        <button id="save" name="save" class="btn btn-primary">Save</button>
                    </div>
                </div>

            </fieldset>
        </form>

    <%--<c:if test="${save != null}">--%>
        <%--<form action="update" method="post">--%>
            <%--</c:if>--%>
            <%--<c:if test="${save == null}">--%>
            <%--<form action="save" method="post">--%>
                <%--</c:if>--%>
                <%--<table border="1" cellpadding="5">--%>
                    <%--<caption>--%>
                        <%--<h2>--%>
                            <%--<c:if test="${save != null}">--%>
                                <%--Edit User--%>
                            <%--</c:if>--%>
                            <%--<c:if test="${save == null}">--%>
                                <%--Add New User--%>
                            <%--</c:if>--%>
                        <%--</h2>--%>
                    <%--</caption>--%>
                    <%--<c:if test="${save != null}">--%>
                        <%--<input type="hidden" name="id" value="<c:out value='${save.id}' />" />--%>
                    <%--</c:if>--%>
                    <%--<tr>--%>
                        <%--<th>Title: </th>--%>
                        <%--<td>--%>
                            <%--<input type="text" name="title" size="45"--%>
                                   <%--value="<c:out value='${save.title}' />"--%>
                            <%--/>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td colspan="2" align="center">--%>
                            <%--<input type="submit" value="Save" />--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                <%--</table>--%>
            <%--</form>--%>
    </div>
</body>
</html>
