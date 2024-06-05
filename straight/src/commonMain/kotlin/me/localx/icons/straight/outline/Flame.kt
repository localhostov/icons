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

public val Icons.Outline.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.485f, 86.766f)
                curveToRelative(-25.569f, -21.67f, -51.906f, -44.15f, -78.561f, -70.72f)
                lineTo(255.731f, 0.96f)
                lineToRelative(-14.915f, 15.107f)
                curveToRelative(-47.985f, 48.113f, -70.656f, 121.987f, -80.5f, 166.307f)
                curveToRelative(-7.535f, -11.679f, -13.126f, -24.502f, -16.556f, -37.97f)
                lineToRelative(-9.013f, -34.795f)
                lineToRelative(-26.208f, 24.632f)
                curveTo(62.619f, 177.345f, 32.0f, 220.11f, 32.0f, 288.592f)
                curveToRelative(-0.882f, 101.634f, 67.488f, 190.839f, 165.859f, 216.401f)
                curveToRelative(14.405f, 3.504f, 29.109f, 5.644f, 43.915f, 6.392f)
                curveToRelative(4.864f, 0.352f, 18.793f, 0.703f, 21.18f, 0.554f)
                curveToRelative(120.685f, -3.63f, 216.608f, -102.565f, 216.507f, -223.305f)
                curveTo(479.461f, 197.14f, 419.225f, 146.001f, 349.485f, 86.766f)
                close()
                moveTo(259.858f, 469.048f)
                curveToRelative(-2.231f, 0.193f, -4.259f, 0.213f, -6.516f, 0.192f)
                curveToRelative(-39.844f, -1.218f, -71.54f, -33.819f, -71.637f, -73.681f)
                curveToRelative(0.0f, -27.002f, 14.481f, -40.461f, 47.254f, -68.357f)
                curveToRelative(8.262f, -7.027f, 17.249f, -14.672f, 26.704f, -23.425f)
                curveToRelative(8.284f, 7.517f, 16.333f, 14.332f, 23.765f, 20.656f)
                curveToRelative(32.922f, 27.939f, 50.107f, 43.804f, 50.107f, 71.062f)
                curveTo(329.461f, 434.599f, 298.901f, 466.859f, 259.858f, 469.048f)
                close()
                moveTo(366.759f, 431.334f)
                lineToRelative(-0.426f, 0.298f)
                curveToRelative(3.822f, -11.644f, 5.777f, -23.819f, 5.792f, -36.074f)
                curveToRelative(0.0f, -48.233f, -31.645f, -75.108f, -65.12f, -103.537f)
                curveToRelative(-11.861f, -10.051f, -24.106f, -20.443f, -36.329f, -32.667f)
                lineToRelative(-15.077f, -15.056f)
                lineToRelative(-15.056f, 15.056f)
                curveToRelative(-13.799f, 13.778f, -27.3f, 25.277f, -39.204f, 35.414f)
                curveToRelative(-33.391f, 28.408f, -62.246f, 52.961f, -62.246f, 100.79f)
                curveToRelative(0.045f, 12.781f, 2.204f, 25.467f, 6.389f, 37.543f)
                curveToRelative(-44.934f, -34.504f, -71.16f, -88.026f, -70.891f, -144.679f)
                curveToRelative(-0.35f, -37.368f, 14.113f, -73.355f, 40.226f, -100.087f)
                curveToRelative(4.498f, 9.125f, 9.83f, 17.815f, 15.929f, 25.959f)
                curveToRelative(9.103f, 12.284f, 24.636f, 17.983f, 39.524f, 14.502f)
                curveToRelative(15.135f, -3.37f, 26.902f, -15.278f, 30.09f, -30.452f)
                curveToRelative(8.917f, -48.944f, 28.202f, -95.413f, 56.56f, -136.289f)
                curveToRelative(22.466f, 21.295f, 44.72f, 40.141f, 64.801f, 57.199f)
                curveToRelative(66.696f, 56.645f, 114.994f, 97.574f, 114.994f, 169.296f)
                curveToRelative(0.106f, 55.877f, -25.749f, 108.633f, -69.976f, 142.784f)
                horizontalLineTo(366.759f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
