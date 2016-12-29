program Project2;

{$APPTYPE CONSOLE}

uses
  sysutils;

var f,f1     :text;
    b,i      :integer;
    s        :string;
    d,k      :longint;
    fl       :boolean;

begin
     assign(f,'kto10.in');
     reset(f);
     readln(f,b);
     read(f,s);
     assign(f1,'kto10.out');
     rewrite(f1);
     fl:=false;
     k:=1;
     for i:=1 to Length(s) do if Ord(s[i])<48+b then
     begin
          if fl then k:=round(k/b);
          case s[i] of
           '0'..'9': d:=d*b+Ord(s[i])-48;
          end;
     end;
     write(f1,d*k);
     close(f);
     close(f1);
end.
