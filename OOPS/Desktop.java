package OOPS;
public class Desktop extends Computer{
		public void desktopSize()
		{
			System.out.println("Size of ds Size is 32inch");
		}
		public static void main(String[]args) {
			Desktop pc=new Desktop();
			pc.ComputerModel();
			pc.desktopSize();
		}
	}

