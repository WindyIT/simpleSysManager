package FileSystem;

import FileSystem.utils.FormatString;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by windy on 2017/8/8.
 */
public class GetTargetFiles {
    public static void main(String[] args) throws InterruptedException {
        String directory = new String("D:\\test");
        String targetFile = new String("test");
        List<String> result = new SearchFileConcurrecy(directory, targetFile).getResults();
        for (String subRes : result){
            System.out.println(subRes);
        }
        System.out.println("\n------------ Divider -----------\n");


        String directory1 = new String("D:\\test");
        String targetFile1 = new String("test");
        List<String> result1 = new SearchFileConcurrecy(directory1, targetFile1).getResults();
        for (String subRes : result1){
            System.out.println(subRes);
        }
    }
}
