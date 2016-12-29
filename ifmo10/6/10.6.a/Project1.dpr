program Project1;

{$APPTYPE CONSOLE}

uses SysUtils;




var f,f1:text;
    n,i:longint;
    flag:boolean;
    a:array[1..1000000] of longint;
begin
     assign(f,'isheap.in');
     reset(f);
     readln(f,n);
     flag:=true;
     for i:=1 to n do read(f,a[i]);
     close(f);
     for i:=1 to n do
     begin
          if 2*i<=n then if a[i]>a[2*i] then begin flag:=false;break; end;
          if 2*i+1<=n then if a[i]>a[2*i+1] then begin flag:=false;break;end;
     end;
     assign(f1,'isheap.out');
     rewrite(f1);
     if flag then write(f1,'YES') else write(f1,'NO');
     close(f1);
end.


