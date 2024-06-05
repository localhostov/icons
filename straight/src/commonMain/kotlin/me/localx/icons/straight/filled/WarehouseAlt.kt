package me.localx.icons.straight.filled

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

public val Icons.Filled.WarehouseAlt: ImageVector
    get() {
        if (_warehouseAlt != null) {
            return _warehouseAlt!!
        }
        _warehouseAlt = Builder(name = "WarehouseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(19.0f, 13.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                lineTo(7.0f, 11.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.043f)
                curveToRelative(0.0f, -0.923f, 0.425f, -1.794f, 1.151f, -2.363f)
                lineTo(10.151f, 0.637f)
                curveToRelative(1.086f, -0.85f, 2.611f, -0.85f, 3.697f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.727f, 0.569f, 1.151f, 1.44f, 1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _warehouseAlt!!
    }

private var _warehouseAlt: ImageVector? = null
