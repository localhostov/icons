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

public val Icons.Outline.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 2.0f)
                lineTo(10.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(3.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 11.0f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                close()
                moveTo(6.8f, 5.374f)
                lineTo(0.0f, 6.692f)
                lineTo(0.0f, 4.615f)
                lineTo(6.046f, 3.452f)
                arcTo(3.953f, 3.953f, 0.0f, false, false, 6.8f, 5.374f)
                close()
                moveTo(24.0f, 0.0f)
                lineTo(24.0f, 2.037f)
                lineToRelative(-5.153f, 1.0f)
                arcTo(3.694f, 3.694f, 0.0f, false, false, 18.855f, 0.989f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
