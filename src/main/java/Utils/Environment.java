package Utils;

public class Environment {

    public Environment() {
    }

    public static String getEnvironment() {
        return System.getProperty("env", EnvironmentInterface.MOCK);
    }

    public interface EnvironmentInterface {
        String MOCK = "mock";
        String UAT = "uat";
    }
}
