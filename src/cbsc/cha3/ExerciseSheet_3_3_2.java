package cbsc.cha3;
/*
 * ��ƶ�
 * ����ʵ�������Ҫ��ʽ��������ϰ��
 * ���Կ�������ƶ���Exercise�Ĳ�����
 */
public class ExerciseSheet_3_3_2 {

	public static void main(String[] args) {
		// int count=50;
		// int columns=5;
		Exercise_3_2_2 exercise = new Exercise_3_2_2();
		exercise.generateAdditionExercise(4);
		System.out.println("---- generate and display add exercises ----");
		exercise.formattedDisplay(-1);
		exercise.clear();
		System.out.println("---- generate and display exercises ----");
		exercise.generateSubstractExercise(20);
		exercise.formattedDisplay();
		
		System.out.println("----methods that should not permitted ----");
		System.out.println("---- exercise.remove(1) ----");
		exercise.remove(1);
		exercise.formattedDisplay ();
		System.out.println("---- exercise.remove(1) ----");
		exercise.set(2,new AdditionOperation());
		exercise.formattedDisplay();
	}

}
