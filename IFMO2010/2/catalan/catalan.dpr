program catalan;

{$APPTYPE CONSOLE}

uses
  SysUtils;
var f,f1:text; i,j,n:integer; a:array[0..501] of int64;
begin
 assign(f,'catalan.in');
 reset(f);
 assign(f1,'catalan.out');
 rewrite(f1);
 read(f,n);
 close(f);
 a[1]:=1; a[0]:=1;
 if n=1 then begin write(f1,a[1]); close(f1); halt end else if
  n=0 then begin write(f1,a[0]);close(f1); halt end;
 for j:=2 to n do
  for i:=0 to j-1 do
   a[j]:=(a[j]+a[i]*a[j-1-i]) mod 1234 ;

  write(f1,a[n]);
  close(f1);
end.
