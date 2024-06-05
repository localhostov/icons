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

public val Icons.Filled.BusAlt: ImageVector
    get() {
        if (_busAlt != null) {
            return _busAlt!!
        }
        _busAlt = Builder(name = "BusAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -2.0f, 3.975f)
                verticalLineTo(21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.949f, 0.5f)
                horizontalLineToRelative(-6.1f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 21.5f)
                verticalLineToRelative(-0.525f)
                arcTo(4.98f, 4.98f, 0.0f, false, true, 2.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(5.479f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 17.4f, 0.584f)
                arcToRelative(25.374f, 25.374f, 0.0f, false, false, -10.8f, 0.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 2.521f, 4.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 3.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineTo(6.42f)
                curveToRelative(0.0f, -0.143f, -0.026f, -0.279f, -0.035f, -0.42f)
                horizontalLineTo(2.035f)
                curveTo(2.026f, 6.141f, 2.0f, 6.277f, 2.0f, 6.42f)
                verticalLineTo(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
