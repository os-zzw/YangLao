package yanglao.service;

import com.github.abel533.entity.Example;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by john on 2016/11/12.
 */
@Service
public abstract class BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    /***********************************/
    //以下是所有的查询事件
    public T queryById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> queryAll() {
        return this.mapper.select(null);
    }

    /**
     * 根据条件返回集合
     *
     * @param t
     * @return
     */
    public List<T> queryByWhere(T t) {
        return mapper.select(t);
    }

    /**
     * 根据条件查询一条数据
     *
     * @param t
     * @return
     */
    public T queryOne(T t) {
        return mapper.selectOne(t);
    }

    /**
     * 分页
     *
     * @param t
     * @param page
     * @param rows
     * @return
     */
    public PageInfo<T> querypageListByWhere(T t, Integer page, Integer rows) {
        PageHelper.startPage(page, rows, true);
        //查询数据
        List<T> list = this.queryByWhere(t);
        return new PageInfo<T>(list);
    }

    /**
     * 自定义查询条件的分页
     *
     * @param example
     * @param page
     * @param rows
     * @return
     */
    public PageInfo<T> querypageListByExample(Example example, Integer page, Integer rows) {
        PageHelper.startPage(page, rows, true);
        //查询数据
        List<T> list = mapper.selectByExample(example);
        return new PageInfo<T>(list);
    }

    /**
     * 插入数据
     */
    public Integer save(T t) {
//        t.setCreate_date(new Date());
//        t.setUpdate_date(new Date());
        return mapper.insert(t);
    }

    /**
     * 新增数据使用不为null的字段
     *
     * @param t
     * @return
     */
    public Integer saveSelective(T t) {
//        t.setCreate_date(new Date());
//        t.setUpdate_date(new Date());
        return mapper.insertSelective(t);
    }


    public Integer update(T t) {
//        t.setUpdate_date(new Date());
        return mapper.updateByPrimaryKey(t);
    }

    /**
     * 更新数据使用不为null的字段
     *
     * @param t
     * @return
     */
    public Integer updateSelective(T t) {
//        t.setUpdate_date(new Date());
        return mapper.updateByPrimaryKeySelective(t);
    }


    public Integer deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids
     * @param property
     * @param tClass
     * @return
     */
    public Integer deleteByIds(List<Object> ids, String property, Class<T> tClass) {
        Example example = new Example(tClass);
        example.createCriteria().andIn(property, ids);
        return mapper.deleteByExample(example);
    }

    public Integer deleteByString(String object){
        return mapper.deleteByPrimaryKey(object);
    }

}
