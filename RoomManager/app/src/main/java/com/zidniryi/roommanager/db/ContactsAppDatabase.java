package com.zidniryi.roommanager.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.zidniryi.roommanager.db.entity.Contact;

//Comunitace Interface with Databases
@Database(entities = {Contact.class}, version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    public abstract ContactDAO getContactDao();
}
