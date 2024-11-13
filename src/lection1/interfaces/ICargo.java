package lection1.interfaces;

import lection1.helicopters.supportive.Cargo;

public interface ICargo {
    public boolean toLoad(Cargo cargo);
    public Cargo toUnload();
    public void showCargoList();
}
