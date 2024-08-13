package com.example.mindbenders.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.mindbenders.models.User
import com.example.mindbenders.navigation.ROUTE_HOME
import com.example.mindbenders.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel (var navController: NavController,
                     var context: Context) {
    var mAuth: FirebaseAuth

    init {
        mAuth = FirebaseAuth.getInstance()
    }

    fun signup(
        firstname: String,
        lastname: String,
        email: String,
        password: String,
    ) {
        if (firstname.isBlank() || lastname.isBlank() || email.isBlank() || password.isBlank()) {
            Toast.makeText(context, "please fill all the fields", Toast.LENGTH_LONG).show()
            return
        } else {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful) {
                    var userdata =
                        User(firstname, lastname, email, password, mAuth.currentUser!!.uid)
                    var regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(context, "please fill all the fields", Toast.LENGTH_LONG)
                                .show()
                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                        }
                    }
                } else {
                    navController.navigate(ROUTE_REGISTER)
                }
            }
        }
    }

    fun login(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(context, "Successfuly logged in", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(context, "${it.exception!!.message}",Toast.LENGTH_LONG).show()
            }
        }

    }

}