program Project12;
{$APPTYPE CONSOLE}
uses
  sysutils;

type mas=array[1..100001] of integer;
procedure Sliv(var a:mas;p,q : integer);
{��������� ��������� �������, p-������, q-�����}
var r,i,j,k : integer;
    b:mas;
begin
 r:=(p+q) div 2;{����� ������}
 i:=p;{������ ����� ��������}
 j:=r+1;{������ ������ ��������}
 for k:=p to q do{������� �� ������ �� �����}
 if (i<=r) and ((j>q) or (a[i]<a[j])) then
 {������������ �������� �� ������� � ����� ������, ������������ ����}
  begin
   b[k]:=a[i];
   i:=i+1;
  end
 else
  begin
   b[k]:=a[j];
   j:=j+1;
  end ;
 for k:=p to q do
 a[k]:=b[k];
end;
{����������� ��������� ����������, ��������� ���� ��������
������ ������ ��������, ��������� ������� � ����� ��� ������ ������ �������}
procedure Sort(var a:mas;p,q : integer); {p,q - ������� ������ � ����� ����������� ����� �������}
begin
 if p<q then {������ �� ������ �������� ���������� ����������}
 begin
  Sort(a,p,(p+q) div 2);{��������� ����� ��������}
  Sort(a,(p+q) div 2 + 1,q);{������ ��������}
  Sliv(a,p,q);{������� ��� ��������}
 end;
end;
var a:mas;
    n,i:longint;
    f,f1:text;
begin
 assign(f,'sort.in');
 reset(f);
 readln(f,n); {����������� ������� ������� A - N) � ��� ����������}
 if n<>0 then
 begin
 for i:=1 to n do
  begin
   read(f,a[i]);
  end;
 {������ ����������� ���������, ��������� �� ������� �� ���������� ��������}
 Sort(a,1,N);
 {����� ���������������� ������� A}
 assign(f1,'sort.out');
 rewrite(f1);
 for i:=1 to n do
 write(f1,a[i],' ');
 close(f);
 close(f1);
 end
 else begin
 assign(f1,'sort.out');
 rewrite(f1);
 write(f1,'0');
 close(f1);
 end;
end.
