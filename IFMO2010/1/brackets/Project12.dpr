program Project12;

{$APPTYPE CONSOLE}

uses
  SysUtils;

var
       stack:array[1..255] of char;
       tos:integer;
       f,f1:text;
       s:string;
       k:char;
       i:integer;


     procedure Push(i:char);
     begin
         tos:=tos+1;
         stack[tos]:=i;
     end;


     function Pop:char;
     begin
     if tos<>0 then
     begin
       Pop:=stack[tos];
       tos:=tos-1;
     end else pop:='0';
     end;

begin
      tos:=0;
      assign(f,'brackets.in');
      reset(f);
      read(f,s);
      close(f);
      if length(s)<>0 then
      for i:=1 to length(s) do
      begin
           if (s[i]='{')or(s[i]='[')or(s[i]='(') then begin push(s[i]);end;
           if (s[i]='}')or(s[i]=']')or(s[i]=')') then
           begin
                k:=pop; if k<>'0' then
                begin
                if (k='(')and(s[i]<>')') then begin assign(f1,'brackets.out'); rewrite(f1); write(f1,'NO'); close(f1); halt; end;
                if (k='[')and(s[i]<>']') then begin assign(f1,'brackets.out'); rewrite(f1); write(f1,'NO'); close(f1); halt; end;
                if (k='{')and(s[i]<>'}') then begin assign(f1,'brackets.out'); rewrite(f1); write(f1,'NO'); close(f1); halt; end;
                end else begin assign(f1,'brackets.out'); rewrite(f1); write(f1,'NO'); close(f1); halt; end; 
           end;
      end
      else
      begin
      assign(f1,'brackets.out');
      rewrite(f1);
      write(f1,'NO');
      end;
      assign(f1,'brackets.out');
      rewrite(f1);
      if tos=0 then write(f1,'YES') else write(f1,'NO');
      close(f1);
end.
