package com.tencent.mm.plugin.order.model;

import com.tencent.mm.ba.a;

public final class d extends a {
    public String hNJ;
    public int month;
    public int year;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.year);
            aVar.dV(2, this.month);
            if (this.hNJ != null) {
                aVar.e(3, this.hNJ);
            }
            return 0;
        } else if (i == 1) {
            r0 = (a.a.a.a.dS(1, this.year) + 0) + a.a.a.a.dS(2, this.month);
            if (this.hNJ != null) {
                return r0 + a.a.a.b.b.a.f(3, this.hNJ);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            d dVar = (d) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dVar.year = aVar3.pMj.mH();
                    return 0;
                case 2:
                    dVar.month = aVar3.pMj.mH();
                    return 0;
                case 3:
                    dVar.hNJ = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
