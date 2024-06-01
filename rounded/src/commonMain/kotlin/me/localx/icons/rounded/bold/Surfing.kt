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

public val Icons.Bold.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.6398f, 0.0044f)
                    curveTo(15.8568f, 0.0044f, 11.5938f, 2.0104f, 8.2398f, 5.3694f)
                    curveTo(4.9108f, 8.6686f, 2.2334f, 12.5656f, 0.3478f, 16.8564f)
                    curveTo(0.001f, 17.6586f, -0.096f, 18.5467f, 0.0693f, 19.4049f)
                    curveTo(0.2347f, 20.2631f, 0.6548f, 21.0515f, 1.2748f, 21.6674f)
                    lineTo(2.3318f, 22.7244f)
                    curveTo(2.9469f, 23.3441f, 3.7344f, 23.764f, 4.5917f, 23.9296f)
                    curveTo(5.4489f, 24.0951f, 6.3362f, 23.9985f, 7.1378f, 23.6524f)
                    curveTo(11.4315f, 21.7716f, 15.3307f, 19.0955f, 18.6298f, 15.7654f)
                    curveTo(21.9888f, 12.4054f, 23.9998f, 8.1424f, 23.9998f, 4.3594f)
                    curveTo(24.0547f, 3.7734f, 23.9795f, 3.1825f, 23.7797f, 2.6288f)
                    curveTo(23.5799f, 2.0752f, 23.2604f, 1.5725f, 22.844f, 1.1565f)
                    curveTo(22.4276f, 0.7406f, 21.9245f, 0.4216f, 21.3706f, 0.2225f)
                    curveTo(20.8167f, 0.0233f, 20.2257f, -0.0511f, 19.6398f, 0.0044f)
                    close()
                    moveTo(16.5088f, 13.6444f)
                    curveTo(13.4797f, 16.7057f, 9.8996f, 19.1672f, 5.9568f, 20.8994f)
                    curveTo(5.7013f, 21.0084f, 5.4184f, 21.0357f, 5.1468f, 20.9774f)
                    lineTo(16.5608f, 9.5604f)
                    curveTo(16.8422f, 9.279f, 17.0003f, 8.8974f, 17.0003f, 8.4994f)
                    curveTo(17.0003f, 8.1015f, 16.8422f, 7.7198f, 16.5608f, 7.4384f)
                    curveTo(16.2794f, 7.157f, 15.8977f, 6.9989f, 15.4998f, 6.9989f)
                    curveTo(15.1018f, 6.9989f, 14.7202f, 7.157f, 14.4388f, 7.4384f)
                    lineTo(3.0268f, 18.8514f)
                    curveTo(2.9695f, 18.5795f, 2.9967f, 18.2965f, 3.1048f, 18.0404f)
                    curveTo(4.8372f, 14.0993f, 7.2972f, 10.5201f, 10.3558f, 7.4904f)
                    curveTo(13.6638f, 4.1834f, 17.3198f, 3.0044f, 19.6398f, 3.0044f)
                    curveTo(20.7168f, 3.0044f, 20.9998f, 3.2824f, 20.9998f, 4.3594f)
                    curveTo(20.9998f, 6.6794f, 19.8158f, 10.3364f, 16.5088f, 13.6444f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
