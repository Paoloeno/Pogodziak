package pl.nowosielski.pogodziak20.models.weather.countries;

import lombok.Data;

@Data
public class Country {

    public static String countriesJson = "[\n" +
            "  {\n" +
            "    \"name_pl\": \"Afganistan\",\n" +
            "    \"name_en\": \"Afghanistan\",\n" +
            "    \"code\": \"AF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Albania\",\n" +
            "    \"name_en\": \"Albania\",\n" +
            "    \"code\": \"AL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Algieria\",\n" +
            "    \"name_en\": \"Algeria\",\n" +
            "    \"code\": \"DZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Andora\",\n" +
            "    \"name_en\": \"Andorra\",\n" +
            "    \"code\": \"AD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Angola\",\n" +
            "    \"name_en\": \"Angola\",\n" +
            "    \"code\": \"AO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Anguilla\",\n" +
            "    \"name_en\": \"Anguilla\",\n" +
            "    \"code\": \"AI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Antarktyka\",\n" +
            "    \"name_en\": \"Antarctica\",\n" +
            "    \"code\": \"AQ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Antigua i Barbuda\",\n" +
            "    \"name_en\": \"Antigua and Barbuda\",\n" +
            "    \"code\": \"AG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Arabia Saudyjska\",\n" +
            "    \"name_en\": \"Saudi Arabia\",\n" +
            "    \"code\": \"SA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Argentyna\",\n" +
            "    \"name_en\": \"Argentina\",\n" +
            "    \"code\": \"AR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Armenia\",\n" +
            "    \"name_en\": \"Armenia\",\n" +
            "    \"code\": \"AM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Aruba\",\n" +
            "    \"name_en\": \"Aruba\",\n" +
            "    \"code\": \"AW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Australia\",\n" +
            "    \"name_en\": \"Australia\",\n" +
            "    \"code\": \"AU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Austria\",\n" +
            "    \"name_en\": \"Austria\",\n" +
            "    \"code\": \"AT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Azerbejdżan\",\n" +
            "    \"name_en\": \"Azerbaijan\",\n" +
            "    \"code\": \"AZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bahamy\",\n" +
            "    \"name_en\": \"Bahamas\",\n" +
            "    \"code\": \"BS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bahrajn\",\n" +
            "    \"name_en\": \"Bahrain\",\n" +
            "    \"code\": \"BH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bangladesz\",\n" +
            "    \"name_en\": \"Bangladesh\",\n" +
            "    \"code\": \"BD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Barbados\",\n" +
            "    \"name_en\": \"Barbados\",\n" +
            "    \"code\": \"BB\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Belgia\",\n" +
            "    \"name_en\": \"Belgium\",\n" +
            "    \"code\": \"BE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Belize\",\n" +
            "    \"name_en\": \"Belize\",\n" +
            "    \"code\": \"BZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Benin\",\n" +
            "    \"name_en\": \"Benin\",\n" +
            "    \"code\": \"BJ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bermudy\",\n" +
            "    \"name_en\": \"Bermuda\",\n" +
            "    \"code\": \"BM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bhutan\",\n" +
            "    \"name_en\": \"Bhutan\",\n" +
            "    \"code\": \"BT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Białoruś\",\n" +
            "    \"name_en\": \"Belarus\",\n" +
            "    \"code\": \"BY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Boliwia\",\n" +
            "    \"name_en\": \"Bolivia, Plurinational State of\",\n" +
            "    \"code\": \"BO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bonaire, Sint Eustatius i Saba\",\n" +
            "    \"name_en\": \"Bonaire, Sint Eustatius and Saba\",\n" +
            "    \"code\": \"BQ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bośnia i Hercegowina\",\n" +
            "    \"name_en\": \"Bosnia and Herzegovina\",\n" +
            "    \"code\": \"BA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Botswana\",\n" +
            "    \"name_en\": \"Botswana\",\n" +
            "    \"code\": \"BW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Brazylia\",\n" +
            "    \"name_en\": \"Brazil\",\n" +
            "    \"code\": \"BR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Brunei\",\n" +
            "    \"name_en\": \"Brunei Darussalam\",\n" +
            "    \"code\": \"BN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Brytyjskie Terytorium Oceanu Indyjskiego\",\n" +
            "    \"name_en\": \"British Indian Ocean Territory\",\n" +
            "    \"code\": \"IO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Brytyjskie Wyspy Dziewicze\",\n" +
            "    \"name_en\": \"Virgin Islands, British\",\n" +
            "    \"code\": \"VG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Bułgaria\",\n" +
            "    \"name_en\": \"Bulgaria\",\n" +
            "    \"code\": \"BG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Burkina Faso\",\n" +
            "    \"name_en\": \"Burkina Faso\",\n" +
            "    \"code\": \"BF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Burundi\",\n" +
            "    \"name_en\": \"Burundi\",\n" +
            "    \"code\": \"BI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Chile\",\n" +
            "    \"name_en\": \"Chile\",\n" +
            "    \"code\": \"CL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Chiny\",\n" +
            "    \"name_en\": \"China\",\n" +
            "    \"code\": \"CN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Chorwacja\",\n" +
            "    \"name_en\": \"Croatia\",\n" +
            "    \"code\": \"HR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Curaçao\",\n" +
            "    \"name_en\": \"Curaçao\",\n" +
            "    \"code\": \"CW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Cypr\",\n" +
            "    \"name_en\": \"Cyprus\",\n" +
            "    \"code\": \"CY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Czad\",\n" +
            "    \"name_en\": \"Chad\",\n" +
            "    \"code\": \"TD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Czarnogóra\",\n" +
            "    \"name_en\": \"Montenegro\",\n" +
            "    \"code\": \"ME\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Czechy\",\n" +
            "    \"name_en\": \"Czech Republic\",\n" +
            "    \"code\": \"CZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Dalekie Wyspy Mniejsze Stanów Zjednoczonych\",\n" +
            "    \"name_en\": \"United States Minor Outlying Islands\",\n" +
            "    \"code\": \"UM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Dania\",\n" +
            "    \"name_en\": \"Denmark\",\n" +
            "    \"code\": \"DK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Demokratyczna Republika Konga\",\n" +
            "    \"name_en\": \"Congo, the Democratic Republic of the\",\n" +
            "    \"code\": \"CD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Dominika\",\n" +
            "    \"name_en\": \"Dominica\",\n" +
            "    \"code\": \"DM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Dominikana\",\n" +
            "    \"name_en\": \"Dominican Republic\",\n" +
            "    \"code\": \"DO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Dżibuti\",\n" +
            "    \"name_en\": \"Djibouti\",\n" +
            "    \"code\": \"DJ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Egipt\",\n" +
            "    \"name_en\": \"Egypt\",\n" +
            "    \"code\": \"EG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Ekwador\",\n" +
            "    \"name_en\": \"Ecuador\",\n" +
            "    \"code\": \"EC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Erytrea\",\n" +
            "    \"name_en\": \"Eritrea\",\n" +
            "    \"code\": \"ER\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Estonia\",\n" +
            "    \"name_en\": \"Estonia\",\n" +
            "    \"code\": \"EE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Etiopia\",\n" +
            "    \"name_en\": \"Ethiopia\",\n" +
            "    \"code\": \"ET\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Falklandy\",\n" +
            "    \"name_en\": \"Falkland Islands (Malvinas)\",\n" +
            "    \"code\": \"FK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Fidżi\",\n" +
            "    \"name_en\": \"Fiji\",\n" +
            "    \"code\": \"FJ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Filipiny\",\n" +
            "    \"name_en\": \"Philippines\",\n" +
            "    \"code\": \"PH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Finlandia\",\n" +
            "    \"name_en\": \"Finland\",\n" +
            "    \"code\": \"FI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Francja\",\n" +
            "    \"name_en\": \"France\",\n" +
            "    \"code\": \"FR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Francuskie Terytoria Południowe i Antarktyczne\",\n" +
            "    \"name_en\": \"French Southern Territories\",\n" +
            "    \"code\": \"TF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gabon\",\n" +
            "    \"name_en\": \"Gabon\",\n" +
            "    \"code\": \"GA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gambia\",\n" +
            "    \"name_en\": \"Gambia\",\n" +
            "    \"code\": \"GM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Georgia Południowa i Sandwich Południowy\",\n" +
            "    \"name_en\": \"South Georgia and the South Sandwich Islands\",\n" +
            "    \"code\": \"GS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Ghana\",\n" +
            "    \"name_en\": \"Ghana\",\n" +
            "    \"code\": \"GH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gibraltar\",\n" +
            "    \"name_en\": \"Gibraltar\",\n" +
            "    \"code\": \"GI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Grecja\",\n" +
            "    \"name_en\": \"Greece\",\n" +
            "    \"code\": \"GR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Grenada\",\n" +
            "    \"name_en\": \"Grenada\",\n" +
            "    \"code\": \"GD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Grenlandia\",\n" +
            "    \"name_en\": \"Greenland\",\n" +
            "    \"code\": \"GL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gruzja\",\n" +
            "    \"name_en\": \"Georgia\",\n" +
            "    \"code\": \"GE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Guam\",\n" +
            "    \"name_en\": \"Guam\",\n" +
            "    \"code\": \"GU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Guernsey\",\n" +
            "    \"name_en\": \"Guernsey\",\n" +
            "    \"code\": \"GG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gujana Francuska\",\n" +
            "    \"name_en\": \"French Guiana\",\n" +
            "    \"code\": \"GF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gujana\",\n" +
            "    \"name_en\": \"Guyana\",\n" +
            "    \"code\": \"GY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gwadelupa\",\n" +
            "    \"name_en\": \"Guadeloupe\",\n" +
            "    \"code\": \"GP\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gwatemala\",\n" +
            "    \"name_en\": \"Guatemala\",\n" +
            "    \"code\": \"GT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gwinea Bissau\",\n" +
            "    \"name_en\": \"Guinea-Bissau\",\n" +
            "    \"code\": \"GW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gwinea Równikowa\",\n" +
            "    \"name_en\": \"Equatorial Guinea\",\n" +
            "    \"code\": \"GQ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Gwinea\",\n" +
            "    \"name_en\": \"Guinea\",\n" +
            "    \"code\": \"GN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Haiti\",\n" +
            "    \"name_en\": \"Haiti\",\n" +
            "    \"code\": \"HT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Hiszpania\",\n" +
            "    \"name_en\": \"Spain\",\n" +
            "    \"code\": \"ES\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Holandia\",\n" +
            "    \"name_en\": \"Netherlands\",\n" +
            "    \"code\": \"NL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Honduras\",\n" +
            "    \"name_en\": \"Honduras\",\n" +
            "    \"code\": \"HN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Hongkong\",\n" +
            "    \"name_en\": \"Hong Kong\",\n" +
            "    \"code\": \"HK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Indie\",\n" +
            "    \"name_en\": \"India\",\n" +
            "    \"code\": \"IN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Indonezja\",\n" +
            "    \"name_en\": \"Indonesia\",\n" +
            "    \"code\": \"ID\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Irak\",\n" +
            "    \"name_en\": \"Iraq\",\n" +
            "    \"code\": \"IQ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Iran\",\n" +
            "    \"name_en\": \"Iran, Islamic Republic of\",\n" +
            "    \"code\": \"IR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Irlandia\",\n" +
            "    \"name_en\": \"Ireland\",\n" +
            "    \"code\": \"IE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Islandia\",\n" +
            "    \"name_en\": \"Iceland\",\n" +
            "    \"code\": \"IS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Izrael\",\n" +
            "    \"name_en\": \"Israel\",\n" +
            "    \"code\": \"IL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Jamajka\",\n" +
            "    \"name_en\": \"Jamaica\",\n" +
            "    \"code\": \"JM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Japonia\",\n" +
            "    \"name_en\": \"Japan\",\n" +
            "    \"code\": \"JP\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Jemen\",\n" +
            "    \"name_en\": \"Yemen\",\n" +
            "    \"code\": \"YE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Jersey\",\n" +
            "    \"name_en\": \"Jersey\",\n" +
            "    \"code\": \"JE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Jordania\",\n" +
            "    \"name_en\": \"Jordan\",\n" +
            "    \"code\": \"JO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kajmany\",\n" +
            "    \"name_en\": \"Cayman Islands\",\n" +
            "    \"code\": \"KY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kambodża\",\n" +
            "    \"name_en\": \"Cambodia\",\n" +
            "    \"code\": \"KH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kamerun\",\n" +
            "    \"name_en\": \"Cameroon\",\n" +
            "    \"code\": \"CM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kanada\",\n" +
            "    \"name_en\": \"Canada\",\n" +
            "    \"code\": \"CA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Katar\",\n" +
            "    \"name_en\": \"Qatar\",\n" +
            "    \"code\": \"QA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kazachstan\",\n" +
            "    \"name_en\": \"Kazakhstan\",\n" +
            "    \"code\": \"KZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kenia\",\n" +
            "    \"name_en\": \"Kenya\",\n" +
            "    \"code\": \"KE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kirgistan\",\n" +
            "    \"name_en\": \"Kyrgyzstan\",\n" +
            "    \"code\": \"KG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kiribati\",\n" +
            "    \"name_en\": \"Kiribati\",\n" +
            "    \"code\": \"KI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kolumbia\",\n" +
            "    \"name_en\": \"Colombia\",\n" +
            "    \"code\": \"CO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Komory\",\n" +
            "    \"name_en\": \"Comoros\",\n" +
            "    \"code\": \"KM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kongo\",\n" +
            "    \"name_en\": \"Congo\",\n" +
            "    \"code\": \"CG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Korea Południowa\",\n" +
            "    \"name_en\": \"Korea, Republic of\",\n" +
            "    \"code\": \"KR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Korea Północna\",\n" +
            "    \"name_en\": \"Korea, Democratic People's Republic of\",\n" +
            "    \"code\": \"KP\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kostaryka\",\n" +
            "    \"name_en\": \"Costa Rica\",\n" +
            "    \"code\": \"CR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kuba\",\n" +
            "    \"name_en\": \"Cuba\",\n" +
            "    \"code\": \"CU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Kuwejt\",\n" +
            "    \"name_en\": \"Kuwait\",\n" +
            "    \"code\": \"KW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Laos\",\n" +
            "    \"name_en\": \"Lao People's Democratic Republic\",\n" +
            "    \"code\": \"LA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Lesotho\",\n" +
            "    \"name_en\": \"Lesotho\",\n" +
            "    \"code\": \"LS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Liban\",\n" +
            "    \"name_en\": \"Lebanon\",\n" +
            "    \"code\": \"LB\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Liberia\",\n" +
            "    \"name_en\": \"Liberia\",\n" +
            "    \"code\": \"LR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Libia\",\n" +
            "    \"name_en\": \"Libyan Arab Jamahiriya\",\n" +
            "    \"code\": \"LY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Liechtenstein\",\n" +
            "    \"name_en\": \"Liechtenstein\",\n" +
            "    \"code\": \"LI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Litwa\",\n" +
            "    \"name_en\": \"Lithuania\",\n" +
            "    \"code\": \"LT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Luksemburg\",\n" +
            "    \"name_en\": \"Luxembourg\",\n" +
            "    \"code\": \"LU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Łotwa\",\n" +
            "    \"name_en\": \"Latvia\",\n" +
            "    \"code\": \"LV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Macedonia\",\n" +
            "    \"name_en\": \"Macedonia, the former Yugoslav Republic of\",\n" +
            "    \"code\": \"MK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Madagaskar\",\n" +
            "    \"name_en\": \"Madagascar\",\n" +
            "    \"code\": \"MG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Majotta\",\n" +
            "    \"name_en\": \"Mayotte\",\n" +
            "    \"code\": \"YT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Makau\",\n" +
            "    \"name_en\": \"Macao\",\n" +
            "    \"code\": \"MO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Malawi\",\n" +
            "    \"name_en\": \"Malawi\",\n" +
            "    \"code\": \"MW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Malediwy\",\n" +
            "    \"name_en\": \"Maldives\",\n" +
            "    \"code\": \"MV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Malezja\",\n" +
            "    \"name_en\": \"Malaysia\",\n" +
            "    \"code\": \"MY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mali\",\n" +
            "    \"name_en\": \"Mali\",\n" +
            "    \"code\": \"ML\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Malta\",\n" +
            "    \"name_en\": \"Malta\",\n" +
            "    \"code\": \"MT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mariany Północne\",\n" +
            "    \"name_en\": \"Northern Mariana Islands\",\n" +
            "    \"code\": \"MP\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Maroko\",\n" +
            "    \"name_en\": \"Morocco\",\n" +
            "    \"code\": \"MA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Martynika\",\n" +
            "    \"name_en\": \"Martinique\",\n" +
            "    \"code\": \"MQ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mauretania\",\n" +
            "    \"name_en\": \"Mauritania\",\n" +
            "    \"code\": \"MR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mauritius\",\n" +
            "    \"name_en\": \"Mauritius\",\n" +
            "    \"code\": \"MU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Meksyk\",\n" +
            "    \"name_en\": \"Mexico\",\n" +
            "    \"code\": \"MX\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mikronezja\",\n" +
            "    \"name_en\": \"Micronesia, Federated States of\",\n" +
            "    \"code\": \"FM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mjanma\",\n" +
            "    \"name_en\": \"Myanmar\",\n" +
            "    \"code\": \"MM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mołdawia\",\n" +
            "    \"name_en\": \"Moldova, Republic of\",\n" +
            "    \"code\": \"MD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Monako\",\n" +
            "    \"name_en\": \"Monaco\",\n" +
            "    \"code\": \"MC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mongolia\",\n" +
            "    \"name_en\": \"Mongolia\",\n" +
            "    \"code\": \"MN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Montserrat\",\n" +
            "    \"name_en\": \"Montserrat\",\n" +
            "    \"code\": \"MS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Mozambik\",\n" +
            "    \"name_en\": \"Mozambique\",\n" +
            "    \"code\": \"MZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Namibia\",\n" +
            "    \"name_en\": \"Namibia\",\n" +
            "    \"code\": \"NA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nauru\",\n" +
            "    \"name_en\": \"Nauru\",\n" +
            "    \"code\": \"NR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nepal\",\n" +
            "    \"name_en\": \"Nepal\",\n" +
            "    \"code\": \"NP\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Niemcy\",\n" +
            "    \"name_en\": \"Germany\",\n" +
            "    \"code\": \"DE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Niger\",\n" +
            "    \"name_en\": \"Niger\",\n" +
            "    \"code\": \"NE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nigeria\",\n" +
            "    \"name_en\": \"Nigeria\",\n" +
            "    \"code\": \"NG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nikaragua\",\n" +
            "    \"name_en\": \"Nicaragua\",\n" +
            "    \"code\": \"NI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Niue\",\n" +
            "    \"name_en\": \"Niue\",\n" +
            "    \"code\": \"NU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Norfolk\",\n" +
            "    \"name_en\": \"Norfolk Island\",\n" +
            "    \"code\": \"NF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Norwegia\",\n" +
            "    \"name_en\": \"Norway\",\n" +
            "    \"code\": \"NO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nowa Kaledonia\",\n" +
            "    \"name_en\": \"New Caledonia\",\n" +
            "    \"code\": \"NC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Nowa Zelandia\",\n" +
            "    \"name_en\": \"New Zealand\",\n" +
            "    \"code\": \"NZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Oman\",\n" +
            "    \"name_en\": \"Oman\",\n" +
            "    \"code\": \"OM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Pakistan\",\n" +
            "    \"name_en\": \"Pakistan\",\n" +
            "    \"code\": \"PK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Palau\",\n" +
            "    \"name_en\": \"Palau\",\n" +
            "    \"code\": \"PW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Palestyna\",\n" +
            "    \"name_en\": \"Palestinian Territory, Occupied\",\n" +
            "    \"code\": \"PS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Panama\",\n" +
            "    \"name_en\": \"Panama\",\n" +
            "    \"code\": \"PA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Papua-Nowa Gwinea\",\n" +
            "    \"name_en\": \"Papua New Guinea\",\n" +
            "    \"code\": \"PG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Paragwaj\",\n" +
            "    \"name_en\": \"Paraguay\",\n" +
            "    \"code\": \"PY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Peru\",\n" +
            "    \"name_en\": \"Peru\",\n" +
            "    \"code\": \"PE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Pitcairn\",\n" +
            "    \"name_en\": \"Pitcairn\",\n" +
            "    \"code\": \"PN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Polinezja Francuska\",\n" +
            "    \"name_en\": \"French Polynesia\",\n" +
            "    \"code\": \"PF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Polska\",\n" +
            "    \"name_en\": \"Poland\",\n" +
            "    \"code\": \"PL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Portoryko\",\n" +
            "    \"name_en\": \"Puerto Rico\",\n" +
            "    \"code\": \"PR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Portugalia\",\n" +
            "    \"name_en\": \"Portugal\",\n" +
            "    \"code\": \"PT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Republika Południowej Afryki\",\n" +
            "    \"name_en\": \"South Africa\",\n" +
            "    \"code\": \"ZA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Republika Środkowoafrykańska\",\n" +
            "    \"name_en\": \"Central African Republic\",\n" +
            "    \"code\": \"CF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Republika Zielonego Przylądka\",\n" +
            "    \"name_en\": \"Cape Verde\",\n" +
            "    \"code\": \"CV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Reunion\",\n" +
            "    \"name_en\": \"Réunion\",\n" +
            "    \"code\": \"RE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Rosja\",\n" +
            "    \"name_en\": \"Russian Federation\",\n" +
            "    \"code\": \"RU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Rumunia\",\n" +
            "    \"name_en\": \"Romania\",\n" +
            "    \"code\": \"RO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Rwanda\",\n" +
            "    \"name_en\": \"Rwanda\",\n" +
            "    \"code\": \"RW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sahara Zachodnia\",\n" +
            "    \"name_en\": \"Western Sahara\",\n" +
            "    \"code\": \"EH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint Kitts i Nevis\",\n" +
            "    \"name_en\": \"Saint Kitts and Nevis\",\n" +
            "    \"code\": \"KN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint Lucia\",\n" +
            "    \"name_en\": \"Saint Lucia\",\n" +
            "    \"code\": \"LC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint Vincent i Grenadyny\",\n" +
            "    \"name_en\": \"Saint Vincent and the Grenadines\",\n" +
            "    \"code\": \"VC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint-Barthélemy\",\n" +
            "    \"name_en\": \"Saint Barthélemy\",\n" +
            "    \"code\": \"BL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint-Martin\",\n" +
            "    \"name_en\": \"Saint Martin (French part)\",\n" +
            "    \"code\": \"MF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Saint-Pierre i Miquelon\",\n" +
            "    \"name_en\": \"Saint Pierre and Miquelon\",\n" +
            "    \"code\": \"PM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Salwador\",\n" +
            "    \"name_en\": \"El Salvador\",\n" +
            "    \"code\": \"SV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Samoa Amerykańskie\",\n" +
            "    \"name_en\": \"American Samoa\",\n" +
            "    \"code\": \"AS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Samoa\",\n" +
            "    \"name_en\": \"Samoa\",\n" +
            "    \"code\": \"WS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"San Marino\",\n" +
            "    \"name_en\": \"San Marino\",\n" +
            "    \"code\": \"SM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Senegal\",\n" +
            "    \"name_en\": \"Senegal\",\n" +
            "    \"code\": \"SN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Serbia\",\n" +
            "    \"name_en\": \"Serbia\",\n" +
            "    \"code\": \"RS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Seszele\",\n" +
            "    \"name_en\": \"Seychelles\",\n" +
            "    \"code\": \"SC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sierra Leone\",\n" +
            "    \"name_en\": \"Sierra Leone\",\n" +
            "    \"code\": \"SL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Singapur\",\n" +
            "    \"name_en\": \"Singapore\",\n" +
            "    \"code\": \"SG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sint Maarten\",\n" +
            "    \"name_en\": \"Sint Maarten (Dutch part)\",\n" +
            "    \"code\": \"SX\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Słowacja\",\n" +
            "    \"name_en\": \"Slovakia\",\n" +
            "    \"code\": \"SK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Słowenia\",\n" +
            "    \"name_en\": \"Slovenia\",\n" +
            "    \"code\": \"SI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Somalia\",\n" +
            "    \"name_en\": \"Somalia\",\n" +
            "    \"code\": \"SO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sri Lanka\",\n" +
            "    \"name_en\": \"Sri Lanka\",\n" +
            "    \"code\": \"LK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Stany Zjednoczone\",\n" +
            "    \"name_en\": \"United States\",\n" +
            "    \"code\": \"US\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Suazi\",\n" +
            "    \"name_en\": \"Swaziland\",\n" +
            "    \"code\": \"SZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sudan\",\n" +
            "    \"name_en\": \"Sudan\",\n" +
            "    \"code\": \"SD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Sudan Południowy\",\n" +
            "    \"name_en\": \"South Sudan\",\n" +
            "    \"code\": \"SS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Surinam\",\n" +
            "    \"name_en\": \"Suriname\",\n" +
            "    \"code\": \"SR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Svalbard i Jan Mayen\",\n" +
            "    \"name_en\": \"Svalbard and Jan Mayen\",\n" +
            "    \"code\": \"SJ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Syria\",\n" +
            "    \"name_en\": \"Syrian Arab Republic\",\n" +
            "    \"code\": \"SY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Szwajcaria\",\n" +
            "    \"name_en\": \"Switzerland\",\n" +
            "    \"code\": \"CH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Szwecja\",\n" +
            "    \"name_en\": \"Sweden\",\n" +
            "    \"code\": \"SE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tadżykistan\",\n" +
            "    \"name_en\": \"Tajikistan\",\n" +
            "    \"code\": \"TJ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tajlandia\",\n" +
            "    \"name_en\": \"Thailand\",\n" +
            "    \"code\": \"TH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tajwan\",\n" +
            "    \"name_en\": \"Taiwan, Province of China\",\n" +
            "    \"code\": \"TW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tanzania\",\n" +
            "    \"name_en\": \"Tanzania, United Republic of\",\n" +
            "    \"code\": \"TZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Timor Wschodni\",\n" +
            "    \"name_en\": \"Timor-Leste\",\n" +
            "    \"code\": \"TL\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Togo\",\n" +
            "    \"name_en\": \"Togo\",\n" +
            "    \"code\": \"TG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tokelau\",\n" +
            "    \"name_en\": \"Tokelau\",\n" +
            "    \"code\": \"TK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tonga\",\n" +
            "    \"name_en\": \"Tonga\",\n" +
            "    \"code\": \"TO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Trynidad i Tobago\",\n" +
            "    \"name_en\": \"Trinidad and Tobago\",\n" +
            "    \"code\": \"TT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tunezja\",\n" +
            "    \"name_en\": \"Tunisia\",\n" +
            "    \"code\": \"TN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Turcja\",\n" +
            "    \"name_en\": \"Turkey\",\n" +
            "    \"code\": \"TR\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Turkmenistan\",\n" +
            "    \"name_en\": \"Turkmenistan\",\n" +
            "    \"code\": \"TM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Turks i Caicos\",\n" +
            "    \"name_en\": \"Turks and Caicos Islands\",\n" +
            "    \"code\": \"TC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Tuvalu\",\n" +
            "    \"name_en\": \"Tuvalu\",\n" +
            "    \"code\": \"TV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Uganda\",\n" +
            "    \"name_en\": \"Uganda\",\n" +
            "    \"code\": \"UG\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Ukraina\",\n" +
            "    \"name_en\": \"Ukraine\",\n" +
            "    \"code\": \"UA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Urugwaj\",\n" +
            "    \"name_en\": \"Uruguay\",\n" +
            "    \"code\": \"UY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Uzbekistan\",\n" +
            "    \"name_en\": \"Uzbekistan\",\n" +
            "    \"code\": \"UZ\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Vanuatu\",\n" +
            "    \"name_en\": \"Vanuatu\",\n" +
            "    \"code\": \"VU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wallis i Futuna\",\n" +
            "    \"name_en\": \"Wallis and Futuna\",\n" +
            "    \"code\": \"WF\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Watykan\",\n" +
            "    \"name_en\": \"Holy See (Vatican City State)\",\n" +
            "    \"code\": \"VA\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wenezuela\",\n" +
            "    \"name_en\": \"Venezuela, Bolivarian Republic of\",\n" +
            "    \"code\": \"VE\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Węgry\",\n" +
            "    \"name_en\": \"Hungary\",\n" +
            "    \"code\": \"HU\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wielka Brytania\",\n" +
            "    \"name_en\": \"United Kingdom\",\n" +
            "    \"code\": \"GB\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wietnam\",\n" +
            "    \"name_en\": \"Viet Nam\",\n" +
            "    \"code\": \"VN\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Włochy\",\n" +
            "    \"name_en\": \"Italy\",\n" +
            "    \"code\": \"IT\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wybrzeże Kości Słoniowej\",\n" +
            "    \"name_en\": \"Côte d'Ivoire\",\n" +
            "    \"code\": \"CI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspa Bouveta\",\n" +
            "    \"name_en\": \"Bouvet Island\",\n" +
            "    \"code\": \"BV\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspa Bożego Narodzenia\",\n" +
            "    \"name_en\": \"Christmas Island\",\n" +
            "    \"code\": \"CX\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspa Man\",\n" +
            "    \"name_en\": \"Isle of Man\",\n" +
            "    \"code\": \"IM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspa Świętej Heleny, Wyspa Wniebowstąpienia i Tristan da Cunha\",\n" +
            "    \"name_en\": \"Saint Helena, Ascension and Tristan Cunha\",\n" +
            "    \"code\": \"SH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Alandzkie\",\n" +
            "    \"name_en\": \"Åland Islands\",\n" +
            "    \"code\": \"AX\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Cooka\",\n" +
            "    \"name_en\": \"Cook Islands\",\n" +
            "    \"code\": \"CK\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Dziewicze Stanów Zjednoczonych\",\n" +
            "    \"name_en\": \"Virgin Islands, U.S.\",\n" +
            "    \"code\": \"VI\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Heard i McDonalda\",\n" +
            "    \"name_en\": \"Heard Island and McDonald Islands\",\n" +
            "    \"code\": \"HM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Kokosowe\",\n" +
            "    \"name_en\": \"Cocos (Keeling) Islands\",\n" +
            "    \"code\": \"CC\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Marshalla\",\n" +
            "    \"name_en\": \"Marshall Islands\",\n" +
            "    \"code\": \"MH\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Owcze\",\n" +
            "    \"name_en\": \"Faroe Islands\",\n" +
            "    \"code\": \"FO\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Salomona\",\n" +
            "    \"name_en\": \"Solomon Islands\",\n" +
            "    \"code\": \"SB\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Wyspy Świętego Tomasza i Książęca\",\n" +
            "    \"name_en\": \"Sao Tome and Principe\",\n" +
            "    \"code\": \"ST\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Zambia\",\n" +
            "    \"name_en\": \"Zambia\",\n" +
            "    \"code\": \"ZM\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Zimbabwe\",\n" +
            "    \"name_en\": \"Zimbabwe\",\n" +
            "    \"code\": \"ZW\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name_pl\": \"Zjednoczone Emiraty Arabskie\",\n" +
            "    \"name_en\": \"United Arab Emirates\",\n" +
            "    \"code\": \"AE\"\n" +
            "  }\n" +
            "]";
}
