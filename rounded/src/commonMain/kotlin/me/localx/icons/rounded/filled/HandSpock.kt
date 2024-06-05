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

public val Icons.Filled.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.853f, 2.275f)
                curveToRelative(-0.805f, -0.195f, -1.616f, 0.299f, -1.811f, 1.104f)
                lineToRelative(-1.8f, 6.952f)
                curveToRelative(-0.117f, 0.458f, -0.575f, 0.742f, -1.037f, 0.643f)
                curveToRelative(-0.487f, -0.105f, -0.79f, -0.593f, -0.667f, -1.076f)
                lineToRelative(2.077f, -8.044f)
                curveToRelative(0.195f, -0.805f, -0.299f, -1.616f, -1.104f, -1.811f)
                curveToRelative(-0.805f, -0.195f, -1.616f, 0.299f, -1.811f, 1.104f)
                lineToRelative(-2.34f, 9.206f)
                curveToRelative(-0.071f, 0.28f, -0.467f, 0.283f, -0.543f, 0.005f)
                lineTo(11.308f, 1.146f)
                curveToRelative(-0.196f, -0.805f, -1.007f, -1.299f, -1.812f, -1.103f)
                curveToRelative(-0.805f, 0.196f, -1.299f, 1.007f, -1.103f, 1.812f)
                lineToRelative(2.167f, 7.977f)
                curveToRelative(0.118f, 0.433f, -0.124f, 0.882f, -0.55f, 1.023f)
                curveToRelative(-0.454f, 0.15f, -0.941f, -0.107f, -1.075f, -0.566f)
                lineToRelative(-1.978f, -6.813f)
                curveToRelative(-0.196f, -0.805f, -1.007f, -1.299f, -1.812f, -1.103f)
                curveToRelative(-0.805f, 0.196f, -1.299f, 1.007f, -1.103f, 1.812f)
                lineToRelative(2.78f, 10.919f)
                curveToRelative(0.139f, 0.58f, -0.541f, 1.003f, -0.999f, 0.622f)
                lineToRelative(-2.429f, -2.222f)
                curveToRelative(-0.088f, -0.088f, -0.24f, -0.201f, -0.441f, -0.333f)
                curveToRelative(-0.843f, -0.47f, -1.954f, -0.284f, -2.584f, 0.561f)
                curveToRelative(-0.604f, 0.81f, -0.437f, 1.965f, 0.276f, 2.68f)
                lineToRelative(5.494f, 5.669f)
                curveToRelative(1.189f, 1.227f, 2.825f, 1.92f, 4.533f, 1.92f)
                horizontalLineToRelative(4.537f)
                curveToRelative(3.023f, 0.0f, 5.574f, -2.249f, 5.953f, -5.248f)
                lineToRelative(0.631f, -4.998f)
                lineToRelative(2.164f, -9.667f)
                curveToRelative(0.195f, -0.805f, -0.299f, -1.616f, -1.104f, -1.811f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
