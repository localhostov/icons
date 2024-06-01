package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9999f, 16.0003f)
                horizontalLineTo(14.9998f)
                verticalLineTo(18.0003f)
                horizontalLineTo(8.9999f)
                verticalLineTo(16.0003f)
                close()
                moveTo(13.7928f, 6.7933f)
                lineTo(11.9998f, 8.5863f)
                lineTo(10.2068f, 6.7933f)
                lineTo(8.7928f, 8.2073f)
                lineTo(10.5858f, 10.0003f)
                lineTo(8.7928f, 11.7933f)
                lineTo(10.2068f, 13.2073f)
                lineTo(11.9998f, 11.4143f)
                lineTo(13.7928f, 13.2073f)
                lineTo(15.2068f, 11.7933f)
                lineTo(13.4138f, 10.0003f)
                lineTo(15.2068f, 8.2073f)
                lineTo(13.7928f, 6.7933f)
                close()
                moveTo(16.9998f, 18.0003f)
                horizontalLineTo(22.9998f)
                verticalLineTo(16.0003f)
                horizontalLineTo(16.9998f)
                verticalLineTo(18.0003f)
                close()
                moveTo(23.2068f, 8.2073f)
                lineTo(21.7928f, 6.7933f)
                lineTo(19.9998f, 8.5863f)
                lineTo(18.2068f, 6.7933f)
                lineTo(16.7928f, 8.2073f)
                lineTo(18.5858f, 10.0003f)
                lineTo(16.7928f, 11.7933f)
                lineTo(18.2068f, 13.2073f)
                lineTo(19.9998f, 11.4143f)
                lineTo(21.7928f, 13.2073f)
                lineTo(23.2068f, 11.7933f)
                lineTo(21.4138f, 10.0003f)
                lineTo(23.2068f, 8.2073f)
                close()
                moveTo(0.9998f, 18.0003f)
                horizontalLineTo(6.9998f)
                verticalLineTo(16.0003f)
                horizontalLineTo(0.9998f)
                verticalLineTo(18.0003f)
                close()
                moveTo(5.7929f, 6.7933f)
                lineTo(3.9999f, 8.5863f)
                lineTo(2.2069f, 6.7933f)
                lineTo(0.7928f, 8.2073f)
                lineTo(2.5859f, 10.0003f)
                lineTo(0.7928f, 11.7933f)
                lineTo(2.2069f, 13.2073f)
                lineTo(3.9999f, 11.4143f)
                lineTo(5.7929f, 13.2073f)
                lineTo(7.2069f, 11.7933f)
                lineTo(5.4138f, 10.0003f)
                lineTo(7.2069f, 8.2073f)
                lineTo(5.7929f, 6.7933f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
