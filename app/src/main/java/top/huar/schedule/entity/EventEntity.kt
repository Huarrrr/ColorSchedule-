package top.huar.schedule.entity

import top.huar.schedule.common.ConstantPool

/**
 * 事件实体
 *
 */
class EventEntity {
    var id: ConstantPool.Int? = null
    var msg: String? = null
    var data: Any? = null

    constructor(id: ConstantPool.Int) {
        this.id = id
    }

    constructor(id: ConstantPool.Int, msg: String) {
        this.id = id
        this.msg = msg
    }

    constructor(id: ConstantPool.Int, msg: String, data: Any) {
        this.id = id
        this.msg = msg
        this.data = data
    }
}
