package processing.app.syntax;

public class KeywordModel {
  
  String keyword, type;
  
  public KeywordModel(String keyword) {
    this.keyword = keyword;
  }
  
  public void setType(String type) {
    this.type = type;
  }

  public String getKeyword() {
    return keyword;
  }

  public String getType() {
    return type;
  }
  
}
