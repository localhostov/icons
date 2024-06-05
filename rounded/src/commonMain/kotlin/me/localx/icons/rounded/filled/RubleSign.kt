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

public val Icons.Filled.RubleSign: ImageVector
    get() {
        if (_rubleSign != null) {
            return _rubleSign!!
        }
        _rubleSign = Builder(name = "RubleSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                curveToRelative(9.929f, -0.353f, 9.922f, -14.65f, 0.0f, -15.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(15.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(7.27f, 0.232f, 7.265f, 10.77f, 0.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _rubleSign!!
    }

private var _rubleSign: ImageVector? = null
