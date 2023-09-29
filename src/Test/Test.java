package Test;

public class Test {

    public static void main(String[] args) {
        // Calling the method with different lengths
        String randomName1 = RandomStringUtils.generateRandomString(5);
        String randomName2 = RandomStringUtils.generateRandomString(8);
        String randomName3 = RandomStringUtils.generateRandomString(56);

        // Printing statements based on the results
        System.out.println("Generated random name 1: " + randomName1);
        System.out.println("Generated random name 2: " + randomName2);
        System.out.println("Generated random name 3: " + randomName3);
    }
}
