package items;

import enums.ItemSeize;
import ownable.Ownable;

public class Item {
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Item item2 = (Item) o;
        if(item2.name.equals(this.name)){
            if(item2.owner.equals(this.owner)){
                if(item2.seize.equals(this.seize)){
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return this.getName()+" of "+this.getClass();
    }
    @Override
    public int hashCode(){
        if(name != null){
            return 17 * name.hashCode();
        }else {
            return 0;
        }
    }
    public Item(ItemSeize i,String n){
        this.seize = i;
        this.name = n;
    }
    private String name;

    public String getName() {
        return name;
    }

    private ItemSeize seize;
    private Ownable owner;

    public Ownable getOwner() {
        return owner;
    }

    public void setOwner(Ownable owner) {
        this.owner = owner;
    }

    public ItemSeize getSeize() {
        return seize;
    }

}
