package kjsGitHubTest2;

public class MemberVO {
	String name;
	int age;

	public MemberVO() {
		super();
	}

	public MemberVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + "]";
	}

}
