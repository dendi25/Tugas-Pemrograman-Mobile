package id.ramadani.dendi

import com.google.gson.annotations.SerializedName

data class PostResponse(
    val id: Int,
    val name: String?,
    val email: String?,
    @SerializedName("body")
    val text:String?
//mendeklarasikan variabel
//@SeriallizeName untuk memanggil nama variabel yang berbeda
)