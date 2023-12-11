package day11;

public class TrainingProgram {

	private String name;
	private int duration;
	private TrainingMode modeOfTraining;
	public TrainingProgram() {
		// TODO Auto-generated constructor stub
		name="art of living";
		duration=3;
		modeOfTraining=TrainingMode.OFFLINE;
	}
	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", duration=" + duration + ", modeOfTraining=" + modeOfTraining + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public TrainingMode getModeOfTraining() {
		return modeOfTraining;
	}
	public void setModeOfTraining(TrainingMode modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}
	public TrainingProgram(String name, int duration, TrainingMode modeOfTraining) {
		super();
		this.name = name;
		this.duration = duration;
		this.modeOfTraining = modeOfTraining;
	}

}
