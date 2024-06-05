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

public val Icons.Filled.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.63f, 3.845f)
                arcTo(2.024f, 2.024f, 0.0f, false, false, 21.988f, 3.0f)
                horizontalLineTo(18.463f)
                curveTo(18.971f, 2.152f, 19.539f, 0.1f, 18.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(-1.54f, 0.105f, -0.97f, 2.151f, -0.463f, 3.0f)
                horizontalLineTo(2.013f)
                arcTo(2.007f, 2.007f, 0.0f, false, false, 0.106f, 5.615f)
                arcTo(6.6f, 6.6f, 0.0f, false, false, 1.594f, 8.0f)
                curveTo(2.119f, 7.491f, 3.281f, 6.4f, 4.7f, 5.228f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.972f, 6.772f)
                curveToRelative(-0.518f, 0.426f, -1.0f, 0.846f, -1.434f, 1.228f)
                horizontalLineTo(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(13.0f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, false, -0.184f, -1.034f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.781f, -1.781f)
                horizontalLineToRelative(0.0f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 6.0f, 10.0f)
                horizontalLineTo(3.221f)
                lineTo(6.0f, 21.135f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -2.865f)
                lineTo(20.78f, 10.0f)
                horizontalLineTo(18.0f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, false, -1.034f, 0.184f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.781f, 1.781f)
                horizontalLineToRelative(0.0f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 15.0f, 13.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(13.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(1.463f)
                curveToRelative(-0.43f, -0.382f, -0.916f, -0.8f, -1.434f, -1.228f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.3f, 5.228f)
                curveTo(20.72f, 6.4f, 21.882f, 7.491f, 22.407f, 8.0f)
                arcTo(6.615f, 6.615f, 0.0f, false, false, 23.9f, 5.615f)
                arcTo(1.937f, 1.937f, 0.0f, false, false, 23.63f, 3.845f)
                close()
                moveTo(15.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
