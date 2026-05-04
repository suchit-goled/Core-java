class SatelliteRunner{

	public static void main(String[] values){

		Satellite s1=new Satellite();
		s1.name="INSAT-1";
		s1.type="Communication";
		s1.weight=2000;
		s1.active=true;
		s1.speed=7.8;
		s1.orbit="LEO";
		s1.purpose="TV";
		s1.solar=true;
		s1.launchSite="Sriharikota";
		s1.life=15;
		s1.origin="India";
		s1.agency="ISRO";
		s1.gps=true;
		s1.model="S101";
		s1.altitude=500;

		System.out.println("updated name:"+s1.name);
		System.out.println("updated type:"+s1.type);
		System.out.println("updated weight:"+s1.weight);
		System.out.println("updated active:"+s1.active);
		System.out.println("updated speed:"+s1.speed);
		System.out.println("updated orbit:"+s1.orbit);
		System.out.println("updated purpose:"+s1.purpose);
		System.out.println("updated solar:"+s1.solar);
		System.out.println("updated launchSite:"+s1.launchSite);
		System.out.println("updated life:"+s1.life);
		System.out.println("updated origin:"+s1.origin);
		System.out.println("updated agency:"+s1.agency);
		System.out.println("updated gps:"+s1.gps);
		System.out.println("updated model:"+s1.model);
		System.out.println("updated altitude:"+s1.altitude);
		System.out.println("");


		Satellite s2=new Satellite();
		s2.name="GSAT-2"; s2.type="Navigation"; s2.weight=1800; s2.active=true; s2.speed=8.0;
		s2.orbit="MEO"; s2.purpose="GPS"; s2.solar=true; s2.launchSite="Sriharikota";
		s2.life=12; s2.origin="India"; s2.agency="ISRO"; s2.gps=true; s2.model="S102"; s2.altitude=20000;

		System.out.println("updated name:"+s2.name);
		System.out.println("updated type:"+s2.type);
		System.out.println("updated weight:"+s2.weight);
		System.out.println("updated active:"+s2.active);
		System.out.println("updated speed:"+s2.speed);
		System.out.println("updated orbit:"+s2.orbit);
		System.out.println("updated purpose:"+s2.purpose);
		System.out.println("updated solar:"+s2.solar);
		System.out.println("updated launchSite:"+s2.launchSite);
		System.out.println("updated life:"+s2.life);
		System.out.println("updated origin:"+s2.origin);
		System.out.println("updated agency:"+s2.agency);
		System.out.println("updated gps:"+s2.gps);
		System.out.println("updated model:"+s2.model);
		System.out.println("updated altitude:"+s2.altitude);
		System.out.println("");


		Satellite s3=new Satellite();
		s3.name="Hubble"; s3.type="Research"; s3.weight=11000; s3.active=true; s3.speed=7.5;
		s3.orbit="LEO"; s3.purpose="Space"; s3.solar=true; s3.launchSite="USA";
		s3.life=20; s3.origin="USA"; s3.agency="NASA"; s3.gps=false; s3.model="S103"; s3.altitude=540;

		System.out.println("updated name:"+s3.name);
		System.out.println("updated type:"+s3.type);
		System.out.println("updated weight:"+s3.weight);
		System.out.println("updated active:"+s3.active);
		System.out.println("updated speed:"+s3.speed);
		System.out.println("updated orbit:"+s3.orbit);
		System.out.println("updated purpose:"+s3.purpose);
		System.out.println("updated solar:"+s3.solar);
		System.out.println("updated launchSite:"+s3.launchSite);
		System.out.println("updated life:"+s3.life);
		System.out.println("updated origin:"+s3.origin);
		System.out.println("updated agency:"+s3.agency);
		System.out.println("updated gps:"+s3.gps);
		System.out.println("updated model:"+s3.model);
		System.out.println("updated altitude:"+s3.altitude);
		System.out.println("");


		Satellite s4=new Satellite();
		s4.name="INSAT-4"; s4.type="Communication"; s4.weight=2500; s4.active=true; s4.speed=7.9;
		s4.orbit="GEO"; s4.purpose="TV"; s4.solar=true; s4.launchSite="India";
		s4.life=14; s4.origin="India"; s4.agency="ISRO"; s4.gps=true; s4.model="S104"; s4.altitude=36000;

		System.out.println("updated name:"+s4.name);
		System.out.println("updated type:"+s4.type);
		System.out.println("updated weight:"+s4.weight);
		System.out.println("updated active:"+s4.active);
		System.out.println("updated speed:"+s4.speed);
		System.out.println("updated orbit:"+s4.orbit);
		System.out.println("updated purpose:"+s4.purpose);
		System.out.println("updated solar:"+s4.solar);
		System.out.println("updated launchSite:"+s4.launchSite);
		System.out.println("updated life:"+s4.life);
		System.out.println("updated origin:"+s4.origin);
		System.out.println("updated agency:"+s4.agency);
		System.out.println("updated gps:"+s4.gps);
		System.out.println("updated model:"+s4.model);
		System.out.println("updated altitude:"+s4.altitude);
		System.out.println("");


		Satellite s5=new Satellite();
		s5.name="GPS-III"; s5.type="Navigation"; s5.weight=2100; s5.active=true; s5.speed=8.2;
		s5.orbit="MEO"; s5.purpose="Navigation"; s5.solar=true; s5.launchSite="USA";
		s5.life=15; s5.origin="USA"; s5.agency="NASA"; s5.gps=true; s5.model="S105"; s5.altitude=20000;

		System.out.println("updated name:"+s5.name);
		System.out.println("updated type:"+s5.type);
		System.out.println("updated weight:"+s5.weight);
		System.out.println("updated active:"+s5.active);
		System.out.println("updated speed:"+s5.speed);
		System.out.println("updated orbit:"+s5.orbit);
		System.out.println("updated purpose:"+s5.purpose);
		System.out.println("updated solar:"+s5.solar);
		System.out.println("updated launchSite:"+s5.launchSite);
		System.out.println("updated life:"+s5.life);
		System.out.println("updated origin:"+s5.origin);
		System.out.println("updated agency:"+s5.agency);
		System.out.println("updated gps:"+s5.gps);
		System.out.println("updated model:"+s5.model);
		System.out.println("updated altitude:"+s5.altitude);
		System.out.println("");


		Satellite s6=new Satellite();
		s6.name="GSAT-6"; s6.type="Communication"; s6.weight=2200; s6.active=true; s6.speed=7.7;
		s6.orbit="GEO"; s6.purpose="Mobile"; s6.solar=true; s6.launchSite="India";
		s6.life=13; s6.origin="India"; s6.agency="ISRO"; s6.gps=false; s6.model="S106"; s6.altitude=36000;

		System.out.println("updated name:"+s6.name);
		System.out.println("updated type:"+s6.type);
		System.out.println("updated weight:"+s6.weight);
		System.out.println("updated active:"+s6.active);
		System.out.println("updated speed:"+s6.speed);
		System.out.println("updated orbit:"+s6.orbit);
		System.out.println("updated purpose:"+s6.purpose);
		System.out.println("updated solar:"+s6.solar);
		System.out.println("updated launchSite:"+s6.launchSite);
		System.out.println("updated life:"+s6.life);
		System.out.println("updated origin:"+s6.origin);
		System.out.println("updated agency:"+s6.agency);
		System.out.println("updated gps:"+s6.gps);
		System.out.println("updated model:"+s6.model);
		System.out.println("updated altitude:"+s6.altitude);
		System.out.println("");


		Satellite s7=new Satellite();
		s7.name="WeatherSat"; s7.type="Weather"; s7.weight=1900; s7.active=true; s7.speed=7.6;
		s7.orbit="LEO"; s7.purpose="Weather"; s7.solar=true; s7.launchSite="Europe";
		s7.life=10; s7.origin="Europe"; s7.agency="ESA"; s7.gps=false; s7.model="S107"; s7.altitude=800;

		System.out.println("updated name:"+s7.name);
		System.out.println("updated type:"+s7.type);
		System.out.println("updated weight:"+s7.weight);
		System.out.println("updated active:"+s7.active);
		System.out.println("updated speed:"+s7.speed);
		System.out.println("updated orbit:"+s7.orbit);
		System.out.println("updated purpose:"+s7.purpose);
		System.out.println("updated solar:"+s7.solar);
		System.out.println("updated launchSite:"+s7.launchSite);
		System.out.println("updated life:"+s7.life);
		System.out.println("updated origin:"+s7.origin);
		System.out.println("updated agency:"+s7.agency);
		System.out.println("updated gps:"+s7.gps);
		System.out.println("updated model:"+s7.model);
		System.out.println("updated altitude:"+s7.altitude);
		System.out.println("");


		Satellite s8=new Satellite();
		s8.name="SpySat"; s8.type="Military"; s8.weight=3000; s8.active=true; s8.speed=7.9;
		s8.orbit="LEO"; s8.purpose="Surveillance"; s8.solar=true; s8.launchSite="USA";
		s8.life=12; s8.origin="USA"; s8.agency="Defense"; s8.gps=true; s8.model="S108"; s8.altitude=600;

		System.out.println("updated name:"+s8.name);
		System.out.println("updated type:"+s8.type);
		System.out.println("updated weight:"+s8.weight);
		System.out.println("updated active:"+s8.active);
		System.out.println("updated speed:"+s8.speed);
		System.out.println("updated orbit:"+s8.orbit);
		System.out.println("updated purpose:"+s8.purpose);
		System.out.println("updated solar:"+s8.solar);
		System.out.println("updated launchSite:"+s8.launchSite);
		System.out.println("updated life:"+s8.life);
		System.out.println("updated origin:"+s8.origin);
		System.out.println("updated agency:"+s8.agency);
		System.out.println("updated gps:"+s8.gps);
		System.out.println("updated model:"+s8.model);
		System.out.println("updated altitude:"+s8.altitude);
		System.out.println("");


		Satellite s9=new Satellite();
		s9.name="NavIC"; s9.type="Navigation"; s9.weight=2100; s9.active=true; s9.speed=8.1;
		s9.orbit="MEO"; s9.purpose="India GPS"; s9.solar=true; s9.launchSite="India";
		s9.life=15; s9.origin="India"; s9.agency="ISRO"; s9.gps=true; s9.model="S109"; s9.altitude=20000;

		System.out.println("updated name:"+s9.name);
		System.out.println("updated type:"+s9.type);
		System.out.println("updated weight:"+s9.weight);
		System.out.println("updated active:"+s9.active);
		System.out.println("updated speed:"+s9.speed);
		System.out.println("updated orbit:"+s9.orbit);
		System.out.println("updated purpose:"+s9.purpose);
		System.out.println("updated solar:"+s9.solar);
		System.out.println("updated launchSite:"+s9.launchSite);
		System.out.println("updated life:"+s9.life);
		System.out.println("updated origin:"+s9.origin);
		System.out.println("updated agency:"+s9.agency);
		System.out.println("updated gps:"+s9.gps);
		System.out.println("updated model:"+s9.model);
		System.out.println("updated altitude:"+s9.altitude);
		System.out.println("");


		Satellite s10=new Satellite();
		s10.name="Starlink"; s10.type="Internet"; s10.weight=260; s10.active=true; s10.speed=7.5;
		s10.orbit="LEO"; s10.purpose="Internet"; s10.solar=true; s10.launchSite="USA";
		s10.life=5; s10.origin="USA"; s10.agency="SpaceX"; s10.gps=true; s10.model="S110"; s10.altitude=550;

		System.out.println("updated name:"+s10.name);
		System.out.println("updated type:"+s10.type);
		System.out.println("updated weight:"+s10.weight);
		System.out.println("updated active:"+s10.active);
		System.out.println("updated speed:"+s10.speed);
		System.out.println("updated orbit:"+s10.orbit);
		System.out.println("updated purpose:"+s10.purpose);
		System.out.println("updated solar:"+s10.solar);
		System.out.println("updated launchSite:"+s10.launchSite);
		System.out.println("updated life:"+s10.life);
		System.out.println("updated origin:"+s10.origin);
		System.out.println("updated agency:"+s10.agency);
		System.out.println("updated gps:"+s10.gps);
		System.out.println("updated model:"+s10.model);
		System.out.println("updated altitude:"+s10.altitude);
		System.out.println("");
	}
}