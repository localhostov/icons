package me.localx.icons.straight.bold

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

public val Icons.Bold.User: ImageVector
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
                    horizontalLineTo(18.0f)
                    verticalLineTo(19.0006f)
                    curveTo(18.0f, 18.4702f, 17.7893f, 17.9615f, 17.4142f, 17.5864f)
                    curveTo(17.0391f, 17.2113f, 16.5304f, 17.0006f, 16.0f, 17.0006f)
                    horizontalLineTo(8.0f)
                    curveTo(7.4696f, 17.0006f, 6.9608f, 17.2113f, 6.5858f, 17.5864f)
                    curveTo(6.2107f, 17.9615f, 6.0f, 18.4702f, 6.0f, 19.0006f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.0006f)
                    curveTo(3.0016f, 17.675f, 3.5289f, 16.4042f, 4.4662f, 15.4668f)
                    curveTo(5.4036f, 14.5295f, 6.6744f, 14.0022f, 8.0f, 14.0006f)
                    horizontalLineTo(16.0f)
                    curveTo(17.3256f, 14.0022f, 18.5964f, 14.5295f, 19.5338f, 15.4668f)
                    curveTo(20.4711f, 16.4042f, 20.9984f, 17.675f, 21.0f, 19.0006f)
                    verticalLineTo(24.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 11.9999f)
                    curveTo(10.8134f, 11.9999f, 9.6533f, 11.648f, 8.6666f, 10.9888f)
                    curveTo(7.6799f, 10.3295f, 6.9109f, 9.3924f, 6.4568f, 8.296f)
                    curveTo(6.0026f, 7.1997f, 5.8838f, 5.9933f, 6.1153f, 4.8294f)
                    curveTo(6.3468f, 3.6655f, 6.9183f, 2.5964f, 7.7574f, 1.7573f)
                    curveTo(8.5965f, 0.9182f, 9.6656f, 0.3467f, 10.8295f, 0.1152f)
                    curveTo(11.9934f, -0.1163f, 13.1998f, 0.0025f, 14.2961f, 0.4567f)
                    curveTo(15.3925f, 0.9108f, 16.3296f, 1.6798f, 16.9889f, 2.6665f)
                    curveTo(17.6482f, 3.6532f, 18.0f, 4.8133f, 18.0f, 5.9999f)
                    curveTo(17.9985f, 7.5908f, 17.3658f, 9.1159f, 16.2409f, 10.2408f)
                    curveTo(15.1161f, 11.3657f, 13.5909f, 11.9984f, 12.0f, 11.9999f)
                    close()
                    moveTo(12.0f, 2.9999f)
                    curveTo(11.4067f, 2.9999f, 10.8267f, 3.1759f, 10.3333f, 3.5055f)
                    curveTo(9.84f, 3.8352f, 9.4555f, 4.3037f, 9.2284f, 4.8519f)
                    curveTo(9.0014f, 5.4001f, 8.9419f, 6.0033f, 9.0577f, 6.5852f)
                    curveTo(9.1735f, 7.1672f, 9.4592f, 7.7017f, 9.8787f, 8.1213f)
                    curveTo(10.2983f, 8.5408f, 10.8328f, 8.8265f, 11.4148f, 8.9423f)
                    curveTo(11.9967f, 9.0581f, 12.5999f, 8.9986f, 13.1481f, 8.7716f)
                    curveTo(13.6963f, 8.5445f, 14.1648f, 8.16f, 14.4945f, 7.6666f)
                    curveTo(14.8241f, 7.1733f, 15.0f, 6.5933f, 15.0f, 5.9999f)
                    curveTo(15.0f, 5.2043f, 14.684f, 4.4412f, 14.1214f, 3.8786f)
                    curveTo(13.5588f, 3.316f, 12.7957f, 2.9999f, 12.0f, 2.9999f)
                    close()
                }
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
