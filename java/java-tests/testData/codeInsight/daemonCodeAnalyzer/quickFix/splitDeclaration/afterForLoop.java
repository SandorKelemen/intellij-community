// "Split into declaration and assignment" "true"
class Test {
  {
      int i;
      for (i<caret>=0; i<10; i++) {
          System.out.println();
      }
  }
}