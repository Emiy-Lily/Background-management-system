package zhan.study.syscontroller.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 * @date : Created in 2020/6/2816:36
 * @description: 日期转化工具
 * @version: 1.0.0$
 */
public class DateUtils {

    // 日期转换成字符串
    public static String dataToString(Date date,String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    // 字符串转换成日期
    public static Date stringToDate(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }

}
