program Project1;

{$APPTYPE CONSOLE}

uses
  SysUtils;

var f,f1:text;
    m,n,k,i,j:integer;
    a:array[1..100,1..100] of byte;
begin
     assign(f,'e2m.in');
     assign(f1,'e2m.out');
     reset(f);
     rewrite(f1);
     readln(f,n,m);
     for k:=1 to m do
     begin
          read(f,i);
          readln(f,j);
          a[i,j]:=1;
          a[j,i]:=1;
     end;
     for i:=1 to n do
     begin
          for j:=1 to n do
           write(f1,a[i,j],' ');
          writeln(f1);
     end;
     close(f);
     close(f1);
end.
