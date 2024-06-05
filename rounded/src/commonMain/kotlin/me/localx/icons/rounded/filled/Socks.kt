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

public val Icons.Filled.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.998f, 4.0f)
                curveToRelative(0.0f, -1.068f, 0.415f, -2.073f, 1.171f, -2.828f)
                reflectiveCurveToRelative(1.761f, -1.172f, 2.829f, -1.172f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.204f, 0.0f, 3.999f, 1.793f, 4.0f, 3.999f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-12.0f, 0.001f, -12.0f, 0.001f)
                close()
                moveTo(11.998f, 6.0f)
                verticalLineToRelative(3.724f)
                curveToRelative(0.001f, 0.251f, -0.091f, 0.491f, -0.26f, 0.675f)
                lineToRelative(-3.344f, 3.667f)
                curveToRelative(-2.109f, 2.636f, -1.796f, 6.469f, 0.696f, 8.544f)
                curveToRelative(1.077f, 0.896f, 2.439f, 1.39f, 3.837f, 1.39f)
                curveToRelative(1.835f, 0.0f, 3.544f, -0.821f, 4.663f, -2.222f)
                lineToRelative(4.212f, -4.861f)
                curveToRelative(1.418f, -1.637f, 2.198f, -3.731f, 2.197f, -5.897f)
                verticalLineToRelative(-5.021f)
                horizontalLineToRelative(-12.001f)
                close()
                moveTo(9.997f, 4.0f)
                curveToRelative(0.0f, -1.493f, 0.547f, -2.898f, 1.537f, -4.0f)
                horizontalLineToRelative(-2.533f)
                curveToRelative(-1.068f, 0.0f, -2.073f, 0.416f, -2.829f, 1.172f)
                reflectiveCurveToRelative(-1.171f, 1.76f, -1.171f, 2.828f)
                horizontalLineToRelative(4.996f)
                close()
                moveTo(6.832f, 12.816f)
                lineToRelative(3.167f, -3.479f)
                lineToRelative(-0.002f, -3.337f)
                horizontalLineToRelative(-4.996f)
                verticalLineToRelative(3.724f)
                curveToRelative(0.001f, 0.251f, -0.091f, 0.491f, -0.26f, 0.675f)
                lineToRelative(-3.344f, 3.667f)
                curveToRelative(-2.109f, 2.636f, -1.796f, 6.469f, 0.696f, 8.544f)
                curveToRelative(1.077f, 0.896f, 2.439f, 1.39f, 3.837f, 1.39f)
                curveToRelative(0.517f, 0.0f, 1.021f, -0.072f, 1.508f, -0.197f)
                curveToRelative(-2.974f, -2.828f, -3.281f, -7.644f, -0.606f, -10.987f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
