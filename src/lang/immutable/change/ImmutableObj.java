package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변 객체의 값을 변경하기 위한 코드.
    // 기존 객체의 값을 변경하지 않고 새로운 객체를 만들어서 반환한다.
    public ImmutableObj add(int num) {
        return new ImmutableObj(value + num);
    }

    public int getValue() {
        return value;
    }

}
