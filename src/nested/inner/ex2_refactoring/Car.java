package nested.inner.ex2_refactoring;

public class Car {

  private String model;
  private int chargeLevel;
  private Engine engine;

  public Car(String model, int chargeLevel) {
    this.model = model;
    this.chargeLevel = chargeLevel;
    this.engine = new Engine();
  }

  // Engine 에서만 사용하는 메소드
//  public String getModel() {
//    return model;
//  }

  // Engine 에서만 사용하는 메소드
//  public int getChargeLevel() {
//    return chargeLevel;
//  }

  public void start() {
    engine.start();
    System.out.println(model + " 시작 완료");
  }

  // 내부 클래스 적용.
  private class Engine {

    public void start() {
      // 외부 인스턴스 변수에 접근 가능.
      System.out.println("충전 레벨 확인: " + chargeLevel);
      System.out.println(model + "의 엔진을 구동합니다.");
    }

  }

}
