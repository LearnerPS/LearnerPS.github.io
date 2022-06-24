***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring;

public class TodoVo {

	private String title, todo;
	
	public TodoVo() {
	}

	public TodoVo(String title, String todo) {
		super();
		this.title = title;
		this.todo = todo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "TodoVo [title=" + title + ", todo=" + todo + "]";
	}
	
}


```
