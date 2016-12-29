program ball;

{$APPTYPE CONSOLE}

uses
  SysUtils;
var f,f1:text; n,i:integer; a:array[1..35] of integer;
begin
  { TODO -oUser -cConsole Main : Insert code here }
  assign(f,'ball.in');
  reset(f);
  assign(f1,'ball.out');
  rewrite(f1);
  read(f,n);
  a[1]:=1; a[2]:=2; a[3]:=4;
  for i:=4 to n do a[i]:=a[i-1]+a[i-2]+a[i-3];
  write(f1,a[n]);
  close(f);
  close(f1);
end.
