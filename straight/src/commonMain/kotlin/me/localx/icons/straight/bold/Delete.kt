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

public val Icons.Bold.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9998f, 2.0001f)
                horizontalLineTo(7.7588f)
                lineTo(0.1108f, 12.0001f)
                lineTo(7.7588f, 22.0001f)
                horizontalLineTo(20.9998f)
                curveTo(21.7955f, 22.0001f, 22.5586f, 21.6841f, 23.1212f, 21.1214f)
                curveTo(23.6838f, 20.5588f, 23.9998f, 19.7958f, 23.9998f, 19.0001f)
                verticalLineTo(5.0001f)
                curveTo(23.9998f, 4.2045f, 23.6838f, 3.4414f, 23.1212f, 2.8788f)
                curveTo(22.5586f, 2.3162f, 21.7955f, 2.0001f, 20.9998f, 2.0001f)
                close()
                moveTo(20.9998f, 19.0001f)
                horizontalLineTo(9.2408f)
                lineTo(3.8888f, 12.0001f)
                lineTo(9.2408f, 5.0001f)
                horizontalLineTo(20.9998f)
                verticalLineTo(19.0001f)
                close()
                moveTo(9.9388f, 13.9391f)
                lineTo(11.8788f, 12.0001f)
                lineTo(9.9388f, 10.0611f)
                lineTo(12.0608f, 7.9391f)
                lineTo(13.9998f, 9.8791f)
                lineTo(15.9388f, 7.9391f)
                lineTo(18.0608f, 10.0611f)
                lineTo(16.1208f, 12.0001f)
                lineTo(18.0608f, 13.9391f)
                lineTo(15.9388f, 16.0611f)
                lineTo(13.9998f, 14.1211f)
                lineTo(12.0608f, 16.0611f)
                lineTo(9.9388f, 13.9391f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
