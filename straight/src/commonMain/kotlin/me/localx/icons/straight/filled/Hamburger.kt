package me.localx.icons.straight.filled

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

public val Icons.Filled.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.094f, 12.006f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                horizontalLineTo(16.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -6.556f, 2.45f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, true, -2.888f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 1.69f, 16.15f)
                arcTo(2.067f, 2.067f, 0.0f, false, true, 0.0f, 14.1f)
                arcTo(2.094f, 2.094f, 0.0f, false, true, 2.094f, 12.006f)
                close()
                moveTo(1.0f, 10.174f)
                verticalLineTo(9.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, -9.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(1.148f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, -1.0f, -0.142f)
                horizontalLineTo(2.094f)
                arcTo(4.033f, 4.033f, 0.0f, false, false, 1.0f, 10.174f)
                close()
                moveTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 4.0f)
                close()
                moveTo(4.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 7.0f)
                close()
                moveTo(22.0f, 18.006f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.246f, 1.96f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, true, -5.508f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.894f, -1.844f)
                curveToRelative(-0.122f, -0.021f, -0.235f, -0.063f, -0.352f, -0.094f)
                verticalLineTo(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(17.864f)
                arcTo(3.939f, 3.939f, 0.0f, false, true, 22.0f, 18.006f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
