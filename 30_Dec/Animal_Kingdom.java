/*
abstract class Animal{
  abstract boolean run();
  abstract boolean swim();
  abstract boolean crawl();
  abstract boolean fly();
}
*/
class Tiger extends Animal{
    public boolean run(){return true;}
    public boolean swim(){return true;}
    public boolean crawl(){return false;}
    public boolean fly(){return false;}
  }
  
  class Snake extends Animal{
    public boolean run(){return true;}
    public boolean swim(){return false;}
    public boolean crawl(){return false;}
    public boolean fly(){return false;}
  }
  
  class Eagle extends Animal{
    public boolean run(){return true;}
    public boolean swim(){return true;}
    public boolean crawl(){return false;}
    public boolean fly(){return true;}
  }
  
  class Shark extends Animal{
    public boolean run(){return true;}
    public boolean swim(){return true;}
    public boolean crawl(){return false;}
    public boolean fly(){return false;}
  }
  