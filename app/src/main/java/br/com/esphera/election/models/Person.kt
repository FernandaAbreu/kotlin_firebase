package br.com.esphera.election.models

import org.parceler.Parcel

/**
 * Created by fernanda on 16/07/17.
 */
@Parcel
data class Person (var uid: String = "",
                     var nome: String = "",
                     var empresa : String,
                     var foto : String){

}

