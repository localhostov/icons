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

public val Icons.Filled.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                lineTo(0.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(7.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineTo(14.0f, 12.0f)
                lineTo(14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                verticalLineToRelative(7.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 24.0f)
                close()
                moveTo(23.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 3.017f, 4.589f)
                curveTo(3.655f, 14.3f, 12.868f, 14.651f, 13.0f, 21.0f)
                lineTo(23.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
