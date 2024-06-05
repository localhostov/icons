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

public val Icons.Bold.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 508.107f, viewportHeight = 508.107f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.115f, 508.106f)
                curveToRelative(-51.379f, 0.067f, -100.736f, -20.016f, -137.472f, -55.936f)
                curveToRelative(-76.869f, -79.88f, -75.368f, -206.677f, 3.371f, -284.715f)
                lineToRelative(123.52f, -123.499f)
                curveTo(266.003f, -7.965f, 347.03f, -14.72f, 405.4f, 28.128f)
                curveToRelative(62.185f, 47.742f, 73.893f, 136.855f, 26.151f, 199.04f)
                curveToRelative(-3.729f, 4.857f, -7.768f, 9.468f, -12.092f, 13.803f)
                lineTo(290.2f, 370.229f)
                curveToRelative(-14.547f, 15.21f, -33.853f, 24.994f, -54.72f, 27.733f)
                curveToRelative(-28.285f, 3.099f, -56.286f, -7.899f, -74.901f, -29.419f)
                curveToRelative(-28.539f, -36.559f, -25.488f, -88.624f, 7.125f, -121.6f)
                lineToRelative(98.539f, -98.453f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.492f, 12.496f, 12.492f, 32.752f, 0.0f, 45.248f)
                lineTo(209.923f, 295.328f)
                curveToRelative(-8.937f, 8.943f, -8.932f, 23.437f, 0.011f, 32.373f)
                reflectiveCurveToRelative(23.437f, 8.932f, 32.373f, -0.011f)
                lineTo(372.739f, 197.28f)
                curveToRelative(26.777f, -26.037f, 31.729f, -67.24f, 11.883f, -98.88f)
                curveToRelative(-23.436f, -36.1f, -71.699f, -46.367f, -107.799f, -22.931f)
                curveToRelative(-4.52f, 2.934f, -8.723f, 6.329f, -12.543f, 10.131f)
                lineTo(135.555f, 214.432f)
                curveTo(86.9f, 261.676f, 80.579f, 337.582f, 120.75f, 392.224f)
                curveToRelative(44.681f, 58.192f, 128.077f, 69.144f, 186.268f, 24.463f)
                curveToRelative(4.547f, -3.491f, 8.863f, -7.273f, 12.921f, -11.322f)
                lineToRelative(101.589f, -101.568f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.492f, 12.496f, 12.492f, 32.752f, 0.0f, 45.248f)
                lineTo(365.187f, 450.613f)
                curveTo(328.326f, 487.519f, 278.276f, 508.21f, 226.115f, 508.106f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
