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

public val Icons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(17.9f)
                curveTo(17.4215f, 1.6736f, 15.3751f, 0.003f, 13.0f, 0.0f)
                horizontalLineTo(11.0f)
                curveTo(8.6248f, 0.003f, 6.5784f, 1.6736f, 6.1f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 4.0f, 2.0f, 4.4477f, 2.0f, 5.0f)
                curveTo(2.0f, 5.5522f, 2.4477f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                curveTo(4.0033f, 21.76f, 6.2399f, 23.9967f, 9.0f, 24.0f)
                horizontalLineTo(15.0f)
                curveTo(17.76f, 23.9967f, 19.9967f, 21.76f, 20.0f, 19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 6.0f, 22.0f, 5.5523f, 22.0f, 5.0f)
                curveTo(22.0f, 4.4477f, 21.5523f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(11.0f, 17.0f)
                curveTo(11.0f, 17.5523f, 10.5523f, 18.0f, 10.0f, 18.0f)
                curveTo(9.4477f, 18.0f, 9.0f, 17.5523f, 9.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 10.4477f, 9.4477f, 10.0f, 10.0f, 10.0f)
                curveTo(10.5522f, 10.0f, 11.0f, 10.4477f, 11.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(15.0f, 17.0f)
                curveTo(15.0f, 17.5523f, 14.5523f, 18.0f, 14.0f, 18.0f)
                curveTo(13.4477f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 13.4477f, 10.0f, 14.0f, 10.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(8.171f, 4.0f)
                curveTo(8.5963f, 2.8023f, 9.729f, 2.0015f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(14.271f, 2.0015f, 15.4037f, 2.8023f, 15.829f, 4.0f)
                horizontalLineTo(8.171f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
