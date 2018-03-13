package xyg.study.forInterview.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * 
 * 在Java 7中可以使用NIO.2的API来做同样的事情，代码如下所示：
 * 
 * @author Truman_SSD
 * @version [版本号, 2018年3月7日]
 */
class ShowFileTest
{
    public static void main(String[] args) throws IOException {
        Path initPath = Paths.get("/Users/Hao/Downloads");
        Files.walkFileTree(initPath, new SimpleFileVisitor<Path>()
        {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file.getFileName()
                        .toString());
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
