#include <cstdio>
#include <vector>
#include <algorithm>

using namespace std;

struct q {
 int x,y,z;
};

bool cmp1(q a,q b) {
 return a.x>b.x;
}

bool cmp2(q a,q b) {
 return a.y<b.y;
}

int main()
{
    freopen("swords.in","r",stdin);
    freopen("swords.out","w",stdout);
    int n,k; scanf("%d%d",&n,&k);
    vector < q > a(n);
    for (int i=0;i<n;i++)
     {scanf("%d",&a[i].x);a[i].y=i+1;a[i].z=-1;}

    sort(a.begin(),a.end(),cmp1);
   // printf("n=%d\n",n);
    a[0].z=0;int b=1;
    for (int i=0;i<n;i++)
    {
     //printf("1\n");
     if (b>=n) break;
     if (a[i].x-a[b].x>=k) {a[b].z=a[i].y;b++;} else {printf("-1");return 0;}
     if (b>=n) break;
     if (a[i].x-a[b].x>=k) {a[b].z=a[i].y;b++;} else {return 0;}
    }

    sort(a.begin(),a.end(),cmp2);
   /* for (int i=0;i<(int)a.size();i++)
     printf("%d ",a[i].x);
     printf("\n");
         for (int i=0;i<(int)a.size();i++)
     printf("%d ",a[i].y);printf("\n");*/
         for (int i=0;i<(int)a.size();i++)
     printf("%d ",a[i].z);
    return 0;
}
