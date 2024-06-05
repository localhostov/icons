package me.localx.icons.rounded.outline

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
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(14.0f, 17.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(11.5f, 13.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.079f, 18.0f)
                curveToRelative(-1.112f, 0.0f, -2.108f, -0.576f, -2.664f, -1.541f)
                curveToRelative(-0.556f, -0.966f, -0.552f, -2.116f, 0.008f, -3.079f)
                lineTo(7.301f, 1.531f)
                curveToRelative(0.558f, -0.959f, 1.552f, -1.531f, 2.661f, -1.531f)
                curveToRelative(1.107f, 0.0f, 2.101f, 0.572f, 2.656f, 1.529f)
                lineToRelative(4.034f, 6.97f)
                curveToRelative(0.277f, 0.478f, 0.113f, 1.09f, -0.364f, 1.367f)
                curveToRelative(-0.48f, 0.275f, -1.09f, 0.113f, -1.366f, -0.365f)
                lineToRelative(-4.033f, -6.968f)
                curveToRelative(-0.393f, -0.676f, -1.462f, -0.678f, -1.858f, 0.003f)
                lineTo(2.152f, 14.385f)
                curveToRelative(-0.199f, 0.342f, -0.201f, 0.735f, -0.004f, 1.077f)
                curveToRelative(0.196f, 0.341f, 0.536f, 0.538f, 0.931f, 0.538f)
                horizontalLineToRelative(5.921f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _problemSolving!!
    }

private var _problemSolving: ImageVector? = null
