program sequence;

{$APPTYPE CONSOLE}

uses
  SysUtils;
 type res=record
      p,s:longint;
      end;
var f,f1:text; n,i,k,m,max:longint; a:array[1..10000000] of res;
function ok(x,y:integer):boolean;
begin
 if y mod x=0 then ok:=true else ok:=false;
end;

procedure give(k:longint);
var i,max1:integer;
begin    max1:=1;
 for i:=1 to m do
  if ok(a[i].p,k) then
   begin if (ok(a[i].p,k)) and (a[i].s+1>max1) then max1:=a[i].s+1;
    if max1>max then max:=max1; end;

 a[m+1].p:=k; a[m+1].s:=max1; m:=m+1;

end;

begin
  reset(f,'sequence.in');
  rewrite(f1,'sequence.out');
  readln(f,n); m:=0;   max:=1;
  for i:=1 to n do begin read(f,k); give(k) end;
  write(f1,max);
  close(f);
  close(f1);
end.
