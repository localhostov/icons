package me.localx.icons.rounded.outline

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

public val Icons.Outline.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5f, 1.9165f)
                    curveTo(16.3739f, 1.934f, 15.2724f, 2.2484f, 14.3067f, 2.8278f)
                    curveTo(13.341f, 3.4072f, 12.5453f, 4.2312f, 12.0f, 5.2165f)
                    curveTo(11.4546f, 4.2312f, 10.6589f, 3.4072f, 9.6932f, 2.8278f)
                    curveTo(8.7275f, 2.2484f, 7.626f, 1.934f, 6.5f, 1.9165f)
                    curveTo(4.7049f, 1.9945f, 3.0137f, 2.7798f, 1.7957f, 4.1007f)
                    curveTo(0.5778f, 5.4217f, -0.0678f, 7.171f, -0.0f, 8.9665f)
                    curveTo(-0.0f, 13.5135f, 4.786f, 18.4795f, 8.8f, 21.8465f)
                    curveTo(9.6962f, 22.5996f, 10.8293f, 23.0125f, 12.0f, 23.0125f)
                    curveTo(13.1706f, 23.0125f, 14.3037f, 22.5996f, 15.2f, 21.8465f)
                    curveTo(19.214f, 18.4795f, 24.0f, 13.5135f, 24.0f, 8.9665f)
                    curveTo(24.0677f, 7.171f, 23.4221f, 5.4217f, 22.2042f, 4.1007f)
                    curveTo(20.9863f, 2.7798f, 19.295f, 1.9945f, 17.5f, 1.9165f)
                    close()
                    moveTo(13.915f, 20.3165f)
                    curveTo(13.3789f, 20.7679f, 12.7007f, 21.0154f, 12.0f, 21.0154f)
                    curveTo(11.2992f, 21.0154f, 10.621f, 20.7679f, 10.085f, 20.3165f)
                    curveTo(4.947f, 16.0055f, 2.0f, 11.8695f, 2.0f, 8.9665f)
                    curveTo(1.9316f, 7.7012f, 2.3663f, 6.4602f, 3.2093f, 5.5142f)
                    curveTo(4.0523f, 4.5682f, 5.2352f, 3.9938f, 6.5f, 3.9165f)
                    curveTo(7.7647f, 3.9938f, 8.9476f, 4.5682f, 9.7906f, 5.5142f)
                    curveTo(10.6336f, 6.4602f, 11.0683f, 7.7012f, 11.0f, 8.9665f)
                    curveTo(11.0f, 9.2317f, 11.1053f, 9.4861f, 11.2929f, 9.6736f)
                    curveTo(11.4804f, 9.8611f, 11.7347f, 9.9665f, 12.0f, 9.9665f)
                    curveTo(12.2652f, 9.9665f, 12.5195f, 9.8611f, 12.7071f, 9.6736f)
                    curveTo(12.8946f, 9.4861f, 13.0f, 9.2317f, 13.0f, 8.9665f)
                    curveTo(12.9316f, 7.7012f, 13.3663f, 6.4602f, 14.2093f, 5.5142f)
                    curveTo(15.0523f, 4.5682f, 16.2352f, 3.9938f, 17.5f, 3.9165f)
                    curveTo(18.7647f, 3.9938f, 19.9476f, 4.5682f, 20.7906f, 5.5142f)
                    curveTo(21.6336f, 6.4602f, 22.0683f, 7.7012f, 22.0f, 8.9665f)
                    curveTo(22.0f, 11.8695f, 19.053f, 16.0055f, 13.915f, 20.3125f)
                    verticalLineTo(20.3165f)
                    close()
                }
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
