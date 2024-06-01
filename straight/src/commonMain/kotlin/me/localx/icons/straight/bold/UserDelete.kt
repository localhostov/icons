package me.localx.icons.straight.bold

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

public val Icons.Bold.UserDelete: ImageVector
    get() {
        if (_userDelete != null) {
            return _userDelete!!
        }
        _userDelete = Builder(name = "UserDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(14.0f, 6.0f)
                    curveTo(14.0f, 4.8133f, 13.6481f, 3.6533f, 12.9888f, 2.6666f)
                    curveTo(12.3295f, 1.6799f, 11.3925f, 0.9109f, 10.2961f, 0.4567f)
                    curveTo(9.1997f, 0.0026f, 7.9933f, -0.1162f, 6.8295f, 0.1153f)
                    curveTo(5.6656f, 0.3468f, 4.5965f, 0.9182f, 3.7574f, 1.7574f)
                    curveTo(2.9182f, 2.5965f, 2.3468f, 3.6656f, 2.1153f, 4.8295f)
                    curveTo(1.8838f, 5.9934f, 2.0026f, 7.1997f, 2.4567f, 8.2961f)
                    curveTo(2.9109f, 9.3925f, 3.6799f, 10.3295f, 4.6666f, 10.9888f)
                    curveTo(5.6533f, 11.6481f, 6.8133f, 12.0f, 8.0f, 12.0f)
                    curveTo(9.5908f, 11.9984f, 11.116f, 11.3658f, 12.2409f, 10.2409f)
                    curveTo(13.3658f, 9.116f, 13.9984f, 7.5908f, 14.0f, 6.0f)
                    close()
                    moveTo(11.0f, 6.0f)
                    curveTo(11.0f, 6.5933f, 10.8241f, 7.1734f, 10.4944f, 7.6667f)
                    curveTo(10.1648f, 8.1601f, 9.6962f, 8.5446f, 9.1481f, 8.7716f)
                    curveTo(8.5999f, 8.9987f, 7.9967f, 9.0581f, 7.4147f, 8.9424f)
                    curveTo(6.8328f, 8.8266f, 6.2982f, 8.5409f, 5.8787f, 8.1213f)
                    curveTo(5.4591f, 7.7018f, 5.1734f, 7.1672f, 5.0576f, 6.5853f)
                    curveTo(4.9419f, 6.0033f, 5.0013f, 5.4001f, 5.2284f, 4.852f)
                    curveTo(5.4554f, 4.3038f, 5.8399f, 3.8352f, 6.3333f, 3.5056f)
                    curveTo(6.8266f, 3.176f, 7.4067f, 3.0f, 8.0f, 3.0f)
                    curveTo(8.7956f, 3.0f, 9.5587f, 3.3161f, 10.1213f, 3.8787f)
                    curveTo(10.6839f, 4.4413f, 11.0f, 5.2043f, 11.0f, 6.0f)
                    close()
                    moveTo(16.0f, 19.0f)
                    curveTo(15.9984f, 17.6744f, 15.4711f, 16.4036f, 14.5338f, 15.4662f)
                    curveTo(13.5964f, 14.5289f, 12.3256f, 14.0016f, 11.0f, 14.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 14.0016f, 2.4036f, 14.5289f, 1.4662f, 15.4662f)
                    curveTo(0.5289f, 16.4036f, 0.0016f, 17.6744f, 0.0f, 19.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.0f)
                    curveTo(3.0f, 18.4696f, 3.2107f, 17.9609f, 3.5858f, 17.5858f)
                    curveTo(3.9609f, 17.2107f, 4.4696f, 17.0f, 5.0f, 17.0f)
                    horizontalLineTo(11.0f)
                    curveTo(11.5304f, 17.0f, 12.0391f, 17.2107f, 12.4142f, 17.5858f)
                    curveTo(12.7893f, 17.9609f, 13.0f, 18.4696f, 13.0f, 19.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _userDelete!!
    }

private var _userDelete: ImageVector? = null
