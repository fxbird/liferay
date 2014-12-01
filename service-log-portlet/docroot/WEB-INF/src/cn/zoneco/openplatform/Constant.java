package cn.zoneco.openplatform;

import com.liferay.portal.kernel.util.PropsUtil;

public class Constant {
    public static final String UPLOAD_FOLDER= PropsUtil.get("upload.foler");
    public static final String FOLDER_SERVICE_LOGO=UPLOAD_FOLDER+"/service-logo";
    public static final String FOLDER_SERVICE_WSDL=UPLOAD_FOLDER+"/service-wsdl";
}
