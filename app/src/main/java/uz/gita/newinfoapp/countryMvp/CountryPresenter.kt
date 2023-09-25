package uz.gita.newinfoapp.countryMvp

import uz.gita.newinfoapp.Data.DataCountry

class CountryPresenter(private val view:CountryActivity):CountryContract.Presenter {

    private val model = CountryModel()

    init {
        showAll()
    }

    override fun search() {
        val text = view.getEditText()
        val array = model.getAll()
        val result = ArrayList<DataCountry>()
        for (i in 0 until array.size) {
            if (array[i].country_name.lowercase().contains(text.lowercase())) {
                result.add(array[i])
            }
        }
        view.showSearchResult(result)
    }

    override fun showAll() {
        view.show(model.getTop10())
    }

    override fun openNextActivity() {
        val text = view.getClickItemIndex()
        val array = model.getAll()
        for (i in 0 until array.size) {
            if (array[i].country_name == text) {
                view.openItemActivity(model.getAll()[i])
            }
        }
    }
}