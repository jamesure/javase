package 课上练习;
import java.util.*;
public class 判断输入的数值是否为123 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

            System.out.println("************************");
            System.out.println("\t\t"+"1：登录");
            System.out.println("\t\t"+"2：注册");
            System.out.println("\t\t"+"3：退出");
            System.out.println("************************");
        while (true){
            System.out.println("输入命令");
            int a=in.nextInt();
            while (!(a>=1&&a<=3)){
                System.out.println("请重新输入命令");
                a=in.nextInt();
            }
            if (a==1){
                System.out.println("登录");
            }
            if (a==2){
                System.out.println("注册");
            }
            if (a==3){
                System.out.println("退出");
                System.out.println("B y e");
                break;
            }
        }
    }
}
