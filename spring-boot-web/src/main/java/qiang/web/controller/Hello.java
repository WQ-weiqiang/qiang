package qiang.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qiang.web.doman.Qiang;

@RestController
@Api(value = "api value", tags = "api tags", produces = "api produce")
public class Hello {
    @Autowired
    Qiang q;


    /**
     * ApiIgnore 使用该注解忽略这个API，不会生成接口文档。可注解在类和方法上
     *
     * @return
     */
    //@ApiIgnore
    @ApiOperation(value = "简短描述", notes = "详细描述")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "query")
    @GetMapping("/")
    String hello() {

        //return "This is hello ";
        return q.toString();

    }
}
