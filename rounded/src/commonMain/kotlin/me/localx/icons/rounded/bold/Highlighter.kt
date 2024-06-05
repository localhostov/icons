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

public val Icons.Bold.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.586f, 1.779f)
                lineToRelative(-0.367f, -0.367f)
                curveToRelative(-1.783f, -1.782f, -4.672f, -1.883f, -6.58f, -0.226f)
                lineTo(4.091f, 11.314f)
                curveToRelative(-1.329f, 1.185f, -2.091f, 2.885f, -2.091f, 4.665f)
                verticalLineToRelative(3.9f)
                lineToRelative(-1.561f, 1.561f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.561f, -1.561f)
                horizontalLineToRelative(3.9f)
                curveToRelative(1.779f, 0.0f, 3.479f, -0.762f, 4.673f, -2.1f)
                lineToRelative(10.124f, -11.544f)
                curveToRelative(1.653f, -1.904f, 1.552f, -4.792f, -0.232f, -6.577f)
                close()
                moveTo(20.558f, 6.383f)
                lineToRelative(-10.11f, 11.53f)
                curveToRelative(-0.227f, 0.255f, -0.5f, 0.454f, -0.789f, 0.624f)
                lineToRelative(-4.195f, -4.195f)
                curveToRelative(0.168f, -0.287f, 0.365f, -0.556f, 0.616f, -0.78f)
                lineTo(17.611f, 3.447f)
                curveToRelative(0.721f, -0.625f, 1.813f, -0.587f, 2.487f, 0.088f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.366f, 0.367f)
                curveToRelative(0.674f, 0.675f, 0.713f, 1.768f, 0.092f, 2.482f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
