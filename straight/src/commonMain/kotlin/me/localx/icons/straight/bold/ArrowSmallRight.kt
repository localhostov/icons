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

public val Icons.Bold.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7679f, 10.2321f)
                lineTo(13.4749f, 5.9391f)
                lineTo(11.3539f, 8.0611f)
                lineTo(13.7929f, 10.5001f)
                horizontalLineTo(4.9999f)
                verticalLineTo(13.5001f)
                horizontalLineTo(13.7929f)
                lineTo(11.3539f, 15.9391f)
                lineTo(13.4749f, 18.0611f)
                lineTo(17.7679f, 13.7681f)
                curveTo(18.0002f, 13.5359f, 18.1844f, 13.2603f, 18.31f, 12.9569f)
                curveTo(18.4357f, 12.6536f, 18.5004f, 12.3284f, 18.5004f, 12.0001f)
                curveTo(18.5004f, 11.6717f, 18.4357f, 11.3466f, 18.31f, 11.0432f)
                curveTo(18.1844f, 10.7399f, 18.0002f, 10.4642f, 17.7679f, 10.2321f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
