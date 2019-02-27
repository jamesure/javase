package 课上练习;
import java.util.*;
public class 判断输入的数值是否为123 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        do {
            System.out.println("请选择功能");
            a=in.nextInt();
        } while (a!=1&&a!=2&&a!=3);
            switch (a){
                case 1:
                    System.out.println("登录");
                    break;
                case 2:
                    System.out.println("注册");
                    break;
                case 3:
                    System.out.println("再见");
                    break;
            }

    }
}
