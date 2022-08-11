package program.jav.NIO.file;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInterfaceDemo {
   public static void main(String[] args) throws IOException {
	   
      Path path = Paths.get("C:\\Users\\Virendra\\Downloads\\Ankush Arora.docx");
      FileSystem fs =  path.getFileSystem();
      System.out.println(fs.toString());
      System.out.println(path.isAbsolute());
      System.out.println(path.getFileName());
      System.out.println(path.toAbsolutePath().toString());
      System.out.println(path.getRoot());
      System.out.println(path.getParent());
      System.out.println(path.getNameCount());
      System.out.println(path.getName(0));
      System.out.println(path.subpath(0, 2));
      System.out.println(path.toString());
      System.out.println(path.getNameCount());
      
      Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
      System.out.println(realPath.toString());
      
      String originalPath = "d:\\data\\projects\\a-project\\..\\another-project";
      
      Path path1 = Paths.get(originalPath);
      Path path2 = path1.normalize();
      
      System.out.println("path2 = " + path2);
   }
}
