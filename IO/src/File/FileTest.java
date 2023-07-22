package File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/*
1、File类的一个对象代表一个文件
2、File类声明在java.io下
3、File类经常做为对象传递到流处理中去
4、使用test，相对路径实在module下
5、使用main方法时候，相对路径在project下

 */
public class FileTest {
    @Test
    public void test1(){
        File f1 = new File("hello.txt");
        File f2 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior\\IO\\src\\hi.txt");
        System.out.println(f1);
        System.out.println(f2);

        //构造器,创造文件目录
        File f3 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior\\IO\\src","abc");
        System.out.println(f3);

        //构造器，文件
        File f4 = new File(f3,"abc");
        System.out.println(f4);
    }

    @Test
    public void test2(){
        File f1 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior\\IO");
        //绝对路径
        System.out.println(f1.getAbsoluteFile());
        //相对路径
        System.out.println(f1.getPath());
        //名称
        System.out.println(f1.getName());
        //文件长度
        System.out.println(f1.length());
        //修改时间
        System.out.println(f1.lastModified());
    }

    @Test
    public void test3(){
        File f1 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior");
        //文件目录 文件名
        String[] l = f1.list();
        for(String s:l){
            System.out.println(s);
        }
        //文件目录 文件路径
        File[] files = f1.listFiles();
        for(File f:files){
            System.out.println(f);
        }

    }
    @Test
    public void test4(){
        //改名
        //public boolean rename renameTo(File dest):把文件重命名为指令的文件路径
        //f1.renameTo(f2):f1存在，f2不存在
        File f1 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior\\IO\\hello.txt");
        File f2 = new File("D:\\OTHER\\java\\idea\\workplace_1\\JavaSenior\\hi.txt");
        System.out.println(f1.renameTo(f2));
    }

    @Test
    public void test5(){
        //是否文件目录
        File f1 = new File("hi.txt");
        System.out.println(f1.isDirectory());
        //是否文件
        System.out.println(f1.isFile());
        //是否存在
        System.out.println(f1.exists());
        //时候可读
        System.out.println(f1.canRead());
    }

    @Test
    public void test6(){
        File f1 = new File("hi.txt");
        if(!f1.exists()){
            try {
                //创建文件
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            //删除
            f1.delete();
        }
    }

    @Test
    public void test7(){
        //mkdir 创建这个目录
        //mkdirs 创建上级目录 没有的话 一并创建
    }

}
