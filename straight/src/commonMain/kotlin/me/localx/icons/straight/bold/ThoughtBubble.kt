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

public val Icons.Bold.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(5.0f, 17.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 10.5f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-0.7f, 0.0f, -1.391f, -0.118f, -2.062f, -0.351f)
                curveToRelative(-1.126f, 0.877f, -2.491f, 1.351f, -3.938f, 1.351f)
                curveToRelative(-2.253f, 0.0f, -4.311f, -1.156f, -5.489f, -3.019f)
                curveToRelative(-3.356f, -0.251f, -6.011f, -3.062f, -6.011f, -6.481f)
                curveTo(0.0f, 4.916f, 2.916f, 2.0f, 6.5f, 2.0f)
                curveToRelative(0.493f, 0.0f, 0.979f, 0.055f, 1.454f, 0.164f)
                curveToRelative(1.31f, -1.371f, 3.127f, -2.164f, 5.046f, -2.164f)
                curveToRelative(2.852f, 0.0f, 5.39f, 1.734f, 6.46f, 4.316f)
                curveToRelative(2.679f, 0.838f, 4.54f, 3.308f, 4.54f, 6.184f)
                close()
                moveTo(21.0f, 10.5f)
                curveToRelative(0.0f, -1.714f, -1.234f, -3.16f, -2.935f, -3.438f)
                lineToRelative(-0.958f, -0.157f)
                lineToRelative(-0.249f, -0.938f)
                curveToRelative(-0.465f, -1.747f, -2.052f, -2.967f, -3.858f, -2.967f)
                curveToRelative(-1.313f, 0.0f, -2.544f, 0.654f, -3.294f, 1.752f)
                lineToRelative(-0.696f, 1.02f)
                lineToRelative(-1.135f, -0.488f)
                curveToRelative(-0.437f, -0.188f, -0.899f, -0.283f, -1.375f, -0.283f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.122f, -0.019f, 1.357f, -0.121f, 1.357f, -0.121f)
                lineToRelative(0.423f, 0.993f)
                curveToRelative(0.551f, 1.293f, 1.814f, 2.128f, 3.22f, 2.128f)
                curveToRelative(0.968f, 0.0f, 1.87f, -0.401f, 2.543f, -1.131f)
                lineToRelative(0.788f, -0.855f)
                lineToRelative(1.024f, 0.551f)
                curveToRelative(0.538f, 0.289f, 1.091f, 0.436f, 1.645f, 0.436f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
