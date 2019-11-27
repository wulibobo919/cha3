package cbsc.cha3;

public class BinaryOperationTester {
	public static void main(String[] args) {
		// 设计一：只有一个类，设计二：有两个子类
		BinaryOperation_3_2 bop;
        System.out.println("test1:constructor('+')");   
        for (int i=0; i<10; i++){
        	bop = new AdditionOperation();
        	System.out.println(bop);
        }
        System.out.println("test1:constructor('-')");   
        for (int i=0; i<10; i++){
        	bop = new SubstractOperation();
        	System.out.println(bop);
        }
        /*
        System.out.println("\ntest2:constructor('+')");   
        for (int i=0; i<10; i++){
        	System.out.println(""+i+": "+(biop.generateAdditionOperation()).asString());
        }
        System.out.println("\ntest3:constructor('-')");   
        for (int i=0; i<10; i++){
        	System.out.println(""+i+": "+(biop.generateSubstractOperation()).fullString());
        }
        */
        /* 不能直接使用下面的构造器，因为产生了不满足约束条件的算式
        System.out.println("\ntest4:constructor(a,b,c)");   
        System.out.println("1:"+new BinaryOperation_3_1(33,34,'+').fullString());
        System.out.println("2:"+new BinaryOperation_3_1(26,94,'+').fullString());
        System.out.println("3:"+new BinaryOperation_3_1(3,50,'-').fullString());
		*/
	}

}
