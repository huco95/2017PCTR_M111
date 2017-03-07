package p01;

public class ThreadBall implements Runnable {

	private Ball ball;
	private Board board;

	public ThreadBall(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		try {
			while (true) {
				ball.move();
				ball.reflect();
				board.repaint();
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

}