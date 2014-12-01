<%@page import="cn.zoneco.openplatform.util.ImageUtil"%>
<%@page import="cn.zoneco.openplatform.service.AttachmentInfoLocalServiceUtil"%>
<%@page import="cn.zoneco.openplatform.model.AttachmentInfo"%>
<%@page import="cn.zoneco.openplatform.model.ServiceInfo"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@ page import="cn.zoneco.openplatform.service.ServiceInfoLocalServiceUtil" %>
<%@include file="init.jsp"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<portlet:renderURL var="addServiceUrl">
	<portlet:param name="jspPage" value="/html/service-mgmt/add.jsp"/>
</portlet:renderURL>

<aui:button type="button" value="添加服务" href="<%=addServiceUrl %>"/>

<%

    PortletURL iteratorUrl = renderResponse.createRenderURL();

%>

<liferay-ui:search-container emptyResultsMessage="没有符合的记录" delta="10" iteratorURL="<%=iteratorUrl %>">
    <liferay-ui:search-container-results>
        <%
            pageContext.setAttribute("results",
                    ServiceInfoLocalServiceUtil.getServiceInfos(searchContainer.getStart(),searchContainer.getEnd()));
            int serviceInfoCount = ServiceInfoLocalServiceUtil.getServiceInfosCount();
            System.out.println("service count = " + serviceInfoCount);
            pageContext.setAttribute("total", serviceInfoCount);
        %>

    </liferay-ui:search-container-results>


    <liferay-ui:search-container-row className="cn.zoneco.openplatform.model.impl.ServiceInfoImpl"
                                     modelVar="service" rowIdProperty="resourceId">
        <liferay-ui:search-container-column-text name="服务列表">
            <aui:row>
                <aui:col width="15">
		           <%
                    	//response.getOutputStream().write();
		           	ServiceInfo serviceInfo =(ServiceInfo)pageContext.getAttribute("service");
		           	if (serviceInfo.getLogoAttId()>0){
		           		
		           		AttachmentInfo attachmentInfo=AttachmentInfoLocalServiceUtil.getAttachmentInfo(serviceInfo.getLogoAttId());
                    %>
                    	<%-- <img src="<%ImageUtil.showImage(attachmentInfo.getAttContent().getBinaryStream(), 
                    			response.getOutputStream());%>" /> --%>
                    <%} %>
                </aui:col>
                <aui:col width="70">
                    <aui:row>
                        ${service.resourceName}
                    </aui:row>
                    <aui:row>
                        ${service.description}
                    </aui:row>
                </aui:col>
            </aui:row>
        </liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text name="操作">
			<portlet:renderURL var="editUrl">
				<portlet:param name="jspPage" value="/html/service-mgmt/add.jsp"/>
				<portlet:param name="resourceId" value="${service.resourceId }"/>
			</portlet:renderURL>
            <liferay-portlet:actionURL var="deleteUrl" name="deleteService">
                <portlet:param name="resourceId" value="${service.resourceId }"/>
            </liferay-portlet:actionURL>

            <a href="<%=editUrl%>">编辑</a> <a href="#" onclick="javascript:doDelete('<%=deleteUrl%>')">删除</a>
		</liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

</liferay-ui:search-container>

<script type="text/javascript">
    function doDelete(deleteUrl){
        if (confirm("真的要删除吗？")){
            document.location.href=deleteUrl
        }
    }

</script>

