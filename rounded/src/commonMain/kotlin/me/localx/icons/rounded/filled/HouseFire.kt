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

public val Icons.Filled.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.51f, 8.2f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-0.385f, -0.345f, -0.995f, -0.257f, -1.258f, 0.187f)
                curveToRelative(-1.481f, 2.505f, -1.141f, 5.879f, -2.468f, 5.879f)
                curveToRelative(-0.628f, 0.0f, -0.53f, -1.086f, -0.826f, -1.756f)
                curveToRelative(-0.21f, -0.475f, -0.848f, -0.548f, -1.175f, -0.144f)
                curveToRelative(-1.251f, 1.549f, -2.456f, 4.276f, -1.348f, 6.939f)
                curveToRelative(1.187f, 2.851f, 3.867f, 4.864f, 6.949f, 4.683f)
                curveToRelative(3.688f, -0.215f, 6.614f, -3.275f, 6.614f, -7.018f)
                curveToRelative(0.0f, -3.696f, -4.098f, -6.637f, -6.49f, -8.77f)
                close()
                moveTo(18.897f, 20.948f)
                curveToRelative(-1.016f, 1.185f, -2.839f, 1.185f, -3.855f, 0.0f)
                curveToRelative(-0.878f, -1.024f, -0.708f, -2.591f, 0.246f, -3.545f)
                lineToRelative(1.117f, -1.117f)
                curveToRelative(0.311f, -0.311f, 0.816f, -0.311f, 1.127f, 0.0f)
                lineToRelative(1.117f, 1.117f)
                curveToRelative(0.954f, 0.954f, 1.125f, 2.52f, 0.246f, 3.545f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(11.551f, 24.004f)
                horizontalLineToRelative(-6.552f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.203f, -4.145f)
                lineTo(9.203f, 0.859f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.88f)
                curveToRelative(1.252f, 0.942f, 2.0f, 2.41f, 2.0f, 3.989f)
                verticalLineToRelative(1.973f)
                curveToRelative(-1.231f, -1.617f, -2.822f, -2.984f, -4.161f, -4.13f)
                curveToRelative(-0.352f, -0.301f, -0.688f, -0.588f, -0.994f, -0.862f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.634f, -0.568f, -1.48f, -0.818f, -2.32f, -0.688f)
                curveToRelative(-0.837f, 0.129f, -1.563f, 0.621f, -1.993f, 1.348f)
                curveToRelative(-0.576f, 0.975f, -0.917f, 2.0f, -1.163f, 2.939f)
                curveToRelative(-0.215f, -0.089f, -0.444f, -0.151f, -0.683f, -0.183f)
                curveToRelative(-0.947f, -0.128f, -1.86f, 0.243f, -2.458f, 0.983f)
                curveToRelative(-1.713f, 2.121f, -3.043f, 5.589f, -1.639f, 8.965f)
                curveToRelative(0.665f, 1.598f, 1.708f, 2.925f, 2.962f, 3.93f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
