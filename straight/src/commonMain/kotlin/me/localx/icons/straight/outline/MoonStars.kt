package me.localx.icons.straight.outline

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

public val Icons.Outline.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.349f, 511.15f)
                curveTo(115.434f, 511.536f, 0.886f, 397.613f, 0.501f, 256.698f)
                reflectiveCurveTo(114.037f, 1.235f, 254.953f, 0.85f)
                curveToRelative(43.566f, -0.119f, 86.436f, 10.919f, 124.528f, 32.062f)
                lineToRelative(33.021f, 18.328f)
                lineToRelative(-32.829f, 18.711f)
                curveToRelative(-96.889f, 55.013f, -130.835f, 178.154f, -75.822f, 275.043f)
                curveToRelative(21.18f, 37.301f, 53.697f, 66.881f, 92.832f, 84.444f)
                lineToRelative(34.467f, 15.543f)
                lineToRelative(-31.192f, 21.263f)
                curveTo(357.74f, 495.411f, 307.661f, 511.071f, 256.349f, 511.15f)
                close()
                moveTo(256.349f, 43.373f)
                curveToRelative(-117.43f, 0.0f, -212.626f, 95.196f, -212.626f, 212.626f)
                reflectiveCurveToRelative(95.196f, 212.626f, 212.626f, 212.626f)
                curveToRelative(30.519f, 0.005f, 60.67f, -6.657f, 88.346f, -19.519f)
                curveToRelative(-112.509f, -74.287f, -143.493f, -225.715f, -69.206f, -338.224f)
                curveToRelative(13.888f, -21.034f, 30.95f, -39.79f, 50.58f, -55.601f)
                curveTo(303.681f, 47.355f, 280.099f, 43.327f, 256.349f, 43.373f)
                close()
                moveTo(411.566f, 207.095f)
                lineToRelative(24.813f, 49.606f)
                lineToRelative(24.835f, -49.606f)
                lineToRelative(49.606f, -24.813f)
                lineToRelative(-49.606f, -24.835f)
                lineToRelative(-24.813f, -49.606f)
                lineToRelative(-24.835f, 49.606f)
                lineToRelative(-49.584f, 24.813f)
                lineTo(411.566f, 207.095f)
                close()
                moveTo(490.237f, 362.312f)
                curveToRelative(-11.743f, 0.0f, -21.263f, 9.52f, -21.263f, 21.263f)
                reflectiveCurveToRelative(9.52f, 21.263f, 21.263f, 21.263f)
                reflectiveCurveToRelative(21.263f, -9.52f, 21.263f, -21.263f)
                reflectiveCurveTo(501.98f, 362.312f, 490.237f, 362.312f)
                close()
                moveTo(362.662f, 277.262f)
                curveToRelative(-11.743f, 0.0f, -21.263f, 9.52f, -21.263f, 21.263f)
                reflectiveCurveToRelative(9.52f, 21.263f, 21.263f, 21.263f)
                curveToRelative(11.743f, 0.0f, 21.263f, -9.52f, 21.263f, -21.263f)
                reflectiveCurveTo(374.405f, 277.262f, 362.662f, 277.262f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
