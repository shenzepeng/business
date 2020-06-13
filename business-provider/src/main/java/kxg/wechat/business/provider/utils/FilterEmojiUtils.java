package kxg.wechat.business.provider.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FilterEmojiUtils {
    /**
     * 过滤表情包
     * @param
     * @return
     */
    public  static String getNewString(String source) {
        if (source != null) {
            Pattern emoji = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]|[\ue000-\uf8ff]", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
            Matcher emojiMatcher = emoji.matcher(source);
            if (emojiMatcher.find()) {
                source = emojiMatcher.replaceAll("");
                return source;
            }
            return source;

        }
        return source;
    }

    public static void main(String[] args) {
        String words="asdasdfa!@#!@$!@%!$!";
        String newString = FilterEmojiUtils.getNewString(words);
        System.out.println(newString);
        System.out.println(1);
    }
}
