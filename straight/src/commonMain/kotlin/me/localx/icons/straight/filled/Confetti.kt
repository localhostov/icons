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

public val Icons.Filled.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.0f)
                lineToRelative(2.667f, -1.333f)
                lineTo(4.0f, 16.0f)
                lineToRelative(1.333f, 2.667f)
                lineTo(8.0f, 20.0f)
                lineTo(5.333f, 21.333f)
                lineTo(4.0f, 24.0f)
                lineTo(2.667f, 21.333f)
                close()
                moveTo(18.667f, 21.333f)
                lineTo(20.0f, 24.0f)
                lineToRelative(1.333f, -2.667f)
                lineTo(24.0f, 20.0f)
                lineToRelative(-2.667f, -1.333f)
                lineTo(20.0f, 16.0f)
                lineToRelative(-1.333f, 2.667f)
                lineTo(16.0f, 20.0f)
                close()
                moveTo(10.667f, 5.333f)
                lineTo(12.0f, 8.0f)
                lineToRelative(1.333f, -2.667f)
                lineTo(16.0f, 4.0f)
                lineTo(13.333f, 2.667f)
                lineTo(12.0f, 0.0f)
                lineTo(10.667f, 2.667f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 12.0f)
                close()
                moveTo(1.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 2.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 8.0f)
                close()
                moveTo(5.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 4.0f)
                close()
                moveTo(1.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 2.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(23.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 12.0f)
                close()
                moveTo(19.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 8.0f)
                close()
                moveTo(23.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 4.0f)
                close()
                moveTo(19.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 0.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 18.0f)
                close()
                moveTo(14.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 14.0f)
                close()
                moveTo(10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
