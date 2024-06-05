package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.981f, 24.002f)
                curveToRelative(-2.381f, 0.0f, -4.628f, -0.92f, -6.347f, -2.639f)
                curveToRelative(-2.132f, -2.133f, -3.034f, -5.08f, -2.474f, -8.085f)
                curveToRelative(0.636f, -3.413f, 3.334f, -6.237f, 6.712f, -7.028f)
                curveToRelative(2.003f, -0.471f, 4.03f, -0.272f, 5.863f, 0.569f)
                curveToRelative(0.077f, 0.036f, 0.181f, 0.014f, 0.252f, -0.057f)
                lineToRelative(0.106f, -0.106f)
                curveToRelative(0.877f, -0.877f, 2.304f, -0.876f, 3.181f, 0.0f)
                lineToRelative(1.062f, 1.062f)
                curveToRelative(0.425f, 0.425f, 0.659f, 0.99f, 0.659f, 1.591f)
                reflectiveCurveToRelative(-0.234f, 1.166f, -0.66f, 1.591f)
                lineToRelative(-0.101f, 0.102f)
                curveToRelative(-0.072f, 0.072f, -0.096f, 0.175f, -0.059f, 0.254f)
                curveToRelative(0.845f, 1.833f, 1.044f, 3.862f, 0.575f, 5.868f)
                curveToRelative(-0.79f, 3.382f, -3.616f, 6.083f, -7.032f, 6.718f)
                curveToRelative(-0.583f, 0.109f, -1.166f, 0.162f, -1.739f, 0.162f)
                close()
                moveTo(22.034f, 6.38f)
                curveToRelative(0.636f, -0.636f, 0.986f, -1.481f, 0.986f, -2.38f)
                reflectiveCurveToRelative(-0.35f, -1.744f, -0.986f, -2.38f)
                curveTo(20.976f, 0.562f, 19.527f, -0.013f, 18.037f, 0.034f)
                curveToRelative(-5.128f, 0.175f, -9.068f, 0.953f, -9.233f, 0.986f)
                curveToRelative(-0.542f, 0.108f, -0.893f, 0.635f, -0.784f, 1.176f)
                curveToRelative(0.107f, 0.542f, 0.638f, 0.894f, 1.176f, 0.785f)
                curveToRelative(0.039f, -0.008f, 3.954f, -0.779f, 8.909f, -0.948f)
                curveToRelative(0.937f, -0.033f, 1.847f, 0.334f, 2.515f, 1.001f)
                curveToRelative(0.532f, 0.533f, 0.532f, 1.399f, 0.0f, 1.932f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
                moveTo(4.451f, 6.258f)
                lineToRelative(0.354f, -1.418f)
                lineToRelative(1.418f, -0.354f)
                curveToRelative(0.445f, -0.111f, 0.757f, -0.511f, 0.757f, -0.97f)
                reflectiveCurveToRelative(-0.312f, -0.859f, -0.757f, -0.97f)
                lineToRelative(-1.418f, -0.354f)
                lineToRelative(-0.354f, -1.418f)
                curveTo(4.34f, 0.328f, 3.94f, 0.016f, 3.481f, 0.016f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.459f, 0.0f, -0.859f, 0.312f, -0.97f, 0.757f)
                lineToRelative(-0.352f, 1.406f)
                lineToRelative(-1.403f, 0.324f)
                curveTo(0.309f, 2.606f, -0.011f, 3.0f, -0.019f, 3.459f)
                reflectiveCurveToRelative(0.297f, 0.864f, 0.74f, 0.984f)
                lineToRelative(1.433f, 0.386f)
                lineToRelative(0.357f, 1.43f)
                curveToRelative(0.111f, 0.445f, 0.511f, 0.757f, 0.97f, 0.757f)
                reflectiveCurveToRelative(0.859f, -0.312f, 0.97f, -0.757f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
