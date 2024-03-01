
INSERT INTO `ry-vue`.`sys_dict_type` (`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (100, '工位类型', 'station_type', '0', 'admin', '2024-02-29 14:11:28', '', NULL, NULL);

INSERT INTO `ry-vue`.`sys_dict_data` (`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (100, 0, '人工工位', '0', 'station_type', '', 'default', 'N', '0', 'admin', '2024-02-29 14:12:03', 'admin', '2024-02-29 14:16:10', NULL);
INSERT INTO `ry-vue`.`sys_dict_data` (`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (101, 1, '自动工位', '1', 'station_type', NULL, 'default', 'N', '0', 'admin', '2024-02-29 14:12:23', '', NULL, NULL);
INSERT INTO `ry-vue`.`sys_dict_data` (`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (102, 2, '半自动工位', '2', 'station_type', NULL, 'default', 'N', '0', 'admin', '2024-02-29 14:12:41', 'admin', '2024-02-29 14:13:09', NULL);


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位', '2030', '1', 'station', 'business/station/index', 1, 0, 'C', '0', '0', 'business:station:list', '#', 'admin', sysdate(), '', null, '工位菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'business:station:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'business:station:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'business:station:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'business:station:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'business:station:export',       '#', 'admin', sysdate(), '', null, '');