-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工位', '2030', '1', 'station', 'business/station/index', 1, 0, 'C', '0', '0', 'business:station:list', 'nested', 'admin', sysdate(), '', null, '工位菜单');

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