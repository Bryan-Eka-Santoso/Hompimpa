import java.util.*;

public class App {
    public static void printSprite(Player player, Enemy enemy){
        String[] playerLines = player.getSprite().split("\n");
        String[] enemyLines = enemy.getSprite().split("\n");
        int maxLines = Math.max(playerLines.length, enemyLines.length);
        for (int i = 0; i < maxLines; i++) {
        String playerLine = (i < playerLines.length) ? playerLines[i] : "";
        String enemyLine = (i < enemyLines.length) ? enemyLines[i] : "";
        System.out.printf("%-20s %s%n", playerLine, enemyLine);
        }
    }

    public static void runGame(Player player, Enemy enemy, Scanner scanI, Random rand){
        int inputPlayer;
        player.startDialog();
        enemy.startDialog();

        do {
            int getRandom = rand.nextInt(3) + 1;
            printSprite(player, enemy);
            System.out.println("==================================================");
            System.out.printf("| %-21s | %-22s |\n", player.nama, enemy.nama);
            System.out.printf("| Life: %-15s | Life: %-16s |\n", player.life, enemy.life);
            System.out.println("==================================================");
            System.out.println("| [1] HOM              [2] PIM            [3] PA |");
            System.out.println("==================================================");
            do {
                System.out.print(">> ");
                inputPlayer = scanI.nextInt();
            } while(inputPlayer < 1 || inputPlayer > 3);

            if ((inputPlayer == 1 && getRandom == 3) || (inputPlayer == 2 && getRandom == 1) || (inputPlayer == 3 && getRandom == 2)){
                player.actionDialog(inputPlayer);
                enemy.actionDialog(getRandom);
                player.victoryDialog();
                enemy.defeatDialog();
                enemy.life -= 1;
            } else if (inputPlayer == getRandom){
                player.actionDialog(inputPlayer);
                enemy.actionDialog(getRandom);
            } else {
                player.actionDialog(inputPlayer);
                enemy.actionDialog(getRandom);
                enemy.victoryDialog();
                player.defeatDialog();
                player.life -= 1;
            }

        } while(enemy.life != 0 && player.life != 0);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanI = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        Random rand = new Random();
        String nama;

        do {
            System.out.println("=== HOM-PIM-PA ===");
            System.out.print("Nama : ");
            nama = scanS.nextLine();
            if(nama.isEmpty()){
                System.out.println("Nama tidak boleh kosong");
            } else if(nama.length() != 5){
                System.out.println("Nama harus 5 karakter");
            }
        } while(nama.isEmpty() || nama.length() != 5);
        Player player = new Player(nama);
        System.out.println("Selamat datang, " + player.nama);
        Kangsihir enemyKangsihir = new Kangsihir();
        runGame(player, enemyKangsihir, scanI, rand);
    }
}
