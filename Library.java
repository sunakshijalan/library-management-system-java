import java.util.Scanner;
class library
{
    String arr[];
    int n;
    int top;
    library(int nn)
    {
        n=nn;
        arr=new String[n];
        top=0;
    }
    void add(String s)
    {
        if(top==n)
            System.out.println("Library Full!");
        else
        {
            boolean flag=false;
            for(int i=0;i<top;i++)
            {
                if(arr[i].equalsIgnoreCase(s))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
                System.out.println("Book already exists in the library!");
            else
            {
                arr[top++]=s;
                System.out.println("Book Added");
            }
        }
    }
    void pop()
    {
        if(top==0)
            System.out.println("Library Empty");
        else
            System.out.println("The book is: "+arr[--top]);
    }
    void display()
    {
        if(top==0)
            System.out.println("No books added yet!");
        else
        {
            System.out.println("Books in the library: ");
            for(int i=0;i<top;i++)
            {
                System.out.println(i+1+". "+arr[i]);
            }
        }
    }
    void search(String s)
    {
        boolean flag=false;
        for(int i=0;i<top;i++)
        {
            if(arr[i].equalsIgnoreCase(s))
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("Book Found!");
        else
            System.out.println("Book Not Found!");
    }
    void count()
    {
        int count=0;
        for(int i=0;i<top;i++)
            count++;
        System.out.println("The total number of books is: "+count);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the library: ");
        int a=sc.nextInt();
        library ob=new library(a);
        while(true)
        {
            System.out.println("Enter Choice: \n1. Add Book\n2. Remove Book\n3. Search Book\n4. Display all Books\n5. Count total books\n6. Exit");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter book to add: ");
                    String s=sc.nextLine();
                    ob.add(s);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    System.out.println("Enter Book to search: ");
                    String s1=sc.nextLine();
                    ob.search(s1);
                    break;
                case 4:
                    ob.display();
                    break;
                case 5:
                    ob.count();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}