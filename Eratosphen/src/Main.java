import java.util.Scanner;

class list{
    int num;
    list next;
    list back;
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max, max1;
        max = in.nextInt();
        max1 = max;

        list root;
        list p = new list();
        root = p;

        for (int i = 2; i <= max; i++) {
            p.num = i;
            list m = new list();
            p.next = m;
            m.back = p;
            m = p;
        }

        p = root.next;
        for (int i = 2; i <= max - 1; i++) {
            for (int j = i + 1; j < max; j++)
                if (0 == (p.num % i)) {
                    p.back = p.next;
                    p.next.back = p.back;
                    p = p.next;
                    max1--;
                }
        }
        p = root;
        for (int i = 0; i< max1; i++) {
            System.out.print(p.num + ' ');
            p = p.next;
        }
    }
}
