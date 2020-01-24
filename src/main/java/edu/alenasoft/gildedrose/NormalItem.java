package edu.alenasoft.gildedrose;

public class NormalItem {

  private String name;

  private int sellIn;

  private int quality;

  public NormalItem(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSellIn() {
    return this.sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return this.quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public void updateQuality() {
    this.quality = this.quality - (this.sellIn == 0 ? 2 : 1);
    if (this.quality < Item.MIN_QUALITY) {
      this.quality = Item.MIN_QUALITY;
    }
  }

}
