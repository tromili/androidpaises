package course.examples.MapLocation;

public class Item
{
     String name;
     int drawableId;

    Item(String name, int drawableId)
    {
        this.name = name;
        this.drawableId = drawableId;
    }
    public String getItemName() {
        return name;
    }
    public void setItemName(String itemName) {
        name = itemName;
    }
    public int getImgResID() {
        return drawableId;
    }
    public void setImgResID(int imgResID) {
        this.drawableId = imgResID;
    }
}