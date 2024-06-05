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

public val Icons.Bold.Investment: ImageVector
    get() {
        if (_investment != null) {
            return _investment!!
        }
        _investment = Builder(name = "Investment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 6.76f)
                curveToRelative(0.0f, -2.18f, 1.747f, -4.273f, 3.701f, -4.741f)
                curveToRelative(-0.558f, -0.509f, -1.201f, -1.256f, -1.201f, -2.02f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.764f, -0.644f, 1.51f, -1.201f, 2.02f)
                curveToRelative(1.954f, 0.468f, 3.701f, 2.561f, 3.701f, 4.741f)
                curveToRelative(0.0f, 1.237f, -1.007f, 2.24f, -2.25f, 2.24f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.243f, 0.0f, -2.25f, -1.003f, -2.25f, -2.24f)
                close()
                moveTo(23.016f, 14.467f)
                lineToRelative(-8.335f, 9.532f)
                lineTo(3.5f, 23.999f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.858f)
                curveToRelative(0.942f, 0.0f, 1.802f, 0.36f, 2.449f, 0.949f)
                lineToRelative(2.438f, -2.679f)
                curveToRelative(0.698f, -0.768f, 1.654f, -1.217f, 2.69f, -1.265f)
                curveToRelative(1.033f, -0.047f, 2.029f, 0.309f, 2.797f, 1.008f)
                curveToRelative(1.565f, 1.427f, 1.692f, 3.874f, 0.283f, 5.455f)
                close()
                moveTo(20.712f, 11.229f)
                curveToRelative(-0.173f, -0.158f, -0.405f, -0.239f, -0.636f, -0.229f)
                curveToRelative(-0.236f, 0.011f, -0.453f, 0.113f, -0.612f, 0.288f)
                lineToRelative(-3.497f, 3.843f)
                curveToRelative(-0.218f, 1.586f, -1.476f, 2.885f, -3.095f, 3.116f)
                lineToRelative(-5.16f, 0.737f)
                lineToRelative(-0.424f, -2.971f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.314f, -0.044f, 0.551f, -0.317f, 0.551f, -0.635f)
                curveToRelative(0.0f, -0.354f, -0.288f, -0.643f, -0.642f, -0.643f)
                lineTo(3.5f, 13.998f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9.819f)
                lineToRelative(7.447f, -8.518f)
                curveToRelative(0.33f, -0.371f, 0.302f, -0.928f, -0.055f, -1.252f)
                close()
                moveTo(16.0f, 7.689f)
                curveToRelative(0.831f, -0.817f, 1.866f, -1.359f, 3.0f, -1.577f)
                verticalLineToRelative(-2.093f)
                horizontalLineToRelative(2.484f)
                lineToRelative(-3.157f, -3.65f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineToRelative(-3.183f, 3.65f)
                horizontalLineToRelative(2.516f)
                verticalLineToRelative(3.669f)
                close()
            }
        }
        .build()
        return _investment!!
    }

private var _investment: ImageVector? = null
