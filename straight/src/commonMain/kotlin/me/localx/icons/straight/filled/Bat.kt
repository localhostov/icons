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

public val Icons.Filled.Bat: ImageVector
    get() {
        if (_bat != null) {
            return _bat!!
        }
        _bat = Builder(name = "Bat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.802f, 10.232f)
                curveToRelative(0.615f, 0.76f, 1.198f, 1.959f, 1.198f, 3.768f)
                curveToRelative(0.0f, 4.188f, -2.02f, 8.275f, -2.105f, 8.447f)
                lineToRelative(-0.895f, 1.789f)
                lineToRelative(-0.895f, -1.789f)
                curveToRelative(-0.086f, -0.172f, -2.105f, -4.259f, -2.105f, -8.447f)
                curveToRelative(0.0f, -1.809f, 0.583f, -3.008f, 1.198f, -3.768f)
                curveToRelative(-0.432f, -0.449f, -0.698f, -1.059f, -0.698f, -1.732f)
                verticalLineToRelative(-3.5f)
                lineToRelative(1.304f, 1.304f)
                curveToRelative(0.355f, -0.194f, 0.763f, -0.304f, 1.196f, -0.304f)
                reflectiveCurveToRelative(0.841f, 0.11f, 1.196f, 0.304f)
                lineToRelative(1.304f, -1.304f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.672f, -0.266f, 1.283f, -0.698f, 1.732f)
                close()
                moveTo(19.581f, 1.186f)
                lineTo(18.0f, 0.057f)
                verticalLineToRelative(2.943f)
                curveToRelative(0.0f, 3.394f, 0.0f, 5.873f, -1.89f, 7.111f)
                curveToRelative(0.515f, 0.979f, 0.89f, 2.253f, 0.89f, 3.889f)
                curveToRelative(0.0f, 1.83f, -0.333f, 3.615f, -0.747f, 5.128f)
                curveToRelative(0.242f, 0.052f, 0.491f, 0.152f, 0.751f, 0.3f)
                lineToRelative(1.085f, 0.618f)
                lineToRelative(0.367f, -1.194f)
                curveToRelative(0.164f, -0.533f, 0.771f, -2.038f, 1.599f, -2.589f)
                curveToRelative(0.909f, -0.605f, 1.901f, 0.026f, 1.935f, 0.048f)
                lineToRelative(1.274f, 0.865f)
                lineToRelative(0.271f, -1.517f)
                curveToRelative(0.019f, -0.102f, 0.445f, -2.501f, 0.465f, -3.642f)
                curveToRelative(0.062f, -3.676f, -1.465f, -8.721f, -4.419f, -10.831f)
                close()
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 0.057f)
                lineToRelative(-1.581f, 1.129f)
                curveTo(1.465f, 3.296f, -0.063f, 8.341f, 0.0f, 12.017f)
                curveToRelative(0.02f, 1.141f, 0.446f, 3.541f, 0.465f, 3.642f)
                lineToRelative(0.274f, 1.478f)
                lineToRelative(1.264f, -0.82f)
                curveToRelative(0.042f, -0.027f, 1.036f, -0.657f, 1.942f, -0.053f)
                curveToRelative(0.827f, 0.552f, 1.435f, 2.056f, 1.599f, 2.589f)
                lineToRelative(0.367f, 1.195f)
                lineToRelative(1.085f, -0.62f)
                curveToRelative(0.26f, -0.148f, 0.509f, -0.248f, 0.751f, -0.3f)
                curveToRelative(-0.414f, -1.513f, -0.747f, -3.298f, -0.747f, -5.128f)
                curveToRelative(0.0f, -1.637f, 0.375f, -2.911f, 0.89f, -3.889f)
                curveToRelative(-1.89f, -1.238f, -1.89f, -3.717f, -1.89f, -7.111f)
                close()
            }
        }
        .build()
        return _bat!!
    }

private var _bat: ImageVector? = null
