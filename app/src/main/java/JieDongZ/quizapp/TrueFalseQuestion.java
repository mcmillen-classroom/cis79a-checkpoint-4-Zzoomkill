package JieDongZ.quizapp;

public class TrueFalseQuestion extends Question
{

    private boolean mAnswer;

    public TrueFalseQuestion(int textResId, int hintTextResId,boolean answer)
    {
        super(textResId, hintTextResId);
        mAnswer=answer;
    }

    @Override
    public boolean checkAnswer(boolean answer)
    {
        return mAnswer==answer;
    }

    @Override
    public  boolean isTrueFalseQuestion()
    {
        return true;
    }
}
