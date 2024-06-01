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

public val Icons.Bold.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0611f, 12.354f)
                curveTo(17.9218f, 12.2146f, 17.7564f, 12.104f, 17.5743f, 12.0286f)
                curveTo(17.3923f, 11.9532f, 17.1971f, 11.9143f, 17.0001f, 11.9143f)
                curveTo(16.803f, 11.9143f, 16.6079f, 11.9532f, 16.4258f, 12.0286f)
                curveTo(16.2438f, 12.104f, 16.0784f, 12.2146f, 15.9391f, 12.354f)
                lineTo(13.5001f, 14.793f)
                verticalLineTo(6.0f)
                curveTo(13.5001f, 5.6022f, 13.342f, 5.2206f, 13.0607f, 4.9393f)
                curveTo(12.7794f, 4.658f, 12.3979f, 4.5f, 12.0001f, 4.5f)
                curveTo(11.6022f, 4.5f, 11.2207f, 4.658f, 10.9394f, 4.9393f)
                curveTo(10.6581f, 5.2206f, 10.5001f, 5.6022f, 10.5001f, 6.0f)
                verticalLineTo(14.793f)
                lineTo(8.0611f, 12.354f)
                curveTo(7.7798f, 12.0726f, 7.3983f, 11.9145f, 7.0004f, 11.9144f)
                curveTo(6.6026f, 11.9143f, 6.221f, 12.0722f, 5.9396f, 12.3535f)
                curveTo(5.6582f, 12.6348f, 5.5f, 13.0163f, 5.4999f, 13.4141f)
                curveTo(5.4998f, 13.812f, 5.6578f, 14.1936f, 5.9391f, 14.475f)
                lineTo(9.5251f, 18.061f)
                curveTo(9.8501f, 18.386f, 10.2359f, 18.6439f, 10.6606f, 18.8198f)
                curveTo(11.0853f, 18.9957f, 11.5404f, 19.0863f, 12.0001f, 19.0863f)
                curveTo(12.4597f, 19.0863f, 12.9149f, 18.9957f, 13.3395f, 18.8198f)
                curveTo(13.7642f, 18.6439f, 14.1501f, 18.386f, 14.4751f, 18.061f)
                lineTo(18.0611f, 14.475f)
                curveTo(18.3423f, 14.1937f, 18.5002f, 13.8122f, 18.5002f, 13.4145f)
                curveTo(18.5002f, 13.0168f, 18.3423f, 12.6353f, 18.0611f, 12.354f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
