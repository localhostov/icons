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

public val Icons.Filled.StudentAlt: ImageVector
    get() {
        if (_studentAlt != null) {
            return _studentAlt!!
        }
        _studentAlt = Builder(name = "StudentAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                verticalLineToRelative(8.469f)
                lineToRelative(-1.558f, 0.295f)
                curveToRelative(-0.01f, 0.002f, -0.176f, 0.033f, -0.442f, 0.08f)
                verticalLineToRelative(-7.884f)
                lineToRelative(-7.969f, 4.063f)
                curveToRelative(-0.627f, 0.32f, -1.345f, 0.48f, -2.064f, 0.48f)
                reflectiveCurveToRelative(-1.437f, -0.16f, -2.063f, -0.48f)
                lineTo(0.052f, 5.5f)
                lineTo(9.904f, 0.477f)
                curveToRelative(1.251f, -0.638f, 2.871f, -0.639f, 4.125f, 0.0f)
                lineToRelative(9.97f, 5.024f)
                close()
                moveTo(0.0f, 17.004f)
                verticalLineToRelative(6.991f)
                lineToRelative(1.186f, -0.225f)
                curveToRelative(0.062f, -0.012f, 5.752f, -1.079f, 9.814f, -1.247f)
                verticalLineToRelative(-4.049f)
                curveToRelative(-4.06f, -0.168f, -9.752f, -1.235f, -9.814f, -1.247f)
                lineToRelative(-1.186f, -0.225f)
                close()
                moveTo(13.0f, 18.475f)
                verticalLineToRelative(4.049f)
                curveToRelative(4.06f, 0.168f, 9.752f, 1.235f, 9.814f, 1.247f)
                lineToRelative(1.186f, 0.225f)
                verticalLineToRelative(-6.991f)
                lineToRelative(-1.186f, 0.225f)
                curveToRelative(-0.062f, 0.012f, -5.752f, 1.079f, -9.814f, 1.247f)
                close()
                moveTo(19.0f, 10.234f)
                lineToRelative(-4.061f, 2.07f)
                curveToRelative(-0.895f, 0.457f, -1.923f, 0.698f, -2.972f, 0.698f)
                reflectiveCurveToRelative(-2.077f, -0.242f, -2.972f, -0.699f)
                lineToRelative(-3.995f, -2.037f)
                verticalLineToRelative(5.566f)
                curveToRelative(2.182f, 0.324f, 4.961f, 0.667f, 7.0f, 0.667f)
                reflectiveCurveToRelative(4.819f, -0.342f, 7.0f, -0.667f)
                verticalLineToRelative(-5.599f)
                close()
            }
        }
        .build()
        return _studentAlt!!
    }

private var _studentAlt: ImageVector? = null
