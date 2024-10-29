package lection1.interfaces;

import lection1.helicopters.supportive.Pilot;

public interface IPilotable <T extends Pilot>{
    T getThePilot();
    void setThePilot(T pilot);
}
