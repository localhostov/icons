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

public val Icons.Outline.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-3.4f, 3.4f)
                arcToRelative(6.946f, 6.946f, 0.0f, false, false, -3.253f, -1.333f)
                arcTo(6.946f, 6.946f, 0.0f, false, false, 12.6f, 6.816f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-3.4f, 3.4f)
                arcTo(6.993f, 6.993f, 0.0f, true, false, 6.069f, 17.931f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 18.6f, 12.816f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 6.0f)
                close()
                moveTo(2.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 2.0f, 11.0f)
                close()
                moveTo(13.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.908f, -4.094f)
                arcToRelative(7.005f, 7.005f, 0.0f, false, false, 5.814f, -5.814f)
                arcTo(4.995f, 4.995f, 0.0f, false, true, 13.0f, 22.0f)
                close()
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null
