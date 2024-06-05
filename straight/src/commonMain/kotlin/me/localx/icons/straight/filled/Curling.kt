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

public val Icons.Filled.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(6.0f, 24.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 0.0f, 18.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(24.0f, 16.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 10.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                arcToRelative(7.962f, 7.962f, 0.0f, false, true, 1.57f, 0.157f)
                lineTo(18.781f, 5.0f)
                lineTo(7.136f, 5.0f)
                lineToRelative(0.493f, -2.217f)
                arcTo(0.992f, 0.992f, 0.0f, false, true, 8.6f, 2.0f)
                lineTo(17.0f, 2.0f)
                lineTo(17.0f, 0.0f)
                lineTo(8.6f, 0.0f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 5.676f, 2.349f)
                lineTo(4.383f, 8.165f)
                arcTo(7.983f, 7.983f, 0.0f, false, true, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
