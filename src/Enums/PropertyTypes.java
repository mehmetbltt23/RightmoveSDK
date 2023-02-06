package Enums;

public enum PropertyTypes {
	NOT_SPECIFIED(0),
	TERRACED_HOUSE(1),
	END_OF_TERRACE_HOUSE(2),
	SEMI_DETACHED_HOUSE(3),
	DETACHED_HOUSE(4),
	MEWS_HOUSE(5),
	CLUSTER_HOUSE(6),
	GROUND_FLOOR_FLAT(7),
	FLAT(8),
	STUDIO_FLAT(9),
	GROUND_FLOOR_MAISONETTE(10),
	MAISONETTE(11),
	BUNGALOW(12),
	TERRACED_BUNGALOW(13),
	SEMI_DETACHED_BUNGALOW(14),
	DETACHED_BUNGALOW(15),
	MOBILE_HOME(16),
	LAND_RESIDENTIAL(20),
	LINK_DETACHED_HOUSE(21),
	TOWN_HOUSE(22),
	COTTAGE(23),
	CHALET(24),
	CHARACTER_PROPERTY(25),
	HOUSE_UNSPECIFIED(26),
	VILLA(27),
	APARTMENT(28),
	PENTHOUSE(29),
	FINCA(30),
	BARN_CONVERSION(43),
	SERVICED_APARTMENT(44),
	PARKING(45),
	SHELTERED_HOUSING(46),
	RETIREMENT_PROPERTY(47),
	HOUSE_SHARE(48),
	FLAT_SHARE(49),
	PARK_HOME(50),
	GARAGES(51),
	FARM_HOUSE(52),
	EQUESTRIAN_FACILITY(53),
	DUPLEX(56),
	TRIPLEX(59),
	LONGERE(62),
	GITE(65),
	BARN(68),
	TRULLI(71),
	MILL(74),
	RUINS(77),
	RESTAURANT(80),
	CAFE(83),
	MILL_COMMERCIAL(86),
	CASTLE(92),
	VILLAGE_HOUSE(95),
	CAVE_HOUSE(101),
	CORTIJO(104),
	FARM_LAND(107),
	PLOT(110),
	COUNTRY_HOUSE(113),
	STONE_HOUSE(116),
	CARAVAN(117),
	LODGE(118),
	LOG_CABIN(119),
	MANOR_HOUSE(120),
	STATELY_HOME(121),
	OFF_PLAN(125),
	SEMI_DETACHED_VILLA(128),
	DETACHED_VILLA(131),
	BAR_NIGHTCLUB(134),
	SHOP(137),
	RIAD(140),
	HOUSE_BOAT(141),
	HOTEL_ROOM(142),
	BLOCK_OF_APARTMENTS(143),
	PRIVATE_HALLS(144),
	OFFICE(178),
	BUSINESS_PARK(181),
	SERVICED_OFFICE(184),
	RETAIL_PROPERTY_HIGH_STREET(187),
	RETAIL_PROPERTY_OUT_OF_TOWN(190),
	CONVENIENCE_STORE(193),
	GARAGES2(196), //possible duplicate
	HAIRDRESSER_BARBER_SHOP(199),
	HOTEL(202),
	PETROL_STATION(205),
	POST_OFFICE(208),
	PUB(211),
	WORKSHOP_RETAIL_SPACE(214),
	DISTRIBUTION_WAREHOUSE(217),
	FACTORY(220),
	HEAVY_INDUSTRIAL(223),
	INDUSTRIAL_PARK(226),
	LIGHT_INDUSTRIAL(229),
	STORAGE(232),
	SHOWROOM(235),
	WAREHOUSE(238),
	LAND_COMMERCIAL(241),
	COMMERCIAL_DEVELOPMENT(244),
	INDUSTRIAL_DEVELOPMENT(247),
	RESIDENTIAL_DEVELOPMENT(250),
	COMMERCIAL_PROPERTY(253),
	DATA_CENTRE(256),
	FARM(259),
	HEALTHCARE_FACILITY(262),
	MARINE_PROPERTY(265),
	MIXED_USE(268),
	RESEARCH_AND_DEVELOPMENT_FACILITY(271),
	SCIENCE_PARK(274),
	GUEST_HOUSE(277),
	HOSPITALITY(280),
	LEISURE_FACILITY(283),
	TAKEAWAY(298),
	CHILDCARE_FACILITY(301),
	SMALLHOLDING(304),
	PLACE_OF_WORSHIP(307),
	TRADE_COUNTER(310),
	COACH_HOUSE(511),
	HOUSE_OF_MULTIPLE_OCCUPATION(512),
	SPORTS_FACILITIES(535),
	SPA(538),
	CAMPSITE_AND_HOLIDAY_VILLAGE(541);

	private final int selected;

	PropertyTypes(int value) {selected = value;}

	public int get() {return selected;}
}