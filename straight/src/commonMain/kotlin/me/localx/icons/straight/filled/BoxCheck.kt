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

public val Icons.Filled.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(1.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                close()
                moveTo(11.909f, 20.419f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.581f, -1.407f, 0.581f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.586f)
                lineToRelative(-2.974f, -2.888f)
                lineToRelative(1.394f, -1.436f)
                lineToRelative(2.984f, 2.898f)
                lineToRelative(5.808f, -5.701f)
                lineToRelative(1.404f, 1.424f)
                lineToRelative(-5.793f, 5.707f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
