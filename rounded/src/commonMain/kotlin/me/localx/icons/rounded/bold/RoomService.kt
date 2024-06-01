package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0001f, 19.0926f)
                verticalLineTo(16.0006f)
                curveTo(22.9956f, 13.3456f, 22.0317f, 10.7816f, 20.2859f, 8.7813f)
                curveTo(18.5401f, 6.781f, 16.1301f, 5.4791f, 13.5001f, 5.1156f)
                verticalLineTo(4.3106f)
                curveTo(13.7529f, 4.0223f, 13.9172f, 3.6672f, 13.9735f, 3.2879f)
                curveTo(14.0297f, 2.9086f, 13.9755f, 2.5212f, 13.8172f, 2.1719f)
                curveTo(13.6589f, 1.8226f, 13.4034f, 1.5264f, 13.0811f, 1.3186f)
                curveTo(12.7588f, 1.1108f, 12.3835f, 1.0003f, 12.0001f, 1.0003f)
                curveTo(11.6166f, 1.0003f, 11.2413f, 1.1108f, 10.919f, 1.3186f)
                curveTo(10.5967f, 1.5264f, 10.3412f, 1.8226f, 10.1829f, 2.1719f)
                curveTo(10.0246f, 2.5212f, 9.9704f, 2.9086f, 10.0266f, 3.2879f)
                curveTo(10.0829f, 3.6672f, 10.2472f, 4.0223f, 10.5001f, 4.3106f)
                verticalLineTo(5.1156f)
                curveTo(7.87f, 5.4791f, 5.46f, 6.781f, 3.7142f, 8.7813f)
                curveTo(1.9684f, 10.7816f, 1.0045f, 13.3456f, 1.0f, 16.0006f)
                verticalLineTo(19.0926f)
                curveTo(0.6707f, 19.2135f, 0.3942f, 19.4461f, 0.2185f, 19.7498f)
                curveTo(0.0429f, 20.0535f, -0.0207f, 20.4091f, 0.0387f, 20.7549f)
                curveTo(0.0982f, 21.1006f, 0.2769f, 21.4146f, 0.5439f, 21.6422f)
                curveTo(0.8109f, 21.8698f, 1.1492f, 21.9966f, 1.5f, 22.0006f)
                horizontalLineTo(22.5001f)
                curveTo(22.8509f, 21.9966f, 23.1892f, 21.8698f, 23.4562f, 21.6422f)
                curveTo(23.7232f, 21.4146f, 23.9019f, 21.1006f, 23.9614f, 20.7549f)
                curveTo(24.0208f, 20.4091f, 23.9572f, 20.0535f, 23.7816f, 19.7498f)
                curveTo(23.6059f, 19.4461f, 23.3294f, 19.2135f, 23.0001f, 19.0926f)
                close()
                moveTo(12.0001f, 8.0006f)
                curveTo(14.1211f, 8.003f, 16.1545f, 8.8466f, 17.6543f, 10.3464f)
                curveTo(19.1541f, 11.8462f, 19.9977f, 13.8796f, 20.0001f, 16.0006f)
                verticalLineTo(19.0006f)
                horizontalLineTo(4.0001f)
                verticalLineTo(16.0006f)
                curveTo(4.0024f, 13.8796f, 4.8461f, 11.8462f, 6.3458f, 10.3464f)
                curveTo(7.8456f, 8.8466f, 9.8791f, 8.003f, 12.0001f, 8.0006f)
                close()
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
