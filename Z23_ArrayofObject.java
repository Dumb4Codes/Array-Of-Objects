
public class Z23_ArrayofObject {

	public static void main(String[] args) {
		
		
		//Food[] refrigerator = new Food[3]; 
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
	
		
		Food[] refrigerator = {food1, food2, food3};  //use after declaring food1 or so
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		
		//for(int i = 0; i<refrigerator.length; i++) {
		//	System.out.println(refrigerator[i].name);
		//}

	}

}
