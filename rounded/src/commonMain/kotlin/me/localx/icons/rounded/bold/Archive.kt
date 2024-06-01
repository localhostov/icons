package me.localx.icons.rounded.bold

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

public val Icons.Bold.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                horizontalLineTo(7.5f)
                curveTo(4.4638f, 0.0033f, 2.0033f, 2.4638f, 2.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2.0033f, 21.5362f, 4.4638f, 23.9967f, 7.5f, 24.0f)
                horizontalLineTo(16.5f)
                curveTo(19.5362f, 23.9967f, 21.9967f, 21.5362f, 22.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(21.9967f, 2.4638f, 19.5362f, 0.0033f, 16.5f, 0.0f)
                close()
                moveTo(7.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 3.0f, 19.0f, 4.1193f, 19.0f, 5.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 4.1193f, 6.1193f, 3.0f, 7.5f, 3.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 21.0f, 5.0f, 19.8807f, 5.0f, 18.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.5f)
                curveTo(19.0f, 19.8807f, 17.8807f, 21.0f, 16.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4999f, 6.0f)
                horizontalLineTo(12.4999f)
                curveTo(13.3283f, 6.0f, 13.9999f, 6.6716f, 13.9999f, 7.5f)
                curveTo(13.9999f, 8.3284f, 13.3283f, 9.0f, 12.4999f, 9.0f)
                horizontalLineTo(11.4999f)
                curveTo(10.6715f, 9.0f, 9.9999f, 8.3284f, 9.9999f, 7.5f)
                curveTo(9.9999f, 6.6716f, 10.6715f, 6.0f, 11.4999f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4999f, 16.0f)
                horizontalLineTo(12.4999f)
                curveTo(13.3283f, 16.0f, 13.9999f, 16.6716f, 13.9999f, 17.5f)
                curveTo(13.9999f, 18.3284f, 13.3283f, 19.0f, 12.4999f, 19.0f)
                horizontalLineTo(11.4999f)
                curveTo(10.6715f, 19.0f, 9.9999f, 18.3284f, 9.9999f, 17.5f)
                curveTo(9.9999f, 16.6716f, 10.6715f, 16.0f, 11.4999f, 16.0f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
