package kjsGitHubTest2;

public class StudentVO extends MemberVO {
	private int StudentNum;

	public StudentVO() {
		super();
	}

	public StudentVO(int studentNum) {
		super();
		StudentNum = studentNum;
	}

	public int getStudentNum() {
		return StudentNum;
	}

	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}

	@Override
	public String toString() {
		return "StudentVO [StudentNum=" + StudentNum + "]";
	}

}
