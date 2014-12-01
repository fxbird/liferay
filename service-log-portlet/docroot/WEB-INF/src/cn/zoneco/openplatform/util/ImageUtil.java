package cn.zoneco.openplatform.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageUtil {
    public static void showImage(InputStream in, OutputStream out) throws IOException {
        BufferedInputStream bin=new BufferedInputStream(in);
        byte[] buffer=new byte[4096];

        int len=0;

        while ((len=bin.read())>0){
            out.write(buffer,0,len);
        }

        in.close();
        out.flush();
    }
}
