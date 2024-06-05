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

public val Icons.Filled.ShuttleVan: ImageVector
    get() {
        if (_shuttleVan != null) {
            return _shuttleVan!!
        }
        _shuttleVan = Builder(name = "ShuttleVan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                horizontalLineToRelative(2.7f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.742f, 1.781f)
                lineTo(23.206f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(6.0f)
                lineTo(24.0f, 18.0f)
                lineTo(24.0f, 12.849f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 23.912f, 12.0f)
                close()
                moveTo(3.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(20.942f, 20.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
