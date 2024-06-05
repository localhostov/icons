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

public val Icons.Filled.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 3.0f)
                close()
                moveTo(21.721f, 21.0f)
                lineToRelative(-2.0f, -6.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.28f)
                lineToRelative(2.0f, 6.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(8.0f, 14.0f)
                verticalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.411f, 11.0f)
                horizontalLineTo(13.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
