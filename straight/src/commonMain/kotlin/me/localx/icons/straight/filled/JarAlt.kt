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

public val Icons.Filled.JarAlt: ImageVector
    get() {
        if (_jarAlt != null) {
            return _jarAlt!!
        }
        _jarAlt = Builder(name = "JarAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.695f, 0.0f, 1.366f, 0.102f, 2.0f, 0.292f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(3.292f)
                curveToRelative(0.634f, -0.189f, 1.305f, -0.292f, 2.0f, -0.292f)
                close()
            }
        }
        .build()
        return _jarAlt!!
    }

private var _jarAlt: ImageVector? = null
