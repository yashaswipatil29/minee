package day11;

import java.util.Arrays;
import java.util.List;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingProgram program1 = new TrainingProgram();
		TrainingProgram program2=new TrainingProgram("stress management",2,TrainingMode.HYBRID);
		TrainingProgram program3=new TrainingProgram("communication skills",4,TrainingMode.HYBRID);
		TrainingProgram program4=new TrainingProgram("health management",6,TrainingMode.ONLINE);
		TrainingProgram program5=new TrainingProgram("Interview skills",8,TrainingMode.ONLINE);

		//instead of add list 5 times use arrays prdefined method
		List<TrainingProgram> allTrainingProgram=Arrays.asList(program1,program2,program3,program4,program5);
		
		
		//displaying training programs having mode as HYBRID
		
		for(TrainingProgram currentProgram : allTrainingProgram)
		{
			TrainingMode currentMode = currentProgram.getModeOfTraining();
			if(currentMode.equals(TrainingMode.HYBRID))
			{
				System.out.println(currentProgram);

				//System.out.println(currentProgram.getName());
			}
		}

	}

}
