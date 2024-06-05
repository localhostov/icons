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
                moveTo(24.0f, 12.849f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, -0.431f, -2.031f)
                lineTo(20.442f, 3.781f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.7f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(9.0f, 19.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(22.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.614f, 4.594f)
                lineTo(21.017f, 10.0f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(3.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.614f, 4.594f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 4.0f)
                close()
                moveTo(7.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(4.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                close()
                moveTo(20.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 12.0f)
                lineTo(21.877f, 12.0f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 0.123f, 0.849f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
