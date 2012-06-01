package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def ping = Action {
    if (System.currentTimeMillis % 2 == 0) {
        InternalServerError("Ping service with error")
    } else {
        Ok("Ping service ok")
    }
  }  
}