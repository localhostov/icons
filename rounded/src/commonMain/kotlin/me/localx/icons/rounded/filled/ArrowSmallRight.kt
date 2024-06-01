package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0609f, 9.525f)
                lineTo(13.4749f, 5.939f)
                curveTo(13.1935f, 5.6577f, 12.8119f, 5.4998f, 12.4141f, 5.4999f)
                curveTo(12.0162f, 5.5f, 11.6347f, 5.6581f, 11.3534f, 5.9395f)
                curveTo(11.0722f, 6.2209f, 10.9142f, 6.6025f, 10.9143f, 7.0004f)
                curveTo(10.9144f, 7.3982f, 11.0725f, 7.7797f, 11.3539f, 8.061f)
                lineTo(13.7929f, 10.5f)
                horizontalLineTo(4.9999f)
                curveTo(4.6021f, 10.5f, 4.2206f, 10.658f, 3.9393f, 10.9393f)
                curveTo(3.658f, 11.2206f, 3.4999f, 11.6022f, 3.4999f, 12.0f)
                curveTo(3.4999f, 12.3978f, 3.658f, 12.7794f, 3.9393f, 13.0607f)
                curveTo(4.2206f, 13.342f, 4.6021f, 13.5f, 4.9999f, 13.5f)
                horizontalLineTo(13.7929f)
                lineTo(11.3539f, 15.939f)
                curveTo(11.0725f, 16.2203f, 10.9144f, 16.6018f, 10.9143f, 16.9997f)
                curveTo(10.9142f, 17.3975f, 11.0722f, 17.7791f, 11.3534f, 18.0605f)
                curveTo(11.6347f, 18.3419f, 12.0162f, 18.5f, 12.4141f, 18.5001f)
                curveTo(12.8119f, 18.5002f, 13.1935f, 18.3423f, 13.4749f, 18.061f)
                lineTo(17.0609f, 14.475f)
                curveTo(17.7162f, 13.818f, 18.0841f, 12.9279f, 18.0841f, 12.0f)
                curveTo(18.0841f, 11.0721f, 17.7162f, 10.182f, 17.0609f, 9.525f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
