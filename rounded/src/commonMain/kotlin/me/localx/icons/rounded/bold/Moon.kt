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

public val Icons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 24.0f)
                    curveTo(13.2491f, 24.0012f, 11.5191f, 23.6193f, 9.9314f, 22.8809f)
                    curveTo(8.3437f, 22.1426f, 6.9369f, 21.0658f, 5.8096f, 19.726f)
                    curveTo(4.6823f, 18.3862f, 3.8618f, 16.816f, 3.4058f, 15.1255f)
                    curveTo(2.9497f, 13.435f, 2.8691f, 11.6651f, 3.1697f, 9.9402f)
                    curveTo(3.4702f, 8.2152f, 4.1446f, 6.5769f, 5.1455f, 5.1403f)
                    curveTo(6.1465f, 3.7036f, 7.4496f, 2.5034f, 8.9636f, 1.6239f)
                    curveTo(10.4777f, 0.7443f, 12.1658f, 0.2068f, 13.9096f, 0.0489f)
                    curveTo(15.6534f, -0.109f, 17.4107f, 0.1167f, 19.058f, 0.71f)
                    curveTo(19.5514f, 0.887f, 19.9882f, 1.1932f, 20.323f, 1.5965f)
                    curveTo(20.6578f, 1.9998f, 20.8782f, 2.4856f, 20.9614f, 3.0031f)
                    curveTo(21.0445f, 3.5206f, 20.9873f, 4.051f, 20.7957f, 4.5389f)
                    curveTo(20.6041f, 5.0268f, 20.2851f, 5.4543f, 19.872f, 5.777f)
                    curveTo(14.772f, 9.697f, 14.784f, 14.316f, 19.872f, 18.223f)
                    curveTo(20.2851f, 18.5458f, 20.604f, 18.9735f, 20.7954f, 19.4615f)
                    curveTo(20.9869f, 19.9495f, 21.0439f, 20.48f, 20.9606f, 20.9975f)
                    curveTo(20.8772f, 21.5151f, 20.6565f, 22.0008f, 20.3216f, 22.404f)
                    curveTo(19.9866f, 22.8072f, 19.5495f, 23.1132f, 19.056f, 23.29f)
                    curveTo(17.754f, 23.7548f, 16.3825f, 23.9949f, 15.0f, 24.0f)
                    close()
                    moveTo(15.0f, 3.0f)
                    curveTo(13.6918f, 2.9985f, 12.399f, 3.2823f, 11.2116f, 3.8316f)
                    curveTo(10.0243f, 4.3808f, 8.9709f, 5.1823f, 8.125f, 6.1802f)
                    curveTo(7.279f, 7.1781f, 6.6608f, 8.3484f, 6.3133f, 9.6096f)
                    curveTo(5.9658f, 10.8709f, 5.8975f, 12.1927f, 6.1131f, 13.483f)
                    curveTo(6.3287f, 14.7734f, 6.823f, 16.0012f, 7.5615f, 17.081f)
                    curveTo(8.3001f, 18.1608f, 9.2652f, 19.0666f, 10.3896f, 19.7353f)
                    curveTo(11.514f, 20.4041f, 12.7706f, 20.8196f, 14.072f, 20.9531f)
                    curveTo(15.3734f, 21.0865f, 16.6883f, 20.9346f, 17.925f, 20.508f)
                    curveTo(11.414f, 15.443f, 11.436f, 8.539f, 17.925f, 3.492f)
                    curveTo(16.9825f, 3.1729f, 15.995f, 3.0068f, 15.0f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
