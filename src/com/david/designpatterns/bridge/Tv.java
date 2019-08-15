package com.david.designpatterns.bridge;

public class Tv {

  private boolean on = false;
  private int channel = 0;
  private int volume = 10;

  public void show() {
    System.out.println("\n\t\t DETAILS ABOUT TV");
    System.out.println("Tv is " + (on ? "ON" : "OFF"));
    System.out.println("Showing channel " + channel);
    System.out.println("Volume level is " + volume);
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
