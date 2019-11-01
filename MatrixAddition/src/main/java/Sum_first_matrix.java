import java.util.*;
class Sum_first_matrix
{
Scanner obj;
int m,n,i,j;
int [][] a;
int [][] b;
int [][] c;
public void matrix_create()
{
 obj=new Scanner(System.in);
System.out.println("Enter The rows and columns");
 m=obj.nextInt();
 n=obj.nextInt();
System.out.println("Enter the array elements");
 a=new int[m][n];
 b=new int [m][n];
 c=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=obj.nextInt();
}
}
}
 void display()
{
System.out.println("The array is");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("\t" + a[i][j]);
}
System.out.println();
}
}
public void second_matrix_create()
{
 
System.out.println("Enter the Second array elements");
 
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=obj.nextInt();
}
}
}
 void second_display()
{
System.out.println("The array is");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("\t" + b[i][j]);
}
System.out.println();
}
}
}
class Second_matrix extends Sum_first_matrix
{
public void add()
{
 
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]= a[i][j] + b[i][j];
}
}
}
void add_display()
{
System.out.println("The Summed array is");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("\t" + c[i][j]);
}
System.out.println();
}
}
}
class Main
{
public static void main(String args[])
{
Second_matrix obj1=new Second_matrix();
obj1.matrix_create();
obj1.display();
obj1.second_matrix_create();
obj1.second_display();
obj1.add();
obj1.add_display();
}
}