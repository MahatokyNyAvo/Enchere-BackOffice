<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<z:layout>
    <div class="col-md-12">
        <br/>
        <h2>Rechargement Compte</h2>
        <br/>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>Id idUtilisateur</th>
                <th>Nom</th>
                <th>Montant</th>
                <th>Date</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${rechargements}" var="rechargement">
                <tr>
                    <td>${rechargement.idUtilisateur.id}</td>
                    <td>${rechargement.idUtilisateur.nom}</td>
                    <td>${rechargement.montant}</td>
                    <td>${rechargement.dateHeure}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/rechargements/${rechargement.id}/${rechargement.idUtilisateur.id}/1">
                            <button class="btn btn-success">Accepter</button>
                        </a>
                        <a href="${pageContext.request.contextPath}/rechargements/${rechargement.id}/${rechargement.idUtilisateur.id}/0">
                            <button class="btn btn-danger">Refuser</button>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <br/>
</z:layout>