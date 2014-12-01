package cn.zoneco.openplatform.portlet;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class ServiceLogPortlet extends MVCPortlet {
    public void toDetail(ActionRequest request, ActionResponse response) {
        long resourceId= ParamUtil.getLong(request,"resourceId");


    }
}
