public class Dibujo implements Runnable{

	private final Board tablero;
	
	public hiloPintor(Board board ) {
		tablero=board;
	}

	@Override
	public void run() {
		while(true) {
			try {
				tablero.repaint();
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}		
	}
}
