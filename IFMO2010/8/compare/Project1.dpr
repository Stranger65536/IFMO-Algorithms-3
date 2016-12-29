program Project3;
{$APPTYPE CONSOLE}
uses
  SysUtils;

var la,lb,i    :integer;
    f,f1       :text;
    a,b        :ansiString;
begin
     assign(f,'compare.in');
     reset(f);
     readln(f,a);
     la:=length(a);
     readln(f,b);
     lb:=length(b);
     close(f);
     assign(f1,'compare.out');
     rewrite(f1);
     if la<lb then begin write(f1,'<'); close(f1); halt; end;
     if lb<la then begin write(f1,'>'); close(f1); halt; end;
     if la=lb then
     begin
          for i:=1 to la do
          begin
               if a[i]=b[i] then continue;
               if a[i]>b[i] then begin write(f1,'>'); close(f1); halt; end;
               if a[i]<b[i] then begin write(f1,'<'); close(f1); halt; end;
          end;
     end;
     write(f1,'=');
     close(f1);
end.

