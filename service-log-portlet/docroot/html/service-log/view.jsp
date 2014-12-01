<%@page import="com.liferay.ext.db.PaginationDataSet"%>
<%@page import="cn.zoneco.openplatform.bo.ServiceBO"%>
<%@ include file="/html/init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<liferay-ui:search-container emptyResultsMessage="没有符合的记录" delta="10" >
		<liferay-ui:search-container-results>
			<%
				PaginationDataSet pds=ServiceBO.findServices(searchContainer.getStart(), searchContainer.getEnd());
				
				pageContext.setAttribute("results", pds.getPagedDataList());
				pageContext.setAttribute("total",pds.getRecordCount());
			%>
		
		</liferay-ui:search-container-results>
		
		<liferay-ui:search-container-row className="cn.zoneco.openplatform.model.bean.ServiceVO"
			 modelVar="service" rowIdProperty="resourceId">
			<liferay-ui:search-container-column-text name="服务名称"	property="resourceName" />
			<liferay-ui:search-container-column-text name="申请时间">
				<fmt:formatDate value="${service.applyDate }" pattern="yyyy年MM月dd日"/>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="审核状态"	property="statusName" />
			<liferay-ui:search-container-column-text name="操作">
				<portlet:renderURL var="viewUrl">
					<portlet:param name="resourceId" value="${service.resourceId }"/>
					<portlet:param name="jspPage" value="/html/service-log/resource-detail.jsp"/>
					<portlet:param name="returnUrl" value="<%=themeDisplay.getURLCurrent()%>"/>
				</portlet:renderURL>
				<a href="<%=viewUrl%>">查看</a>
				删除
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	
	</liferay-ui:search-container>    
		