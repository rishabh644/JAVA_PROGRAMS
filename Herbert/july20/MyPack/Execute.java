package MyPack;


class Execute {

public static void main(String args[]) {

 Client ref;
  Client obj=new Client();
  obj.callback(45);
  obj.nonIfaceMeth();
  ref= obj;
  ref.callback(23);
  Callback2 ref1;
  ref1=obj;
  ref1.callback(99);
  
  }
  
  
  }