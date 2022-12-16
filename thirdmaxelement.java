import java.util.*;
import java.lang.Math;

public class thirdmaxelement{


    public static void main(String[] args) { 
        int arr[]={-1,-2,-3,-4,-9};
        
        int i;

        for( i=0;i<5;i++)
     {        System.out.println(arr[i]);
    }

    int ans= Integer.MIN_VALUE;
    int max;
        for(i=0;i<5;i++)
        {
            if( arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        max=ans;
        int ans2= Integer.MIN_VALUE;
        for(i=0;i<5;i++)
{

            if(arr[i]==max){
            continue;
            }
            if( arr[i]>ans2)
            {
                ans2=arr[i];
            }
        
    }
       int max1=ans2;
       int ans3= Integer.MIN_VALUE;
       for(i=0;i<5;i++)
{

            if(arr[i]==max1 || arr[i]==max){
            continue;
            }
            if( arr[i]>ans3)
            {
                ans3=arr[i];
            }
        
    }
        System.out.println("third max  is "+ ans3);

       
    }
}    
  