<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<z:layout>
    <div class="col-md-12">
        <br/>
        <h2>Configuration</h2>
    </div>

    <div class="col-md-8">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>Commission</th>
                <td></td>
                <th><c:out value="${configuration.getCommissionConfiguration().getPourcentage()}"/>%</th>
            </tr>
            <tr>
                <th>Durée</th>
                <td></td>
                <th><c:out value="${configuration.getDureeConfiguration().getDureeMinimum()}"/> h -
                    <c:out value="${configuration.getDureeConfiguration().getDureeMaximum()}"/> h</th>
            </tr>
            </thead>
        </table>
    </div>
    <div class="col-md-4">
        <h3>Insertion</h3>
        <form method="post" action="${pageContext.request.contextPath}/commissionsConfiguration" >
            <h4>Commission</h4>
            <div class="form-group">
                <label class="col-sm-2 control-label">Pourcentage</label>
                <div class="col-sm-6">
                    <input type="number" class="form-control" name="pourcentage"  id="pourcentage" placeholder=""/>
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
        <form method="post" action="${pageContext.request.contextPath}/dureeConfiguration" >
            <h4>Durée</h4>
            <div class="form-group">
                <label class="col-sm-2 control-label">Minimum (h)</label>
                <div class="col-sm-6">
                    <input type="number" class="form-control" name="dureeMinimum"  id="dureeMinimum" placeholder=""/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Maximum (h)</label>
                <div class="col-sm-6">
                    <input type="number" class="form-control" name="dureeMaximum"  id="dureeMaximum" placeholder=""/>
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
    <br/>
</z:layout>