/* 
 * File:   main.cpp
 * Author: Str@nger
 *
 * Created on September 29, 2011, 6:35 PM
 */

#include <cstdlib>
#include <cstdio>


using namespace std;

int mas[20][20];
bool usedleft[20][20];
bool usedright[20][20];
bool usedup[20][20];
bool useddown[20][20];

int main() {
    freopen("nolefts.in","r",stdin);
    freopen("nolefts.out","w",stdout); 
    int n, m;
    int f1, f2;
    int s1, s2;
    scanf("%d %d\n",&n,&m);
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            char temp;
            scanf("%c",&temp);
            if (temp == 'X') mas[i][j] = -1; 
            else if (temp == 'F') {
                f1 = i; f2 = j; 
                mas[i][j] = 0;
            }
            else if (temp == 'S') {
                s1 = i; s2 = j;
                mas[i][j] = 0;
            }
            else {
                mas[i][j] = 0;
            }
        }
         scanf("\n");
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            printf("%d ",mas[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}