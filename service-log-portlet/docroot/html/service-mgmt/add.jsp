<%@include file="init.jsp"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<%
//    request.setAttribute("returnUrl",request.getParameter(""));

%>

<liferay-portlet:renderURL var="returnUrl">
    <liferay-portlet:param name="jspPage" value="/html/service-mgmt/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="addService" var="addUrl"/>

<aui:form useNamespace="false" action="<%=addUrl%>" name="form1" method="post" enctype="multipart/form-data">
	<aui:input inlineLabel="left" label="服务名" name="resourceName"/>
	<aui:input inlineLabel="left"  label="简介" type="textarea" name="description"/>
	<aui:input inlineLabel="left"  label="服务Logo图片" type="file" name="resourceLogo"/>
	<aui:input inlineLabel="left"  label="WSDL文件" type="file" name="wsdlFile"/>

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