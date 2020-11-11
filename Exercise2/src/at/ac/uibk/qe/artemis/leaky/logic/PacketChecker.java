package at.ac.uibk.qe.artemis.leaky.logic;

import at.ac.uibk.qe.artemis.leaky.LeakyBucketPatternInterface;

import static java.lang.System.currentTimeMillis;

public class PacketChecker implements LeakyBucketPatternInterface {

    private int errorsPerSec = 0;
    private long lastTimeStamp = currentTimeMillis();
    private int currentError = 0;

    @Override
    public void setErrorRate(int errorsPerSec) {
        this.errorsPerSec = errorsPerSec;
    }

    @Override
    public void receivePacket(IPotentiallyFaultyPacket potentiallyFaultyPacket) throws TooManyErrorsException {
        if(currentTimeMillis() - lastTimeStamp > 1000){
            lastTimeStamp = currentTimeMillis();
            currentError = 0;
        }
        if(potentiallyFaultyPacket.isFaulty()){
            currentError = currentError + 1;
        }

        if(currentError > errorsPerSec){
            throw new TooManyErrorsException();
        }

    }
}
