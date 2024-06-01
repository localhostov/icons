package me.localx.icons.rounded.filled

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

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 11.986f)
                    curveTo(-0.0101f, 14.5504f, 2.0605f, 16.6376f, 4.6249f, 16.6478f)
                    curveTo(5.806f, 16.6524f, 6.9444f, 16.2069f, 7.8085f, 15.4018f)
                    lineTo(14.728f, 18.526f)
                    curveTo(14.6799f, 18.7847f, 14.6536f, 19.047f, 14.6491f, 19.3101f)
                    curveTo(14.641f, 21.8922f, 16.7275f, 23.9919f, 19.3096f, 24.0001f)
                    curveTo(21.8916f, 24.0083f, 23.9914f, 21.9217f, 23.9996f, 19.3397f)
                    curveTo(24.0078f, 16.7576f, 21.9212f, 14.6578f, 19.3392f, 14.6496f)
                    curveTo(17.7965f, 14.6448f, 16.3507f, 15.4012f, 15.4751f, 16.6713f)
                    lineTo(8.9741f, 13.7359f)
                    curveTo(9.4359f, 12.6209f, 9.4376f, 11.3685f, 8.9791f, 10.2522f)
                    lineTo(15.4711f, 7.3018f)
                    curveTo(16.933f, 9.4161f, 19.8321f, 9.9449f, 21.9464f, 8.4831f)
                    curveTo(24.0607f, 7.0212f, 24.5895f, 4.1222f, 23.1277f, 2.0078f)
                    curveTo(21.6658f, -0.1065f, 18.7667f, -0.6353f, 16.6524f, 0.8265f)
                    curveTo(15.3932f, 1.6972f, 14.6427f, 3.1312f, 14.6451f, 4.6621f)
                    curveTo(14.6493f, 4.9255f, 14.676f, 5.1881f, 14.725f, 5.4471f)
                    lineTo(7.8235f, 8.5832f)
                    curveTo(5.9537f, 6.8274f, 3.0145f, 6.9199f, 1.2587f, 8.7897f)
                    curveTo(0.4461f, 9.6552f, -0.0043f, 10.7989f, 1.0E-4f, 11.986f)
                    close()
                }
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
