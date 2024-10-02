package interfaces;

import helicopters.supportive.Cargo;

public interface ICargo {
    public boolean toLoad(Cargo cargo);
    public Cargo toUnload();
    public void showCargoList();
}
