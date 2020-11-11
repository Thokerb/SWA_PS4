package at.ac.uibk.qe.artemis.leaky;

public class PotentiallyFaultyPacket implements LeakyBucketPatternInterface.IPotentiallyFaultyPacket {

    private boolean isFaulty;

    public PotentiallyFaultyPacket(boolean isFaulty){
        this.isFaulty = isFaulty;
    }

    @Override
    public byte[] payLoad() {
        return new byte[0];
    }

    @Override
    public boolean isFaulty() {
        return this.isFaulty;
    }
}
