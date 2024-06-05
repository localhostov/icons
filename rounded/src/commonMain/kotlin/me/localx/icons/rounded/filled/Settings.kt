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

public val Icons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.283f, 384.0f)
                curveToRelative(17.646f, 30.626f, 56.779f, 41.148f, 87.405f, 23.502f)
                curveToRelative(0.021f, -0.012f, 0.041f, -0.024f, 0.062f, -0.036f)
                lineToRelative(9.493f, -5.483f)
                curveToRelative(17.92f, 15.332f, 38.518f, 27.222f, 60.757f, 35.072f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.654f, 64.0f, -64.0f)
                verticalLineToRelative(-10.944f)
                curveToRelative(22.242f, -7.863f, 42.841f, -19.767f, 60.757f, -35.115f)
                lineToRelative(9.536f, 5.504f)
                curveToRelative(30.633f, 17.673f, 69.794f, 7.167f, 87.467f, -23.467f)
                curveToRelative(17.673f, -30.633f, 7.167f, -69.794f, -23.467f, -87.467f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-9.472f, -5.461f)
                curveToRelative(4.264f, -23.201f, 4.264f, -46.985f, 0.0f, -70.187f)
                lineToRelative(9.472f, -5.461f)
                curveToRelative(30.633f, -17.673f, 41.14f, -56.833f, 23.467f, -87.467f)
                curveToRelative(-17.673f, -30.633f, -56.833f, -41.14f, -87.467f, -23.467f)
                lineToRelative(-9.493f, 5.483f)
                curveTo(362.862f, 94.638f, 342.25f, 82.77f, 320.0f, 74.944f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -35.346f, -28.654f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(10.944f)
                curveToRelative(-22.242f, 7.863f, -42.841f, 19.767f, -60.757f, 35.115f)
                lineToRelative(-9.536f, -5.525f)
                curveTo(91.073f, 86.86f, 51.913f, 97.367f, 34.24f, 128.0f)
                reflectiveCurveToRelative(-7.167f, 69.794f, 23.467f, 87.467f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(9.472f, 5.461f)
                curveToRelative(-4.264f, 23.201f, -4.264f, 46.985f, 0.0f, 70.187f)
                lineToRelative(-9.472f, 5.461f)
                curveTo(27.158f, 314.296f, 16.686f, 353.38f, 34.283f, 384.0f)
                close()
                moveTo(256.0f, 170.667f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                reflectiveCurveTo(303.128f, 341.333f, 256.0f, 341.333f)
                reflectiveCurveTo(170.667f, 303.128f, 170.667f, 256.0f)
                reflectiveCurveTo(208.872f, 170.667f, 256.0f, 170.667f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
