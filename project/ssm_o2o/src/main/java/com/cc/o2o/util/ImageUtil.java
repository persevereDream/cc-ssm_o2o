package com.cc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {

    static final Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    /**
     * 创建缩略图
     * @param thumbnail
     * @param targetAddr
     * @return
     */
//    public static String generateThumbnail(File thumbnail,String targetAddr){
//        String realFileName = getRandomFileName();
//        String extension = getFileExtension(thumbnail);
//        makeDirPath(targetAddr);
//        String relativeAddr = targetAddr+realFileName+extension;
//        logger.debug("current relativeAddr is:"+relativeAddr);
//        File dest = new File(PathUtil.getImgBasePath()+relativeAddr);
//        logger.debug("current complete addr is:"+PathUtil.getImgBasePath()+relativeAddr);
//        try{
//            Thumbnails.of(thumbnail)
//                    .size(200,200)
//                    .watermark(Positions.CENTER_LEFT,ImageIO.read(new File(basePath+"/水印2.jpg")),0.5f)
//                    .outputQuality(0.8f)
//                    .toFile(dest);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return relativeAddr;
//    }
    public static String generateThumbnail(File thumbnail,String targetAddr) throws IOException {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr+realFileName+extension;
        logger.debug("current relativeAddr is:"+relativeAddr);
        File dest = new File(PathUtil.getImgBasePath()+relativeAddr);
        logger.debug("current complete addr is:"+PathUtil.getImgBasePath()+relativeAddr);

        Thumbnails.of(thumbnail)
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
     * @param cFile
     * @return
     */
    private static String getFileExtension(File cFile) {
        String originalFileName = cFile.getName();
        return originalFileName.substring(originalFileName.lastIndexOf("."));

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
