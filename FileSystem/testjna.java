/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystem;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 *
 * @author Afei
 */
public class testjna {

    /**
     * @param args the command line arguments
     */
    public interface getTargetFilesV3 extends Library{
        getTargetFilesV3 INSTANCE =(getTargetFilesV3)Native.loadLibrary("getTargetFilesV3", getTargetFilesV3.class);
        public String getAllFilesPath(String curDir, String tarDir);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String out=getTargetFilesV3.INSTANCE.getAllFilesPath("D:", "¿ËΩ®ª‘");
        System.out.println(out);
    }
    
}
