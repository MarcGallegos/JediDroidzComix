package com.ninjamindgames.android.jedidroidzcomix.data;


import android.provider.BaseColumns;

public final class ComiContract {

    // private empty constructor to prevent accidental instantiation of Contract Class.
    private ComiContract() {
    }

    /**
     * Inner class that defines constant values for the inventory database table.
     * Each entry in the table represents a single title.
     */
    public static final class TitleEntry implements BaseColumns {

        /**
         * Name of database table for items
         */
        public final static String TABLE_NAME = "items";

        /**
         * Unique DB Table identifier number for the item (only used in DataBase Table)
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Item Title or Name
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "product_name";

        /**
         * Supplier Name
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER = "supplier_name";

        /**
         * Supplier Phone Number
         * Type: INTEGER
         */
        public final static String COLUMN_SUPPLIER_PH = "supplier_phone_number";

        /**
         * Item Price
         * Type: INTEGER
         */
        public final static String COLUMN_PRICE = "item_price";

        /**
         * Quantity In-Stock
         * Type: INTEGER
         */
        public final static String COLUMN_QTY = "quantity";

        /**
         * Section or Genre
         * Type: INTEGER
         */
        public final static String COLUMN_SECTION = "section";


    }
}
