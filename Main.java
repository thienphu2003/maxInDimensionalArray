import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hãy nhập số hàng");
        int x=sc.nextInt();
        System.out.println("Hãy nhập số cột");
        int y=sc.nextInt();
        int[][] matrix=new int[x][y];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.println("Hãy nhập phần tử ở dòng "+(i+1)+"cột "+(j+1));
                matrix[i][j]=sc.nextInt();
            }
        }
        int max= matrix[0][0];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất tìm được trong ma trận là : "+max);
    }
}
