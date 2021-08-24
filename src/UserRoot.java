public class UserRoot implements User{
    private String name;

    @Override
    public String auth(AuthGenerator authGenerator) {
        return authGenerator.generateUserRootAuthKey(this);
    }

    public UserRoot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
