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

public val Icons.Filled.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.8789f)
                verticalLineTo(6.7069f)
                curveTo(9.0f, 6.5092f, 9.0587f, 6.3159f, 9.1686f, 6.1515f)
                curveTo(9.2785f, 5.9871f, 9.4347f, 5.8589f, 9.6173f, 5.7833f)
                curveTo(9.8f, 5.7076f, 10.0011f, 5.6878f, 10.195f, 5.7264f)
                curveTo(10.389f, 5.7649f, 10.5671f, 5.8601f, 10.707f, 5.9999f)
                lineTo(16.293f, 11.5859f)
                curveTo(16.4805f, 11.7735f, 16.5858f, 12.0278f, 16.5858f, 12.2929f)
                curveTo(16.5858f, 12.5581f, 16.4805f, 12.8124f, 16.293f, 12.9999f)
                lineTo(10.707f, 18.5859f)
                curveTo(10.5671f, 18.7257f, 10.389f, 18.821f, 10.195f, 18.8595f)
                curveTo(10.0011f, 18.8981f, 9.8f, 18.8783f, 9.6173f, 18.8026f)
                curveTo(9.4347f, 18.7269f, 9.2785f, 18.5988f, 9.1686f, 18.4344f)
                curveTo(9.0587f, 18.27f, 9.0f, 18.0767f, 9.0f, 17.8789f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
