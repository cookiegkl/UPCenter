package org.hanzhdy.manager.upc.controller;

import javax.servlet.http.HttpServletRequest;

import org.hanzhdy.manager.support.bean.SessionUser;
import org.hanzhdy.manager.support.constants.resp.RespResult;
import org.hanzhdy.manager.support.controller.ApplicationController;
import org.hanzhdy.manager.upc.controller.params.AccessSystemParams;
import org.hanzhdy.manager.upc.model.AccessSystem;
import org.hanzhdy.manager.upc.service.AccessSystemService;
import org.hanzhdy.web.bean.DatatableResult;
import org.hanzhdy.web.throwable.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * @description 接入系统管理Controller
 * @author H.CAAHN
 * @createtime 2016年10月7日 上午12:40:25
 */
@Controller
@RequestMapping("/basic/accesssys")
public class AccessSystemController extends ApplicationController {
    @Autowired
    private AccessSystemService accessSystemService;
    
    /** 日志对象 */
    private static final Logger logger = LoggerFactory.getLogger(AccessSystemController.class);
    
    /**
     * 转到接入系统管理列表页面
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String toList() {
        return "/basic/accsys/accesssystem-list";
    }
    
    /**
     * 请求获取接入系统列表数据
     * @param params
     * @param request
     * @return
     */
    @RequestMapping(value = "dataList", method = RequestMethod.POST)
    @ResponseBody
    public Object dataList(AccessSystemParams params, HttpServletRequest request) {
        try {
            DatatableResult dataResult = accessSystemService.queryAsDatatableResult(params);
            return JSON.toJSONString(dataResult);
        }
        catch (BizException ex) {
            logger.error("查询接入系统数据失败，查询参数：{}, 错误信息：[{}, {}]", JSON.toJSONString(params), ex.getCode(), ex.getMsg());
        }
        catch (Exception ex) {
            logger.error("查询接入系统数据失败，查询参数：" + JSON.toJSONString(params), ex);
        }
        return null;
    }
    
    /**
     * 跳转到编辑页面
     * @param id
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "toEdit", method = RequestMethod.GET)
    public String toEdit(Long id, Model model, HttpServletRequest request) {
        // 查询接入系统信息
        if (id != null && id > 0) {
            AccessSystem record = accessSystemService.queryById(id);
            if (record != null) {
                model.addAttribute("record", record);
                return "/basic/accsys/accesssystem-edit";
            }
            return redirect(REDIRECT_404);
        }
        return "/basic/accsys/accesssystem-edit";
    }
    
    /**
     * 处理保存第三方接入系统信息请求
     * @param record
     * @param request
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public Object saveUser(AccessSystem record, HttpServletRequest request) {
        SessionUser user = super.getSessionUser(request);
        try {
            // 执行新增或更新操作
            boolean result = false;
            if (record.getId() == null) {
                record.setCreator(user.getId());
                result = this.accessSystemService.insert(record);
            }
            else {
                record.setUpdater(user.getId());
                result = this.accessSystemService.update(record);
            }
            
            // 处理返回结果
            return RespResult.create(result ? respCode.SUCCESS : respCode.SAVE_NORECORD);
        }
        catch (BizException ex) {
            logger.warn("保存第三方接入系统信息失败，数据参数{}, 错误信息：[{}, {}]", JSON.toJSONString(record), ex.getCode(), ex.getMsg());
            return RespResult.create(ex.getCode(), ex.getMsg());
        }
        catch (Exception ex) {
            logger.error("保存第三方接入系统信息失败，数据参数：" + JSON.toJSONString(record), ex);
            return RespResult.create(respCode.ERROR_EXCEPTION);
        }
    }
    
    /**
     * 处理更新第三方接入系统数据状态请求
     * @param record
     * @param request
     * @return
     */
    @RequestMapping(value = "updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public Object updateStatus(AccessSystem record, HttpServletRequest request) {
        SessionUser user = super.getSessionUser(request);
        try {
            record.setUpdater(user.getId());
            this.accessSystemService.updateStatus(record);
            return RespResult.create(respCode.SUCCESS);
        }
        catch (BizException ex) {
            logger.error("更新第三方接入系统数据状态失败，数据参数：{}, 错误信息：[{}, {}]", JSON.toJSONString(record), ex.getCode(), ex.getMsg());
            return RespResult.create(ex.getCode(), ex.getMsg());
        }
        catch (Exception ex) {
            logger.error("更新第三方接入系统数据状态失败，数据参数：" + JSON.toJSONString(record), ex);
            return RespResult.create(respCode.ERROR_EXCEPTION);
        }
    }
}
