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

public val Icons.Outline.CircleEnvelope: ImageVector
    get() {
        if (_circleEnvelope != null) {
            return _circleEnvelope!!
        }
        _circleEnvelope = Builder(name = "CircleEnvelope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.993f, 5.994f)
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
                curveToRelative(0.0f, -1.069f, -0.417f, -2.074f, -1.173f, -2.83f)
                curveToRelative(-0.756f, -0.754f, -1.76f, -1.17f, -2.827f, -1.17f)
                close()
                moveTo(8.998f, 7.999f)
                lineToRelative(5.993f, -0.005f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.181f, 0.0f, 0.359f, 0.024f, 0.529f, 0.071f)
                lineToRelative(-2.526f, 2.526f)
                curveToRelative(-0.527f, 0.527f, -1.448f, 0.527f, -1.976f, 0.0f)
                lineToRelative(-2.526f, -2.527f)
                curveToRelative(0.161f, -0.042f, 0.33f, -0.065f, 0.504f, -0.065f)
                close()
                moveTo(16.993f, 12.995f)
                curveToRelative(0.0f, 1.102f, -0.896f, 2.0f, -1.999f, 2.0f)
                lineToRelative(-5.993f, 0.003f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.208f, -1.414f, -0.585f)
                reflectiveCurveToRelative(-0.586f, -0.88f, -0.586f, -1.415f)
                verticalLineToRelative(-2.999f)
                curveToRelative(0.0f, -0.183f, 0.025f, -0.36f, 0.072f, -0.529f)
                lineToRelative(2.535f, 2.536f)
                curveToRelative(0.642f, 0.641f, 1.495f, 0.995f, 2.402f, 0.995f)
                reflectiveCurveToRelative(1.761f, -0.354f, 2.401f, -0.995f)
                lineToRelative(2.518f, -2.518f)
                curveToRelative(0.043f, 0.164f, 0.065f, 0.334f, 0.065f, 0.507f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleEnvelope!!
    }

private var _circleEnvelope: ImageVector? = null
