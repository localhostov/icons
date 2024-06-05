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

public val Icons.Bold.Banjo: ImageVector
    get() {
        if (_banjo != null) {
            return _banjo!!
        }
        _banjo = Builder(name = "Banjo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.56f, 6.985f)
                lineToRelative(3.44f, -3.425f)
                lineToRelative(-3.56f, -3.56f)
                lineToRelative(-3.44f, 3.425f)
                verticalLineToRelative(1.454f)
                lineToRelative(-4.506f, 4.506f)
                curveToRelative(-1.282f, -0.874f, -2.829f, -1.385f, -4.494f, -1.385f)
                curveTo(3.589f, 8.0f, 0.0f, 11.589f, 0.0f, 16.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.665f, -0.511f, -3.212f, -1.385f, -4.494f)
                lineToRelative(4.521f, -4.521f)
                horizontalLineToRelative(1.424f)
                close()
                moveTo(8.0f, 21.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(6.061f, 13.939f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _banjo!!
    }

private var _banjo: ImageVector? = null
