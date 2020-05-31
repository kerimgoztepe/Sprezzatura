package JavaCybertekEU.assignment_EU2.assignment14_krm.Question12;

public class CameraPhone extends tasks.assignment_14.Question12.Phone {
	
	int imageSize;
	int memorySize;
	
	
	public CameraPhone(int imageSize, int memorySize) {		
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures () {
		return (memorySize*1000)/imageSize;
	}
	
	
	
	

}
