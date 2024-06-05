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

public val Icons.Bold.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.006f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(4.417f, 24.0f)
                curveToRelative(-1.574f, 0.0f, -2.994f, -0.809f, -3.798f, -2.162f)
                curveToRelative(-0.804f, -1.354f, -0.834f, -2.986f, -0.081f, -4.368f)
                lineTo(9.626f, 0.782f)
                curveToRelative(0.396f, -0.727f, 1.307f, -0.996f, 2.035f, -0.6f)
                curveToRelative(0.728f, 0.396f, 0.996f, 1.308f, 0.6f, 2.035f)
                lineTo(3.173f, 18.905f)
                curveToRelative(-0.349f, 0.639f, -0.098f, 1.192f, 0.026f, 1.401f)
                curveToRelative(0.124f, 0.208f, 0.49f, 0.693f, 1.218f, 0.693f)
                horizontalLineToRelative(18.089f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.756f, 10.002f)
                curveToRelative(0.295f, 0.381f, 0.738f, 0.58f, 1.186f, 0.58f)
                curveToRelative(0.321f, 0.0f, 0.646f, -0.103f, 0.919f, -0.315f)
                curveToRelative(0.654f, -0.508f, 0.773f, -1.45f, 0.265f, -2.104f)
                curveToRelative(-0.814f, -1.05f, -1.746f, -2.015f, -2.768f, -2.868f)
                curveToRelative(-0.634f, -0.53f, -1.581f, -0.444f, -2.113f, 0.189f)
                curveToRelative(-0.531f, 0.636f, -0.446f, 1.582f, 0.19f, 2.113f)
                curveToRelative(0.857f, 0.716f, 1.638f, 1.525f, 2.322f, 2.405f)
                close()
                moveTo(18.151f, 14.408f)
                curveToRelative(0.367f, 1.055f, 0.619f, 2.153f, 0.75f, 3.267f)
                curveToRelative(0.089f, 0.764f, 0.738f, 1.325f, 1.488f, 1.325f)
                curveToRelative(0.059f, 0.0f, 0.117f, -0.003f, 0.177f, -0.01f)
                curveToRelative(0.823f, -0.097f, 1.412f, -0.842f, 1.315f, -1.665f)
                curveToRelative(-0.156f, -1.329f, -0.457f, -2.642f, -0.895f, -3.901f)
                curveToRelative(-0.272f, -0.784f, -1.127f, -1.196f, -1.91f, -0.925f)
                curveToRelative(-0.782f, 0.272f, -1.196f, 1.127f, -0.924f, 1.909f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null
