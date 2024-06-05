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

public val Icons.Filled.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.829f, 6.829f)
                lineToRelative(2.287f, 2.236f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 1.083f, 0.0f)
                lineToRelative(2.3f, -2.244f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 13.992f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.992f)
                close()
                moveTo(21.8f, 5.579f)
                lineTo(14.8f, 0.855f)
                arcTo(4.979f, 4.979f, 0.0f, false, false, 9.2f, 0.855f)
                lineToRelative(-7.0f, 4.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 9.724f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.8f, 5.579f)
                close()
                moveTo(16.243f, 17.243f)
                lineTo(13.94f, 19.5f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, true, -3.88f, 0.0f)
                lineToRelative(-2.3f, -2.245f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.478f, -8.493f)
                horizontalLineToRelative(0.0f)
                arcTo(6.008f, 6.008f, 0.0f, false, true, 16.243f, 17.243f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
