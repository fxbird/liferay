<%@page import="com.liferay.ext.db.PaginationDataSet"%>
<%@ include file="/html/init.jsp" %>
<%@page import="cn.zoneco.openplatform.bo.ServiceBO"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
long resourceId = ParamUtil.getLong(request, "resourceId");
pageContext.setAttribute("service", ServiceBO.findService(resourceId));

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("jspPage", "/html/service-log/resource-detail.jsp");
pageContext.setAttribute("portletURL", portletURL);

PortletURL iteratorUrl = renderResponse.createRenderURL();
iteratorUrl.setParameter("resourceId", resourceId+"");
iteratorUrl.setParameter("jspPage", "/html/service-log/resource-detail.jsp");
iteratorUrl.setParameter("returnUrl", ParamUtil.getString(request, "returnUrl"));

%>


<aui:row>
	<aui:col width="50">
		服务名称：${service.resourceName}
	</aui:col>
	<aui:col width="25">
		审核状态：${service.statusName}
	</aui:col>
	<aui:col width="25">
		申请时间：<fmt:formatDate value="${service.applyDate}" pattern="yyyy年MM月dd日"/>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col>
		服务说明：${service.description }
	</aui:col>
</aui:row>

服务调用日志：
<liferay-ui:search-container emptyResultsMessage="没有符合的记录" delta="1" iteratorURL="<%=iteratorUrl %>">
		<liferay-ui:search-container-results>
			<%
				PaginationDataSet pds=ServiceBO.findCallLogByResourceId(resourceId,searchContainer.getStart(), searchContainer.getEnd());
				
				pageContext.setAttribute("results", pds.getPagedDataList());
				pageContext.setAttribute("total",pds.getRecordCount());
			%>
		
		</liferay-ui:search-container-results>
		
		<liferay-ui:search-container-row className="cn.zoneco.openplatform.model.impl.CallLogImpl" modelVar="callLog" rowIdProperty="logId">
			<liferay-ui:search-container-column-text name="调用开始时间"	>
				<fmt:formatDate value="${callLog.startTime}" pattern="yyyy年MM月"/>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="调用结束时间">
				<fmt:formatDate value="${callLog.endTime}" pattern="yyyy年MM月"/>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="输入报文"	property="inMsg" />
			<liferay-ui:search-container-column-text name="输出报文"	property="outMsg" />
			<liferay-ui:search-container-column-text name="调用状态"	property="" >
				<c:choose>
					<c:when test="${callLog.logStatus=='T' }">成功</c:when>
					<c:otherwise>失败</c:otherwise>
				</c:choose>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="摘要"	property="logMessage" />
			
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	
	</liferay-ui:search-container>    
		
		
<aui:button type="button" value="返回" href='<%=ParamUtil.getString(request, "returnUrl") %>'/>

