public class RestaurantNotFoundException extends Throwable {
	private static final long serialVersionUID = 1666441458600048043L;

	public RestaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }
}
