
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<h3>Employee List page</h3>

	<c:if test="${fn:length(facilityList) gt 0}">
	<table style="cellspacing: 2; cellpadding: 2; border: 1;">
		<thead>
			<tr class="listHeading">
				<th><spring:message code="Fac Num" /></th>
				<th><spring:message code="Fac Name" /></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="facility" items="${facilityList}">
				<tr class="listRecord">
					<td>${facility.facilityid}</td>
					<td>${facility.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>