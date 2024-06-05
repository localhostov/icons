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

public val Icons.Bold.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.5f)
                lineTo(17.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 11.0f)
                lineTo(17.741f, 11.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 6.259f, 11.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(2.5f)
                curveTo(7.0f, 18.855f, 4.617f, 21.0f, 2.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 21.0f)
                curveTo(19.383f, 21.0f, 17.0f, 18.855f, 17.0f, 16.5f)
                close()
                moveTo(8.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 7.0f)
                close()
                moveTo(8.3f, 21.0f)
                arcTo(7.078f, 7.078f, 0.0f, false, false, 10.0f, 16.5f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.5f)
                arcTo(7.078f, 7.078f, 0.0f, false, false, 15.7f, 21.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
