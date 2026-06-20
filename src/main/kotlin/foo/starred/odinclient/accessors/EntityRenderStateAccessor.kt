@file:Suppress("FunctionName")

package foo.starred.odinclient.accessors

import net.minecraft.world.entity.Entity

interface EntityRenderStateAccessor {
    fun `odc$getEntity`(): Entity?
    fun `odc$setEntity`(entity: Entity?)
}