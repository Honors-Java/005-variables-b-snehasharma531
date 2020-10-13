int rectX = 160;
int rectY = 90;
int width = 180;
int circleX = 240;
int circleY = 185;
int radius = 80;




void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  background(0);
  stroke(0);
  fill(255,int(random(1,200)),100);
  rect(rectX,rectY,rectX,width);
  stroke(0);
  fill(int(random(1,200)),int(random(1,20)),int(random(20,250)));
  ellipse(circleX,circleY,radius,radius);
  circleX = circleX+2;
  circleY --; 
  radius = radius-0.5;
  

}
