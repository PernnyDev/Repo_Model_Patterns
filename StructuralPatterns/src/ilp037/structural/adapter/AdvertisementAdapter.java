package ilp037.structural.adapter;

public class AdvertisementAdapter extends Advertisement {
	private Ad ad;
	
	public AdvertisementAdapter(Ad ad) {
		this.ad = ad;
		this.title = ad.description.substring(0, 10);
		this.price = Double.parseDouble(ad.price.toString());
		this.status = convertStatus(ad.status);
	}

	private AdvertisementStatus convertStatus(String status) {
		switch (status) {
		case "new": return AdvertisementStatus.DRAFT;
		case "published": return AdvertisementStatus.PUBLISHED;
		case "reviewed" : return AdvertisementStatus.PUBLISHED;
		default: return AdvertisementStatus.DELETED;
		}
	}
	@Override
	public void publish() {
		this.ad.publish();
	}
	@Override
	public void activate() {
		this.ad.publish();
	}
	@Override
	public void inactivate() {
		this.ad.delete();
	}
	@Override
	public void delete() {
		this.ad.delete();
	}
}
