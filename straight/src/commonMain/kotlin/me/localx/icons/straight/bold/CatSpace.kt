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

public val Icons.Bold.CatSpace: ImageVector
    get() {
        if (_catSpace != null) {
            return _catSpace!!
        }
        _catSpace = Builder(name = "CatSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.0f)
                horizontalLineToRelative(-0.107f)
                curveToRelative(1.299f, -1.272f, 2.107f, -3.043f, 2.107f, -5.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.056f, 0.236f, 2.059f, 0.657f, 2.958f)
                curveToRelative(-4.498f, 2.014f, -6.192f, 6.789f, -6.57f, 10.101f)
                curveToRelative(-0.641f, -0.532f, -1.087f, -1.247f, -1.087f, -2.035f)
                curveToRelative(0.0f, -1.848f, 0.478f, -2.817f, 0.983f, -3.845f)
                curveToRelative(0.477f, -0.969f, 1.017f, -2.065f, 1.017f, -3.679f)
                curveToRelative(0.0f, -2.649f, -2.056f, -4.5f, -5.0f, -4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.469f, 0.0f, 2.0f, 0.108f, 2.0f, 1.5f)
                curveToRelative(0.0f, 0.915f, -0.297f, 1.519f, -0.708f, 2.354f)
                curveToRelative(-0.576f, 1.169f, -1.292f, 2.624f, -1.292f, 5.17f)
                curveToRelative(0.0f, 3.522f, 3.456f, 5.977f, 6.558f, 5.977f)
                horizontalLineToRelative(17.442f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineToRelative(2.028f, 1.521f)
                curveToRelative(0.582f, -0.331f, 1.255f, -0.521f, 1.972f, -0.521f)
                reflectiveCurveToRelative(1.39f, 0.19f, 1.972f, 0.521f)
                lineToRelative(2.028f, -1.521f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.205f, -1.795f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.795f, -4.0f, -4.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-6.978f)
                curveToRelative(0.117f, -1.688f, 0.86f, -7.039f, 5.561f, -8.574f)
                curveToRelative(1.206f, 0.983f, 2.744f, 1.574f, 4.417f, 1.574f)
                curveToRelative(0.695f, 0.0f, 1.366f, -0.102f, 2.0f, -0.292f)
                verticalLineToRelative(7.292f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(4.5f, 4.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                close()
            }
        }
        .build()
        return _catSpace!!
    }

private var _catSpace: ImageVector? = null
