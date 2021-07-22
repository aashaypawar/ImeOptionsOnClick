package com.aashay.imeonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myEditText = findViewById<EditText>(R.id.et1)
        doSomething(myEditText)
    }

    private fun doSomething(search: EditText){
        search.setOnEditorActionListener(TextView.OnEditorActionListener{ _, actionId, _ ->

            /*
            EditorInfo.IME_ACTION_DONE = When no IME options is specified
            EditorInfo.IME_ACTION_SEARCH = When IME options is actionSearch
            EditorInfo.IME_ACTION_GO = When IME options is actionGo
            EditorInfo.IME_ACTION_NEXT = When IME options is actionNext
            EditorInfo.IME_ACTION_NONE = When IME options is actionNone
            EditorInfo.IME_ACTION_PREVIOUS = When IME options is actionPrevious
            EditorInfo.IME_ACTION_SEND = When IME options is actionSend
             */

            if (actionId == EditorInfo.IME_ACTION_DONE) {

                if(search.text.toString() == "geeksforgeeks"){
                    Toast.makeText(applicationContext, "Welcome to GFG", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Invalid Input", Toast.LENGTH_SHORT).show()
                }

                return@OnEditorActionListener true
            }
            false
        })
    }
}