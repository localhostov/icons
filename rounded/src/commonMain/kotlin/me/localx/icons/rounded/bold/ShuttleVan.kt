package me.localx.icons.rounded.bold

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
                moveTo(23.354f, 10.727f)
                lineToRelative(-2.427f, -5.46f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 15.9f, 2.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 7.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, false, 3.0f, 4.243f)
                verticalLineTo(20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.757f)
                arcTo(4.508f, 4.508f, 0.0f, false, false, 24.0f, 15.5f)
                verticalLineTo(13.773f)
                arcTo(7.454f, 7.454f, 0.0f, false, false, 23.354f, 10.727f)
                close()
                moveTo(18.185f, 6.485f)
                lineTo(19.747f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(0.9f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.185f, 6.485f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.5f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 5.0f)
                close()
                moveTo(21.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 15.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.933f)
                arcToRelative(4.524f, 4.524f, 0.0f, false, true, 0.067f, 0.773f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
