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
                moveTo(21.0f, 5.0f)
                lineTo(21.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                lineTo(15.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                lineTo(3.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(0.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 5.0f)
                close()
                moveTo(10.843f, 14.482f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.022f, -1.894f)
                lineTo(8.0f, 13.54f)
                close()
                moveTo(19.523f, 15.234f)
                lineTo(17.0f, 14.0f)
                lineToRelative(1.169f, 2.558f)
                arcTo(3.456f, 3.456f, 0.0f, false, true, 16.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 20.0f, 13.5f)
                arcTo(3.465f, 3.465f, 0.0f, false, true, 19.523f, 15.234f)
                close()
            }
        }
        .build()
        return _chessClock!!
    }

private var _chessClock: ImageVector? = null
