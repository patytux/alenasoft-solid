package edu.alenasoft.gildedrose;

public class Item {

  public static final int MAX_QUALITY = 50;

  public static final int MIN_QUALITY = 0;

  private NormalItem item;

  private static final String AGED_BRIE = "Aged Brie";

  private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

  private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  private static final String CONJURED = "Conjured Mana Cake";

  public Item(String name, int sellIn, int quality) {
    if (name.equals(AGED_BRIE)) {
      item = new AgedBrieItem(name, sellIn, quality);
      return;
    }
    if (name.equals(BACKSTAGE)) {
      item = new BackstageItem(name, sellIn, quality);
      return;
    }
    if (name.equals(SULFURAS)) {
      item = new SulfurasItem(name, sellIn, quality);
      return;
    }
    if (name.equals(CONJURED)) {
      item = new ConjuredItem(name, sellIn, quality);
      return;
    }
    item = new NormalItem(name, sellIn, quality);
  }

  /* Generated getter and setter code */
  public String getName() {
    return this.item.getName();
  }

  public void setName(String name) {
    this.item.setName(name);
  }

  public int getSellIn() {
    return this.item.getSellIn();
  }

  public void setSellIn(int sellIn) {
    this.item.setSellIn(sellIn);
  }

  public int getQuality() {
    return this.item.getQuality();
  }

  public void setQuality(int quality) {
    this.item.setQuality(quality);
  }

  @Override
  public String toString() {
    return new StringBuilder()
            .append("Item{")
            .append("name='")
            .append(this.item.getName())
            .append('\'')
            .append(", sellIn=")
            .append(this.item.getSellIn())
            .append(", quality=")
            .append(this.item.getQuality())
            .append('}')
            .toString();
  }

  public void updateQuality() {
    this.item.updateQuality();
    reduceSellIn();
  }

  private void reduceSellIn() {
    this.setSellIn(this.getSellIn() - 1);
  }
}
