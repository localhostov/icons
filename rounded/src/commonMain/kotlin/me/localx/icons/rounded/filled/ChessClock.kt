package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChessClock: ImageVector
    get() {
        if (_chessClock != null) {
            return _chessClock!!
        }
        _chessClock = Builder(name = "ChessClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.576f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(5.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(21.0f, 20.576f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 16.0f)
                lineTo(24.0f, 10.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 5.0f)
                close()
                moveTo(8.0f, 14.5f)
                horizontalLineToRelative(2.837f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -2.0f)
                lineTo(8.0f, 12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(16.146f, 14.561f)
                lineTo(18.153f, 16.567f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 1.414f, -1.414f)
                lineToRelative(-2.006f, -2.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.415f, 1.415f)
                close()
            }
        }
        .build()
        return _chessClock!!
    }

private var _chessClock: ImageVector? = null
