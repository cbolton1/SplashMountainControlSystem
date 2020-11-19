
public class SplashMountainControlSystem {

	public static void main(String[] args) {
		//TODO:
		//create log with n seats and m passengers
		Log log1 = new Log();
		//if log is empty, it will be cleaned before the passengers can board
		if(log1.getLogFull()){
			log1.clean = false;
		}else{
			log1.clean = true;
			//after log is cleaned start boarding
			
		}
		//riders board after it is cleaned one by one until full
		//log rides
		//riders get off one by one

	}

}
