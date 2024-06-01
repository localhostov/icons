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

public val Icons.Filled.Heart: ImageVector
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
                }
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
