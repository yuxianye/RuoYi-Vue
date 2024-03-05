-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备管理', '2030', '1', 'equipment', 'business/equipment/index', 1, 0, 'C', '0', '0', 'business:equipment:list', 'nested', 'admin', sysdate(), '', null, '设备菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'business:equipment:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'business:equipment:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'business:equipment:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'business:equipment:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'business:equipment:export',       '#', 'admin', sysdate(), '', null, '');