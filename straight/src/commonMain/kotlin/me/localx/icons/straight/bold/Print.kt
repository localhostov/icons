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

public val Icons.Bold.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 9.0f)
                lineTo(0.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
