

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
	private Ball ball1;
	private Ball ball2;
	private Timeline animation;

	public BallPane(int startWidth, int startHeight) {
		ball1 = new Ball(1, 1, 20, 20, 20, Color.GREEN);
		ball2 = new Ball(1, 1, 20, startWidth - 20, startHeight - 20, Color.BLUE);
		getChildren().addAll(ball1.getCircle(), ball2.getCircle()); // Place a ball into this pane

		// Create an animation for moving the balls
		animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation
	}

	public void play() {
		animation.play();
	}

	public void pause() {
		animation.pause();
	}

	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 0.1);
	}

	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	}

	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}

	protected void moveBall() {
		ball1.moveBall();
		ball2.moveBall();
	}

	class Ball {
		Circle circle;
		double dx, dy, radius;
		double x, y;
		Color color;

		public Ball(double dx, double dy, double radius, double startX, double startY, Color color) {
			super();
			this.dx = dx;
			this.dy = dy;
			this.radius = radius;
			this.x = startX;
			this.y = startY;
			this.color = color;
			this.circle = new Circle(x, y, radius);
			this.circle.setFill(color);
		}
		
		public Circle getCircle() {
			return circle;
		}
		
		void moveBall() {
			// Check boundaries
			if (x < radius || x > getWidth() - radius) {
				dx *= -1; // Change ball move direction
			}
			if (y < radius || y > getHeight() - radius) {
				dy *= -1; // Change ball move direction
			}

			// Adjust ball position
			x += dx;
			y += dy;
			circle.setCenterX(x);
			circle.setCenterY(y);
		}

	}
}
