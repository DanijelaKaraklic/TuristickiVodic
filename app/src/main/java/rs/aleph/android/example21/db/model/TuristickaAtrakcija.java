package rs.aleph.android.example21.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 29.11.17..
 */

@DatabaseTable(tableName = TuristickaAtrakcija.TABLE_NAME_ATRAKCIJA)
public class TuristickaAtrakcija {
    public static final String TABLE_NAME_ATRAKCIJA = "turistickaAtrakcija";

    public static final String FIELD_NAME_ID = "id";
    public static final String FIELD_NAME_NAME = "name";
    public static final String FIELD_NAME_DESCRIPTION = "description";
    public static final String FIELD_NAME_IMAGE = "image";
    public static final String FIELD_NAME_ADRESS = "postal";
    public static final String FIELD_NAME_WEB_ADRESS = "web";

    public static final String FIELD_NAME_TELEPHONE = "telephone";
    public static final String FIELD_NAME_TIME_START= "timeStart";
    public static final String FIELD_NAME_TIME_END= "timeEnd";

    public static final String FIELD_NAME_PRICE = "price";
    public static final String FIELD_NAME_COMMENT = "comment";





    @DatabaseField(columnName = FIELD_NAME_ID,generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;


    @DatabaseField(columnName = FIELD_NAME_DESCRIPTION)
    private String mDescription;


    @DatabaseField(columnName = FIELD_NAME_IMAGE)
    private String mImage;

    @DatabaseField(columnName = FIELD_NAME_ADRESS)

    private String mAdress;


    @DatabaseField(columnName = FIELD_NAME_WEB_ADRESS)

    private String mWebAdress;

    @DatabaseField(columnName = FIELD_NAME_TELEPHONE)
    private int mTel;

    @DatabaseField(columnName = FIELD_NAME_TIME_START)
    private int mStart;

    @DatabaseField(columnName = FIELD_NAME_TIME_END)
    private int mEnd;
    @DatabaseField(columnName = FIELD_NAME_PRICE)
    private double mPrice;

    @DatabaseField(columnName = FIELD_NAME_COMMENT)

    private String mComment;





    public String getmWebAdress() {
        return mWebAdress;
    }

    public void setmWebAdress(String mWebAdress) {
        this.mWebAdress = mWebAdress;
    }

    public int getmStart() {
        return mStart;
    }

    public void setmStart(int mStart) {
        this.mStart = mStart;
    }

    public int getmEnd() {
        return mEnd;
    }

    public void setmEnd(int mEnd) {
        this.mEnd = mEnd;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public String getmComment() {
        return mComment;
    }

    public void setmComment(String mComment) {
        this.mComment = mComment;
    }


    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public String getmAdress() {
        return mAdress;
    }

    public void setmAdress(String mAdress) {
        this.mAdress = mAdress;
    }

    public int getmTel() {
        return mTel;
    }

    public void setmTel(int mTel) {
        this.mTel = mTel;
    }

    public TuristickaAtrakcija() {
    }

    @Override
    public String toString() {
        return mName;
    }


}
