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

public val Icons.Bold.InventoryAlt: ImageVector
    get() {
        if (_inventoryAlt != null) {
            return _inventoryAlt!!
        }
        _inventoryAlt = Builder(name = "InventoryAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.671f, 12.0f)
                curveToRelative(-0.555f, 0.0f, -1.112f, -0.211f, -1.536f, -0.635f)
                lineToRelative(-1.443f, -1.386f)
                lineToRelative(2.079f, -2.163f)
                lineToRelative(0.891f, 0.856f)
                lineToRelative(2.187f, -2.142f)
                lineToRelative(2.099f, 2.144f)
                lineToRelative(-2.759f, 2.702f)
                curveToRelative(-0.415f, 0.416f, -0.965f, 0.624f, -1.517f, 0.624f)
                close()
                moveTo(3.0f, 20.5f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(-5.338f)
                curveToRelative(-0.562f, -1.182f, -1.769f, -2.0f, -3.162f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.394f, 0.0f, -2.599f, 0.818f, -3.162f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-3.0f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(-1.527f)
                lineToRelative(-3.063f, 3.0f)
                horizontalLineToRelative(4.591f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.134f, 17.364f)
                curveToRelative(0.409f, 0.41f, 0.954f, 0.636f, 1.533f, 0.636f)
                reflectiveCurveToRelative(1.124f, -0.226f, 1.521f, -0.624f)
                lineToRelative(2.759f, -2.702f)
                lineToRelative(-2.099f, -2.143f)
                lineToRelative(-2.187f, 2.141f)
                lineToRelative(-0.891f, -0.856f)
                lineToRelative(-2.079f, 2.164f)
                lineToRelative(1.442f, 1.385f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _inventoryAlt!!
    }

private var _inventoryAlt: ImageVector? = null
