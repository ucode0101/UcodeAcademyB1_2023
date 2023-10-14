package day_54_java_versions_features;

public class Java15TextBlock {

    public static void main(String[] args) {

        // Regular way of String using double quotes
        String text = "Java is a versatile and powerful programming language " +
                "that enables developers to create robust, high-performance applications. " +
                "One common use for Java is developing Android apps. Android uses the Java " +
                "language but not the full Java SE platform. Other popular uses for Java include " +
                "web applications, big data, mobile application development, enterprise software " +
                "development, and more. Java is also a very popular language for enterprise applications. " +
                "It’s often used to build robust, scalable, and secure systems. Some of the world’s largest" +
                " companies use Java for mission-critical applications.";

        // Using Text block """ """
        String textBlock =
                """
                Java is a versatile and powerful programming language that enables
                developers to create robust, high-performance applications. One common
                use for Java is developing Android apps. Android uses the Java language
                but not the full Java SE platform. Other popular uses for Java include web
                 applications, big data, mobile application development, enterprise software development,
                 and more. Java is also a very popular language for enterprise applications.
                 It’s often used to build robust, scalable, and secure systems.
                 Some of the world’s largest companies use Java for mission-critical applications.
                 """;


    }
}
