package Keywords;

public class TestDriveWay {

	public static void main(String[] args) {
		DriveWay tofael = new DriveWay();
		tofael.setDriveWaySize(6);
		System.out.println(tofael.getDriveWaySize());
		
		
		DriveWay arif = new DriveWay();
		arif.setDriveWaySize(7);
		System.out.println(arif.getDriveWaySize());
		
		System.out.println("Arif's drive way size: "+arif.getDriveWaySize());
		System.out.println("Tofael's drive way size: "+tofael.getDriveWaySize());
	
		
	DriveWay.buildDriveWay();
	}

}
