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

public val Icons.Filled.CircleW: ImageVector
    get() {
        if (_circleW != null) {
            return _circleW!!
        }
        _circleW = Builder(name = "CircleW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.061f, 16.099f)
                curveToRelative(-0.195f, 1.075f, -0.974f, 1.804f, -1.946f, 1.888f)
                curveToRelative(-0.062f, 0.006f, -0.125f, 0.008f, -0.187f, 0.008f)
                curveToRelative(-0.916f, 0.0f, -1.733f, -0.582f, -2.071f, -1.495f)
                lineToRelative(-0.869f, -2.494f)
                lineToRelative(-0.886f, 2.481f)
                curveToRelative(-0.364f, 0.983f, -1.251f, 1.597f, -2.237f, 1.498f)
                curveToRelative(-0.96f, -0.082f, -1.729f, -0.81f, -1.915f, -1.81f)
                lineToRelative(-0.944f, -8.818f)
                curveToRelative(-0.059f, -0.55f, 0.339f, -1.042f, 0.888f, -1.101f)
                curveToRelative(0.551f, -0.056f, 1.042f, 0.34f, 1.1f, 0.888f)
                lineToRelative(0.933f, 8.742f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.036f, 0.1f, 0.108f, 0.106f)
                curveToRelative(0.078f, 0.004f, 0.14f, -0.064f, 0.186f, -0.189f)
                lineToRelative(1.836f, -5.14f)
                curveToRelative(0.143f, -0.397f, 0.52f, -0.663f, 0.942f, -0.663f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.424f, 0.002f, 0.801f, 0.271f, 0.94f, 0.671f)
                lineToRelative(1.795f, 5.152f)
                curveToRelative(0.041f, 0.11f, 0.121f, 0.174f, 0.203f, 0.171f)
                curveToRelative(0.03f, -0.003f, 0.108f, -0.01f, 0.141f, -0.184f)
                lineToRelative(0.923f, -8.667f)
                curveToRelative(0.059f, -0.549f, 0.539f, -0.949f, 1.101f, -0.888f)
                curveToRelative(0.549f, 0.059f, 0.946f, 0.551f, 0.888f, 1.101f)
                lineToRelative(-0.934f, 8.742f)
                close()
            }
        }
        .build()
        return _circleW!!
    }

private var _circleW: ImageVector? = null
