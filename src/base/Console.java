package base;

public class Console {
    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")
                    || System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
