package cn.zoneco.openplatform.util;

import cn.zoneco.openplatform.model.AttachmentInfo;
import cn.zoneco.openplatform.model.impl.AttachmentInfoImpl;
import cn.zoneco.openplatform.service.AttachmentInfoLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.ext.web.RSPFileItem;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class AttachmentUtil {
    public static AttachmentInfo addAttachment(FileItem fileItem, long userId) throws SystemException {
        AttachmentInfo attachment=new AttachmentInfoImpl();
        attachment.setAttachId(CounterLocalServiceUtil.increment(AttachmentInfo.class.getName()));
        attachment.setCreateBy(userId);
        attachment.setCreateDate(new Date());
        
        RSPFileItem rspFileItem = new RSPFileItem(fileItem);
        String fileName=rspFileItem.getName();
        attachment.setExtName(StringUtils.substringAfterLast(fileName,"."));
        attachment.setOriName(fileName);


        byte[] content = fileItem.get();
        UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(content);

        OutputBlob dataOutputBlob = new OutputBlob(unsyncByteArrayInputStream,content.length);
        attachment.setAttContent(dataOutputBlob);

        AttachmentInfoLocalServiceUtil.addAttachmentInfo(attachment);

        return attachment;
    }
}
