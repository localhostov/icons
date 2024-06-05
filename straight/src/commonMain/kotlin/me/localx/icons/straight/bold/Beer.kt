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

public val Icons.Bold.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 4.0f)
                lineTo(16.329f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.05f, -1.729f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -6.435f, -0.238f)
                arcTo(2.959f, 2.959f, 0.0f, false, false, 2.7f, 4.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.0f, 20.5f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(3.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
