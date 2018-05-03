package ru.temoteam.a1exs.todo.data

import com.google.firebase.auth.FirebaseAuth
import ru.temoteam.a1exs.todo.data.objects.User
import com.google.firebase.auth.FirebaseUser
import android.widget.Toast
import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.database.FirebaseDatabase






object FirebaseProvider {

    private val mAuth = FirebaseAuth.getInstance()
    private val storage = FirebaseStorage.getInstance()
    private val database = FirebaseDatabase.getInstance()

    fun saveTask(task: ru.temoteam.a1exs.todo.data.objects.Task){
        database.reference.child(getCurrentUser()!!.uid).child("tasks").push().setValue(task)
    }

    fun readTasks(offset:Int, count:Int, onTaskAdded: (String,ru.temoteam.a1exs.todo.data.objects.Task) -> Void){
        database.reference.child(getCurrentUser()!!.uid).child("tasks").addChildEventListener(object :ChildEventListener{

            override fun onChildAdded(p0: DataSnapshot?, p1: String?) {
                onTaskAdded(p0?.key!!,p0.value as ru.temoteam.a1exs.todo.data.objects.Task)
            }

            override fun onCancelled(p0: DatabaseError?) {}

            override fun onChildMoved(p0: DataSnapshot?, p1: String?) {}

            override fun onChildChanged(p0: DataSnapshot?, p1: String?) {}

            override fun onChildRemoved(p0: DataSnapshot?) {}
        })
    }

    fun uploadImg(){

    }

    fun getCurrentUser(): FirebaseUser? {
        return mAuth.currentUser
    }

    fun login(email:String,password:String):Task<AuthResult>{
        return mAuth.signInWithEmailAndPassword(email, password)
    }

    fun register(email:String,password:String):Task<AuthResult>{
        return mAuth.createUserWithEmailAndPassword(email, password)
    }

    fun debugAuth(){
        login("debug@tester.ru","123456")
    }
}