public class UserAnonymous implements User{
    @Override
    public String auth(AuthGenerator authGenerator) {
        return authGenerator.generateUserAnonymousAuthKey(this);
    }
}
