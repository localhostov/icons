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

public val Icons.Bold.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.976f, -0.005f)
                curveToRelative(-1.545f, 0.0f, -2.888f, 0.991f, -3.344f, 2.466f)
                curveToRelative(-0.03f, 0.098f, -0.061f, 0.198f, -0.092f, 0.298f)
                curveToRelative(-0.786f, -0.249f, -1.441f, -0.46f, -1.798f, -0.582f)
                lineToRelative(-0.969f, 2.84f)
                curveToRelative(0.372f, 0.127f, 1.058f, 0.347f, 1.88f, 0.607f)
                curveToRelative(-0.156f, 0.503f, -0.316f, 1.019f, -0.478f, 1.541f)
                curveToRelative(-0.834f, -0.264f, -1.534f, -0.488f, -1.909f, -0.616f)
                lineToRelative(-0.967f, 2.84f)
                curveToRelative(0.386f, 0.131f, 1.11f, 0.364f, 1.973f, 0.637f)
                curveToRelative(-0.929f, 2.646f, -2.803f, 5.969f, -4.272f, 5.969f)
                curveToRelative(-0.265f, 0.0f, -0.968f, 0.0f, -1.0f, -1.0f)
                verticalLineToRelative(-1.482f)
                curveToRelative(0.018f, -0.692f, 0.292f, -1.518f, 1.5f, -1.518f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 8.995f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.208f, 0.0f, 1.482f, 0.825f, 1.5f, 1.52f)
                lineToRelative(0.031f, 2.32f)
                curveToRelative(0.0f, 3.161f, 1.31f, 5.747f, 3.594f, 7.096f)
                curveToRelative(1.202f, 0.71f, 2.541f, 1.072f, 3.884f, 1.072f)
                curveToRelative(0.875f, 0.0f, 1.752f, -0.154f, 2.592f, -0.465f)
                curveToRelative(2.129f, -0.788f, 3.769f, -2.472f, 4.499f, -4.618f)
                curveToRelative(0.475f, -1.397f, 4.288f, -13.595f, 4.899f, -15.574f)
                curveToRelative(0.064f, -0.21f, 0.256f, -0.351f, 0.477f, -0.351f)
                horizontalLineToRelative(2.024f)
                lineTo(24.0f, -0.005f)
                horizontalLineToRelative(-2.024f)
                close()
                moveTo(11.06f, 20.724f)
                curveToRelative(-1.3f, 0.48f, -2.687f, 0.345f, -3.909f, -0.376f)
                curveToRelative(-1.913f, -1.129f, -2.119f, -3.532f, -2.119f, -4.533f)
                lineToRelative(-0.031f, -2.32f)
                curveToRelative(0.0f, -0.462f, -0.078f, -0.982f, -0.25f, -1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(-0.172f, 0.518f, -0.25f, 1.038f, -0.25f, 1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.608f, 1.065f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.492f, 0.0f, 0.96f, -0.09f, 1.403f, -0.252f)
                curveToRelative(-0.519f, 0.908f, -1.341f, 1.61f, -2.344f, 1.981f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
