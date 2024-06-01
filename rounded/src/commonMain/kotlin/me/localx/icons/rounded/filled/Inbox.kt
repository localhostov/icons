package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(16.8954f, 10.0f, 16.0f, 10.8955f, 16.0f, 12.0f)
                curveTo(16.0f, 13.1046f, 15.1045f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 14.0f, 8.0f, 13.1046f, 8.0f, 12.0f)
                curveTo(8.0f, 10.8955f, 7.1046f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(3.0f)
                curveTo(1.3432f, 10.0f, 0.0f, 11.3432f, 0.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(0.0033f, 19.76f, 2.24f, 21.9967f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(21.76f, 21.9967f, 23.9967f, 19.7601f, 24.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(24.0f, 11.3432f, 22.6568f, 10.0f, 21.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 7.5523f, 22.0f, 7.0f)
                curveTo(22.0f, 6.4477f, 21.5523f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 6.0f, 2.0f, 6.4477f, 2.0f, 7.0f)
                curveTo(2.0f, 7.5522f, 2.4477f, 8.0f, 3.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 4.0f, 22.0f, 3.5523f, 22.0f, 3.0f)
                curveTo(22.0f, 2.4477f, 21.5523f, 2.0f, 21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 2.0f, 2.0f, 2.4477f, 2.0f, 3.0f)
                curveTo(2.0f, 3.5523f, 2.4477f, 4.0f, 3.0f, 4.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
