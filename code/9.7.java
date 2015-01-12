
enum Color{
  Black, White, Red, Yellow Green
}

boolean paintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
  if(x<0 || x>= screen.length) return false;
  if(y<0 || y>=screen[0].length) return false;
  
  if(screen[x][y] == ocolor){
    screen[x][y] = ncolor;
    paintFill(screen, x-1, y, ocolor, ncolor);
    paintFill(screen, x+1, y, ocolor, ncolor);
    paintFill(screen, x, y-1, ocolor, ncolor);
    paintFill(screen, x, y+1, ocolor, ncolor);
  }
  return true;
}

boolean paintFill(Color[][] screen, int x, int y, Color ncolor){
  paintFill(screen, x, y, screen[y][x], ncolor);
}
