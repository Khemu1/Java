import java.util.*;

 class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size =in.nextInt();
        int [] arr = new  int [size];
        for (int i=0;i<size;i++)    {
            arr[i]=in.nextInt();
        }
        System.out.println(find(arr));
    }
    public  static int find(int [] arr )    {
        int size=arr.length;
        Set <Integer> dis = new HashSet<>();
        for (int i=0;i<size;i++)    {
            dis.add(arr[i]);
        }
        return dis.size();
    }
}
