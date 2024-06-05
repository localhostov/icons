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

public val Icons.Outline.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(18.414f, 24.0f)
                lineTo(24.0f, 18.414f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(18.0f, 21.586f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(3.586f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(12.75f, 5.0f)
                horizontalLineToRelative(3.263f)
                lineTo(16.013f, 6.25f)
                lineTo(14.0f, 6.25f)
                lineTo(14.0f, 7.388f)
                horizontalLineToRelative(1.864f)
                verticalLineToRelative(1.25f)
                lineTo(14.0f, 8.638f)
                verticalLineToRelative(2.387f)
                lineTo(12.75f, 11.025f)
                close()
                moveTo(5.25f, 7.0f)
                lineTo(5.25f, 9.068f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 6.0f, 9.819f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, false, 0.75f, -0.735f)
                lineTo(6.75f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 9.084f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.984f)
                lineTo(6.0f, 11.068f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 4.0f, 9.084f)
                verticalLineToRelative(-2.1f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 6.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 8.0f, 7.0f)
                lineTo(6.75f, 7.0f)
                arcTo(0.772f, 0.772f, 0.0f, false, false, 6.0f, 6.25f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 5.251f, 7.0f)
                close()
                moveTo(9.75f, 5.0f)
                lineTo(11.0f, 5.0f)
                verticalLineToRelative(6.069f)
                lineTo(9.75f, 11.069f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
