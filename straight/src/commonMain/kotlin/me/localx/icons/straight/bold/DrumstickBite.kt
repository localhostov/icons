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

public val Icons.Bold.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.501f, 2.499f)
                curveToRelative(-3.326f, -3.327f, -8.738f, -3.326f, -12.064f, 0.0f)
                curveToRelative(-3.076f, 3.075f, -3.408f, 10.321f, -3.436f, 11.138f)
                lineToRelative(-0.022f, 0.651f)
                lineToRelative(0.806f, 0.806f)
                lineToRelative(-3.433f, 3.433f)
                curveToRelative(-0.356f, -0.327f, -0.831f, -0.527f, -1.352f, -0.527f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.521f, -0.2f, -0.996f, -0.527f, -1.352f)
                lineToRelative(3.433f, -3.433f)
                lineToRelative(0.808f, 0.808f)
                lineToRelative(0.652f, -0.023f)
                curveToRelative(0.093f, -0.003f, 2.305f, -0.087f, 4.809f, -0.604f)
                lineToRelative(1.609f, -0.333f)
                lineToRelative(-0.478f, -1.573f)
                curveToRelative(-0.123f, -0.404f, -0.186f, -0.821f, -0.186f, -1.239f)
                curveToRelative(0.0f, -2.343f, 1.906f, -4.25f, 4.25f, -4.25f)
                curveToRelative(0.531f, 0.0f, 1.056f, 0.101f, 1.56f, 0.3f)
                lineToRelative(1.939f, 0.767f)
                lineToRelative(0.11f, -2.083f)
                curveToRelative(0.128f, -2.419f, -0.776f, -4.783f, -2.479f, -6.485f)
                close()
                moveTo(13.121f, 14.25f)
                curveToRelative(0.0f, 0.153f, 0.005f, 0.307f, 0.015f, 0.46f)
                curveToRelative(-0.919f, 0.137f, -1.719f, 0.212f, -2.24f, 0.252f)
                lineToRelative(-1.861f, -1.861f)
                curveToRelative(0.159f, -2.188f, 0.814f, -6.772f, 2.523f, -8.48f)
                curveToRelative(2.155f, -2.156f, 5.665f, -2.158f, 7.822f, 0.0f)
                curveToRelative(0.669f, 0.668f, 1.146f, 1.494f, 1.401f, 2.391f)
                curveToRelative(-4.131f, -0.23f, -7.66f, 3.104f, -7.66f, 7.238f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null
