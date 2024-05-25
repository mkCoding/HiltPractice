package com.example.hiltpractice.ui.criminal_list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltpractice.data.model.CriminalsModel
import com.example.hiltpractice.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CriminalListViewModel @Inject constructor(val repository: Repository):ViewModel() {

    //If json response starts with an Object use this -> MutableLiveData<Model>
    //If json response starts with an Array use this -> MutableLiveData<ArrayList<Model>>

    private val _criminalList = MutableLiveData<CriminalsModel>()
    val criminalList: LiveData<CriminalsModel> = _criminalList

    init {
        getCriminalList()
    }

    private fun getCriminalList() {

        viewModelScope.launch {
            val result = repository.getCriminals()

//            if(result!=null){
//                _criminalList.postValue(result)
//            }

//            Log.d("Results",result.items.toString() )
            Log.d("CriminalListViewModel","Testing")
        }
    }


}