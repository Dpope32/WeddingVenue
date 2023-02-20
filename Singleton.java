// Singleton class for WeddingVenue
public class WeddingVenue {

    // Private static instance variable
    private static WeddingVenue instance;

    // Private constructor to prevent direct instantiation
    private WeddingVenue() {}

    // Public static method to get instance of the singleton
    public static WeddingVenue getInstance() {
        if (instance == null) {
            instance = new WeddingVenue();
        }
        return instance;
