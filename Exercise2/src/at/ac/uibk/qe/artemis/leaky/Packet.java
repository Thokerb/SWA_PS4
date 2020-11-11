package at.ac.uibk.qe.artemis.leaky;

public class Packet implements LeakyBucketPatternInterface.IPacket {
    @Override
    public byte[] payLoad() {
        return new byte[0];
    }
}
