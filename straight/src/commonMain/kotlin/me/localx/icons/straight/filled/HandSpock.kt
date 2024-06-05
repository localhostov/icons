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
                lineToRelative(-1.796f, 7.063f)
                curveToRelative(-0.096f, 0.376f, -0.462f, 0.618f, -0.846f, 0.557f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.437f, -0.069f, -0.72f, -0.499f, -0.611f, -0.927f)
                lineToRelative(2.09f, -8.219f)
                curveToRelative(0.195f, -0.805f, -0.299f, -1.616f, -1.104f, -1.811f)
                curveToRelative(-0.805f, -0.195f, -1.616f, 0.299f, -1.811f, 1.104f)
                lineToRelative(-2.413f, 9.493f)
                curveToRelative(-0.054f, 0.212f, -0.268f, 0.36f, -0.486f, 0.36f)
                curveToRelative(-0.216f, 0.0f, -0.452f, -0.144f, -0.509f, -0.352f)
                lineTo(10.967f, 1.146f)
                curveToRelative(-0.196f, -0.805f, -1.007f, -1.299f, -1.812f, -1.103f)
                curveToRelative(-0.805f, 0.196f, -1.299f, 1.007f, -1.103f, 1.812f)
                lineToRelative(2.23f, 8.208f)
                curveToRelative(0.121f, 0.442f, -0.184f, 0.887f, -0.64f, 0.933f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.359f, 0.036f, -0.693f, -0.192f, -0.788f, -0.541f)
                lineToRelative(-1.896f, -6.98f)
                curveToRelative(-0.196f, -0.805f, -1.007f, -1.299f, -1.812f, -1.103f)
                curveToRelative(-0.805f, 0.196f, -1.299f, 1.007f, -1.103f, 1.812f)
                lineToRelative(2.957f, 12.315f)
                lineToRelative(-3.605f, -2.996f)
                curveToRelative(-0.088f, -0.088f, -0.24f, -0.201f, -0.441f, -0.333f)
                curveToRelative(-0.843f, -0.47f, -1.954f, -0.284f, -2.584f, 0.561f)
                curveToRelative(-0.604f, 0.81f, -0.437f, 1.965f, 0.276f, 2.68f)
                lineToRelative(7.354f, 7.588f)
                horizontalLineToRelative(13.5f)
                lineToRelative(0.436f, -11.0f)
                lineToRelative(2.022f, -8.913f)
                curveToRelative(0.195f, -0.805f, -0.299f, -1.616f, -1.104f, -1.811f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
