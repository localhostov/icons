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
                moveTo(24.0f, 8.271f)
                lineTo(4.219f, 4.314f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 1.0f, 4.5f)
                lineTo(1.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 19.729f)
                lineToRelative(20.0f, -4.0f)
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
                moveTo(21.0f, 13.271f)
                lineTo(19.0f, 13.671f)
                lineTo(19.0f, 10.329f)
                lineToRelative(2.0f, 0.4f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
