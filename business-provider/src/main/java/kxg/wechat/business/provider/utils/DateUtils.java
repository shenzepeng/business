package kxg.wechat.business.provider.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@Slf4j
public class DateUtils {
    public static Date getLocalDate() {
        try {
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            log.info("当地时间-{}",date);
            //转换为标准时间对象
            return date;
        }catch (Exception e){
            log.info("获取当地时间失败,返还系统时间");
        }
        return new Date();
    }

    public static void main(String[] args) {
        Date localDate = DateUtils.getLocalDate();
        System.out.println(localDate);
    }
}
