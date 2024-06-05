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

public val Icons.Bold.ProblemSolving: ImageVector
    get() {
        if (_problemSolving != null) {
            return _problemSolving!!
        }
        _problemSolving = Builder(name = "ProblemSolving", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.948f, 21.786f)
                lineToRelative(-2.49f, -2.491f)
                curveToRelative(0.361f, -0.691f, 0.584f, -1.463f, 0.584f, -2.295f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.831f, 0.0f, 1.604f, -0.223f, 2.295f, -0.584f)
                lineToRelative(2.49f, 2.491f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(17.042f, 19.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.042f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.336f, 15.0f)
                curveToRelative(-0.189f, 0.634f, -0.294f, 1.305f, -0.294f, 2.0f)
                curveToRelative(0.0f, 0.34f, 0.033f, 0.673f, 0.08f, 1.0f)
                lineTo(3.118f, 18.0f)
                curveToRelative(-1.113f, 0.0f, -2.108f, -0.576f, -2.664f, -1.541f)
                reflectiveCurveToRelative(-0.553f, -2.115f, 0.006f, -3.077f)
                lineTo(7.342f, 1.53f)
                curveTo(7.898f, 0.572f, 8.892f, 0.0f, 10.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.108f, 0.0f, 2.102f, 0.573f, 2.657f, 1.531f)
                lineToRelative(4.934f, 8.497f)
                curveToRelative(-0.182f, -0.014f, -0.364f, -0.028f, -0.55f, -0.028f)
                curveToRelative(-0.933f, 0.0f, -1.821f, 0.186f, -2.634f, 0.517f)
                lineToRelative(-4.343f, -7.48f)
                horizontalLineToRelative(-0.129f)
                lineTo(3.054f, 14.889f)
                lineToRelative(0.064f, 0.111f)
                horizontalLineToRelative(7.218f)
                close()
            }
        }
        .build()
        return _problemSolving!!
    }

private var _problemSolving: ImageVector? = null
