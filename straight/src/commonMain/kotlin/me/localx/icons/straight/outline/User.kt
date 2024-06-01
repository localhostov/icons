package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 24.0006f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(18.9576f)
                    curveTo(18.9992f, 18.1736f, 18.6874f, 17.4219f, 18.133f, 16.8676f)
                    curveTo(17.5787f, 16.3132f, 16.827f, 16.0014f, 16.043f, 16.0006f)
                    horizontalLineTo(7.957f)
                    curveTo(7.173f, 16.0014f, 6.4213f, 16.3132f, 5.867f, 16.8676f)
                    curveTo(5.3126f, 17.4219f, 5.0008f, 18.1736f, 5.0f, 18.9576f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(18.9576f)
                    curveTo(3.0016f, 17.6434f, 3.5243f, 16.3835f, 4.4536f, 15.4542f)
                    curveTo(5.3829f, 14.525f, 6.6428f, 14.0022f, 7.957f, 14.0006f)
                    horizontalLineTo(16.043f)
                    curveTo(17.3572f, 14.0022f, 18.6171f, 14.525f, 19.5464f, 15.4542f)
                    curveTo(20.4756f, 16.3835f, 20.9984f, 17.6434f, 21.0f, 18.9576f)
                    verticalLineTo(24.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 11.9999f)
                    curveTo(10.8132f, 11.9999f, 9.6532f, 11.648f, 8.6665f, 10.9888f)
                    curveTo(7.6798f, 10.3295f, 6.9108f, 9.3924f, 6.4567f, 8.296f)
                    curveTo(6.0025f, 7.1997f, 5.8837f, 5.9933f, 6.1152f, 4.8294f)
                    curveTo(6.3467f, 3.6655f, 6.9182f, 2.5964f, 7.7573f, 1.7573f)
                    curveTo(8.5964f, 0.9182f, 9.6655f, 0.3467f, 10.8294f, 0.1152f)
                    curveTo(11.9933f, -0.1163f, 13.1997f, 0.0025f, 14.296f, 0.4567f)
                    curveTo(15.3924f, 0.9108f, 16.3295f, 1.6798f, 16.9888f, 2.6665f)
                    curveTo(17.648f, 3.6532f, 17.9999f, 4.8133f, 17.9999f, 5.9999f)
                    curveTo(17.9983f, 7.5908f, 17.3657f, 9.1159f, 16.2408f, 10.2408f)
                    curveTo(15.1159f, 11.3657f, 13.5907f, 11.9984f, 11.9999f, 11.9999f)
                    close()
                    moveTo(11.9999f, 1.9999f)
                    curveTo(11.2088f, 1.9999f, 10.4355f, 2.2345f, 9.7776f, 2.6741f)
                    curveTo(9.1199f, 3.1136f, 8.6072f, 3.7383f, 8.3044f, 4.4692f)
                    curveTo(8.0017f, 5.2001f, 7.9225f, 6.0044f, 8.0768f, 6.7803f)
                    curveTo(8.2311f, 7.5562f, 8.6121f, 8.269f, 9.1715f, 8.8284f)
                    curveTo(9.7309f, 9.3878f, 10.4436f, 9.7687f, 11.2196f, 9.9231f)
                    curveTo(11.9955f, 10.0774f, 12.7998f, 9.9982f, 13.5307f, 9.6955f)
                    curveTo(14.2616f, 9.3927f, 14.8863f, 8.88f, 15.3258f, 8.2222f)
                    curveTo(15.7653f, 7.5644f, 15.9999f, 6.7911f, 15.9999f, 5.9999f)
                    curveTo(15.9999f, 4.9391f, 15.5785f, 3.9217f, 14.8284f, 3.1715f)
                    curveTo(14.0782f, 2.4214f, 13.0608f, 1.9999f, 11.9999f, 1.9999f)
                    close()
                }
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
