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
                moveTo(11.021f, 10.591f)
                lineToRelative(-2.591f, -2.591f)
                lineToRelative(7.164f, -0.006f)
                lineToRelative(-2.597f, 2.597f)
                curveToRelative(-0.527f, 0.527f, -1.448f, 0.527f, -1.976f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.993f, 8.993f)
                curveToRelative(0.0f, -0.458f, -0.111f, -0.887f, -0.295f, -1.276f)
                lineToRelative(0.009f, -0.009f)
                lineToRelative(-0.032f, -0.032f)
                curveToRelative(-0.293f, -0.593f, -0.772f, -1.073f, -1.365f, -1.365f)
                lineToRelative(-0.017f, -0.017f)
                lineToRelative(-0.005f, 0.005f)
                curveToRelative(-0.394f, -0.19f, -0.83f, -0.306f, -1.296f, -0.306f)
                lineToRelative(-7.992f, 0.007f)
                curveToRelative(-0.458f, 0.0f, -0.887f, 0.111f, -1.275f, 0.295f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.004f, 0.003f)
                curveToRelative(-1.013f, 0.482f, -1.72f, 1.508f, -1.72f, 2.702f)
                verticalLineToRelative(8.0f)
                lineToRelative(13.993f, -0.008f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(12.009f, 13.0f)
                curveToRelative(-0.907f, 0.0f, -1.761f, -0.354f, -2.402f, -0.995f)
                lineToRelative(-2.606f, -2.607f)
                verticalLineToRelative(5.601f)
                lineToRelative(9.993f, -0.006f)
                verticalLineToRelative(-5.572f)
                lineToRelative(-2.583f, 2.583f)
                curveToRelative(-0.641f, 0.642f, -1.494f, 0.995f, -2.401f, 0.995f)
                close()
            }
        }
        .build()
        return _circleEnvelope!!
    }

private var _circleEnvelope: ImageVector? = null
