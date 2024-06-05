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

public val Icons.Filled.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.379f, 10.124f)
                curveToRelative(2.368f, 0.558f, 4.328f, -1.342f, 4.328f, -1.342f)
                curveTo(19.416f, 2.822f, 18.082f, 0.018f, 15.571f, 0.009f)
                horizontalLineToRelative(-0.014f)
                curveTo(12.973f, 0.009f, 11.718f, 2.82f, 11.035f, 6.175f)
                curveToRelative(-0.015f, 0.072f, 1.119f, 3.188f, 4.344f, 3.948f)
                close()
                moveTo(23.888f, 14.777f)
                curveToRelative(-0.872f, -1.655f, -2.52f, -2.903f, -4.146f, -3.62f)
                curveToRelative(0.0f, 0.0f, -1.588f, 1.463f, -4.742f, 0.93f)
                curveToRelative(-3.534f, -0.597f, -4.601f, -3.794f, -4.743f, -3.83f)
                curveToRelative(-0.21f, -0.053f, -0.439f, -0.1f, -0.691f, -0.143f)
                curveToRelative(-1.893f, -0.32f, -3.805f, 0.035f, -5.445f, 1.0f)
                curveToRelative(-0.358f, 0.211f, -0.504f, 0.657f, -0.38f, 1.053f)
                lineToRelative(0.011f, 0.035f)
                curveToRelative(0.137f, 0.438f, 0.577f, 0.718f, 1.028f, 0.636f)
                curveToRelative(2.576f, -0.468f, 3.979f, 0.012f, 5.213f, 1.309f)
                curveToRelative(-0.206f, 0.594f, -0.506f, 1.265f, -0.925f, 1.954f)
                curveToRelative(-0.005f, -0.005f, -0.01f, -0.01f, -0.015f, -0.015f)
                curveToRelative(-0.774f, 1.272f, -1.951f, 2.585f, -3.781f, 3.501f)
                curveToRelative(-2.89f, 1.245f, -3.723f, 3.26f, -3.772f, 3.345f)
                lineToRelative(-0.015f, 0.026f)
                horizontalLineToRelative(-0.485f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.432f)
                lineToRelative(0.216f, 0.222f)
                curveToRelative(0.296f, 0.305f, 0.809f, 0.817f, 3.35f, 0.817f)
                curveToRelative(0.0f, 0.0f, 0.002f, 0.0f, 0.002f, 0.0f)
                curveToRelative(4.73f, 0.0f, 7.924f, -1.364f, 10.086f, -3.127f)
                curveToRelative(-0.206f, -3.022f, -1.069f, -3.983f, -1.93f, -4.392f)
                curveToRelative(-0.447f, -0.212f, -0.701f, -0.69f, -0.574f, -1.168f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.157f, -0.593f, 0.813f, -0.911f, 1.37f, -0.654f)
                curveToRelative(1.544f, 0.713f, 2.808f, 2.193f, 3.113f, 5.799f)
                curveToRelative(0.033f, 0.39f, 0.296f, 0.727f, 0.673f, 0.831f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.439f, 0.122f, 0.915f, -0.088f, 1.09f, -0.509f)
                curveToRelative(0.815f, -1.965f, 1.043f, -4.049f, 0.531f, -5.87f)
                curveToRelative(0.922f, 0.153f, 2.146f, 0.492f, 3.181f, 1.121f)
                curveToRelative(0.307f, 0.187f, 0.691f, 0.198f, 0.995f, 0.005f)
                lineToRelative(0.039f, -0.025f)
                curveToRelative(0.414f, -0.263f, 0.544f, -0.802f, 0.315f, -1.236f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
