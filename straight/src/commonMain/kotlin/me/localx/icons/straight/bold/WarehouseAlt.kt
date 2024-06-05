package me.localx.icons.straight.bold

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

public val Icons.Bold.WarehouseAlt: ImageVector
    get() {
        if (_warehouseAlt != null) {
            return _warehouseAlt!!
        }
        _warehouseAlt = Builder(name = "WarehouseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 10.151f)
                verticalLineToRelative(13.849f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.0f, 14.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.151f)
                curveToRelative(0.0f, -1.084f, 0.489f, -2.088f, 1.344f, -2.756f)
                lineTo(9.843f, 0.744f)
                curveToRelative(1.27f, -0.994f, 3.043f, -0.994f, 4.314f, 0.0f)
                lineToRelative(8.5f, 6.652f)
                curveToRelative(0.854f, 0.667f, 1.343f, 1.672f, 1.343f, 2.756f)
                close()
                moveTo(21.0f, 10.151f)
                curveToRelative(0.0f, -0.152f, -0.071f, -0.299f, -0.191f, -0.393f)
                lineTo(12.308f, 3.106f)
                curveToRelative(-0.182f, -0.142f, -0.434f, -0.142f, -0.615f, 0.0f)
                lineTo(3.192f, 9.758f)
                curveToRelative(-0.121f, 0.094f, -0.192f, 0.241f, -0.192f, 0.394f)
                verticalLineToRelative(10.849f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 10.151f)
                close()
            }
        }
        .build()
        return _warehouseAlt!!
    }

private var _warehouseAlt: ImageVector? = null
