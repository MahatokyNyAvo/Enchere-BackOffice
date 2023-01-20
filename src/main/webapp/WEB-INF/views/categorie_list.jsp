<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<z:layout>
    <div class="col-md-12">
        <br/>
        <h2>Categorie</h2>
    </div>
    <div class="col-md-8">
        <br/>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>id</th>
                <th>intitulé</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${categories}" var="categorie">
                <tr>
                    <td>${categorie.id}</td>
                    <td>${categorie.intitule}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-md-4">
    <h3>Insertion</h3>
        <form method="post" action="${pageContext.request.contextPath}/categories" >
            <div class="form-group">
                <label class="col-sm-2 control-label">Intitule</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" name="intitule"  id="intitule" placeholder=""/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Submit" class="btn btn-info" />
                    &nbsp; &nbsp; &nbsp;
                    <input type="reset" value="Reset" class="btn btn-info" />
                </div>
            </div>
        </form>
    </div>
</z:layout>