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

public val Icons.Bold.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.5f)
                horizontalLineTo(10.207f)
                lineTo(12.646f, 8.061f)
                curveTo(12.9274f, 7.7797f, 13.0855f, 7.3982f, 13.0856f, 7.0004f)
                curveTo(13.0857f, 6.6025f, 12.9277f, 6.2209f, 12.6465f, 5.9395f)
                curveTo(12.3652f, 5.6581f, 11.9837f, 5.5f, 11.5858f, 5.4999f)
                curveTo(11.188f, 5.4998f, 10.8064f, 5.6577f, 10.525f, 5.939f)
                lineTo(6.939f, 9.525f)
                curveTo(6.2837f, 10.182f, 5.9158f, 11.0721f, 5.9158f, 12.0f)
                curveTo(5.9158f, 12.9279f, 6.2837f, 13.818f, 6.939f, 14.475f)
                lineTo(10.525f, 18.061f)
                curveTo(10.8064f, 18.3423f, 11.188f, 18.5002f, 11.5858f, 18.5001f)
                curveTo(11.9837f, 18.5f, 12.3652f, 18.3419f, 12.6465f, 18.0605f)
                curveTo(12.9277f, 17.7791f, 13.0857f, 17.3975f, 13.0856f, 16.9997f)
                curveTo(13.0855f, 16.6018f, 12.9274f, 16.2203f, 12.646f, 15.939f)
                lineTo(10.207f, 13.5f)
                horizontalLineTo(19.0f)
                curveTo(19.3978f, 13.5f, 19.7793f, 13.342f, 20.0606f, 13.0607f)
                curveTo(20.3419f, 12.7794f, 20.5f, 12.3978f, 20.5f, 12.0f)
                curveTo(20.5f, 11.6022f, 20.3419f, 11.2206f, 20.0606f, 10.9393f)
                curveTo(19.7793f, 10.658f, 19.3978f, 10.5f, 19.0f, 10.5f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
