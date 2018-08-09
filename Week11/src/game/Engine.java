package game;

public class Engine {
	private boolean idle;
	private String model;
	
	public Engine(String model) {
		setModel(model);
	}

	public boolean isStarted() {
		return idle;
	}

	public void start() {
		this.idle = true;
	}
	
	public void stop() {
		this.idle = false;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
