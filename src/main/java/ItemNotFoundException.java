public class ItemNotFoundException extends Throwable {
	private static final long serialVersionUID = -5233454316587334638L;

	public ItemNotFoundException(String itemName) {
        super(itemName);
    }
}
