<%@page import="cn.zoneco.openplatform.model.ServiceInfo"%>
<%@ page import="cn.zoneco.openplatform.service.ServiceInfoLocalServiceUtil" %>
<%@ page import="cn.zoneco.openplatform.service.AttachmentInfoLocalServiceUtil" %>
<%@ page import="cn.zoneco.openplatform.Constant" %>
<%@include file="init.jsp"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<%
//    request.setAttribute("returnUrl",request.getParameter(""));
long resourceId = ParamUtil.getLong(request,"resourceId");
ServiceInfo serviceInfo= ServiceInfoLocalServiceUtil.getServiceInfo(resourceId);
request.setAttribute("serviceInfo", serviceInfo);

if (serviceInfo.getLogoAttId()>0){
    request.setAttribute("attLogo", AttachmentInfoLocalServiceUtil.getAttachmentInfo(serviceInfo.getLogoAttId()));
}

request.setAttribute("wsdlAtt", AttachmentInfoLocalServiceUtil.getAttachmentInfo(serviceInfo.getWsdlAttId()));


%>

<liferay-portlet:renderURL var="returnUrl">
    <liferay-portlet:param name="jspPage" value="/html/service-mgmt/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="saveUpdateService" var="updateUrl"/>

<aui:form useNamespace="false" action="<%=updateUrl%>" name="form1" method="post" enctype="multipart/form-data">
	<aui:input inlineLabel="left" label="服务名" name="resourceName" value="${serviceInfo.resourceName}"/>
	<aui:input inlineLabel="left"  label="简介" type="textarea" name="description" value="${serviceInfo.description}"/>
	<aui:input inlineLabel="left"  label="服务Logo图片" type="file" name="resourceLogo"/>
    <c:if test="${attLogo!=null}">
        <img src="<%=Constant.FOLDER_SERVICE_LOGO%>/${attLogo.saveName}"/>
    </c:if>
	<aui:input inlineLabel="left"  label="WSDL文件" type="file" name="wsdlFile"/>
    <span><a href="<%=Constant.FOLDER_SERVICE_WSDL%>/${wsdlAtt.saveName}">下载</a></span>

	<aui:button-row>
		<aui:button type="button" value="提交" onclick="doSubmit()"/>
		<aui:button type="button" value="返回" href="${returnUrl}"/>
	</aui:button-row>
</aui:form>

<script type="text/javascript">
   function doSubmit(){
       if (isEmptyInput('resourceName',true)){
           alert('请输入服务名')
           return
       }

       if (isEmptyInput('description',true)){
           alert('请输入服务描述')
           return
       }

       if (isEmptyInput('wsdlFile',true)){
           alert('请选择wsdl文件')
           return
       }

       document.form1.submit()

   }


</script>