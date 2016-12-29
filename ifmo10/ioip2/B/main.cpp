#include <cstdio>
#include <string>
#include <iostream>

using namespace std;
int l; int L;

bool let(char c)
{
    return (c!=' ' && c!='\n');
}

bool valid(string s)
{
	int n = (int)s.length();
	if (n < 8) return false;
	if (s.substr(0,7)!="http://") return false;
	for (int i=7; i<n; i++)
		if ( !(s[i]>='a' && s[i]<='z') && s[i]!='.' && s[i]!=':' && s[i]!='/' ) return false;
	return true;
}

string go(string s)
{
	if (L <= l) return s;
	int m = L - l;
	int n = (int)s.length();
	if (n <= 3) return s;
	if (n-3 < m) m = n-3;
	s = s.substr(0,n-m);
	s[n-m-3] = '.'; s[n-m-2]='.'; s[n-m-1]='.';
	L-=m;
	return s;

}
int main() {
	freopen("twi.in","r",stdin);
	freopen("twi.out","w",stdout);
	scanf("%d\n",&l);
	char c; string s = "";
    while (scanf("%c",&c) == 1) s+=c;
    L = (int)s.length() - 1;
	if (L <= l)
	{
	    printf("%s\n",s.c_str());
	    cout << "0" << endl;
    }

	char last = ' ';
	int sl = (int)s.length();
	string x1 = "";

	for (int i=0; i<sl; i++)
	{
		if ( (s[i] == ' ' || s[i] == '\n') && let(last))
		 { if (valid(x1)) x1 = go(x1); printf("%s%c",x1.c_str(),s[i]); x1 = ""; last = s[i]; continue; }

		if (let(s[i]) && let(last)) { x1+=s[i]; last = s[i]; continue; }

		if (let(s[i]) && !let(last)) { x1 = s[i]; last = s[i]; continue; }

		printf("%c",s[i]); last = s[i];
	}

	if (L <= l) cout << "0"; else cout << L - l << endl;
	return 0;
}
