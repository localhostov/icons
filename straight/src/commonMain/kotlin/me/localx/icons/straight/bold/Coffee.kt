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

public val Icons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, -2.236f, -3.264f)
                arcTo(3.507f, 3.507f, 0.0f, false, false, 18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(3.507f, 3.507f, 0.0f, false, false, 2.236f, 2.236f)
                arcTo(3.507f, 3.507f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 8.0f)
                lineTo(1.616f, 8.0f)
                lineTo(3.681f, 24.0f)
                lineTo(20.319f, 24.0f)
                lineTo(22.383f, 8.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(5.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(6.319f, 21.0f)
                lineToRelative(-0.645f, -5.0f)
                horizontalLineToRelative(3.51f)
                curveToRelative(0.9f, 3.959f, 4.733f, 3.957f, 5.632f, 0.0f)
                horizontalLineToRelative(3.51f)
                lineToRelative(-0.645f, 5.0f)
                close()
                moveTo(18.713f, 13.0f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.9f, -3.959f, -4.733f, -3.957f, -5.632f, 0.0f)
                horizontalLineToRelative(-3.9f)
                lineTo(4.642f, 8.0f)
                lineTo(19.359f, 8.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
