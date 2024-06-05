package me.localx.icons.straight.filled

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

public val Icons.Filled.Subtitles: ImageVector
    get() {
        if (_subtitles != null) {
            return _subtitles!!
        }
        _subtitles = Builder(name = "Subtitles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 2.0f)
                close()
                moveTo(4.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(20.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 10.0f)
                lineTo(20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
