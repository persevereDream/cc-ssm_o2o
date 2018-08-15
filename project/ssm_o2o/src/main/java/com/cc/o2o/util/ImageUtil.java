package com.cc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {

    static final Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    /**
     * 处理缩略图，并返回新生图片的相对值路径
     * @param thumbnailInputStream
     * @param targetAddrm
     * @param fileName
     * @return
     */
    public static String generateThumbnail(InputStream thumbnailInputStream, String fileName, String targetAddr) throws IOException {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(fileName);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr+realFileName+extension;
        logger.debug("current relativeAddr is:"+relativeAddr);
        File dest = new File(PathUtil.getImgBasePath()+relativeAddr);
        logger.debug("current complete addr is:"+PathUtil.getImgBasePath()+relativeAddr);

        Thumbnails.of(thumbnailInputStream)
                .size(200,200)
                .watermark(Positions.CENTER_LEFT,ImageIO.read(new File(basePath+"/水印2.jpg")),0.5f)
                .outputQuality(0.8f)
                .toFile(dest);

        return relativeAddr;
    }

    /**
     * 创建目标路劲所涉及到的目录,即/home/work/cc/xxx.jpg
     * 那么home work cc 这三个文件加都得自动创建
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath()+targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()){
            dirPath.mkdir();
        }
    }

    /**
     * 获取输入文件流的扩展名
     * @param fileName
     * @return
     */
    private static String getFileExtension(String fileName ) {
        return fileName.substring(fileName.lastIndexOf("."));

    }

    /**
     * 生成随机文件名，当前年月日小时分钟秒钟+5位随机数
     * @return
     */
    public static String getRandomFileName() {
        //获取随机5位数
        int rannum = r.nextInt(89999)+10000;
        String nowTiemStr = sDateFormat.format(new Date());
        return nowTiemStr+rannum;
    }

}
