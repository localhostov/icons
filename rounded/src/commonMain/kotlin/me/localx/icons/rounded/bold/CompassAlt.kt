package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                verticalLineToRelative(-0.615f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.615f)
                curveTo(5.143f, 2.85f, 1.0f, 7.445f, 1.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -5.555f, -4.143f, -10.15f, -9.5f, -10.885f)
                close()
                moveTo(13.5f, 20.854f)
                verticalLineToRelative(-0.354f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.354f)
                curveToRelative(-3.209f, -0.612f, -5.742f, -3.145f, -6.354f, -6.354f)
                horizontalLineToRelative(0.354f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.354f)
                curveToRelative(0.612f, -3.209f, 3.145f, -5.742f, 6.354f, -6.354f)
                verticalLineToRelative(0.354f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.354f)
                curveToRelative(3.209f, 0.612f, 5.742f, 3.145f, 6.354f, 6.354f)
                horizontalLineToRelative(-0.354f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.354f)
                curveToRelative(-0.612f, 3.209f, -3.145f, 5.742f, -6.354f, 6.354f)
                close()
                moveTo(16.48f, 16.5f)
                curveToRelative(0.265f, 0.619f, -0.361f, 1.246f, -0.98f, 0.98f)
                lineToRelative(-4.838f, -2.469f)
                curveToRelative(-0.302f, -0.13f, -0.544f, -0.371f, -0.673f, -0.673f)
                lineToRelative(-2.426f, -4.838f)
                curveToRelative(-0.265f, -0.619f, 0.361f, -1.246f, 0.98f, -0.98f)
                lineToRelative(4.795f, 2.469f)
                curveToRelative(0.302f, 0.13f, 0.544f, 0.371f, 0.673f, 0.673f)
                lineToRelative(2.469f, 4.838f)
                close()
            }
        }
        .build()
        return _compassAlt!!
    }

private var _compassAlt: ImageVector? = null
