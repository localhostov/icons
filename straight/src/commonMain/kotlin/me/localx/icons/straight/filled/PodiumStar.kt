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

public val Icons.Filled.PodiumStar: ImageVector
    get() {
        if (_podiumStar != null) {
            return _podiumStar!!
        }
        _podiumStar = Builder(name = "PodiumStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.184f)
                curveToRelative(0.414f, 1.161f, 1.514f, 2.0f, 2.816f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.153f, 12.0f)
                lineToRelative(2.0f, 12.0f)
                horizontalLineToRelative(15.694f)
                lineToRelative(2.0f, -12.0f)
                horizontalLineToRelative(2.153f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 10.0f)
                close()
                moveTo(15.999f, 16.611f)
                lineToRelative(-2.197f, 1.273f)
                lineToRelative(0.884f, 2.686f)
                lineToRelative(-0.504f, 0.349f)
                lineToRelative(-2.173f, -1.68f)
                lineToRelative(-2.183f, 1.687f)
                lineToRelative(-0.48f, -0.362f)
                lineToRelative(0.869f, -2.717f)
                lineToRelative(-2.212f, -1.231f)
                verticalLineToRelative(-0.615f)
                horizontalLineToRelative(2.899f)
                lineToRelative(0.784f, -3.0f)
                horizontalLineToRelative(0.648f)
                lineToRelative(0.784f, 3.0f)
                horizontalLineToRelative(2.883f)
                verticalLineToRelative(0.611f)
                close()
            }
        }
        .build()
        return _podiumStar!!
    }

private var _podiumStar: ImageVector? = null
