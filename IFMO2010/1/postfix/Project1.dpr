{$APPTYPE CONSOLE} 
uses sysutils; 
const max = 256; 
var 
  s: string; 
  res: longint; 
  f,f1:text; 

stack: array[1 .. max] of longint; 
  sptr: integer = 0; 

type 
  func = function(left, right: longint): longint; 

function plus(left, right: longint): longint; 
begin plus := left + right end; 
function minus(left, right: longint): longint; 
begin minus := left - right end; 
function mult(left, right: longint): longint; 
begin mult := left * right end; 

procedure push(value: longint); 
begin 
  if sptr < max then 
  begin 
    inc(sptr); 
    stack[sptr] := value; 
  end; 
end; 
function pop: longint; 
begin 
  if sptr > 0 then 
  begin 
    pop := stack[sptr]; 
    dec(sptr); 
  end; 
end; 

const 
  func_table: array[1 .. 3] of func = (plus, minus, mult); 

var 
  first, second: longint; 
  i: integer; 

begin 
  assign(f,'postfix.in'); 
  reset(f); 
  read(f,s); 
  close(f); 
  res := 0; 
  for i := 1 to length(s) do 
  begin 
    case s[i] of 
      ' ': ; 
      '0' .. '9': push(ord(s[i]) - ord('0')); 
      '+', '-', '*': 
      begin 
        second := pop; first := pop; 
        push( func_table[pos(s[i], '+-*')](first, second) ); 
      end; 
    end; 
  end; 
  assign(f1,'postfix.out'); 
  rewrite(f1); 
  write(f1,stack[sptr]); 
  close(f1); 
end.
