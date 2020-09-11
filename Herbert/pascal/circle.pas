program const_circle;
const
PI=3.141592654;
var
r,d,c:real;
begin
writeln('Enter the radius of the circle');
readln(r);
d:=2*r;
c:=PI*d;
writeln('The circumference of the circle is ',c:7:2);
end.