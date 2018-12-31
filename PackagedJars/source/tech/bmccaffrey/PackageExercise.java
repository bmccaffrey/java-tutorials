package tech.bmccaffrey;

public class PackageExercise {

	public static void main(String[] args) {
		new PackageExercise().notifySuccess();
	}

	public void notifySuccess() {
		System.out.println("Success.");
		System.out.println("JAR'd package? Packaged JAR?");
		System.out.println("Either way, the proper class's main() is running as per the manifest.txt");
	}
}
