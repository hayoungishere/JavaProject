
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Car car = new Car();
		car.setCarModel("±×·£Àú");
		car.setCarColor("ÆÄ¶û");
		
		
		System.out.println("¸ðµ¨ : "+car.getCarModel()+"\n»ö»ó : " + car.getCarColor());
	
		System.out.println(car.toString());
	
		
		car=null;
		
		System.gc(); //Garbage Collector ½ÇÇàµÊ.
	}

}
