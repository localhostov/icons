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

public val Icons.Bold.StepBackward: ImageVector
    get() {
        if (_stepBackward != null) {
            return _stepBackward!!
        }
        _stepBackward = Builder(name = "StepBackward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.885f, 0.424f)
                curveToRelative(-1.305f, -0.661f, -2.849f, -0.534f, -4.027f, 0.329f)
                lineToRelative(-8.857f, 7.757f)
                lineTo(6.001f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-7.01f)
                lineToRelative(8.856f, 7.756f)
                curveToRelative(0.674f, 0.493f, 1.46f, 0.754f, 2.274f, 0.754f)
                curveToRelative(0.607f, 0.0f, 1.197f, -0.143f, 1.753f, -0.424f)
                curveToRelative(1.306f, -0.661f, 2.116f, -1.981f, 2.116f, -3.444f)
                lineTo(21.0f, 3.867f)
                curveToRelative(0.0f, -1.463f, -0.812f, -2.783f, -2.115f, -3.443f)
                close()
                moveTo(18.0f, 20.132f)
                curveToRelative(0.0f, 0.341f, -0.168f, 0.614f, -0.471f, 0.768f)
                curveToRelative(-0.291f, 0.146f, -0.591f, 0.13f, -0.857f, -0.044f)
                lineTo(7.353f, 12.695f)
                curveToRelative(-0.228f, -0.167f, -0.353f, -0.414f, -0.353f, -0.695f)
                reflectiveCurveToRelative(0.125f, -0.528f, 0.353f, -0.695f)
                lineTo(16.671f, 3.145f)
                curveToRelative(0.267f, -0.174f, 0.569f, -0.19f, 0.857f, -0.044f)
                curveToRelative(0.305f, 0.154f, 0.472f, 0.426f, 0.472f, 0.767f)
                verticalLineToRelative(16.265f)
                close()
            }
        }
        .build()
        return _stepBackward!!
    }

private var _stepBackward: ImageVector? = null
