enum TIP{
A=18;
B=5;
V=0;
}

class Item {
        String id;
        String name;
        double price;
        TIP t; //TODO add variable.

    	public Item(String id, String name, double price, TIP t) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.t = t;
		}
    	
    	
        public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public TIP getT() {
			return t;
		}


		public void setT(TIP t) {
			this.t = t;
		}


		double taxReturn () {
              return price*15/100;
        }

	
}

