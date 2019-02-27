package 课上练习;

public class Do_While求和 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        do {
            sum+=i++;
        }while (i<=100);
        System.out.println(sum);
        System.out.println(i);
    }
}
