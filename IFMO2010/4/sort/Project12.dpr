program Project12;
{$APPTYPE CONSOLE}
uses
  sysutils;

type mas=array[1..100001] of integer;
procedure Sliv(var a:mas;p,q : integer);
{процедура сливающая массивы, p-начало, q-конец}
var r,i,j,k : integer;
    b:mas;
begin
 r:=(p+q) div 2;{делим массив}
 i:=p;{начало левой половины}
 j:=r+1;{начало правой половины}
 for k:=p to q do{смотрим от начала до конца}
 if (i<=r) and ((j>q) or (a[i]<a[j])) then
 {переставляем элементы из половин в новый массив, упорядочивая пары}
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
{рекурсивная процедура сортировки, проверяет если осталось
больше одного элемента, повторяет слияние в левой или правой частях массива}
procedure Sort(var a:mas;p,q : integer); {p,q - индексы начала и конца сортируемой части массива}
begin
 if p<q then {массив из одного элемента тривиально упорядочен}
 begin
  Sort(a,p,(p+q) div 2);{сортируем левую половину}
  Sort(a,(p+q) div 2 + 1,q);{правую половину}
  Sliv(a,p,q);{сливаем две половины}
 end;
end;
var a:mas;
    n,i:longint;
    f,f1:text;
begin
 assign(f,'sort.in');
 reset(f);
 readln(f,n); {Определение размера массива A - N) и его заполнение}
 if n<>0 then
 begin
 for i:=1 to n do
  begin
   read(f,a[i]);
  end;
 {запуск сортирующей процедуры, сортируем от первого до последнего элемента}
 Sort(a,1,N);
 {Вывод отсортированного массива A}
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
