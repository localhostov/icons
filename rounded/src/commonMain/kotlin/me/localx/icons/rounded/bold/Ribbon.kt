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

public val Icons.Bold.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.884f, 17.006f)
                lineToRelative(-3.873f, -3.727f)
                curveToRelative(2.759f, -3.139f, 2.642f, -7.94f, -0.354f, -10.937f)
                curveToRelative(-1.512f, -1.51f, -3.521f, -2.342f, -5.657f, -2.342f)
                curveToRelative(-2.063f, 0.0f, -4.021f, 0.782f, -5.514f, 2.204f)
                curveToRelative(-1.554f, 1.479f, -2.461f, 3.589f, -2.487f, 5.788f)
                curveToRelative(-0.025f, 1.99f, 0.672f, 3.925f, 1.947f, 5.421f)
                lineToRelative(-3.845f, 3.608f)
                curveToRelative(-0.673f, 0.667f, -1.04f, 1.555f, -1.036f, 2.501f)
                curveToRelative(0.005f, 0.946f, 0.381f, 1.832f, 1.06f, 2.492f)
                lineToRelative(1.02f, 0.992f)
                curveToRelative(0.681f, 0.663f, 1.569f, 0.991f, 2.453f, 0.991f)
                curveToRelative(0.889f, 0.0f, 1.773f, -0.333f, 2.434f, -0.993f)
                lineToRelative(3.984f, -3.763f)
                lineToRelative(3.925f, 3.732f)
                curveToRelative(0.68f, 0.68f, 1.577f, 1.02f, 2.476f, 1.02f)
                curveToRelative(0.882f, 0.0f, 1.765f, -0.328f, 2.44f, -0.986f)
                lineToRelative(1.021f, -0.993f)
                curveToRelative(0.679f, -0.66f, 1.055f, -1.546f, 1.06f, -2.492f)
                curveToRelative(0.004f, -0.946f, -0.363f, -1.834f, -1.052f, -2.517f)
                close()
                moveTo(14.24f, 9.651f)
                curveToRelative(0.92f, -0.856f, 1.986f, -2.041f, 2.48f, -3.299f)
                curveToRelative(0.562f, 1.618f, 0.27f, 3.468f, -0.875f, 4.844f)
                lineToRelative(-1.606f, -1.545f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.48f, -0.888f, 1.612f, -2.0f, 2.626f)
                curveToRelative(-1.112f, -1.014f, -2.0f, -2.146f, -2.0f, -2.626f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(5.939f, 20.854f)
                curveToRelative(-0.192f, 0.192f, -0.508f, 0.194f, -0.703f, 0.004f)
                lineToRelative(-1.021f, -0.993f)
                curveToRelative(-0.131f, -0.127f, -0.15f, -0.277f, -0.151f, -0.355f)
                curveToRelative(0.0f, -0.078f, 0.019f, -0.229f, 0.118f, -0.328f)
                lineToRelative(3.91f, -3.668f)
                lineToRelative(1.744f, 1.659f)
                lineToRelative(-3.898f, 3.682f)
                close()
                moveTo(19.784f, 19.865f)
                lineToRelative(-1.021f, 0.994f)
                curveToRelative(-0.193f, 0.188f, -0.51f, 0.188f, -0.729f, -0.031f)
                lineToRelative(-9.563f, -9.095f)
                curveToRelative(-0.953f, -0.953f, -1.489f, -2.304f, -1.473f, -3.703f)
                curveToRelative(0.007f, -0.581f, 0.105f, -1.143f, 0.285f, -1.667f)
                curveToRelative(0.77f, 1.943f, 2.9f, 3.714f, 3.741f, 4.358f)
                lineToRelative(8.764f, 8.432f)
                curveToRelative(0.129f, 0.128f, 0.147f, 0.278f, 0.147f, 0.356f)
                curveToRelative(0.0f, 0.078f, -0.021f, 0.229f, -0.151f, 0.355f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
