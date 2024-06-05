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

public val Icons.Bold.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.463f)
                curveTo(22.0f, 4.261f, 17.514f, 0.029f, 12.0f, 0.029f)
                reflectiveCurveTo(2.0f, 4.261f, 2.0f, 9.463f)
                curveToRelative(0.0f, 4.994f, 3.045f, 10.486f, 7.434f, 12.08f)
                curveToRelative(-0.132f, 0.235f, -0.249f, 0.48f, -0.347f, 0.73f)
                curveToRelative(-0.325f, 0.829f, 0.298f, 1.727f, 1.189f, 1.727f)
                horizontalLineToRelative(3.447f)
                curveToRelative(0.891f, 0.0f, 1.514f, -0.897f, 1.189f, -1.727f)
                curveToRelative(-0.098f, -0.25f, -0.215f, -0.495f, -0.347f, -0.73f)
                curveToRelative(4.39f, -1.594f, 7.434f, -7.087f, 7.434f, -12.08f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.878f, 0.0f, -7.0f, -5.218f, -7.0f, -9.537f)
                curveToRelative(0.0f, -3.548f, 3.141f, -6.434f, 7.0f, -6.434f)
                reflectiveCurveToRelative(7.0f, 2.886f, 7.0f, 6.434f)
                curveToRelative(0.0f, 4.319f, -3.122f, 9.537f, -7.0f, 9.537f)
                close()
                moveTo(16.678f, 11.709f)
                curveToRelative(-0.246f, 0.913f, -0.616f, 1.745f, -1.034f, 2.45f)
                curveToRelative(-0.442f, 0.746f, -1.443f, 0.919f, -2.089f, 0.341f)
                lineToRelative(-0.216f, -0.194f)
                curveToRelative(-0.483f, -0.432f, -0.588f, -1.14f, -0.26f, -1.699f)
                curveToRelative(0.271f, -0.462f, 0.512f, -1.0f, 0.678f, -1.575f)
                curveToRelative(0.174f, -0.6f, 0.694f, -1.033f, 1.318f, -1.033f)
                horizontalLineToRelative(0.285f)
                curveToRelative(0.891f, 0.0f, 1.549f, 0.848f, 1.318f, 1.709f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
