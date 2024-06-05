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

public val Icons.Bold.CircleNodes: ImageVector
    get() {
        if (_circleNodes != null) {
            return _circleNodes!!
        }
        _circleNodes = Builder(name = "CircleNodes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveToRelative(0.016f, 0.0f, 0.031f, -0.002f, 0.047f, -0.002f)
                lineToRelative(-1.183f, 4.731f)
                curveToRelative(-0.852f, -0.464f, -1.827f, -0.729f, -2.864f, -0.729f)
                curveToRelative(-0.016f, 0.0f, -0.031f, 0.002f, -0.047f, 0.002f)
                lineToRelative(1.183f, -4.731f)
                curveToRelative(0.852f, 0.465f, 1.827f, 0.729f, 2.864f, 0.729f)
                close()
                moveTo(9.294f, 11.818f)
                curveToRelative(-0.479f, 0.897f, -1.181f, 1.656f, -2.029f, 2.209f)
                lineToRelative(3.441f, 3.155f)
                curveToRelative(0.479f, -0.897f, 1.181f, -1.657f, 2.029f, -2.209f)
                lineToRelative(-3.442f, -3.154f)
                close()
                moveTo(14.91f, 7.162f)
                curveToRelative(-0.524f, -0.84f, -0.843f, -1.816f, -0.895f, -2.863f)
                lineToRelative(-4.925f, 1.539f)
                curveToRelative(0.524f, 0.84f, 0.843f, 1.816f, 0.895f, 2.863f)
                lineToRelative(4.925f, -1.539f)
                close()
                moveTo(20.0f, 0.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveTo(22.209f, 0.0f, 20.0f, 0.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(4.0f, 5.0f)
                curveTo(1.791f, 5.0f, 0.0f, 6.791f, 0.0f, 9.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _circleNodes!!
    }

private var _circleNodes: ImageVector? = null
