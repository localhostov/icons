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

public val Icons.Bold.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.993f)
                lineToRelative(3.535f, -3.457f)
                curveToRelative(0.945f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.52f, -2.592f, -1.465f, -3.536f)
                curveToRelative(-0.945f, -0.944f, -2.201f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.592f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.945f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.52f, 2.592f, 1.475f, 3.545f)
                lineToRelative(3.525f, 3.448f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(21.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.327f, 1.104f, -0.924f, 2.115f, -1.762f, 2.951f)
                lineToRelative(-0.05f, 0.049f)
                horizontalLineToRelative(4.102f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.879f)
                lineToRelative(-3.561f, -3.561f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(4.439f, 4.439f)
                horizontalLineToRelative(3.121f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 19.999f)
                verticalLineToRelative(-3.121f)
                lineToRelative(-3.879f, -3.879f)
                lineTo(3.0f, 12.999f)
                verticalLineToRelative(-3.0f)
                lineTo(7.102f, 9.999f)
                lineToRelative(-0.025f, -0.025f)
                curveToRelative(-0.851f, -0.85f, -1.455f, -1.868f, -1.784f, -2.975f)
                lineTo(3.0f, 6.999f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 5.999f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(1.879f)
                lineToRelative(2.121f, 2.121f)
                verticalLineToRelative(1.879f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null
