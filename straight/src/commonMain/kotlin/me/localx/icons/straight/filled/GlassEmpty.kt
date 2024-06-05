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

public val Icons.Filled.GlassEmpty: ImageVector
    get() {
        if (_glassEmpty != null) {
            return _glassEmpty!!
        }
        _glassEmpty = Builder(name = "GlassEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.027f, 24.0f)
                horizontalLineTo(5.848f)
                curveToRelative(-1.549f, 0.0f, -2.863f, -1.209f, -2.99f, -2.754f)
                lineTo(1.111f, 0.0f)
                horizontalLineToRelative(21.773f)
                lineToRelative(-1.869f, 21.263f)
                curveToRelative(-0.136f, 1.56f, -1.42f, 2.737f, -2.988f, 2.737f)
                close()
            }
        }
        .build()
        return _glassEmpty!!
    }

private var _glassEmpty: ImageVector? = null
