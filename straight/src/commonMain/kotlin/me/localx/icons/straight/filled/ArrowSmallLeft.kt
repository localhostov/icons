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

public val Icons.Filled.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9998f, 11.0f)
                horizontalLineTo(8.9998f)
                lineTo(12.2928f, 7.707f)
                lineTo(10.8788f, 6.293f)
                lineTo(6.5858f, 10.586f)
                curveTo(6.2109f, 10.961f, 6.0002f, 11.4696f, 6.0002f, 12.0f)
                curveTo(6.0002f, 12.5303f, 6.2109f, 13.0389f, 6.5858f, 13.414f)
                lineTo(10.8788f, 17.707f)
                lineTo(12.2928f, 16.293f)
                lineTo(8.9998f, 13.0f)
                horizontalLineTo(18.9998f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
