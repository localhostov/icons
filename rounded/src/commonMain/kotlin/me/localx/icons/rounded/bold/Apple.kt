package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.341f, 6.0f)
                    horizontalLineTo(14.992f)
                    curveTo(15.9405f, 5.6845f, 16.8094f, 5.1674f, 17.539f, 4.484f)
                    curveTo(18.3744f, 3.5525f, 18.8844f, 2.3746f, 18.992f, 1.128f)
                    curveTo(19.0116f, 0.9763f, 18.9961f, 0.822f, 18.9468f, 0.6772f)
                    curveTo(18.8974f, 0.5324f, 18.8155f, 0.4008f, 18.7073f, 0.2926f)
                    curveTo(18.5992f, 0.1844f, 18.4676f, 0.1025f, 18.3228f, 0.0532f)
                    curveTo(18.1779f, 0.0038f, 18.0237f, -0.0116f, 17.872f, 0.008f)
                    curveTo(16.6253f, 0.1156f, 15.4475f, 0.6255f, 14.516f, 1.461f)
                    curveTo(13.8192f, 2.2446f, 13.3624f, 3.2121f, 13.2f, 4.248f)
                    curveTo(12.9352f, 2.9772f, 12.4437f, 1.7645f, 11.749f, 0.668f)
                    curveTo(11.5283f, 0.3365f, 11.185f, 0.1062f, 10.7945f, 0.0278f)
                    curveTo(10.4041f, -0.0506f, 9.9985f, 0.0293f, 9.667f, 0.25f)
                    curveTo(9.3355f, 0.4707f, 9.1052f, 0.814f, 9.0268f, 1.2044f)
                    curveTo(8.9484f, 1.5949f, 9.0283f, 2.0005f, 9.249f, 2.332f)
                    curveTo(9.9348f, 3.4419f, 10.3462f, 4.6993f, 10.449f, 6.0f)
                    horizontalLineTo(8.659f)
                    curveTo(6.3184f, 6.0489f, 4.0927f, 7.0236f, 2.4696f, 8.7106f)
                    curveTo(0.8465f, 10.3976f, -0.0416f, 12.6593f, -0.0f, 15.0f)
                    curveTo(-0.194f, 20.655f, 5.933f, 25.877f, 11.074f, 23.32f)
                    curveTo(11.3553f, 23.108f, 11.6987f, 22.9948f, 12.0509f, 22.9979f)
                    curveTo(12.4031f, 23.0009f, 12.7444f, 23.1201f, 13.022f, 23.337f)
                    curveTo(18.138f, 25.882f, 24.181f, 20.578f, 24.0f, 15.0f)
                    curveTo(24.0415f, 12.6593f, 23.1534f, 10.3976f, 21.5303f, 8.7106f)
                    curveTo(19.9072f, 7.0236f, 17.6815f, 6.0489f, 15.341f, 6.0f)
                    close()
                    moveTo(15.341f, 21.0f)
                    curveTo(15.0128f, 20.9798f, 14.6962f, 20.8709f, 14.425f, 20.685f)
                    curveTo(13.6914f, 20.2462f, 12.8547f, 20.0099f, 12.0f, 20.0f)
                    curveTo(11.187f, 20.0174f, 10.3922f, 20.2437f, 9.692f, 20.657f)
                    curveTo(9.3845f, 20.8617f, 9.0278f, 20.9801f, 8.659f, 21.0f)
                    curveTo(1.182f, 20.754f, 1.185f, 9.244f, 8.659f, 9.0f)
                    horizontalLineTo(15.341f)
                    curveTo(22.82f, 9.247f, 22.814f, 20.756f, 15.341f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
