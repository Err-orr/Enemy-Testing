import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player(50.0); // Player with attack power of 50
    Doge enemyDoge = new Doge(90.0, 30.0, 1.2, "Traitless"); // Doge enemy with 100 health and other attributes
    enemyDoge.magnificationStats();
    while (enemyDoge.getHealth() > 0) {
      System.out.println("Enter attack power:");
      int attackPower = (int) (Math.random() * 20 + 1); // scanner.nextDouble();
      player.setAttackPower(attackPower);
      player.attack(enemyDoge); // Player attacks the Doge
    }

    scanner.close();
  }
}