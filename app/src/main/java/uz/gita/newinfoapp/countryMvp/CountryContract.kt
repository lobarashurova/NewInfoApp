package uz.gita.newinfoapp.countryMvp

import uz.gita.newinfoapp.Data.DataCountry

interface CountryContract {
    interface Model {
        fun getTop10(): ArrayList<DataCountry>
        fun getAll(): ArrayList<DataCountry>
    }

    interface Presenter {
        fun search()
        fun showAll()
        fun openNextActivity()
    }

    interface View {
        fun getClickItemIndex(): String
        fun getEditText(): String
        fun showSearchResult(array: ArrayList<DataCountry>)
        fun show(array: ArrayList<DataCountry>)
        fun openItemActivity(itemCountry: DataCountry)
    }
}