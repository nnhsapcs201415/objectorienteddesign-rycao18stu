/**
A question with a text and an answer.
 */
public class Question
{
    private String text;
    private String answer;

    /**
    Constructs a question with empty question and answer.
     */
    public Question() 
    {
        this.text = "";
        this.answer = "";
    }

    /**
     * Constructs a question with the specified question text
     */
    public Question(String questionText)
    {
        this.text = questionText;
        this.answer = "";
    }

    public void addText(String addedText)
    {
        this.text += addedText;
    }

    /**
    Sets the question text.
    @param questionText the text of this question
     */
    public void setText(String questionText)   
    {
        text = questionText;
    }

    /**
    Sets the answer for this question.
    @param correctResponse the answer
     */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }

    /**
    Checks a given response for correctness.
    @param response the response to check
    @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    /**
    Displays this question.
     */
    public void display()
    {
        System.out.println(text);
    }

    public String toString()
    {
        return "text [" + this.text + "]: " + this.answer;
    }
}
