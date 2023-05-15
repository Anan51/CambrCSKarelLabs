public void task() {
  goToCorner();
  for(int i = 0, i < 4, i++) {
    while(frontIsClear()) {
      pickBeeper();
    }
    if (wallOnRightAndLeft()) {
      putBeeper();
    }
    move();
    turnRight();
  }
}
