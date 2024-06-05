public class Player {
  private double attackPower;
  private double health;
  public Player(double attackPower, double health) {
    this.attackPower = attackPower;
    this.health = health;
  }
  public double getHealth() {
    return this.health;
  }  
  public void setAttackPower(double attackPower) {
    this.attackPower = attackPower;
  }
  public void attack(Doge enemy) {
    enemy.takeDamage(attackPower);
  }
  public void takeDamage(double damage) {
    health -= damage;
    System.out.println("Player took " + damage + " damage.");
    if (health <= 0) {
      System.out.println("Player died.");
    }
  }
}