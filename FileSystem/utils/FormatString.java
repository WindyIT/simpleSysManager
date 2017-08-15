package FileSystem.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by windy on 2017/8/11.
 */
public class FormatString {
    public static LinkedList<String> format(String str){
        LinkedList<String> resultList = new LinkedList<>();
        if (str==null){
            resultList.add("0");
        }else {
            String[] result = str.split("\\n");
            for (String subRes : result)
                resultList.add(subRes);
        }

        return resultList;
    }
}
