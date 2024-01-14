import java.util.Scanner;

public class combination 
{
    private void genComb(String str, int r) 
    {
        int n = str.length();
        StringBuilder combination = new StringBuilder();
        genComUtil(str, combination, 0, n - 1, 0, r);
    }

    private void genComUtil(String str, StringBuilder c, int start, int end, int index, int r) {
        if (index == r) 
        {
            System.out.println(c.toString());
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) 
        {
            c.append(str.charAt(i));
            genComUtil(str, c, i + 1, end, index + 1, r);
            c.setLength(c.length() - 1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the combination length: ");
        int r = sc.nextInt();

        combination c = new combination();
        c.genComb(str, r);
    }
}
