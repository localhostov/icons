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

public val Icons.Outline.CircleW: ImageVector
    get() {
        if (_circleW != null) {
            return _circleW!!
        }
        _circleW = Builder(name = "CircleW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.039f, 0.02f)
                curveTo(5.422f, 0.02f, 0.039f, 5.402f, 0.039f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.039f, 0.02f)
                close()
                moveTo(12.039f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.039f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.485f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(18.033f, 7.376f)
                lineToRelative(-0.933f, 8.742f)
                curveToRelative(-0.196f, 1.076f, -0.946f, 1.896f, -2.134f, 1.896f)
                curveToRelative(-0.916f, 0.0f, -1.733f, -0.582f, -2.071f, -1.495f)
                lineToRelative(-0.869f, -2.494f)
                lineToRelative(-0.887f, 2.481f)
                curveToRelative(-0.364f, 0.984f, -1.254f, 1.595f, -2.237f, 1.498f)
                curveToRelative(-0.96f, -0.082f, -1.729f, -0.81f, -1.914f, -1.811f)
                lineToRelative(-0.944f, -8.817f)
                curveToRelative(-0.059f, -0.55f, 0.339f, -1.042f, 0.888f, -1.101f)
                curveToRelative(0.549f, -0.058f, 1.042f, 0.339f, 1.1f, 0.888f)
                lineToRelative(0.933f, 8.742f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.036f, 0.1f, 0.107f, 0.106f)
                curveToRelative(0.075f, 0.008f, 0.14f, -0.064f, 0.186f, -0.189f)
                lineToRelative(1.837f, -5.14f)
                curveToRelative(0.142f, -0.397f, 0.519f, -0.663f, 0.941f, -0.663f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.424f, 0.002f, 0.801f, 0.271f, 0.94f, 0.671f)
                lineToRelative(1.794f, 5.152f)
                curveToRelative(0.043f, 0.113f, 0.114f, 0.192f, 0.204f, 0.17f)
                curveToRelative(0.029f, -0.002f, 0.108f, -0.009f, 0.141f, -0.184f)
                lineToRelative(0.922f, -8.666f)
                curveToRelative(0.059f, -0.549f, 0.546f, -0.954f, 1.101f, -0.888f)
                curveToRelative(0.549f, 0.059f, 0.946f, 0.551f, 0.888f, 1.101f)
                close()
            }
        }
        .build()
        return _circleW!!
    }

private var _circleW: ImageVector? = null
