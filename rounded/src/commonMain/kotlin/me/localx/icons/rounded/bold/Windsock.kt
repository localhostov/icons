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

public val Icons.Bold.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.186f, 7.708f)
                lineTo(4.213f, 4.313f)
                arcTo(2.512f, 2.512f, 0.0f, false, false, 2.5f, 0.0f)
                arcTo(2.505f, 2.505f, 0.0f, false, false, 1.0f, 4.489f)
                lineTo(1.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(4.0f, 19.729f)
                lineToRelative(17.186f, -3.437f)
                arcTo(3.509f, 3.509f, 0.0f, false, false, 24.0f, 12.86f)
                lineTo(24.0f, 11.14f)
                arcTo(3.509f, 3.509f, 0.0f, false, false, 21.186f, 7.708f)
                close()
                moveTo(14.0f, 9.329f)
                lineToRelative(2.0f, 0.4f)
                verticalLineToRelative(4.542f)
                lineToRelative(-2.0f, 0.4f)
                close()
                moveTo(11.0f, 15.271f)
                lineTo(9.0f, 15.671f)
                lineTo(9.0f, 8.329f)
                lineToRelative(2.0f, 0.4f)
                close()
                moveTo(4.0f, 7.329f)
                lineToRelative(2.0f, 0.4f)
                verticalLineToRelative(8.542f)
                lineToRelative(-2.0f, 0.4f)
                close()
                moveTo(21.0f, 12.86f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.491f)
                lineToRelative(-1.6f, 0.32f)
                lineTo(19.0f, 10.329f)
                lineToRelative(1.6f, 0.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, 0.491f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
