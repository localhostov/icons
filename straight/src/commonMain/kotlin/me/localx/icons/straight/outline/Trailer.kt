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

public val Icons.Outline.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(4.127f, 21.0f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, 7.746f, 0.0f)
                lineTo(24.0f, 21.0f)
                close()
                moveTo(3.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(14.0f, 12.0f)
                lineTo(14.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                close()
                moveTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 22.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, -3.873f, 3.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(5.0f)
                lineTo(11.873f, 19.0f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
