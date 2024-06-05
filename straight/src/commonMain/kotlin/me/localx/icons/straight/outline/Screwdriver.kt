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

public val Icons.Outline.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.578f, 9.0f)
                lineToRelative(3.396f, -5.891f)
                lineTo(20.891f, 0.025f)
                lineToRelative(-5.891f, 3.396f)
                verticalLineToRelative(4.164f)
                lineToRelative(-5.01f, 5.01f)
                lineToRelative(-1.411f, -1.398f)
                lineTo(0.898f, 18.879f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(7.701f, -7.701f)
                lineToRelative(-1.431f, -1.417f)
                lineToRelative(5.003f, -5.003f)
                horizontalLineToRelative(4.164f)
                close()
                moveTo(3.727f, 21.707f)
                curveToRelative(-0.377f, 0.379f, -1.037f, 0.377f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(6.273f, -6.272f)
                lineToRelative(1.421f, 1.407f)
                lineToRelative(-6.28f, 6.279f)
                close()
                moveTo(17.0f, 4.577f)
                lineToRelative(3.561f, -2.054f)
                lineToRelative(0.916f, 0.916f)
                lineToRelative(-2.054f, 3.561f)
                horizontalLineToRelative(-2.423f)
                verticalLineToRelative(-2.423f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
