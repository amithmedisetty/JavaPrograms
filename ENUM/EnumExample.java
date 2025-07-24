//Enums in Java are a special data type that enables a variable to be a set of predefined constants. They are used to define collections of constants that are logically related, making the code more readable and maintainable.
//They have private constructors, and each enum constant is a public static final instance of the enum type.
//Enums can have fields, methods, and constructors, and they can implement interfaces.
//It extends teh java.lang.Enum class, which provides methods like values(), valueOf(), and ordinal(), so it cannot extend any other class.
//It can have abstract methods, and each enum constant can provide its own implementation of these methods.
package ENUM;
public enum EnumExample {
    WINTER("Cold", 3),   // Each constant calls the constructor
    SPRING("Mild", 3),
    SUMMER("Hot", 3),
    FALL("Cool", 3);

    private final String description;
    private final int months;
    EnumExample(String description, int months) {
        this.description = description;
        this.months = months;
    }
    public String getDescription() {
        return description;
    }

    public int getMonths() {
        return months;
    }
    @Override
    public String toString() {
        return this.name() + " is " + description + " and lasts for " + months + " months.";
    }

    public static void main(String[] args) {
        EnumExample currentSeason = EnumExample.SUMMER;
        System.out.println("Current season: " + currentSeason.getDescription()); 
        System.out.println("Months in " + currentSeason + ": " + currentSeason.getMonths());
        for (EnumExample season : EnumExample.values()) {
            System.out.println(season);
        }
    }
}