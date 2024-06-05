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

public val Icons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(17.693f)
                lineTo(13.446f, 1.563f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.812f, 0.0f)
                horizontalLineTo(7.13f)
                lineToRelative(2.9f, 10.0f)
                horizontalLineTo(6.4f)
                lineToRelative(-2.3f, -2.295f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 0.327f, 8.2f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, -0.008f, 2.4f)
                lineTo(3.407f, 16.0f)
                horizontalLineToRelative(6.612f)
                lineToRelative(-3.0f, 8.0f)
                horizontalLineToRelative(3.793f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 2.605f, -1.513f)
                lineTo(17.464f, 16.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 10.0f)
                close()
                moveTo(9.792f, 2.0f)
                horizontalLineToRelative(1.02f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, 0.863f, 0.491f)
                lineTo(15.455f, 10.0f)
                horizontalLineTo(12.11f)
                close()
                moveTo(22.0f, 14.0f)
                horizontalLineTo(16.354f)
                lineTo(11.69f, 21.479f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.878f, 0.521f)
                horizontalLineTo(9.9f)
                lineToRelative(3.0f, -8.0f)
                horizontalLineTo(4.567f)
                lineTo(2.055f, 9.6f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 2.406f, 9.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.285f, 0.118f)
                lineTo(5.573f, 12.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
