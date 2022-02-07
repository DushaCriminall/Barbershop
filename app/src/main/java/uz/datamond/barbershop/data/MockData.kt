package uz.datamond.barbershop.data

import android.content.Context
import uz.datamond.barbershop.R


class MockData {
    companion object {


        fun getMobileOperatorsServices(context: Context): ArrayList<MobileOperatorsServices> {
            val list = ArrayList<MobileOperatorsServices>()
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.nine),
                    1,
                    R.string.nine
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.nineHalf),
                    2,
                    R.string.nineHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.ten),
                    3,
                    R.string.ten
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.tenHalf),
                    4,
                    R.string.tenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.eleven),
                    5,
                    R.string.eleven
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.elevenHalf),
                    6,
                    R.string.elevenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.twelve),
                    7,
                    R.string.twelve
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.twelveHalf),
                    8,
                    R.string.twelveHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.thirteen),
                    9,
                    R.string.thirteen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.thirteenHalf),
                    10,
                    R.string.thirteenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.fourteen),
                    11,
                    R.string.fourteen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.fourteenHalf),
                    12,
                    R.string.fourteenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.fifteen),
                    13,
                    R.string.fifteen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.fifteenHalf),
                    14,
                    R.string.fifteenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.sixteen),
                    15,
                    R.string.sixteen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.sixteenHalf),
                    16,
                    R.string.sixteenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.seventeen),
                    17,
                    R.string.seventeen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.seventeenHalf),
                    18,
                    R.string.seventeenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.eighteen),
                    19,
                    R.string.eighteen
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.eighteenHalf),
                    20,
                    R.string.eighteenHalf
                )
            )
            list.add(
                MobileOperatorsServices(
                    context.getString(R.string.nineteen),
                    21,
                    R.string.nineteen
                )
            )
            return list
        }

//        fun getNewSaleCategories(): ArrayList<Category> {
//            val list = ArrayList<Category>()
//            list.add(Category(0, LocalizedString("News","News","Yangiliklar"), LocalizedString("","","")))
//            list.add(Category(1, LocalizedString("Sale","Sale","Chegirmalar"), LocalizedString("","","")))
//      return list
//        }

        fun getUsersList(): ArrayList<UsersList> {
            val list = ArrayList<UsersList>()
            list.add(
                UsersList(
                    "1. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "2. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "3. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "4. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "5. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "6. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "7. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "8. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "9. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            list.add(
                UsersList(
                    "10. Maria Callas ",
                    "500 000 uzs",
                    "+998 90       15 47  ",
                    "1000 баллов"
                )
            )
            return list
        }

        fun getNewsList(): ArrayList<NewsList> {
            val list = ArrayList<NewsList>()
            list.add(
                NewsList(
                    "Счастливые миллионы с mobiuz",
                    "Абонент - пользователь тарифов для физических лиц с предоплатной системой расчетов (кроме тарифов для туристов), купивший пакет “5555 MB”."
                )
            )
            list.add(
                NewsList(
                    "Счастливые миллионы с mobiuz",
                    "При покупке месячных интернет пакетов получите 25% от купленного объема трафика в подарок. Акция “МЕGAбайты +25%” действует до 06.09.2020 г."
                )
            )
            list.add(
                NewsList(
                    "Счастливые миллионы с mobiuz",
                    "Подключитесь на тарифный план с абонентской платой 30 000 сум/мес. и больше, и учавствуйте в акции “АвтоMOBI”! Также в акции учавствуют абоненты - физические лица всех тарифных планов (кроме ТП “Tourist SIM”, “Tourist SIM Lite”, “Tourist SIM+Э"
                )
            )
            return list
        }

        fun getDateList(): ArrayList<DateList> {
            val list = ArrayList<DateList>()
            list.add(DateList("Месяц"))
            list.add(DateList("Неделя"))
            list.add(DateList("День"))
            return list
        }

        fun getContactsList(): ArrayList<ContactsObject> {
            val list = ArrayList<ContactsObject>()
            list.add(
                ContactsObject(
                    "Для абонентов",
                    "Для абонентов Mobiuz доступен короткий номер",
                    "0890"
                )
            )
            list.add(
                ContactsObject(
                    "Для абонентов",
                    "Для абонентов Mobiuz доступен короткий номер",
                    "0890"
                )
            )
            list.add(
                ContactsObject(
                    "Для абонентов",
                    "Для абонентов Mobiuz доступен короткий номер",
                    "0890"
                )
            )
            list.add(
                ContactsObject(
                    "Для абонентов",
                    "Для абонентов Mobiuz доступен короткий номер",
                    "0890"
                )
            )
            return list
        }

    }

    data class MobileOperatorsList(
        val operatorNameUz: String,
        val operatorNameRu: String,
        val color: String,
        val id: Int,
        var isChecked: Boolean = false
    )

    data class MobileOperatorsServices(
        val time: String,
        val id: Int,
        val stringId: Int = -1
    )

    data class UsersList(
        val name: String,
        val price: String,
        val phoneNumber: String,
        val bonus: String
    )

    data class NewsList(val title: String, val body: String)
    data class DateList(
        val dateList: String,
        var isChecked: Boolean = false,
        val id: Int = 0,
        val description: String = ""
    )

    data class PackagesList(
        val id: Int,
        val name: String,
        val options: ArrayList<OptionsList>,
        val ussd_code: String = "",
        val isPlan: Boolean = false,
        val price: Int = 0,
        val minut: Int = 0,
        val sms: Int = 0,
        val internet: Int = 0
    )

    data class ContactsObject(val title: String, val body: String, val number: String)
    data class OptionsList(
        val name: String,
        val value: String = ""
    )
}