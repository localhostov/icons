package me.localx.icons.straight.bold

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
                moveTo(7.658f, 7.03f)
                curveToRelative(0.111f, -0.019f, 0.226f, -0.03f, 0.342f, -0.03f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.121f, 0.0f, 0.232f, 0.004f, 0.346f, 0.025f)
                lineToRelative(-3.712f, 3.712f)
                curveToRelative(-0.341f, 0.339f, -0.93f, 0.337f, -1.269f, 0.0f)
                lineToRelative(-3.708f, -3.708f)
                close()
                moveTo(14.755f, 12.859f)
                curveToRelative(-0.735f, 0.736f, -1.714f, 1.142f, -2.755f, 1.142f)
                reflectiveCurveToRelative(-2.02f, -0.405f, -2.756f, -1.141f)
                lineToRelative(-3.244f, -3.245f)
                verticalLineToRelative(6.386f)
                lineToRelative(11.993f, -0.007f)
                verticalLineToRelative(-6.373f)
                lineToRelative(-3.238f, 3.238f)
                close()
                moveTo(24.0f, 12.001f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.001f)
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
