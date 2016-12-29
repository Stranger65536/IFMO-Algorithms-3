
#include <stdio.h>
#include <fstream>
#include <stdlib.h>
#include <iostream>
#include <queue>

using namespace std;

int main()
{
    queue <int> oc;
    int a[100];
    int n, t, m, s, i, vr;

    ifstream in;
    in.open ("saloon.in");
    ofstream out;
    out.open ("saloon.out");

    in >> n;

    for (i = 0; i < n; i++) {
        in >> t;
        in >> m;
        vr = t*60 + m;
        in >> s;
        while (vr >= oc.front() && !oc.empty()) {
            oc.pop();
        }
        if (oc.empty()) {
            oc.push(vr + 20);
            a[i] = vr + 20;
        } else {
            if (s >= oc.size()) {
                oc.push(oc.back() + 20);
                a[i] = oc.back();
            } else {
                a[i] = vr;
            }
        }
        if (vr > 1440) {
            out << "error";//до полуночи
        }

    }

    for (i = 0; i < n; i++) {
        t = a[i] / 60;
        m = a[i] % 60;
        out << t << " " << m << endl;
    }
    in.close();
    out.close();
}
