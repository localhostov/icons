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

public val Icons.Bold.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = Builder(name = "StepForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(7.01f)
                lineTo(9.143f, 0.753f)
                curveTo(7.961f, -0.112f, 6.42f, -0.237f, 5.116f, 0.423f)
                curveToRelative(-1.305f, 0.661f, -2.116f, 1.98f, -2.116f, 3.444f)
                verticalLineToRelative(16.265f)
                curveToRelative(0.0f, 1.463f, 0.811f, 2.783f, 2.117f, 3.444f)
                curveToRelative(0.555f, 0.281f, 1.145f, 0.423f, 1.752f, 0.423f)
                curveToRelative(0.814f, 0.0f, 1.601f, -0.261f, 2.274f, -0.754f)
                lineToRelative(8.856f, -7.756f)
                verticalLineToRelative(7.01f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(20.999f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.647f, 12.695f)
                lineToRelative(-9.319f, 8.161f)
                curveToRelative(-0.268f, 0.175f, -0.569f, 0.189f, -0.856f, 0.045f)
                curveToRelative(-0.304f, -0.154f, -0.472f, -0.427f, -0.472f, -0.768f)
                lineTo(6.0f, 3.867f)
                curveToRelative(0.0f, -0.341f, 0.167f, -0.613f, 0.473f, -0.768f)
                curveToRelative(0.13f, -0.066f, 0.264f, -0.099f, 0.395f, -0.099f)
                curveToRelative(0.159f, 0.0f, 0.315f, 0.048f, 0.462f, 0.144f)
                lineToRelative(9.318f, 8.161f)
                curveToRelative(0.228f, 0.167f, 0.353f, 0.414f, 0.353f, 0.695f)
                reflectiveCurveToRelative(-0.125f, 0.528f, -0.353f, 0.695f)
                close()
            }
        }
        .build()
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
