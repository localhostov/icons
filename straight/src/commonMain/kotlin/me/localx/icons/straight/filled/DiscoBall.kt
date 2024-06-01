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

public val Icons.Filled.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) {
            return _discoBall!!
        }
        _discoBall = Builder(name = "DiscoBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0001f, 0.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(4.056f)
                    curveTo(13.6789f, 4.1221f, 14.3491f, 4.2578f, 15.0001f, 4.461f)
                    verticalLineTo(9.151f)
                    curveTo(14.0171f, 9.053f, 13.0081f, 9.0f, 12.0001f, 9.0f)
                    curveTo(10.9921f, 9.0f, 9.9831f, 9.053f, 9.0001f, 9.151f)
                    verticalLineTo(4.461f)
                    curveTo(9.6511f, 4.2578f, 10.3213f, 4.1221f, 11.0001f, 4.056f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(2.0001f, 14.0f)
                    curveTo(2.0001f, 14.82f, 3.8791f, 15.927f, 7.0001f, 16.541f)
                    verticalLineTo(11.459f)
                    curveTo(3.8791f, 12.073f, 2.0001f, 13.18f, 2.0001f, 14.0f)
                    close()
                    moveTo(17.0001f, 5.353f)
                    verticalLineTo(9.425f)
                    curveTo(18.5519f, 9.6688f, 20.0592f, 10.1406f, 21.4731f, 10.825f)
                    curveTo(20.6952f, 8.5188f, 19.1055f, 6.5741f, 17.0001f, 5.353f)
                    close()
                    moveTo(9.0001f, 11.16f)
                    verticalLineTo(16.84f)
                    curveTo(9.9965f, 16.9474f, 10.998f, 17.0008f, 12.0001f, 17.0f)
                    curveTo(13.0023f, 17.0008f, 14.0037f, 16.9474f, 15.0001f, 16.84f)
                    verticalLineTo(11.16f)
                    curveTo(13.0058f, 10.9466f, 10.9944f, 10.9466f, 9.0001f, 11.16f)
                    close()
                    moveTo(17.0001f, 11.46f)
                    verticalLineTo(16.542f)
                    curveTo(20.1211f, 15.928f, 22.0001f, 14.821f, 22.0001f, 14.001f)
                    curveTo(22.0001f, 13.181f, 20.1211f, 12.073f, 17.0001f, 11.459f)
                    verticalLineTo(11.46f)
                    close()
                    moveTo(9.0001f, 18.85f)
                    verticalLineTo(23.54f)
                    curveTo(10.9529f, 24.1547f, 13.0473f, 24.1547f, 15.0001f, 23.54f)
                    verticalLineTo(18.85f)
                    curveTo(14.0171f, 18.95f, 13.0081f, 19.001f, 12.0001f, 19.001f)
                    curveTo(10.9921f, 19.001f, 9.9831f, 18.947f, 9.0001f, 18.849f)
                    verticalLineTo(18.85f)
                    close()
                    moveTo(17.0001f, 22.65f)
                    curveTo(19.1047f, 21.4299f, 20.6943f, 19.4867f, 21.4731f, 17.182f)
                    curveTo(20.0588f, 17.864f, 18.5516f, 18.3334f, 17.0001f, 18.575f)
                    verticalLineTo(22.65f)
                    close()
                    moveTo(7.0001f, 22.65f)
                    verticalLineTo(18.575f)
                    curveTo(5.4483f, 18.3312f, 3.941f, 17.8594f, 2.5271f, 17.175f)
                    curveTo(3.3051f, 19.4812f, 4.8948f, 21.4259f, 7.0001f, 22.647f)
                    verticalLineTo(22.65f)
                    close()
                    moveTo(2.5271f, 10.821f)
                    curveTo(3.9413f, 10.138f, 5.4485f, 9.6676f, 7.0001f, 9.425f)
                    verticalLineTo(5.353f)
                    curveTo(4.8955f, 6.5731f, 3.3059f, 8.5163f, 2.5271f, 10.821f)
                    close()
                }
            }
        }
        .build()
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
