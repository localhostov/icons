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
                horizontalLineToRelative(1.4f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, true, 4.57f, 2.97f)
                lineTo(23.205f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(6.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(20.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-0.727f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.884f, 12.0f)
                close()
                moveTo(7.942f, 20.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
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
