package me.localx.icons.straight.bold

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

public val Icons.Bold.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0001f, 15.0004f)
                horizontalLineTo(15.0001f)
                verticalLineTo(18.0004f)
                horizontalLineTo(9.0001f)
                verticalLineTo(15.0004f)
                close()
                moveTo(13.4391f, 5.9394f)
                lineTo(12.0001f, 7.3794f)
                lineTo(10.5611f, 5.9394f)
                lineTo(8.4391f, 8.0614f)
                lineTo(9.8791f, 9.5004f)
                lineTo(8.4391f, 10.9394f)
                lineTo(10.5611f, 13.0614f)
                lineTo(12.0001f, 11.6214f)
                lineTo(13.4391f, 13.0614f)
                lineTo(15.5611f, 10.9394f)
                lineTo(14.1211f, 9.5004f)
                lineTo(15.5611f, 8.0614f)
                lineTo(13.4391f, 5.9394f)
                close()
                moveTo(17.0001f, 18.0004f)
                horizontalLineTo(23.0001f)
                verticalLineTo(15.0004f)
                horizontalLineTo(17.0001f)
                verticalLineTo(18.0004f)
                close()
                moveTo(23.5611f, 8.0614f)
                lineTo(21.4391f, 5.9394f)
                lineTo(20.0001f, 7.3794f)
                lineTo(18.5611f, 5.9394f)
                lineTo(16.4391f, 8.0614f)
                lineTo(17.8791f, 9.5004f)
                lineTo(16.4391f, 10.9394f)
                lineTo(18.5611f, 13.0614f)
                lineTo(20.0001f, 11.6214f)
                lineTo(21.4391f, 13.0614f)
                lineTo(23.5611f, 10.9394f)
                lineTo(22.1211f, 9.5004f)
                lineTo(23.5611f, 8.0614f)
                close()
                moveTo(1.0001f, 18.0004f)
                horizontalLineTo(7.0001f)
                verticalLineTo(15.0004f)
                horizontalLineTo(1.0001f)
                verticalLineTo(18.0004f)
                close()
                moveTo(5.4391f, 5.9394f)
                lineTo(4.0001f, 7.3794f)
                lineTo(2.5611f, 5.9394f)
                lineTo(0.4391f, 8.0614f)
                lineTo(1.8791f, 9.5004f)
                lineTo(0.4391f, 10.9394f)
                lineTo(2.5611f, 13.0614f)
                lineTo(4.0001f, 11.6214f)
                lineTo(5.4391f, 13.0614f)
                lineTo(7.5611f, 10.9394f)
                lineTo(6.1211f, 9.5004f)
                lineTo(7.5611f, 8.0614f)
                lineTo(5.4391f, 5.9394f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
