package com.david.designpatterns.bridge;

public class Bridge {

  public static void main(String[] args) {
    Tv sony = new Tv();
    RemoteControl control = new RemoteControl();

    System.out.println("Turn on the TV using the remote control\n");
    control.pressAButton(RemoteControl.TURN_ON);
    apply(sony, control);
    control.pressAButton(RemoteControl.VOLUME_UP);
    apply(sony, control);
    control.pressAButton(RemoteControl.NEXT_CHANNEL);
    apply(sony, control);
    control.pressAButton(RemoteControl.NEXT_CHANNEL);
    apply(sony, control);
    sony.show();

    System.out.println("\n\nTurn off the TV using the remote control\n");
    control.pressAButton(RemoteControl.VOLUME_DOWN);
    apply(sony, control);
    control.pressAButton(RemoteControl.PREVIOUS_CHANNEL);
    apply(sony, control);
    control.pressAButton(RemoteControl.TURN_OFF);
    apply(sony, control);
    sony.show();
  }

  /**
   * This is the real Bridge implementation. When a button in the remote control is pressed the TV
   * need to change.
   *
   * @param tv
   * @param control
   */
  public static void apply(Tv tv, RemoteControl control) {
    switch (control.getButtonPressed()) {
      case RemoteControl.TURN_ON:
        tv.setOn(true);
        break;
      case RemoteControl.TURN_OFF:
        tv.setOn(false);
        break;
      case RemoteControl.NEXT_CHANNEL:
        tv.setChannel(tv.getChannel() + 1);
        break;
      case RemoteControl.PREVIOUS_CHANNEL:
        tv.setChannel(tv.getChannel() - 1);
        break;
      case RemoteControl.VOLUME_UP:
        tv.setVolume(tv.getVolume() + 10);
        break;
      case RemoteControl.VOLUME_DOWN:
        tv.setVolume(tv.getVolume() - 10);
        break;
    }
  }
}
