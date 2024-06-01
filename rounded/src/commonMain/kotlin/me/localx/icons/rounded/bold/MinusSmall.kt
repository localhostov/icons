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

public val Icons.Bold.MinusSmall: ImageVector
    get() {
        if (_minusSmall != null) {
            return _minusSmall!!
        }
        _minusSmall = Builder(name = "MinusSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.5f)
                horizontalLineTo(7.5f)
                curveTo(7.1022f, 13.5f, 6.7206f, 13.342f, 6.4393f, 13.0607f)
                curveTo(6.158f, 12.7794f, 6.0f, 12.3978f, 6.0f, 12.0f)
                curveTo(6.0f, 11.6022f, 6.158f, 11.2206f, 6.4393f, 10.9393f)
                curveTo(6.7206f, 10.658f, 7.1022f, 10.5f, 7.5f, 10.5f)
                horizontalLineTo(16.5f)
                curveTo(16.8978f, 10.5f, 17.2794f, 10.658f, 17.5607f, 10.9393f)
                curveTo(17.842f, 11.2206f, 18.0f, 11.6022f, 18.0f, 12.0f)
                curveTo(18.0f, 12.3978f, 17.842f, 12.7794f, 17.5607f, 13.0607f)
                curveTo(17.2794f, 13.342f, 16.8978f, 13.5f, 16.5f, 13.5f)
                close()
            }
        }
        .build()
        return _minusSmall!!
    }

private var _minusSmall: ImageVector? = null
