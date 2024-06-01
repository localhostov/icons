package me.localx.icons.rounded.filled

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

public val Icons.Filled.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.9999f)
                curveTo(17.8124f, 5.8125f, 17.5581f, 5.7071f, 17.293f, 5.7071f)
                curveTo(17.0278f, 5.7071f, 16.7735f, 5.8125f, 16.586f, 5.9999f)
                lineTo(12.0f, 10.5859f)
                lineTo(7.414f, 5.9999f)
                curveTo(7.2264f, 5.8125f, 6.9721f, 5.7071f, 6.707f, 5.7071f)
                curveTo(6.4418f, 5.7071f, 6.1875f, 5.8125f, 6.0f, 5.9999f)
                curveTo(5.8125f, 6.1875f, 5.7072f, 6.4418f, 5.7072f, 6.7069f)
                curveTo(5.7072f, 6.9721f, 5.8125f, 7.2264f, 6.0f, 7.4139f)
                lineTo(10.586f, 11.9999f)
                lineTo(6.0f, 16.5859f)
                curveTo(5.8125f, 16.7735f, 5.7072f, 17.0278f, 5.7072f, 17.2929f)
                curveTo(5.7072f, 17.5581f, 5.8125f, 17.8124f, 6.0f, 17.9999f)
                curveTo(6.1875f, 18.1874f, 6.4418f, 18.2927f, 6.707f, 18.2927f)
                curveTo(6.9721f, 18.2927f, 7.2264f, 18.1874f, 7.414f, 17.9999f)
                lineTo(12.0f, 13.4139f)
                lineTo(16.586f, 17.9999f)
                curveTo(16.7735f, 18.1874f, 17.0278f, 18.2927f, 17.293f, 18.2927f)
                curveTo(17.5581f, 18.2927f, 17.8124f, 18.1874f, 18.0f, 17.9999f)
                curveTo(18.1874f, 17.8124f, 18.2928f, 17.5581f, 18.2928f, 17.2929f)
                curveTo(18.2928f, 17.0278f, 18.1874f, 16.7735f, 18.0f, 16.5859f)
                lineTo(13.414f, 11.9999f)
                lineTo(18.0f, 7.4139f)
                curveTo(18.1874f, 7.2264f, 18.2928f, 6.9721f, 18.2928f, 6.7069f)
                curveTo(18.2928f, 6.4418f, 18.1874f, 6.1875f, 18.0f, 5.9999f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
