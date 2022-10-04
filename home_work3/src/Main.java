public class Main {
    public static void main(String[] args) {
        int array[] = {5,5,-4,3,-2,1};
        int smallest=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)
            {
                smallest=array[i];
                break;
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(smallest>array[i]&&array[i]>0)
            {
                smallest=array[i];
            }
        }
        System.out.println(smallest);
    }
    }
}