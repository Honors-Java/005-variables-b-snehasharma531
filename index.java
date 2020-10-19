int rectX = 160;
int rectY = 90;
int width = 180;
int r = 255;
int g = 0;
int b = 0;
int radius = 10;




void setup() {
	size(500, 500);
  background(0);
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

  // background(0);
  stroke(0);
  fill(r,g,b);
  rect(rectX,rectY,rectX,width);
  stroke(0);
  fill(int(random(1,200)),int(random(1,20)),int(random(20,250)));
  ellipse(mouseX+random(20)+random(-20),mouseY+random(20)+random(-20),radius,radius);
 
}
void mousePressed(){
  background(255);
  r = random(0,255);
  g = random(0,200);
  b = random(100,200);
  rectX = random(0,500); 
  rectY = random(0,500);
  width = random(0,500);
}
