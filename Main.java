import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n,m=0,flag=0,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
m=n/2;    
  for(i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
}  
}  
