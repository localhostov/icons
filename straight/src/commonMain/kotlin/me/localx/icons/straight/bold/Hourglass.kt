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

public val Icons.Bold.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.591f)
                arcTo(11.944f, 11.944f, 0.0f, false, true, 6.986f, 12.0f)
                arcTo(11.937f, 11.937f, 0.0f, false, true, 3.0f, 3.409f)
                arcTo(3.412f, 3.412f, 0.0f, false, true, 6.409f, 0.0f)
                horizontalLineTo(17.591f)
                arcTo(3.413f, 3.413f, 0.0f, false, true, 21.0f, 3.409f)
                arcTo(11.963f, 11.963f, 0.0f, false, true, 17.028f, 12.0f)
                arcTo(11.963f, 11.963f, 0.0f, false, true, 21.0f, 20.591f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-0.409f)
                curveToRelative(0.0f, -3.384f, -2.271f, -5.9f, -4.177f, -7.417f)
                lineTo(12.348f, 12.0f)
                lineToRelative(1.475f, -1.174f)
                curveTo(15.729f, 9.311f, 18.0f, 6.793f, 18.0f, 3.409f)
                arcTo(0.41f, 0.41f, 0.0f, false, false, 17.591f, 3.0f)
                horizontalLineTo(6.409f)
                arcTo(0.41f, 0.41f, 0.0f, false, false, 6.0f, 3.409f)
                curveToRelative(0.0f, 3.386f, 2.281f, 5.9f, 4.2f, 7.414f)
                lineTo(11.682f, 12.0f)
                lineTo(10.2f, 13.176f)
                curveTo(8.281f, 14.691f, 6.0f, 17.207f, 6.0f, 20.591f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
