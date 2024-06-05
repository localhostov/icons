package me.localx.icons.rounded.outline

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

public val Icons.Outline.ShuttleVan: ImageVector
    get() {
        if (_shuttleVan != null) {
            return _shuttleVan!!
        }
        _shuttleVan = Builder(name = "ShuttleVan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.4f, 10.43f)
                lineTo(20.97f, 4.97f)
                arcTo(5.005f, 5.005f, 0.0f, false, false, 16.4f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, 3.0f, 3.873f)
                verticalLineTo(19.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineToRelative(-0.627f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 24.0f, 15.0f)
                verticalLineTo(13.273f)
                arcTo(6.936f, 6.936f, 0.0f, false, false, 23.4f, 10.43f)
                close()
                moveTo(19.142f, 5.782f)
                lineTo(21.017f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.142f, 5.782f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 4.0f)
                close()
                moveTo(8.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(17.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 21.0f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.836f)
                arcTo(4.977f, 4.977f, 0.0f, false, true, 22.0f, 13.273f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
