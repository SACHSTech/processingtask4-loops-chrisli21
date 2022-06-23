import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255,255,255);
  }
  public void draw() {

    strokeweight((float)0.003*height);
    stroke(0,0,0);

    // 1
    for (int i = height/20; 1 <= height/2; i += height/20){
      line(i,0,i, height/2);
      line(0,1, width/2, i);
    }
	  // 2
    fill(207,0, 158);
    for (int circleY = ((height)/14); circleY <= ((height/14)*7); circleY += ((height)/11)) {
      for(int circleX = ((width)/14)*250; circleX <= ((width/14)*7)*250; circleX += ((width)/11)){
        ellipse(circleX, circleY, 25, 25);
      }
    }
	  // 3
    strokeweight((float)0.002*height);
    for (int i = 0; i <= height/2; i++){
      stroke(i,i,i);
      line(1, height/2, i, height);
    }

    // 4
    for (int intAngle = 0; intAngle < 300; intAngle += 45){
      stroke(0,0,0);
      strokeweight(1);
      fill(255, 3, 3);

      pushmatrix();
      translate(width * 3 / 4, height * 3 / 4);
      rotate(radians(intAngle));
      ellipse(0, 0, width / 20, height / 3);
      popmatrix();
      
    }

    fill(0, 163, 52);
    nostroke();
    ellipse((width/2)*width/4, (height/2)+height/4, 50, 50);
}

