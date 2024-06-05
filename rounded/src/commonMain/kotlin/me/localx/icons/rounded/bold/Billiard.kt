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

public val Icons.Bold.Billiard: ImageVector
    get() {
        if (_billiard != null) {
            return _billiard!!
        }
        _billiard = Builder(name = "Billiard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                close()
                moveTo(14.786f, 11.271f)
                lineTo(12.786f, 15.271f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.573f, -1.543f)
                lineToRelative(0.787f, -1.728f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.286f, 2.271f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _billiard!!
    }

private var _billiard: ImageVector? = null
