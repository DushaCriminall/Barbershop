package uz.datamond.xaydovchilaruyushmasi.network


import retrofit2.Call
import retrofit2.http.GET
import uz.datamond.barbershop.network.model.ListModel

interface BarbershopApi {
    @GET("")
    fun getDriversInfo(): Call<ListModel>
}