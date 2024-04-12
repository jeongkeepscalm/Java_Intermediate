package enumeration.test;

public enum AuthGrade {

    GUEST(1, "손님", new String[]{"메인화면"})
    , LOGIN(2, "로그인 회원", new String[]{"메인화면", "이메일 관리 화면"})
    , ADMIN(3, "관리자", new String[]{"메인화면", "이메일 관리 화면", "관리자 화면"});

    private final int level;
    private final String description;

    private final String[] authmenu;

    AuthGrade(int level, String description, String[] authmenu) {
        this.level = level;
        this.description = description;
        this.authmenu = authmenu;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String[] getAuthmenu() {
        return authmenu;
    }
}
