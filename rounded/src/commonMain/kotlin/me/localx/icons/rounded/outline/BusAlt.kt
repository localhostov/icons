package me.localx.icons.rounded.outline

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

public val Icons.Outline.BusAlt: ImageVector
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
                verticalLineTo(6.42f)
                arcToRelative(6.168f, 6.168f, 0.0f, false, false, -0.04f, -0.7f)
                arcTo(5.933f, 5.933f, 0.0f, false, false, 17.4f, 0.584f)
                arcToRelative(25.374f, 25.374f, 0.0f, false, false, -10.8f, 0.0f)
                arcTo(5.934f, 5.934f, 0.0f, false, false, 2.04f, 5.72f)
                arcToRelative(6.168f, 6.168f, 0.0f, false, false, -0.04f, 0.7f)
                verticalLineTo(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.95f, 0.5f)
                horizontalLineToRelative(6.1f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.0f, 21.5f)
                verticalLineTo(21.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 2.0f, -4.0f)
                verticalLineTo(15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(7.052f, 2.532f)
                arcToRelative(23.287f, 23.287f, 0.0f, false, true, 9.9f, 0.0f)
                arcTo(3.927f, 3.927f, 0.0f, false, true, 19.746f, 5.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                horizontalLineTo(4.254f)
                arcTo(3.927f, 3.927f, 0.0f, false, true, 7.052f, 2.532f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
