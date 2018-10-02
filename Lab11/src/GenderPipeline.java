//everett yang 111756324
//note: this is not supposed to run anything...it's just rewriting the thing as asked in the exercise
//and idk where to put it
public class GenderPipeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roster
			.stream()
			.filter(e -> e.getGender() == Person.Sex.MALE)
			.forEach(e -> System.out.println(e.getName()));
	}

}
