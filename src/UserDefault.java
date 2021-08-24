public class UserDefault implements User{
    private String name;

    public UserDefault(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String auth(AuthGenerator authGenerator) {
        return authGenerator.generateUserDefaultAuthKey(this);
    }
}
