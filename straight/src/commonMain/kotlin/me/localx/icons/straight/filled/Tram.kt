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

public val Icons.Filled.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 2.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.046f, 3.452f)
                lineTo(0.0f, 4.615f)
                verticalLineTo(6.692f)
                lineTo(6.8f, 5.374f)
                arcTo(3.953f, 3.953f, 0.0f, false, true, 6.046f, 3.452f)
                close()
                moveTo(18.855f, 0.989f)
                arcToRelative(3.694f, 3.694f, 0.0f, false, true, -0.008f, 2.048f)
                lineToRelative(5.153f, -1.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
