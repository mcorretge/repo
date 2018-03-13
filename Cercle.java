public class Cercle{
private float x;
private float y;

Cercle()
{
	x = 50
	y = 60
}

Cercle(float xx, float yy)
{
x=xx;
y=yy;
}

String toString()
{
	return Cercle.x & " " & Cercle.y
}

bool equals()
{
	return Cercle.x.equals(Cercle.y)
}

String getX()
{
	return Cercle.x
}
String getY()
{
	return Cercle.y
}

setX(float xx)
{
	Cercle.x = xx
}
setY(float yy)
{
	Cercle.y = yy
}
}