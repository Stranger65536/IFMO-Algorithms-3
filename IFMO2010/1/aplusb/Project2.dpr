program Project2;

{$APPTYPE CONSOLE}

uses
  SysUtils;

var f,f1:text;
    a,b:longint;

begin
  { TODO -oUser -cConsole Main : Insert code here }
  assign(f,'aplusb.in');
  reset(f);
  read(f,a,b);
  close(f);
  assign(f1,'aplusb.out');
  rewrite(f1);
  write(f1,a+b);
  close(f1);
end.
