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

public val Icons.Bold.Dewpoint: ImageVector
    get() {
        if (_dewpoint != null) {
            return _dewpoint!!
        }
        _dewpoint = Builder(name = "Dewpoint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 24.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.929f, 6.929f)
                lineTo(10.0f, 0.013f)
                lineToRelative(7.06f, 6.9f)
                arcToRelative(10.014f, 10.014f, 0.0f, false, true, 0.011f, 14.154f)
                horizontalLineToRelative(0.0f)
                arcTo(9.934f, 9.934f, 0.0f, false, true, 10.0f, 24.0f)
                close()
                moveTo(10.0f, 4.209f)
                lineTo(5.038f, 9.062f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 14.95f, 9.05f)
                close()
                moveTo(19.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 21.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 2.5f)
                close()
            }
        }
        .build()
        return _dewpoint!!
    }

private var _dewpoint: ImageVector? = null
