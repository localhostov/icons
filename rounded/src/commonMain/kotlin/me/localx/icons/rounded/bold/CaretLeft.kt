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

public val Icons.Bold.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.293f, 18.5859f)
                lineTo(7.707f, 12.9999f)
                curveTo(7.5195f, 12.8124f, 7.4142f, 12.5581f, 7.4142f, 12.2929f)
                curveTo(7.4142f, 12.0278f, 7.5195f, 11.7735f, 7.707f, 11.5859f)
                lineTo(13.293f, 5.9999f)
                curveTo(13.4328f, 5.8601f, 13.611f, 5.7649f, 13.8049f, 5.7264f)
                curveTo(13.9989f, 5.6878f, 14.1999f, 5.7076f, 14.3826f, 5.7833f)
                curveTo(14.5653f, 5.8589f, 14.7215f, 5.9871f, 14.8314f, 6.1515f)
                curveTo(14.9413f, 6.3159f, 14.9999f, 6.5092f, 15.0f, 6.7069f)
                verticalLineTo(17.8789f)
                curveTo(14.9999f, 18.0767f, 14.9413f, 18.27f, 14.8314f, 18.4344f)
                curveTo(14.7215f, 18.5988f, 14.5653f, 18.7269f, 14.3826f, 18.8026f)
                curveTo(14.1999f, 18.8783f, 13.9989f, 18.8981f, 13.8049f, 18.8595f)
                curveTo(13.611f, 18.821f, 13.4328f, 18.7257f, 13.293f, 18.5859f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
