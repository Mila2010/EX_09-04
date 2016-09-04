package nyc.c4q;

/**
 * Created by Millochka on 9/4/16.
 */
public class Student {
    private String mFirstName;
    private String mLastName;
    private int mIdNumber;
    private String mFavoriteFood;

    public void Student(){

        mFavoriteFood = "Banana";
        mFirstName = "Mila";
        mIdNumber = 111111;
        mLastName = "Urakhchinskaya";
    }

    private String getmFavoriteFood(){
        return mFavoriteFood;
    }

    public boolean checkSameFAvoriteFood(Student object){
             if(this.mFavoriteFood.equalsIgnoreCase(object.getmFavoriteFood()))
             {
              return true;
             }

             return false;
    }
}
