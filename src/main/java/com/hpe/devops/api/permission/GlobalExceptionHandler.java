package com.hpe.devops.api.permission;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public StackTraceElement[] ExceptionHandler(HttpServletRequest request, Exception e)
	{
	
		 e.printStackTrace();
	
		 return e.getStackTrace();
	}
	 
	//
	// @ExceptionHandler(BadRequestException.class)
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ResponseBody
	// public List<ResError> BadRequestExceptionHandler(HttpServletRequest
	// request, BadRequestException e) {
	//
	// List<ResError> errList = new ArrayList<ResError>();
	//
	// for (FieldError fe : e.getBindingResult().getFieldErrors()) {
	//
	// errList.add(new ResError(e.getCode(), fe.getDefaultMessage(),
	// fe.getField()));
	// }
	//
	// return errList;
	// }
	//
	// @ExceptionHandler(BusinessCheckException.class)
	// @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	// @ResponseBody
	// public ResError BusinessCheckExceptionHandler(HttpServletRequest request,
	// BusinessCheckException e) {
	//
	// String msg = StringUtils.isEmpty(e.getMessage()) ?
	// MsgUtil.getInstance().get(e.getCode(), request)
	// : e.getMessage();
	//
	// return new ResError(e.getCode(), msg);
	//
	// }
	//
	// @ExceptionHandler(UnauthorizedException.class)
	// @ResponseStatus(HttpStatus.UNAUTHORIZED)
	// @ResponseBody
	// public ResError UnauthorizedExceptionHandler(HttpServletRequest request,
	// UnauthorizedException e) {
	//
	// String msg = StringUtils.isEmpty(e.getMessage()) ?
	// MsgUtil.getInstance().get(e.getCode(), request)
	// : e.getMessage();
	//
	// return new ResError(e.getCode(), msg);
	// }
	//
	// @ExceptionHandler(ConflictException.class)
	// @ResponseStatus(HttpStatus.CONFLICT)
	// @ResponseBody
	// public ResError ConflictExceptionHandler(HttpServletRequest request,
	// ConflictException e) {
	//
	// String msg = StringUtils.isEmpty(e.getMessage()) ?
	// MsgUtil.getInstance().get(e.getCode(), request)
	// : e.getMessage();
	//
	// return new ResError(e.getCode(), msg);
	// }
	//
	// @ExceptionHandler(NotFoundException.class)
	// @ResponseStatus(HttpStatus.NOT_FOUND)
	// @ResponseBody
	// public ResError NotFoundExceptionHandler(HttpServletRequest request,
	// NotFoundException e) {
	//
	// String msg = StringUtils.isEmpty(e.getMessage()) ?
	// MsgUtil.getInstance().get(e.getCode(), request)
	// : e.getMessage();
	//
	// return new ResError(e.getCode(), msg);
	// }
	//
	// @ExceptionHandler(UnknownException.class)
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	// @ResponseBody
	// public ResError UnknownExceptionHandler(HttpServletRequest request,
	// UnknownException e) {
	//
	// String msg = StringUtils.isEmpty(e.getMessage()) ?
	// MsgUtil.getInstance().get(e.getCode(), request)
	// : e.getMessage();
	//
	// return new ResError(e.getCode(), msg);
	// }
}
