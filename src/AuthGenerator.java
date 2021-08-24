public interface AuthGenerator {
    String generateUserAnonymousAuthKey(UserAnonymous userAnonymous);
    String generateUserRootAuthKey(UserRoot userRootAuthKey);
    String generateUserDefaultAuthKey(UserDefault userDefaultAuthKey);
}
