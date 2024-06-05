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

public val Icons.Filled.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.5f)
                lineTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(13.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 8.374f)
                curveToRelative(-0.609f, 0.425f, -1.358f, 0.663f, -2.163f, 0.626f)
                curveToRelative(-0.678f, -0.031f, -1.294f, -0.273f, -1.81f, -0.649f)
                curveToRelative(-0.572f, 0.408f, -1.273f, 0.649f, -2.028f, 0.649f)
                curveToRelative(-0.659f, 0.0f, -1.276f, -0.183f, -1.803f, -0.501f)
                curveToRelative(-0.062f, 0.154f, -0.431f, 0.883f, -0.882f, 1.333f)
                lineToRelative(-2.25f, 2.137f)
                lineToRelative(-1.357f, -1.429f)
                horizontalLineToRelative(0.001f)
                reflectiveCurveToRelative(-0.021f, -0.021f, -0.021f, -0.021f)
                lineToRelative(2.41f, -2.342f)
                curveToRelative(0.043f, -0.059f, 0.088f, -0.126f, 0.136f, -0.199f)
                curveToRelative(0.47f, -0.843f, 0.284f, -1.954f, -0.561f, -2.584f)
                curveToRelative(-0.81f, -0.604f, -1.965f, -0.437f, -2.68f, 0.276f)
                lineToRelative(-2.497f, 2.455f)
                curveToRelative(-1.325f, 1.303f, -1.33f, 3.438f, -0.01f, 4.746f)
                lineToRelative(5.013f, 4.969f)
                verticalLineToRelative(6.162f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.234f)
                lineToRelative(0.868f, -1.52f)
                curveToRelative(0.74f, -1.295f, 1.132f, -2.77f, 1.132f, -4.262f)
                verticalLineToRelative(-4.319f)
                curveToRelative(-0.455f, 0.217f, -0.964f, 0.338f, -1.5f, 0.338f)
                curveToRelative(-0.743f, 0.0f, -1.433f, -0.233f, -2.0f, -0.63f)
                close()
                moveTo(9.0f, 4.375f)
                verticalLineToRelative(-1.875f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.526f)
                curveToRelative(0.838f, -0.006f, 1.672f, 0.244f, 2.369f, 0.763f)
                curveToRelative(0.235f, 0.175f, 0.445f, 0.372f, 0.631f, 0.586f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
