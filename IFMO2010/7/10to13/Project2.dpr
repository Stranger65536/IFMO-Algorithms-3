program Project2;

{$APPTYPE CONSOLE}

uses
  sysutils;

var  cs1,cs2,res,change:integer;
     TD:string;
     f,f1:text;

{from dec in all}
function FromDec(n,r:longint):string;
var s:String;
    const digit:string[16]='0123456789ABCDEF';
begin
     s:='';
     repeat
           s:=digit[(n mod r)+1]+s;
           n:=n div r;
     until n=0;
     FromDec:=s;
end;



{from all to Dec}
function ToDec(n:string;r:longint):longint;
var m,i:longint;
    const digit:string[36]='0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ';
begin
     m:=0;
     while n[1]='0' do delete(n,1,1);
     for i:=1 to length(n) do m:=m*r+pos(n[i],digit)-1;
     ToDec:=m;
end;

begin
     cs1:=10;
     assign(f,'10to13.in');
     reset(f);
     read(f,TD);
     cs2:=13;
     assign(f1,'10to13.out');
     rewrite(f1);
     write(f1,FromDec(ToDec(TD,cs1),cs2));
     close(f);
     close(f1);
end.
