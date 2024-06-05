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

public val Icons.Bold.Sink: ImageVector
    get() {
        if (_sink != null) {
            return _sink!!
        }
        _sink = Builder(name = "Sink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 4.75f)
                curveToRelative(0.0f, -0.965f, 0.785f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.785f, 1.75f, 1.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -2.619f, -2.131f, -4.75f, -4.75f, -4.75f)
                reflectiveCurveToRelative(-4.75f, 2.131f, -4.75f, 4.75f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 4.687f, 3.813f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.864f, 0.0f, -5.225f, -2.201f, -5.478f, -5.0f)
                horizontalLineToRelative(17.955f)
                curveToRelative(-0.253f, 2.799f, -2.613f, 5.0f, -5.478f, 5.0f)
                close()
            }
        }
        .build()
        return _sink!!
    }

private var _sink: ImageVector? = null
