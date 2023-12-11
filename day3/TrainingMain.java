package day3;

public class TrainingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OfflineTraining offtrg = new OfflineTraining("oop",10,"YCP");
        String offtrgModule = offtrg.getModuleName();
        System.out.println("Module Name "+offtrgModule);
        offtrg.conductTraining();
     
        OnlineTraining ontrg = new OnlineTraining("NodeJs" ,5 , "www.zoom.us");
        String ontrgModule = ontrg.getModuleName();
        System.out.println("Module Name "+ontrgModule);
        ontrg.conductTraining();
	}

}
