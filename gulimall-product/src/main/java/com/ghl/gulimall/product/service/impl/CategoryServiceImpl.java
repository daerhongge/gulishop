package com.ghl.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghl.common.utils.PageUtils;
import com.ghl.common.utils.Query;

import com.ghl.gulimall.product.dao.CategoryDao;
import com.ghl.gulimall.product.entity.CategoryEntity;
import com.ghl.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listwithtree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //找到根菜单
        List<CategoryEntity> lev1 = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getchildren(categoryEntity, entities));
            return categoryEntity;
        }).sorted((mue1,mue2)->{
            return (mue1.getSort()==null?0:mue1.getSort())-(mue2.getSort()==null?0:mue2.getSort());
        }).collect(Collectors.toList());
        return lev1 ;
    }

    @Override
    public void removemenuByids(List<Long> asList) {
        //TODO:检查当前应用是否被应用
        baseMapper.deleteBatchIds(asList);
    }

    //查询子菜单
    public List<CategoryEntity> getchildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter((categoryEntity1) -> {
            return categoryEntity1.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //查询子菜单的子菜单，递归算法
            categoryEntity.setChildren(getchildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((mue1,mue2)->{
            //排序
            return (mue1.getSort()==null?0:mue1.getSort())-(mue2.getSort()==null?0:mue2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}