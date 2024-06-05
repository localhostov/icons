package me.localx.icons.straight.outline

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

public val Icons.Outline.ChessClock: ImageVector
    get() {
        if (_chessClock != null) {
            return _chessClock!!
        }
        _chessClock = Builder(name = "ChessClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
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
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 12.0f, 13.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.5f, 9.0f)
                close()
                moveTo(7.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.263f, -3.546f)
                lineTo(7.5f, 13.5f)
                lineToRelative(2.242f, 1.089f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 16.0f)
                close()
                moveTo(16.5f, 9.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 21.0f, 13.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 9.0f)
                close()
                moveTo(14.0f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcToRelative(2.456f, 2.456f, 0.0f, false, true, -0.123f, 0.735f)
                lineToRelative(-2.37f, -0.742f)
                lineToRelative(0.692f, 2.395f)
                arcToRelative(2.452f, 2.452f, 0.0f, false, true, -0.7f, 0.112f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 13.5f)
                close()
            }
        }
        .build()
        return _chessClock!!
    }

private var _chessClock: ImageVector? = null
