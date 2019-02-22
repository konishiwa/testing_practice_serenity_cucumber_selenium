package automation.model;

public class TemplateModel {
	
	public int id;
	public String name;
	
	public TemplateModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TemplateModel() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
