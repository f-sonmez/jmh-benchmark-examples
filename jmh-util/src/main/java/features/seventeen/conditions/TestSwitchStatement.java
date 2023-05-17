package features.seventeen.conditions;

public class TestSwitchStatement {

    public static void main(String[] args) {
        long startedTime = System.nanoTime();
        System.out.println(sayHelloWithIfStatement(Country.WORLD));
        long endTime = System.nanoTime();
        System.out.println(endTime - startedTime);

        // new feature for switch statement
        // 1176000

        // previous switch statement
        // 1931200

        // if statement
        // 688600

    }


    /**
     * <a href="https://openjdk.org/jeps/406">For more detail...</a>
     * new feature for switch statement
     *
     * @param country
     * @return
     */
    private static String sayHello(Country country) {
        return switch (country) {
            case TURKIYE -> "Hi, Turkiye, the most interesting country in the world. Anytime anything might happen";
            case GERMANY -> "Hi, Germany (Delivery hero! :) )";
            case ENGLAND -> "Hi, England (Premier League)";
            case USA -> "Hi, money oh sorry :) hi, USA";
            default -> "Hello, World";
        };
    }

    /**
     * previous switch statement
     *
     * @param country
     * @return
     */
    private static String sayHelloPrevious(Country country) {
        String message = "";
        switch (country) {
            case TURKIYE:
                message = "Hi, Turkiye, the most interesting and exciting country in the world. Anytime anything might happen";
                break;
            case GERMANY:
                message = "Hi, Germany (Delivery hero! :) )";
                break;
            case ENGLAND:
                message = "Hi, England (Premier League)";
                break;
            case USA:
                message = "Hi, money oh sorry :) hi, USA";
                break;
            default:
                message = "Hello, World";
                break;
        }
        return message;
    }

    private static String sayHelloWithIfStatement(Country country) {
        String message = "";
        if (country.equals(Country.TURKIYE)) {
            message = "Hi, Turkiye, the most interesting and exciting country in the world. Anytime anything might happen";
        } else if (country.equals(Country.GERMANY)) {
            message = "Hi, Germany (Delivery hero! :) )";
        } else if (country.equals(Country.ENGLAND)) {
            message = "Hi, England (Premier League)";
        } else if (country.equals(Country.USA)) {
            message = "Hi, money oh sorry :) hi, USA";
        } else {
            message = "Hello, World";
        }

        return message;
    }

    public enum Country {
        TURKIYE,
        GERMANY,
        ENGLAND,
        USA,
        WORLD
    }
}
