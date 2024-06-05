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

public val Icons.Filled.ItAlt: ImageVector
    get() {
        if (_itAlt != null) {
            return _itAlt!!
        }
        _itAlt = Builder(name = "ItAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 9.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-7.848f)
                curveToRelative(1.434f, -1.192f, 2.348f, -2.989f, 2.348f, -5.0f)
                curveToRelative(0.0f, -2.703f, -1.651f, -5.02f, -3.999f, -6.0f)
                horizontalLineToRelative(-5.001f)
                curveToRelative(-2.348f, 0.98f, -3.999f, 3.297f, -3.999f, 6.0f)
                curveToRelative(0.0f, 2.011f, 0.914f, 3.808f, 2.348f, 5.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(14.0f, 12.988f)
                verticalLineToRelative(2.512f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-2.512f)
                curveToRelative(-1.476f, 0.738f, -2.5f, 2.249f, -2.5f, 4.012f)
                curveToRelative(0.0f, 1.956f, 1.256f, 3.605f, 3.0f, 4.224f)
                verticalLineToRelative(2.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.776f)
                curveToRelative(1.744f, -0.62f, 3.0f, -2.268f, 3.0f, -4.224f)
                curveToRelative(0.0f, -1.763f, -1.024f, -3.273f, -2.5f, -4.012f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _itAlt!!
    }

private var _itAlt: ImageVector? = null
