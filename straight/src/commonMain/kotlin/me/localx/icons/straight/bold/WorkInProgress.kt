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

public val Icons.Bold.WorkInProgress: ImageVector
    get() {
        if (_workInProgress != null) {
            return _workInProgress!!
        }
        _workInProgress = Builder(name = "WorkInProgress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 10.5f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                close()
                moveTo(22.956f, 14.521f)
                lineToRelative(-8.436f, 8.436f)
                curveToRelative(-0.695f, 0.695f, -1.607f, 1.042f, -2.521f, 1.042f)
                reflectiveCurveToRelative(-1.825f, -0.347f, -2.521f, -1.042f)
                lineTo(1.044f, 14.521f)
                curveToRelative(-1.39f, -1.39f, -1.39f, -3.651f, 0.0f, -5.041f)
                lineTo(9.479f, 1.043f)
                curveToRelative(1.391f, -1.389f, 3.65f, -1.389f, 5.041f, 0.0f)
                lineToRelative(8.436f, 8.436f)
                curveToRelative(1.39f, 1.39f, 1.39f, 3.651f, 0.0f, 5.041f)
                close()
                moveTo(7.769f, 12.8f)
                lineToRelative(1.164f, 2.56f)
                curveToRelative(0.181f, 0.398f, 0.499f, 0.64f, 0.841f, 0.64f)
                curveToRelative(0.516f, 0.0f, 0.945f, -0.295f, 0.988f, -1.0f)
                lineToRelative(0.508f, -7.0f)
                horizontalLineToRelative(-1.604f)
                lineToRelative(-0.319f, 4.402f)
                lineToRelative(-1.577f, -3.469f)
                lineToRelative(-1.577f, 3.468f)
                lineToRelative(-0.319f, -4.402f)
                horizontalLineToRelative(-1.604f)
                lineToRelative(0.508f, 7.0f)
                curveToRelative(0.043f, 0.705f, 0.472f, 1.0f, 0.988f, 1.0f)
                curveToRelative(0.342f, 0.0f, 0.66f, -0.242f, 0.841f, -0.64f)
                lineToRelative(1.164f, -2.56f)
                close()
                moveTo(15.234f, 18.0f)
                horizontalLineToRelative(-6.468f)
                lineToRelative(2.835f, 2.835f)
                curveToRelative(0.221f, 0.22f, 0.578f, 0.22f, 0.799f, 0.0f)
                lineToRelative(2.835f, -2.834f)
                close()
                moveTo(14.1f, 16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(15.234f, 6.0f)
                lineToRelative(-2.835f, -2.835f)
                curveToRelative(-0.221f, -0.22f, -0.578f, -0.22f, -0.799f, 0.0f)
                lineToRelative(-2.835f, 2.834f)
                horizontalLineToRelative(6.468f)
                close()
                moveTo(20.099f, 10.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _workInProgress!!
    }

private var _workInProgress: ImageVector? = null
