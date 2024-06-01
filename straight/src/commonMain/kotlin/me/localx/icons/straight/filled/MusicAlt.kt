package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.MusicAlt: ImageVector
    get() {
        if (_musicAlt != null) {
            return _musicAlt!!
        }
        _musicAlt = Builder(name = "MusicAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9159f, 0.6909f)
                    curveTo(22.5768f, 0.4092f, 22.1796f, 0.206f, 21.7528f, 0.0957f)
                    curveTo(21.326f, -0.0146f, 20.8801f, -0.0292f, 20.4469f, 0.0529f)
                    lineTo(8.4479f, 2.2999f)
                    curveTo(7.7596f, 2.4288f, 7.1381f, 2.7943f, 6.691f, 3.3333f)
                    curveTo(6.2439f, 3.8723f, 5.9994f, 4.5507f, 5.9999f, 5.2509f)
                    verticalLineTo(16.5559f)
                    curveTo(5.3946f, 16.196f, 4.7042f, 16.0041f, 3.9999f, 15.9999f)
                    curveTo(3.2088f, 15.9999f, 2.4355f, 16.2345f, 1.7777f, 16.674f)
                    curveTo(1.1199f, 17.1136f, 0.6072f, 17.7383f, 0.3044f, 18.4692f)
                    curveTo(0.0017f, 19.2001f, -0.0775f, 20.0043f, 0.0768f, 20.7803f)
                    curveTo(0.2311f, 21.5562f, 0.6121f, 22.2689f, 1.1715f, 22.8283f)
                    curveTo(1.7309f, 23.3877f, 2.4437f, 23.7687f, 3.2196f, 23.9231f)
                    curveTo(3.9955f, 24.0774f, 4.7998f, 23.9982f, 5.5307f, 23.6954f)
                    curveTo(6.2616f, 23.3927f, 6.8863f, 22.88f, 7.3258f, 22.2222f)
                    curveTo(7.7653f, 21.5644f, 7.9999f, 20.791f, 7.9999f, 19.9999f)
                    verticalLineTo(9.4199f)
                    lineTo(21.9999f, 6.7999f)
                    verticalLineTo(13.5609f)
                    curveTo(21.3951f, 13.1992f, 20.7047f, 13.0056f, 19.9999f, 12.9999f)
                    curveTo(19.2088f, 12.9999f, 18.4355f, 13.2345f, 17.7777f, 13.674f)
                    curveTo(17.1199f, 14.1136f, 16.6072f, 14.7383f, 16.3044f, 15.4692f)
                    curveTo(16.0017f, 16.2001f, 15.9225f, 17.0043f, 16.0768f, 17.7803f)
                    curveTo(16.2311f, 18.5562f, 16.6121f, 19.2689f, 17.1715f, 19.8283f)
                    curveTo(17.7309f, 20.3877f, 18.4437f, 20.7687f, 19.2196f, 20.9231f)
                    curveTo(19.9955f, 21.0774f, 20.7998f, 20.9982f, 21.5307f, 20.6954f)
                    curveTo(22.2616f, 20.3927f, 22.8863f, 19.88f, 23.3258f, 19.2222f)
                    curveTo(23.7653f, 18.5644f, 23.9999f, 17.791f, 23.9999f, 16.9999f)
                    verticalLineTo(2.9999f)
                    curveTo(24.0f, 2.559f, 23.9029f, 2.1235f, 23.7156f, 1.7245f)
                    curveTo(23.5282f, 1.3254f, 23.2552f, 0.9725f, 22.9159f, 0.6909f)
                    close()
                }
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
