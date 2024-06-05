package me.localx.icons.rounded.filled

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

public val Icons.Filled.CircleEnvelope: ImageVector
    get() {
        if (_circleEnvelope != null) {
            return _circleEnvelope!!
        }
        _circleEnvelope = Builder(name = "CircleEnvelope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 8.07f)
                curveToRelative(0.16f, -0.042f, 0.325f, -0.071f, 0.498f, -0.071f)
                lineToRelative(5.993f, -0.005f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.18f, 0.0f, 0.353f, 0.032f, 0.522f, 0.077f)
                lineToRelative(-2.519f, 2.519f)
                curveToRelative(-0.527f, 0.527f, -1.448f, 0.527f, -1.976f, 0.0f)
                lineToRelative(-2.521f, -2.521f)
                close()
                moveTo(14.41f, 12.005f)
                curveToRelative(-0.641f, 0.642f, -1.494f, 0.995f, -2.401f, 0.995f)
                reflectiveCurveToRelative(-1.761f, -0.354f, -2.402f, -0.995f)
                lineToRelative(-2.528f, -2.529f)
                curveToRelative(-0.046f, 0.168f, -0.078f, 0.341f, -0.078f, 0.523f)
                verticalLineToRelative(2.999f)
                curveToRelative(0.0f, 0.535f, 0.208f, 1.037f, 0.586f, 1.415f)
                reflectiveCurveToRelative(0.88f, 0.585f, 1.414f, 0.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(5.993f, -0.003f)
                curveToRelative(1.103f, 0.0f, 1.999f, -0.898f, 1.999f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.172f, -0.029f, -0.339f, -0.071f, -0.501f)
                lineToRelative(-2.512f, 2.512f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.993f, 9.994f)
                curveToRelative(0.0f, -1.069f, -0.417f, -2.074f, -1.173f, -2.83f)
                curveToRelative(-0.756f, -0.754f, -1.76f, -1.17f, -2.827f, -1.17f)
                horizontalLineToRelative(-0.004f)
                lineToRelative(-5.993f, 0.005f)
                curveToRelative(-2.203f, 0.002f, -3.996f, 1.796f, -3.996f, 4.0f)
                verticalLineToRelative(2.999f)
                curveToRelative(0.0f, 1.069f, 0.416f, 2.074f, 1.172f, 2.829f)
                reflectiveCurveToRelative(1.76f, 1.171f, 2.828f, 1.171f)
                horizontalLineToRelative(0.003f)
                lineToRelative(5.993f, -0.003f)
                curveToRelative(2.204f, -0.001f, 3.997f, -1.796f, 3.997f, -4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _circleEnvelope!!
    }

private var _circleEnvelope: ImageVector? = null
