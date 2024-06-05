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

public val Icons.Filled.InventoryAlt: ImageVector
    get() {
        if (_inventoryAlt != null) {
            return _inventoryAlt!!
        }
        _inventoryAlt = Builder(name = "InventoryAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.829f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-5.171f)
                close()
                moveTo(3.924f, 6.676f)
                lineToRelative(1.241f, 1.192f)
                lineToRelative(2.533f, -2.48f)
                lineToRelative(1.399f, 1.429f)
                lineToRelative(-2.759f, 2.702f)
                curveToRelative(-0.32f, 0.32f, -0.744f, 0.481f, -1.168f, 0.481f)
                curveToRelative(-0.427f, 0.0f, -0.855f, -0.162f, -1.181f, -0.488f)
                lineToRelative(-1.45f, -1.393f)
                lineToRelative(1.386f, -1.442f)
                close()
                moveTo(3.924f, 12.788f)
                lineToRelative(1.241f, 1.192f)
                lineToRelative(2.533f, -2.48f)
                lineToRelative(1.399f, 1.429f)
                lineToRelative(-2.759f, 2.702f)
                curveToRelative(-0.32f, 0.32f, -0.744f, 0.481f, -1.168f, 0.481f)
                curveToRelative(-0.427f, 0.0f, -0.855f, -0.162f, -1.181f, -0.488f)
                lineToRelative(-1.45f, -1.393f)
                lineToRelative(1.386f, -1.442f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.042f, -2.0f)
                horizontalLineToRelative(3.458f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _inventoryAlt!!
    }

private var _inventoryAlt: ImageVector? = null
