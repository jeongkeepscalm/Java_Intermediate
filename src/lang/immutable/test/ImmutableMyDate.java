package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 불변 객체의 값을 변경하는 경우 관례저으로 with_% 를 사용한다.
    // with_% : 해당 메서드가 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다.
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, this.month, this.day);
    }
    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(this.year, month, this.day);
    }

    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
