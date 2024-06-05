package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.WarehouseAlt: ImageVector
    get() {
        if (_warehouseAlt != null) {
            return _warehouseAlt!!
        }
        _warehouseAlt = Builder(name = "WarehouseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.68f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.088f, -0.852f, -2.609f, -0.852f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.572f, -1.151f, 1.434f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 13.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.791f, -1.151f, -2.363f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 13.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineTo(11.384f, 2.212f)
                curveToRelative(0.363f, -0.284f, 0.869f, -0.284f, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.244f, 0.191f, 0.384f, 0.478f, 0.384f, 0.788f)
                verticalLineToRelative(11.957f)
                close()
                moveTo(8.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _warehouseAlt!!
    }

private var _warehouseAlt: ImageVector? = null
