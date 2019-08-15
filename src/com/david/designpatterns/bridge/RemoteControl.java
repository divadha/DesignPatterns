package com.david.designpatterns.bridge;

public class RemoteControl {

  private int buttonPressed = 0;

  public static final int VOLUME_UP = 1;
  public static final int VOLUME_DOWN = 2;
  public static final int TURN_ON = 3;
  public static final int TURN_OFF = 4;
  public static final int NEXT_CHANNEL = 5;
  public static final int PREVIOUS_CHANNEL = 6;

  public void pressAButton(int button) {
    System.out.println("REMOTE CONTROL CHANGED");
    System.out.print("\t\t");
    switch (button) {
      case VOLUME_UP:
        System.out.println("User press volume up");
        break;
      case VOLUME_DOWN:
        System.out.println("User press volume down");
        break;
      case TURN_ON:
        System.out.println("User press turn on");
        break;
      case TURN_OFF:
        System.out.println("User press turn off");
        break;
      case NEXT_CHANNEL:
        System.out.println("User press next channel");
        break;
      case PREVIOUS_CHANNEL:
        System.out.println("User press previous channel");
        break;
    }
    buttonPressed = button;
  }

  public int getButtonPressed() {
    return buttonPressed;
  }
}
