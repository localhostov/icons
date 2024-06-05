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

public val Icons.Filled.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.067f, 19.006f)
                lineToRelative(8.837f, 3.048f)
                lineToRelative(-0.652f, 1.891f)
                lineToRelative(-11.251f, -3.881f)
                lineTo(0.749f, 23.945f)
                lineToRelative(-0.652f, -1.891f)
                lineToRelative(8.837f, -3.048f)
                lineTo(0.097f, 15.958f)
                lineToRelative(0.652f, -1.891f)
                lineToRelative(11.251f, 3.881f)
                lineToRelative(11.251f, -3.881f)
                lineToRelative(0.652f, 1.891f)
                lineToRelative(-8.837f, 3.048f)
                close()
                moveTo(5.0f, 9.0f)
                curveToRelative(0.0f, -2.013f, 1.167f, -3.57f, 2.328f, -4.768f)
                curveToRelative(0.0f, 0.0f, 0.773f, 2.687f, 1.48f, 2.687f)
                curveToRelative(2.004f, 0.0f, 1.068f, -4.466f, 3.192f, -6.919f)
                curveToRelative(2.211f, 2.211f, 7.0f, 4.947f, 7.0f, 9.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.134f, -7.0f, -7.0f)
                close()
                moveTo(10.585f, 13.414f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                reflectiveCurveToRelative(0.781f, -2.048f, 0.0f, -2.829f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
