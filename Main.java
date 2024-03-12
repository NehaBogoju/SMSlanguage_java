import java.util.Scanner;

class Main {
    static void replace(StringBuilder s1) {
        String[] r = {"yes", "you", "today", "why"};
        String[] rep = {"s", "u", "2day", "y"};
        StringBuilder buff = new StringBuilder();
        int i;
        int index;
        for (i = 0; i < 4; i++) {
            if ((index = s1.indexOf(r[i])) != -1) {
                buff.append(s1, 0, index);
                buff.append(rep[i]);
                buff.append(s1, index + r[i].length(), s1.length());
                s1.setLength(0);
                s1.append(buff);
                buff.setLength(0);
                replace(s1);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(scanner.nextLine());
        replace(s1);
        System.out.print(s1);
    }
}
