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

public val Icons.Outline.HeartHealthMuscle: ImageVector
    get() {
        if (_heartHealthMuscle != null) {
            return _heartHealthMuscle!!
        }
        _heartHealthMuscle = Builder(name = "HeartHealthMuscle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 2.333f, -4.0f, 5.0f, -4.0f, 5.0f)
                curveToRelative(0.0f, 0.0f, -4.0f, -2.667f, -4.0f, -5.0f)
                close()
                moveTo(23.316f, 9.551f)
                lineToRelative(0.684f, 0.228f)
                verticalLineToRelative(10.538f)
                lineToRelative(-0.35f, 0.299f)
                curveToRelative(-0.161f, 0.138f, -4.035f, 3.384f, -11.65f, 3.384f)
                curveTo(4.235f, 24.0f, 0.162f, 18.309f, 0.0f, 18.077f)
                curveTo(-0.033f, 14.615f, -0.105f, 6.472f, 6.677f, 1.255f)
                curveToRelative(0.101f, -0.092f, 1.498f, -1.279f, 3.323f, -1.279f)
                curveTo(12.504f, -0.024f, 14.0f, 1.756f, 14.0f, 3.476f)
                verticalLineToRelative(0.678f)
                lineToRelative(-1.981f, 0.789f)
                verticalLineToRelative(1.034f)
                lineToRelative(-2.987f, 0.951f)
                curveToRelative(-0.048f, 0.442f, -0.029f, 1.029f, -0.01f, 1.64f)
                curveToRelative(0.037f, 1.184f, 0.074f, 2.664f, -0.287f, 4.256f)
                curveToRelative(1.057f, -0.449f, 2.355f, -0.823f, 3.765f, -0.823f)
                curveToRelative(0.695f, 0.0f, 1.317f, 0.132f, 1.879f, 0.322f)
                curveToRelative(0.4f, -0.506f, 2.754f, -3.322f, 5.621f, -3.322f)
                curveToRelative(1.644f, 0.0f, 3.249f, 0.529f, 3.316f, 0.551f)
                close()
                moveTo(22.0f, 11.262f)
                curveToRelative(-0.52f, -0.124f, -1.268f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-1.502f, 0.0f, -3.062f, 1.42f, -3.805f, 2.267f)
                curveToRelative(0.802f, 0.592f, 1.258f, 1.179f, 1.295f, 1.228f)
                lineToRelative(-1.597f, 1.204f)
                curveToRelative(-0.013f, -0.017f, -1.328f, -1.699f, -3.394f, -1.699f)
                curveToRelative(-2.736f, 0.0f, -5.11f, 1.879f, -5.134f, 1.898f)
                lineToRelative(-1.257f, -1.556f)
                curveToRelative(1.03f, -2.002f, 0.964f, -4.087f, 0.913f, -5.711f)
                curveToRelative(-0.034f, -1.087f, -0.064f, -2.027f, 0.215f, -2.814f)
                lineToRelative(0.165f, -0.469f)
                lineToRelative(2.616f, -0.833f)
                verticalLineToRelative(-0.928f)
                lineToRelative(1.809f, -0.72f)
                curveToRelative(-0.26f, -0.458f, -0.829f, -0.891f, -1.827f, -0.891f)
                curveToRelative(-1.089f, 0.0f, -2.046f, 0.816f, -2.056f, 0.825f)
                curveTo(1.903f, 7.45f, 1.966f, 14.042f, 1.998f, 17.421f)
                curveToRelative(0.783f, 0.972f, 4.088f, 4.579f, 10.002f, 4.579f)
                curveToRelative(5.644f, 0.0f, 8.967f, -1.932f, 10.0f, -2.643f)
                verticalLineToRelative(-8.095f)
                close()
            }
        }
        .build()
        return _heartHealthMuscle!!
    }

private var _heartHealthMuscle: ImageVector? = null
