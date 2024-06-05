package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.288f, 6.219f)
                lineToRelative(-1.371f, -0.588f)
                curveTo(21.484f, 2.463f, 18.761f, 0.014f, 15.477f, 0.014f)
                curveTo(11.893f, 0.014f, 8.977f, 2.93f, 8.977f, 6.514f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.384f, 0.0f, -3.0f, -0.655f, -3.0f, -2.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(-0.023f, 6.685f, -0.023f, 7.514f)
                verticalLineToRelative(3.5f)
                curveTo(-0.023f, 16.04f, 3.365f, 20.289f, 7.977f, 21.598f)
                verticalLineToRelative(0.916f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.683f, 0.0f, 1.351f, -0.063f, 2.0f, -0.183f)
                verticalLineToRelative(0.683f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.703f)
                curveToRelative(3.559f, -1.824f, 6.0f, -5.53f, 6.0f, -9.797f)
                verticalLineToRelative(-2.143f)
                lineToRelative(1.311f, -0.562f)
                curveToRelative(0.418f, -0.179f, 0.689f, -0.59f, 0.689f, -1.045f)
                reflectiveCurveToRelative(-0.271f, -0.866f, -0.689f, -1.045f)
                close()
                moveTo(5.977f, 13.014f)
                curveToRelative(1.092f, 0.0f, 2.117f, -0.293f, 3.0f, -0.805f)
                verticalLineToRelative(0.229f)
                curveToRelative(0.0f, 2.165f, -1.728f, 3.933f, -3.878f, 3.997f)
                curveToRelative(-1.018f, -1.103f, -1.73f, -2.491f, -2.001f, -4.029f)
                curveToRelative(0.841f, 0.392f, 1.815f, 0.608f, 2.879f, 0.608f)
                close()
                moveTo(18.977f, 11.014f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-0.921f, 0.0f, -1.805f, -0.156f, -2.629f, -0.444f)
                curveToRelative(2.161f, -1.193f, 3.629f, -3.494f, 3.629f, -6.133f)
                verticalLineToRelative(-5.923f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.477f, 6.514f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
