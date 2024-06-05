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

public val Icons.Bold.ShuttleVan: ImageVector
    get() {
        if (_shuttleVan != null) {
            return _shuttleVan!!
        }
        _shuttleVan = Builder(name = "ShuttleVan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.349f)
                arcToRelative(5.455f, 5.455f, 0.0f, false, false, -0.474f, -2.234f)
                lineTo(20.4f, 4.078f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.2f, 2.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(17.657f, 5.3f)
                lineToRelative(2.09f, 4.7f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.2f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.657f, 5.3f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.5f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 5.0f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.975f)
                arcToRelative(2.526f, 2.526f, 0.0f, false, true, 0.025f, 0.349f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
