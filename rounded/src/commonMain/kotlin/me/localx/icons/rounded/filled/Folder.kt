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

public val Icons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.9905f)
                verticalLineTo(17.9995f)
                curveTo(0.0033f, 20.7596f, 2.24f, 22.9962f, 5.0f, 22.9995f)
                horizontalLineTo(19.0f)
                curveTo(21.76f, 22.9962f, 23.9967f, 20.7596f, 24.0f, 17.9995f)
                verticalLineTo(8.8795f)
                lineTo(0.0f, 8.9905f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(12.472f)
                curveTo(12.3173f, 3.001f, 12.1645f, 2.9668f, 12.025f, 2.9f)
                lineTo(8.869f, 1.316f)
                curveTo(8.4524f, 1.1085f, 7.9934f, 1.0004f, 7.528f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.24f, 1.0033f, 0.0033f, 3.2399f, 0.0f, 6.0f)
                verticalLineTo(6.991f)
                lineTo(23.863f, 6.88f)
                curveTo(23.3419f, 4.6128f, 21.3262f, 3.0046f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
