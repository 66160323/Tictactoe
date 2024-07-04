import java.util.Scanner;
public class Game
{
    private char[][]board = new char[3][3];
    private static char Player = 'X';
    public static void main(String[]args)
    {
    System.out.println("Welcome to Tic Tac Toe Game");           
    BOARD(); 
        while(true)
        makeMove();

        

    }
    private static void BOARD()
    {
        for (int i = 0; i<3; i++) 
        {
            for (int j = 0; j<3; j++)
            {
                System.out.print("-");
            }
        System.out.println();
        }
    }
    private static void makeMove()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("เลือกแถวที่ต้องการ");
        int row = scanner.nextInt() -1;

        System.out.print("เลือกคอลัมน์ที่ต้องการ");
        int col = scanner.nextInt() -1;
        
        if (row < 0 || row > 2 || col < 0 || col >2)
        {
            System.out.println("ค่าไม่ถูกต้อง กรุณาเลือกแถวและคอลัมน์ระหว่าง 1 ถึง 3");
            return;
        }
        System.out.print("รับค่า");
        int newmove = scanner.nextInt();

        board[row][col] = newmove;
        System.out.println();
        
    }
}
