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

public val Icons.Filled.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4141f, 10.586f)
                lineTo(13.1211f, 6.293f)
                lineTo(11.7071f, 7.707f)
                lineTo(15.0001f, 11.0f)
                horizontalLineTo(5.0001f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0001f)
                lineTo(11.7071f, 16.293f)
                lineTo(13.1211f, 17.707f)
                lineTo(17.4141f, 13.414f)
                curveTo(17.7891f, 13.0389f, 17.9997f, 12.5303f, 17.9997f, 12.0f)
                curveTo(17.9997f, 11.4696f, 17.7891f, 10.961f, 17.4141f, 10.586f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
