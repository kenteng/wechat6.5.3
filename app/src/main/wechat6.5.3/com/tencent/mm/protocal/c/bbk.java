package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class bbk extends aqp {
    public int mXq;
    public int mXr;
    public int mXs;
    public int mXt;
    public int scene;
    public String username;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.scene);
            aVar.dV(3, this.mXq);
            aVar.dV(4, this.mXr);
            aVar.dV(5, this.mXs);
            aVar.dV(6, this.mXt);
            if (this.username == null) {
                return 0;
            }
            aVar.e(7, this.username);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((((r0 + a.a.a.a.dS(2, this.scene)) + a.a.a.a.dS(3, this.mXq)) + a.a.a.a.dS(4, this.mXr)) + a.a.a.a.dS(5, this.mXs)) + a.a.a.a.dS(6, this.mXt);
            if (this.username != null) {
                r0 += a.a.a.b.b.a.f(7, this.username);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bbk com_tencent_mm_protocal_c_bbk = (bbk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bbk.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bbk.scene = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bbk.mXq = aVar3.pMj.mH();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bbk.mXr = aVar3.pMj.mH();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bbk.mXs = aVar3.pMj.mH();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bbk.mXt = aVar3.pMj.mH();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_bbk.username = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
