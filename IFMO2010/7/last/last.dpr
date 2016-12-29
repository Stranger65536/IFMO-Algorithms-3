program last;

{$APPTYPE CONSOLE}

uses
  SysUtils;
 var f,f1:text; k,m,i:longint; s:string;  n,c:int64;
begin
  assign(f,'last.in');
  reset(f);
  assign(f1,'last.out');
  rewrite(f1);
  read(f,n,k);
  close(f);
  str(n,s);
  if n=k then begin write(f1,'-1'); close(f1); halt end;
  if n<k then begin  write(f1,'0'); close(f1); halt end;
  c:=0;
  for i:=n-1 downto 2 do if (n mod i)=k then c:=c+1;
  write(f1,c);
  close(f1);
end.
