import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class authTest {
    @Test
    public void deveRetornarAuthKeyDefault(){
        UserDefault userDefault = new UserDefault("joao");
        UserAuthGenerator authGenerator = new UserAuthGenerator();

        Assertions.assertEquals("898a76ds81b1b31hj4g-joao-DEF", authGenerator.generateAuthKey(userDefault));
    }
    @Test
    public void deveRetornarAuthKeyRoot(){
        UserRoot userRoot = new UserRoot("r00t");
        UserAuthGenerator authGenerator = new UserAuthGenerator();

        Assertions.assertEquals("0a89987czx987cx98871239-r00t-ROOT", authGenerator.generateAuthKey(userRoot));
    }
    @Test
    public void deveRetornarAuthKeyAnonymous(){
        UserAnonymous userAnonymous = new UserAnonymous();
        UserAuthGenerator authGenerator = new UserAuthGenerator();

        Assertions.assertEquals("12841b10as0010230-ANON", authGenerator.generateAuthKey(userAnonymous));
    }
}
