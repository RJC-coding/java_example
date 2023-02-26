public class Main {
  public static void main(String[] args) {
    listMaker listMaker = new listMaker();
    listObject list = listMaker.makeList("listFile.txt");
    list.getList().sort(null);
    for (int s = 0; s<list.getList().size(); s+=1)  {
      System.out.print(list.getList().get(s));
      if (s!=list.getList().size()-1) {
        System.out.print(", ");
      }
    }
  }
}
