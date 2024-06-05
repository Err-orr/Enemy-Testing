public class Doge {
  private double health;
  private double attack;
  private double magnification;
  private String trait;

  // Constructor for Doge
  public Doge(double health, double attack, double magnification, String trait) {
    this.health = health;
    this.attack = attack;
    this.magnification = magnification;
    this.trait = trait;
  }

  public double getHealth() {
    return health;
  }

  public void magnificationStats() {
    if (this.magnification > 1) {
      this.health *= this.magnification;
      this.attack *= this.magnification;
    } else if (this.magnification < 1) {
      this.health *= this.magnification;
      this.attack *= this.magnification;
    } else if (this.magnification == 1) {
      System.out.println("Your doge is perfectly balanced.");
    } else {
      System.out.println("You can't have a negative magnification. The magnification is set to 1.");
      this.magnification = 1;
    }
  }

  public void takeDamage(double damage) {
    health -= damage;
    System.out.println(trait + " Doge takes " + damage + " damage!");
    if (health <= 0) {
      System.out.println(trait + " Doge is defeated!");
    } else {
      System.out.println(trait + " Doge's remaining health: " + health);
    }
  }

  // Getters and setters for Doge attributes if needed
  // ...
}