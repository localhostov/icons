package me.localx.icons.rounded.bold

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

public val Icons.Bold.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 22.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(0.424f, 14.884f)
                curveToRelative(-0.281f, -0.556f, -0.424f, -1.145f, -0.424f, -1.753f)
                curveToRelative(0.0f, -0.815f, 0.261f, -1.602f, 0.754f, -2.274f)
                lineTo(8.931f, 1.519f)
                curveToRelative(0.737f, -0.966f, 1.852f, -1.519f, 3.069f, -1.519f)
                reflectiveCurveToRelative(2.333f, 0.552f, 3.069f, 1.519f)
                lineToRelative(8.178f, 9.339f)
                curveToRelative(0.864f, 1.181f, 0.99f, 2.724f, 0.329f, 4.027f)
                curveToRelative(-0.661f, 1.305f, -1.98f, 2.116f, -3.443f, 2.116f)
                lineTo(3.868f, 17.001f)
                curveToRelative(-1.463f, 0.0f, -2.782f, -0.811f, -3.444f, -2.116f)
                close()
                moveTo(3.0f, 13.131f)
                curveToRelative(0.0f, 0.132f, 0.034f, 0.266f, 0.1f, 0.397f)
                curveToRelative(0.154f, 0.304f, 0.427f, 0.472f, 0.768f, 0.472f)
                horizontalLineToRelative(16.265f)
                curveToRelative(0.341f, 0.0f, 0.613f, -0.167f, 0.767f, -0.472f)
                curveToRelative(0.146f, -0.289f, 0.13f, -0.591f, -0.044f, -0.857f)
                lineTo(12.695f, 3.353f)
                curveToRelative(-0.335f, -0.454f, -1.056f, -0.454f, -1.391f, 0.0f)
                lineTo(3.145f, 12.672f)
                curveToRelative(-0.096f, 0.146f, -0.145f, 0.3f, -0.145f, 0.459f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
