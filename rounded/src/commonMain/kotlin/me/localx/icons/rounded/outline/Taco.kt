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

public val Icons.Outline.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 15.0f)
                close()
                moveTo(15.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 17.0f)
                close()
                moveTo(18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                close()
                moveTo(22.988f, 10.268f)
                curveToRelative(1.257f, 2.14f, 1.0f, 5.337f, 1.012f, 7.732f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(3.5f, 23.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 19.5f)
                curveToRelative(0.026f, -3.511f, -0.523f, -8.3f, 2.063f, -11.123f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.626f, 9.624f)
                arcTo(7.486f, 7.486f, 0.0f, false, false, 2.0f, 14.274f)
                lineTo(2.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                curveToRelative(0.05f, -2.675f, -0.358f, -6.812f, 1.044f, -9.169f)
                curveTo(4.647f, 7.907f, 4.177f, 3.9f, 8.257f, 3.063f)
                arcToRelative(3.315f, 3.315f, 0.0f, false, true, 3.8f, -1.947f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 4.918f, -0.011f)
                arcToRelative(3.308f, 3.308f, 0.0f, false, true, 3.768f, 1.958f)
                curveTo(24.76f, 3.891f, 24.387f, 7.8f, 22.988f, 10.268f)
                close()
                moveTo(7.356f, 8.351f)
                arcToRelative(9.461f, 9.461f, 0.0f, false, true, 14.316f, -0.08f)
                curveTo(22.353f, 6.658f, 21.983f, 5.073f, 20.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.98f, -0.8f)
                arcTo(1.464f, 1.464f, 0.0f, false, false, 17.688f, 3.0f)
                arcToRelative(1.739f, 1.739f, 0.0f, false, false, -0.583f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.241f, -0.317f)
                curveToRelative(-0.981f, -1.261f, -1.815f, -1.153f, -2.7f, 0.025f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.242f, 0.317f)
                arcTo(2.031f, 2.031f, 0.0f, false, false, 11.337f, 3.0f)
                arcTo(1.493f, 1.493f, 0.0f, false, false, 9.98f, 4.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 5.0f)
                curveTo(6.968f, 5.073f, 6.652f, 6.729f, 7.356f, 8.351f)
                close()
                moveTo(22.0f, 14.5f)
                curveTo(21.623f, 4.461f, 7.23f, 4.612f, 7.0f, 14.791f)
                curveToRelative(-0.088f, 1.112f, 0.267f, 5.25f, -0.338f, 6.209f)
                lineTo(19.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
