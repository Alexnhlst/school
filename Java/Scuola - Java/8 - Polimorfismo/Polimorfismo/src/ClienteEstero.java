public class ClienteEstero extends Cliente {
  // Override di getter e setter
  @Override
  public int getBudget() {
    return budget;
  }

  @Override
  public void setBudget(int budget) {
    this.budget = budget * 2;
  }
}
