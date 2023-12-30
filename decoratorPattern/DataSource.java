package decoratorPattern;

public interface DataSource {
	void writeData(String data);

    String readData();
}
