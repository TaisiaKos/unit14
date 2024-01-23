public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товара с именем " + id + " не найдено!");
    }
}
