#include <cstdio>
#include <vector>
#include <memory.h>
#include <iostream>
#include <algorithm>
#define pb push_back
using namespace std;
struct edge
{
        int u; bool c; bool in; int ind;
        edge(int _u = 0,bool _c = false, bool _in = false, int _ind = 0)
        {
            u = _u;
            c = _c;
            in = _in;
            ind = _ind;
        }
};
int n,m,k;

struct _set_
{
        int pp[100100]; int ss[100100];
        _set_()
        {
        for (int i=1;i<=100100;i++) { pp[i] = i; ss[i] = 1; }
        };
        int find_set(int a) { if (pp[a] == a) return a; else return pp[a] = find_set(pp[a]); }
        void union_set(int a,int b)
        {
                a = find_set(a);
                b = find_set(b);
                if (a == b) return;
                if (ss[a] > ss[b]) swap(a,b);
                pp[a] = b; ss[b] +=ss[a];
        };
};
vector <int> res;
vector < vector <edge> > g;

int main() {
        freopen("roads.in","r",stdin);
        freopen("roads.out","w",stdout);
        scanf("%d%d%d",&n,&m,&k);
        g.resize(n+1);
        _set_ s1;

        for (int i=1;i<=m;i++)
        {
                int u,v,c;
                scanf("%d%d%d",&u,&v,&c);
                if (c == 0) s1.union_set(u,v);
                g[u].pb(edge(v,c,0,i));
                g[v].pb(edge(u,c,0,i));
        };

        int cnt = 0;
        for (int i=1; i<=n; i++)
                if (s1.pp[i] == i) cnt++;
        if (k < cnt-1 || k > n-1) { cout << "0" << endl; return 0; }
        _set_ s;

        for (int i=1;i<=n;i++)
                for (int j=(int)g[i].size()-1; j>=0; j--)
                {
                        int v = i; int to = g[i][j].u;
                        if (s1.find_set(v)!=s1.find_set(to)) { s1.union_set(v,to); s.union_set(v,to); k--; res.pb(g[i][j].ind); }
                }


        for (int i=1;i<=n && k>0;i++)
                for (int j=(int)g[i].size()-1; j>=0; j--)
                {
                        if (k == 0) break;
                        int v = i; int to = g[i][j].u;
                        if (!g[i][j].c) continue;
                        if (s.find_set(v) == s.find_set(to)) continue;
                        s.union_set(v,to); res.pb(g[i][j].ind); k--;
                }

        if (k > 0) { cout << "0" << endl; return 0; }

        for (int i=1;i<=n;i++)
                for (int j=(int)g[i].size()-1; j>=0; j--)
                {
                        int v = i; int to = g[i][j].u;
                        if (s.find_set(v) == s.find_set(to)) continue;
                        s.union_set(v,to); res.pb(g[i][j].ind);
                }
        sort(res.begin(),res.end());
        for (int i=0;i<(int)res.size();i++)
                printf("%d ",res[i]);
        return 0;
}
