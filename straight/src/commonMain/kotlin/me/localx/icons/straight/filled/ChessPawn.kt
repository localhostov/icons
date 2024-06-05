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

public val Icons.Filled.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                lineTo(4.0f, 12.0f)
                lineTo(7.111f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 9.778f, 0.0f)
                lineTo(20.0f, 12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
