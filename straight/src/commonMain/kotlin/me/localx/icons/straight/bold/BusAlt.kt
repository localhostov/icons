package me.localx.icons.straight.bold

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
                verticalLineTo(4.583f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.055f, -3.135f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(20.208f, 20.208f, 0.0f, false, false, 4.054f, 1.448f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 2.0f, 4.583f)
                verticalLineTo(10.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 12.012f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.012f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineTo(15.012f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 15.5f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 15.5f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
