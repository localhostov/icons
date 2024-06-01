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

public val Icons.Bold.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.5f)
                curveTo(23.0f, 3.6716f, 22.3285f, 3.0f, 21.5f, 3.0f)
                horizontalLineTo(17.724f)
                curveTo(17.0921f, 1.2074f, 15.4007f, 0.0061f, 13.5f, 0.0f)
                horizontalLineTo(10.5f)
                curveTo(8.5993f, 0.0061f, 6.9079f, 1.2074f, 6.276f, 3.0f)
                horizontalLineTo(2.5f)
                curveTo(1.6716f, 3.0f, 1.0f, 3.6716f, 1.0f, 4.5f)
                curveTo(1.0f, 5.3284f, 1.6716f, 6.0f, 2.5f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.5f)
                curveTo(3.0f, 21.5376f, 5.4625f, 24.0f, 8.5f, 24.0f)
                horizontalLineTo(15.5f)
                curveTo(18.5376f, 24.0f, 21.0f, 21.5376f, 21.0f, 18.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3285f, 6.0f, 23.0f, 5.3284f, 23.0f, 4.5f)
                close()
                moveTo(18.0f, 18.5f)
                curveTo(18.0f, 19.8807f, 16.8807f, 21.0f, 15.5f, 21.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 21.0f, 6.0f, 19.8807f, 6.0f, 18.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 18.0f)
                curveTo(10.3284f, 18.0f, 11.0f, 17.3284f, 11.0f, 16.5f)
                verticalLineTo(10.5f)
                curveTo(11.0f, 9.6716f, 10.3284f, 9.0f, 9.5f, 9.0f)
                curveTo(8.6716f, 9.0f, 8.0f, 9.6716f, 8.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(8.0f, 17.3284f, 8.6716f, 18.0f, 9.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 18.0f)
                curveTo(15.3284f, 18.0f, 16.0f, 17.3284f, 16.0f, 16.5f)
                verticalLineTo(10.5f)
                curveTo(16.0f, 9.6716f, 15.3284f, 9.0f, 14.5f, 9.0f)
                curveTo(13.6716f, 9.0f, 13.0f, 9.6716f, 13.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.3284f, 13.6716f, 18.0f, 14.5f, 18.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
