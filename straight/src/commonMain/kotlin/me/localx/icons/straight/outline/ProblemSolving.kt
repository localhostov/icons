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

public val Icons.Outline.ProblemSolving: ImageVector
    get() {
        if (_problemSolving != null) {
            return _problemSolving!!
        }
        _problemSolving = Builder(name = "ProblemSolving", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.959f, 22.545f)
                lineToRelative(-2.792f, -2.792f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                lineToRelative(2.792f, 2.792f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.08f, 16.0f)
                curveToRelative(-0.047f, 0.327f, -0.08f, 0.66f, -0.08f, 1.0f)
                reflectiveCurveToRelative(0.033f, 0.673f, 0.08f, 1.0f)
                lineTo(3.079f, 18.0f)
                curveToRelative(-1.112f, 0.0f, -2.108f, -0.576f, -2.664f, -1.541f)
                curveToRelative(-0.556f, -0.965f, -0.553f, -2.116f, 0.007f, -3.078f)
                lineTo(7.302f, 1.53f)
                curveToRelative(0.558f, -0.958f, 1.552f, -1.53f, 2.66f, -1.53f)
                curveToRelative(1.108f, 0.0f, 2.102f, 0.573f, 2.657f, 1.531f)
                lineToRelative(4.917f, 8.496f)
                curveToRelative(-0.178f, -0.013f, -0.355f, -0.027f, -0.536f, -0.027f)
                curveToRelative(-0.577f, 0.0f, -1.135f, 0.078f, -1.672f, 0.209f)
                lineToRelative(-4.44f, -7.675f)
                curveToRelative(-0.393f, -0.68f, -1.461f, -0.68f, -1.857f, 0.0f)
                lineTo(2.151f, 14.386f)
                curveToRelative(-0.199f, 0.342f, -0.2f, 0.733f, -0.003f, 1.076f)
                curveToRelative(0.196f, 0.342f, 0.536f, 0.538f, 0.931f, 0.538f)
                horizontalLineToRelative(7.001f)
                close()
            }
        }
        .build()
        return _problemSolving!!
    }

private var _problemSolving: ImageVector? = null
