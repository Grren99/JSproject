package com.wnsrl.controller;

import com.wnsrl.controller.action.Action;
import com.wnsrl.controller.action.CategoryAction;
import com.wnsrl.controller.action.CommentDeleteAction;
import com.wnsrl.controller.action.CommentUpdateAction;
import com.wnsrl.controller.action.CommentUpdateFomrAction;
import com.wnsrl.controller.action.CommentWriteAction;
import com.wnsrl.controller.action.CommentWriteFormAction;
import com.wnsrl.controller.action.DeleteAction;
import com.wnsrl.controller.action.LoginAction;
import com.wnsrl.controller.action.LoginFormAction;
import com.wnsrl.controller.action.LogoutAction;
import com.wnsrl.controller.action.MainListAction;
import com.wnsrl.controller.action.RegisterAction;
import com.wnsrl.controller.action.RegisterFromAction;
import com.wnsrl.controller.action.UpdateAction;
import com.wnsrl.controller.action.UpdateFormAction;
import com.wnsrl.controller.action.WriteAction;
import com.wnsrl.controller.action.WriteFormAction;
import com.wnsrl.controller.action.WriteView;

public class ActionFactory {

	private ActionFactory() {
		super();
	}
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction (String command) {
		Action action = null;
		if(command.equals("Main_list")) {
			action = new MainListAction();
		}else if(command.equals("login_list_form")) {
			action = new LoginFormAction();
		}else if(command.equals("login_list")) {
			action = new LoginAction();
		}else if(command.equals("logout_list")) {
			action = new LogoutAction();
		}else if(command.equals("Register_list_form")) {
			action = new RegisterFromAction();
		}else if(command.equals("Register_list")){
			action = new RegisterAction();
		}else if(command.equals("Category_list")) {
			action = new CategoryAction();
		}else if(command.equals("Write_list_form")) {
			action = new WriteFormAction();
		}else if(command.equals("Write_list")) {
			action = new WriteAction();
		}else if(command.equals("Comment_write_form")) {
			action = new CommentWriteFormAction();
		}else if(command.equals("Comment_write_list")) {
			action = new CommentWriteAction();
		}else if(command.equals("Write_view")) {
			action = new WriteView();
		}else if(command.equals("Update_list_form")) {
			action = new UpdateFormAction();
		}else if(command.equals("Update_list")) {
			action = new UpdateAction();
		}else if(command.equals("Comment_Update_form")) {
			action = new CommentUpdateFomrAction();
		}else if(command.equals("Comment_Update")) {
			action = new CommentUpdateAction();
		}else if(command.equals("Delete_list")) {
			action = new DeleteAction();
		}else if(command.equals("Comment_delete")) {
			action = new CommentDeleteAction();
		}
			
		return action;
	}
}
