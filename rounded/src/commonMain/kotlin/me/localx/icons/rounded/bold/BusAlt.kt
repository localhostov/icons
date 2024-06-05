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

public val Icons.Bold.BusAlt: ImageVector
    get() {
        if (_busAlt != null) {
            return _busAlt!!
        }
        _busAlt = Builder(name = "BusAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 5.936f)
                arcTo(5.38f, 5.38f, 0.0f, false, false, 18.087f, 0.792f)
                arcToRelative(23.809f, 23.809f, 0.0f, false, false, -12.174f, 0.0f)
                arcTo(5.381f, 5.381f, 0.0f, false, false, 2.0f, 5.936f)
                lineTo(2.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, false, 2.0f, 4.24f)
                lineTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(20.0f, 20.739f)
                arcTo(5.489f, 5.489f, 0.0f, false, false, 22.0f, 16.5f)
                lineTo(22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 6.0f)
                lineTo(8.5f, 6.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(19.0f, 6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(7.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 16.5f)
                lineTo(5.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(10.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 19.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
