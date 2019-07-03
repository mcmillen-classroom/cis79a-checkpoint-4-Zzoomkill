package JieDongZ.quizapp;

public class MultipleChoiceQuestion extends Question
{
    private int mOptionsResId;

    //index into the array of correct answer
    private int mAnswer;

    public MultipleChoiceQuestion(int textResId, int hintTextResId, int optionsResId,int answer)
    {
        super(textResId, hintTextResId);
        mOptionsResId=optionsResId;
        mAnswer=answer;
    }

    public int getOptionsResId()
    {
        return mOptionsResId;
    }

    @Override
    public boolean checkAnswer(int answer)
    {
        return mAnswer==answer;
    }

    @Override
    public  boolean isMultipleChoiceQuestion()
    {
        return true;
    }
}