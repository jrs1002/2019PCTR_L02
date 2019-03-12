package PR02_PC;

public class Hilo implements Runnable{
	private final Ball privBall;

	public Hilo (Ball ball) {
		privBall=ball;

	}

	@Override
	public void run() {
		while(true) {
			privBall.move();
			try {
					Thread.sleep(20);
			} catch (InterruptedException e) {
					break;
			}
		}

	}
}
