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

public val Icons.Bold.CompassAlt: ImageVector
    get() {
        if (_compassAlt != null) {
            return _compassAlt!!
        }
        _compassAlt = Builder(name = "CompassAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 2.115f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.115f)
                curveTo(5.143f, 2.85f, 1.0f, 7.445f, 1.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -5.555f, -4.143f, -10.15f, -9.5f, -10.885f)
                close()
                moveTo(13.5f, 20.854f)
                verticalLineToRelative(-1.854f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.854f)
                curveToRelative(-3.209f, -0.612f, -5.742f, -3.145f, -6.354f, -6.354f)
                horizontalLineToRelative(1.854f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.854f)
                curveToRelative(0.612f, -3.209f, 3.145f, -5.742f, 6.354f, -6.354f)
                verticalLineToRelative(1.854f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.854f)
                curveToRelative(3.209f, 0.612f, 5.742f, 3.145f, 6.354f, 6.354f)
                horizontalLineToRelative(-1.854f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.854f)
                curveToRelative(-0.612f, 3.209f, -3.145f, 5.742f, -6.354f, 6.354f)
                close()
                moveTo(13.81f, 11.19f)
                lineToRelative(2.714f, 6.333f)
                lineToRelative(-6.333f, -2.714f)
                lineToRelative(-2.714f, -6.333f)
                lineToRelative(6.333f, 2.714f)
                close()
            }
        }
        .build()
        return _compassAlt!!
    }

private var _compassAlt: ImageVector? = null
