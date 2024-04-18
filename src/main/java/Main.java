import java.util.Scanner;

class bubble
{

    int arr[] = new int[10];

    void createArray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.println("enter elements in array");
            arr[i]=sc.nextInt();
        }

    }

    void sort()
    {
        for(int i=0; i<10-1; i++)
        {
            for(int j=0; j<10-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void showArray()
    {
        for(int i=0; i<10; i++)
            System.out.print(" "+arr[i]);
    }
}

public class Main {
  public static void main(String[] args) {
    bubble ss = new bubble();
    ss.createArray();
    System.out.println("Before Sorting");
    ss.showArray();
    System.out.println( "\n After sorting");
    ss.sort();
    ss.showArray();
  }

}