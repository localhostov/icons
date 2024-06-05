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

public val Icons.Bold.PlanetRinged: ImageVector
    get() {
        if (_planetRinged != null) {
            return _planetRinged!!
        }
        _planetRinged = Builder(name = "PlanetRinged", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.23f, 0.771f)
                curveToRelative(-1.44f, -1.442f, -4.131f, -0.847f, -7.999f, 1.766f)
                curveToRelative(-1.014f, -0.347f, -2.101f, -0.536f, -3.231f, -0.536f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.13f, 0.189f, 2.217f, 0.536f, 3.231f)
                curveTo(-0.076f, 19.1f, -0.671f, 21.789f, 0.771f, 23.23f)
                curveToRelative(0.518f, 0.519f, 1.183f, 0.778f, 2.003f, 0.778f)
                curveToRelative(1.204f, 0.0f, 2.742f, -0.561f, 4.642f, -1.685f)
                curveToRelative(0.439f, -0.26f, 0.891f, -0.548f, 1.353f, -0.859f)
                curveToRelative(1.014f, 0.347f, 2.101f, 0.536f, 3.232f, 0.536f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.13f, -0.189f, -2.218f, -0.536f, -3.232f)
                curveToRelative(0.311f, -0.462f, 0.598f, -0.914f, 0.858f, -1.353f)
                curveToRelative(1.891f, -3.192f, 2.188f, -5.366f, 0.908f, -6.645f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(2.555f, 0.0f, 4.795f, 1.377f, 6.017f, 3.428f)
                curveToRelative(-1.143f, 1.529f, -2.627f, 3.269f, -4.474f, 5.116f)
                curveToRelative(-1.847f, 1.847f, -3.587f, 3.331f, -5.116f, 4.474f)
                curveToRelative(-2.05f, -1.222f, -3.427f, -3.462f, -3.427f, -6.017f)
                curveToRelative(0.0f, -3.86f, 3.141f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(3.014f, 20.999f)
                curveToRelative(0.067f, -0.452f, 0.355f, -1.355f, 1.174f, -2.764f)
                curveToRelative(0.465f, 0.581f, 0.993f, 1.109f, 1.574f, 1.575f)
                curveToRelative(-1.251f, 0.736f, -2.205f, 1.124f, -2.748f, 1.189f)
                close()
                moveTo(12.024f, 19.0f)
                curveToRelative(1.208f, -1.008f, 2.436f, -2.131f, 3.64f, -3.335f)
                curveToRelative(1.204f, -1.204f, 2.328f, -2.432f, 3.336f, -3.64f)
                curveToRelative(-0.013f, 3.841f, -3.136f, 6.962f, -6.976f, 6.975f)
                close()
                moveTo(18.235f, 4.188f)
                curveToRelative(1.409f, -0.819f, 2.312f, -1.107f, 2.764f, -1.174f)
                curveToRelative(-0.065f, 0.543f, -0.454f, 1.497f, -1.189f, 2.749f)
                curveToRelative(-0.465f, -0.581f, -0.993f, -1.109f, -1.574f, -1.574f)
                close()
            }
        }
        .build()
        return _planetRinged!!
    }

private var _planetRinged: ImageVector? = null
