package com.ardently.love.fusion.lib.gms;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.fusion.lib.FQInfo;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;
import com.ardently.love.ref.NYHandlerInit;





public class OTUWidgetCustomize extends DOxygenConnectivity.WMoney {
private long helperSame_sum = 0;
private long methodsSpider_flag = 0;


    public static final String ACTION = "com.google.android.gms.measurement.START";
    public static final String DESC = "com.google.android.gms.common.internal.IGmsServiceBroker";


    private static PMWShowComplete GetServiceRequest;
    private static PBDMovability pkgName;
    private static PBDMovability CREATOR;

    private static Parcelable.Creator creator;
    private static NYHandlerInit writeParcelable;

    private void init() {
        if (GetServiceRequest == null) {
            GetServiceRequest = new PMWShowComplete(getAidl().forName("com.google.android.gms.common.internal.GetServiceRequest"));
            HashMap<String,Double> lightbulbq = new HashMap<String,Double>();
     lightbulbq.put("libswscale", 111.0);
     lightbulbq.put("overscrolling", 481.0);
     lightbulbq.put("smoothen", 825.0);
     lightbulbq.put("unempty", 665.0);
     lightbulbq.put("distances", 633.0);
             if (lightbulbq.size() > 176) {}
        }
        if (pkgName == null) {
            pkgName = GetServiceRequest.getField("zzd");
            ArrayList<String> firstd = new ArrayList<String>();
     firstd.add("rasterizes");
     firstd.add("bitmap");
     firstd.add("requiring");
             if (firstd.size() > 92) {}
        }

        PBDMovability[] CREATORs = GetServiceRequest.getFields("CREATOR", Parcelable.Creator.class);
            boolean download5 = true;
             while (!download5) { break; }
        if (CREATORs.length > 0) {
            creator = CREATORs[0].get(null, null);
            boolean lightS = true;
             if (!lightS) {}

            NYHandlerInit[] methods = new PMWShowComplete(creator.getClass()).getMethods(null, void.class, GetServiceRequest.get(), Parcel.class, int.class);
            String changedu = "chromamc";
            if (methods.length > 0) {
                writeParcelable = methods[0];
            float mobile7 = 1462.0f;
             if (mobile7 > 93) {}
            }
        }

    }


    @Override
    public boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        boolean ok = true;
        if(QRowsAudio.DBG_LOG)Log.e(QRowsAudio.TAG, "OTUWidgetCustomize.transact: " + code);
        if (code == 46) {
            init();
            data.setDataPosition(0);
            data.enforceInterface(getAidl().mDescriptor);
            IBinder IGmsCallbacks = data.readStrongBinder();
            Parcelable request = null;

            if (!pkgName.isNull() && data.readInt() != 0) {
                request = (Parcelable) creator.createFromParcel(data);

                pkgName.set(request, FQInfo.A.getPkgName());

                data = Parcel.obtain();
                data.writeInterfaceToken(getAidl().mDescriptor);
                data.writeStrongBinder(IGmsCallbacks);
                data.writeInt(1);

                writeParcelable.call(null, request, data, 0);
                ok = super.transact(code, data, reply, flags);

                data.recycle();
            }
        } else {
            ok = super.transact(code, data, reply, flags);
        }
        return ok;
    }


    static class RMatch extends DOxygenConnectivity.TPathDrawer {
int modityGlobalRows_tag = 0;
String selectArrayStr;
private double correctLayouts_size = 0.0;




        public RMatch(DOxygenConnectivity observer, IInterface stub) {
            super(observer, stub);
        }

        @Override
        protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            return super.onTransact(code, data, reply, flags);
        }
    }

}
