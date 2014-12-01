package cn.zoneco.openplatform.portlet;

import cn.zoneco.openplatform.model.AttachmentInfo;
import cn.zoneco.openplatform.model.ServiceInfo;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.ext.web.UploadForm;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import cn.zoneco.openplatform.model.impl.ServiceInfoImpl;
import cn.zoneco.openplatform.service.ServiceInfoLocalServiceUtil;
import cn.zoneco.openplatform.util.AttachmentUtil;

import org.apache.commons.fileupload.FileItem;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import java.util.Date;

public class ServiceMgmtPortlet extends MVCPortlet {
    private static Log log = LogFactoryUtil.getLog(ServiceMgmtPortlet.class);

    public void addService(ActionRequest request, ActionResponse response) throws SystemException {
        UploadForm uploadForm = new UploadForm(request);

        ServiceInfo serviceInfo = new ServiceInfoImpl();
        serviceInfo.setResourceId(CounterLocalServiceUtil.increment(ServiceInfo.class.getName()));
        serviceInfo.setResourceName(uploadForm.getStringField("resourceName"));
        serviceInfo.setDescription(uploadForm.getStringField("description"));
        serviceInfo.setCreateBy(PortalUtil.getUserId(request));
        serviceInfo.setCreateDate(new Date());
        serviceInfo.setUpdateBy(PortalUtil.getUserId(request));
        serviceInfo.setUpdateDate(new Date());

        if(uploadForm.isSelectFile("resourceLogo")) {
            AttachmentInfo attachment = AttachmentUtil.addAttachment((FileItem) uploadForm.getField("resourceLogo"),
                    PortalUtil.getUserId(request));
            log.debug("save logo image '" + attachment.getOriName() + "'");
            serviceInfo.setLogoAttId(attachment.getAttachId());
        }

        AttachmentInfo attachment = AttachmentUtil.addAttachment((FileItem) uploadForm.getField("wsdlFile"),
                PortalUtil.getUserId(request));
        serviceInfo.setWsdlAttId(attachment.getAttachId());
        log.debug("save wsdl file '" + attachment.getOriName() + "'");

        ServiceInfoLocalServiceUtil.addServiceInfo(serviceInfo);
        response.setRenderParameter("jspPage", "/html/service-mgmt/view.jsp");


    }

    public void deleteService(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long resourceId = ParamUtil.getLong(request,"resourceId");
        ServiceInfoLocalServiceUtil.deleteServiceInfo(resourceId);

        response.setRenderParameter("jspPage", "/html/service-mgmt/view.jsp");
    }

}
