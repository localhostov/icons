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

public val Icons.Bold.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                horizontalLineTo(12.492f)
                curveTo(12.4112f, 2.9996f, 12.3317f, 2.9801f, 12.26f, 2.943f)
                lineTo(9.315f, 1.4f)
                curveTo(8.8135f, 1.1375f, 8.256f, 1.0002f, 7.69f, 1.0f)
                horizontalLineTo(5.5f)
                curveTo(2.4638f, 1.0033f, 0.0033f, 3.4638f, 0.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(0.0033f, 20.5362f, 2.4638f, 22.9967f, 5.5f, 23.0f)
                horizontalLineTo(18.5f)
                curveTo(21.5362f, 22.9967f, 23.9967f, 20.5362f, 24.0f, 17.5f)
                verticalLineTo(8.5f)
                curveTo(23.9967f, 5.4638f, 21.5362f, 3.0033f, 18.5f, 3.0f)
                close()
                moveTo(21.0f, 17.5f)
                curveTo(21.0f, 18.8807f, 19.8807f, 19.9999f, 18.5f, 19.9999f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 20.0f, 3.0f, 18.8807f, 3.0f, 17.5f)
                verticalLineTo(7.967f)
                horizontalLineTo(20.94f)
                curveTo(20.9793f, 8.1419f, 20.9994f, 8.3207f, 21.0f, 8.5f)
                verticalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
