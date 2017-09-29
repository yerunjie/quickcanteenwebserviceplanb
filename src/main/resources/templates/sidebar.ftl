<style type="text/css">
    .sidebar ul.nav li.parent ul li.active a {
        background-color: #30a5ff;
        color: #fff !important;
    }
</style>
<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
    <form role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
    </form>
    <ul class="nav menu">
        <li <#if module == "index">class="active"</#if>><a href="index"><span
                class="glyphicon glyphicon-dashboard"></span>主页</a></li>
        <li <#if module == "widgets">class="active"</#if>><a href="widgets"><span class="glyphicon glyphicon-th"></span>
            Widgets</a></li>
        <li <#if module == "charts">class="active"</#if>><a href="charts"><span
                class="glyphicon glyphicon-stats"></span> Charts</a></li>
        <li <#if module == "dishes">class="active"</#if>><a href="dishes"><span
                class="glyphicon glyphicon-list-alt"></span> 菜品</a></li>
        <li <#if module == "forms">class="active"</#if>><a href="forms"><span class="glyphicon glyphicon-pencil"></span>
            Forms</a></li>
        <li <#if module == "panels">class="active"</#if>><a href="panels"><span
                class="glyphicon glyphicon-info-sign"></span> Alerts &amp; Panels</a></li>
        <li class="parent">
            <a href="orders">
                <span class="glyphicon glyphicon-list"></span>订单<span data-toggle="collapse" href="#sub-item-1"
                                                                      class="icon pull-right"><em
                    class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-1">
            <#list statusList as s>
                <li <#if status?? && status.getDesc() == s.getDesc()>class="active"</#if>>
                    <a href="orders?status=${s.getValue()}">
                        <span class="glyphicon glyphicon-share-alt"></span>${s.getDesc()}(${orderCountByStatus[s.getDesc()?string]})
                    </a>
                </li>
            </#list>
            </ul>
        </li>
        <li role="presentation" class="divider"></li>
        <li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Login Page</a></li>
    </ul>
    <div class="attribution">Template by <a href="http://www.medialoot.com/item/lumino-admin-bootstrap-template/">Medialoot</a>
    </div>
</div><!--/.sidebar-->