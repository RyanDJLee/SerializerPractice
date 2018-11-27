import java.io.Serializable;

public class LocalDateTime implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7327728897844507176L;
	public String date;
	public Integer time;

	public LocalDateTime(String date, Integer time) {
		this.date = date;
		this.time = time;
	}

	public String displayDate() {
		return this.date;
	}
	
	public Integer displayTime() {
		return this.time;
	}
}
