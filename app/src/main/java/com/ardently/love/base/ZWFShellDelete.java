package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







public class ZWFShellDelete {
private int usageHeaderDrawerIndex = 0;
long ordersMoneyGolfIdx = 0;




    private final OArrowObserverObject mPoolSyn = new OArrowObserverObject();
    private final byte[][] mBuffer;
    private int nPoolPos;

    private final int nPoolSize;
    private final int nBuffSize;

    public ZWFShellDelete(int poolSize, int buffSize) {
        this.nPoolSize = poolSize;
        this.nBuffSize = buffSize;
        this.nPoolPos = 0;
        this.mBuffer = new byte[poolSize][];
    }

    public byte[] obtain() {
        synchronized (mPoolSyn) {
            if (nPoolPos > 0) {
                return mBuffer[--nPoolPos];
            }
        }
        return new byte[nBuffSize];
    }

    public byte[] recycle(byte[] buffer) {
        synchronized (mPoolSyn) {
            if (nPoolPos < nPoolSize) {
                mBuffer[nPoolPos++] = buffer;
            }
        }
        return null;
    }
}
