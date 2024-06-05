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

public val Icons.Bold.CircleEnvelope: ImageVector
    get() {
        if (_circleEnvelope != null) {
            return _circleEnvelope!!
        }
        _circleEnvelope = Builder(name = "CircleEnvelope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.235f, 7.098f)
                curveToRelative(0.244f, -0.064f, 0.499f, -0.098f, 0.763f, -0.098f)
                horizontalLineToRelative(5.993f)
                curveToRelative(0.274f, 0.0f, 0.538f, 0.031f, 0.79f, 0.099f)
                lineToRelative(-3.138f, 3.138f)
                curveToRelative(-0.341f, 0.339f, -0.93f, 0.337f, -1.269f, 0.0f)
                lineToRelative(-3.139f, -3.139f)
                close()
                moveTo(14.764f, 12.358f)
                curveToRelative(-0.854f, 0.855f, -2.036f, 1.264f, -3.263f, 1.11f)
                curveToRelative(-0.899f, -0.113f, -1.718f, -0.579f, -2.358f, -1.22f)
                lineToRelative(-3.037f, -3.037f)
                curveToRelative(-0.068f, 0.251f, -0.105f, 0.515f, -0.105f, 0.788f)
                verticalLineToRelative(3.499f)
                curveToRelative(0.0f, 1.381f, 1.12f, 2.501f, 2.501f, 2.5f)
                lineToRelative(6.993f, -0.004f)
                curveToRelative(1.38f, 0.0f, 2.499f, -1.12f, 2.499f, -2.5f)
                verticalLineToRelative(-3.501f)
                curveToRelative(0.0f, -0.265f, -0.035f, -0.521f, -0.099f, -0.766f)
                lineToRelative(-3.13f, 3.13f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleEnvelope!!
    }

private var _circleEnvelope: ImageVector? = null
