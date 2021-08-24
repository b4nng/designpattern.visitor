public class UserAuthGenerator implements AuthGenerator{
    public String generateAuthKey(User user){return user.auth(this);}


    //Imagine que são métodos que geram HASHES aleatórias
    @Override
    public String generateUserAnonymousAuthKey(UserAnonymous userAnonymous) {
        return "12841b10as0010230"+"-ANON";
    }

    @Override
    public String generateUserRootAuthKey(UserRoot userRoot) {
        return "0a89987czx987cx98871239"+"-"+userRoot.getName()+"-ROOT";
    }

    @Override
    public String generateUserDefaultAuthKey(UserDefault userDefault) {
        return "898a76ds81b1b31hj4g"+"-"+userDefault.getName()+"-DEF";
    }
}
