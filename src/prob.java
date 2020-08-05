import java.util.*;

public class prob {
    public static void main(String[] args) {
        int[]ar=new int[20];
        for (int i=0;i<=19;i++)
        {
            ar[i]=i;
        }
        for (int i=0;i<=19;i++)
        {
            System.out.println(ar[i]);
        }
        ArrayList arr=new ArrayList();
        arr.add("amit");
        arr.add(12);
        System.out.println(arr);

        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
      //  System.out.println(ll.contains(3));
        ll.add(2,5);
        System.out.println(ll);
        System.out.println(ll.size());
        Vector<Integer>vv=new Vector<>();
        vv.add(1);
        vv.add(2);
        vv.add(3);
        System.out.println(vv);
        HashSet hi=new HashSet();
        hi.add(1);
        hi.add(2);
        System.out.println(hi.add(2));
        Queue<Integer>qq=new LinkedList<>();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        System.out.println(qq.remove());

        Stack<Integer>Stack=new Stack<>();
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        System.out.println(Stack.pop());
        System.out.println(Stack.empty());
        String str=new String("hello");

        int sh[]={1,2,3,3};
        System.out.println(sh.length);
        LinkedList l2=new LinkedList();
        l2.push(43);




    }
}
