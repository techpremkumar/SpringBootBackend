package withoutioc;

public class Service {

    private Repository repository = new Repository();

    public void execute() {
        repository.save();
    }
}