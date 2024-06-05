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

public val Icons.Bold.ChessClock: ImageVector
    get() {
        if (_chessClock != null) {
            return _chessClock!!
        }
        _chessClock = Builder(name = "ChessClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 5.0f)
                lineTo(20.0f, 5.0f)
                lineTo(20.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                lineTo(14.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 5.0f)
                lineTo(3.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 8.5f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 8.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(10.865f, 12.588f)
                lineTo(8.959f, 13.54f)
                lineTo(10.843f, 14.482f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.022f, -1.894f)
                close()
                moveTo(20.0f, 13.5f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, true, -0.477f, 1.734f)
                lineTo(17.5f, 14.56f)
                lineToRelative(0.666f, 2.0f)
                arcTo(3.456f, 3.456f, 0.0f, false, true, 16.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 20.0f, 13.5f)
                close()
            }
        }
        .build()
        return _chessClock!!
    }

private var _chessClock: ImageVector? = null
