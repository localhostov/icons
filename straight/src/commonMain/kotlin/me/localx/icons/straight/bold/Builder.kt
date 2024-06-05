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

public val Icons.Bold.Builder: ImageVector
    get() {
        if (_builder != null) {
            return _builder!!
        }
        _builder = Builder(name = "Builder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 8.984f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(3.252f, 0.0f, 6.0f, -2.748f, 6.0f, -6.0f)
                verticalLineToRelative(-0.984f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.846f, -1.012f, -3.44f, -2.5f, -4.306f)
                verticalLineToRelative(3.306f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.5f, 0.05f)
                curveToRelative(-0.167f, -0.017f, -0.329f, -0.05f, -0.5f, -0.05f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.171f, 0.0f, -0.333f, 0.034f, -0.5f, 0.05f)
                verticalLineToRelative(3.95f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.5f, 0.694f)
                curveToRelative(-1.488f, 0.866f, -2.5f, 2.46f, -2.5f, 4.306f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.984f)
                close()
                moveTo(12.0f, 8.984f)
                curveToRelative(0.0f, 1.626f, -1.374f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.984f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.984f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _builder!!
    }

private var _builder: ImageVector? = null
