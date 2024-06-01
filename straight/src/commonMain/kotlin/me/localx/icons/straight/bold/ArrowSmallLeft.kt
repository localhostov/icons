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

public val Icons.Bold.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9999f, 10.5001f)
                horizontalLineTo(10.2069f)
                lineTo(12.6459f, 8.0611f)
                lineTo(10.5249f, 5.9391f)
                lineTo(6.2319f, 10.2321f)
                curveTo(5.9997f, 10.4642f, 5.8155f, 10.7399f, 5.6898f, 11.0432f)
                curveTo(5.5641f, 11.3466f, 5.4995f, 11.6717f, 5.4995f, 12.0001f)
                curveTo(5.4995f, 12.3284f, 5.5641f, 12.6536f, 5.6898f, 12.9569f)
                curveTo(5.8155f, 13.2603f, 5.9997f, 13.5359f, 6.2319f, 13.7681f)
                lineTo(10.5249f, 18.0611f)
                lineTo(12.6459f, 15.9391f)
                lineTo(10.2069f, 13.5001f)
                horizontalLineTo(18.9999f)
                verticalLineTo(10.5001f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
