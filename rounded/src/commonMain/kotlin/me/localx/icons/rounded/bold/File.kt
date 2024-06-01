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

public val Icons.Bold.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 4.049f)
                lineTo(18.018f, 1.631f)
                curveTo(16.9823f, 0.5906f, 15.576f, 0.0039f, 14.1079f, 0.0f)
                horizontalLineTo(7.5f)
                curveTo(4.4638f, 0.0033f, 2.0033f, 2.4638f, 1.9999f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2.0033f, 21.5362f, 4.4638f, 23.9967f, 7.5f, 24.0f)
                horizontalLineTo(16.5f)
                curveTo(19.5362f, 23.9967f, 21.9967f, 21.5362f, 22.0f, 18.5f)
                verticalLineTo(7.917f)
                curveTo(22.0037f, 6.4679f, 21.4318f, 5.0765f, 20.41f, 4.049f)
                close()
                moveTo(19.0f, 18.5f)
                curveTo(19.0f, 19.8807f, 17.8807f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 21.0f, 5.0f, 19.8807f, 5.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(4.9999f, 4.1193f, 6.1193f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 8.1046f, 13.8954f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
