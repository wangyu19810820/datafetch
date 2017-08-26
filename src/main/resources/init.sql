TRUNCATE TABLE bp_article;
TRUNCATE TABLE bp_article_read;
TRUNCATE TABLE bp_articleattribute;
TRUNCATE TABLE bp_articlecontent;
TRUNCATE TABLE bp_articleprogress;
TRUNCATE TABLE dt_drugbidsourcehc;
TRUNCATE TABLE dt_projectdataimport;
TRUNCATE TABLE mgr_proj_extras;
TRUNCATE TABLE mgr_proj_task;
TRUNCATE TABLE mgr_proj_task_attach;
TRUNCATE TABLE mgr_proj_tasklog;
TRUNCATE TABLE mgr_task_execution;
TRUNCATE TABLE task_download_fail_file;


UPDATE task_datetime set datetime = "1970-01-01 00:00:00", pageindex = 1;
UPDATE remote_token set dateTime = "1970-01-01 00:00:00";

-- TRUNCATE TABLE remote_token;

-- TRUNCATE TABLE qx_hospitalcharge;