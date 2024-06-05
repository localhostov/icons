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

public val Icons.Outline.InventoryAlt: ImageVector
    get() {
        if (_inventoryAlt != null) {
            return _inventoryAlt!!
        }
        _inventoryAlt = Builder(name = "InventoryAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 2.0f)
                horizontalLineToRelative(5.171f)
                curveToRelative(0.413f, -1.164f, 1.525f, -2.0f, 2.829f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, 0.836f, 2.829f, 2.0f)
                horizontalLineToRelative(5.171f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(6.165f, 8.869f)
                lineToRelative(-1.241f, -1.192f)
                lineToRelative(-1.386f, 1.442f)
                lineToRelative(1.45f, 1.393f)
                curveToRelative(0.326f, 0.326f, 0.754f, 0.488f, 1.181f, 0.488f)
                curveToRelative(0.425f, 0.0f, 0.848f, -0.161f, 1.168f, -0.481f)
                lineToRelative(2.759f, -2.702f)
                lineToRelative(-1.399f, -1.429f)
                lineToRelative(-2.533f, 2.48f)
                close()
                moveTo(6.165f, 14.869f)
                lineToRelative(-1.241f, -1.192f)
                lineToRelative(-1.386f, 1.441f)
                lineToRelative(1.449f, 1.393f)
                curveToRelative(0.315f, 0.315f, 0.734f, 0.489f, 1.179f, 0.489f)
                reflectiveCurveToRelative(0.865f, -0.174f, 1.171f, -0.48f)
                lineToRelative(2.759f, -2.702f)
                lineToRelative(-1.399f, -1.429f)
                lineToRelative(-2.533f, 2.481f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(-2.447f)
                lineToRelative(-2.042f, 2.0f)
                horizontalLineToRelative(4.489f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _inventoryAlt!!
    }

private var _inventoryAlt: ImageVector? = null
