package Shopping;

import java.util.List;

public class Shopping {
    List<Item> itemList;
    private double discount = 0;
    public Shopping(List<Item> itemList) {
        this.itemList = itemList;

    }

    public void addItem(Item item) {
        itemList.add(item);
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public double getTotalPrice() {
        double price = 0;
        if (discount > 0) {
            for (Item item : itemList) {
                price += item.getPrice() * discount;
            }
        } else{
                for (Item item : itemList) {
                    price += item.getPrice();
                }

            }
            return price;
        }

        public List getItems() {
            for (Item item : itemList) {
                System.out.println(item.getName());
            }
            return itemList;
        }

    }
