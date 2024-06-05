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

public val Icons.Bold.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.772f, 19.95f)
                lineToRelative(-2.772f, -2.95f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.655f, 0.0f, -1.734f, -2.028f, -2.314f, -3.118f)
                curveToRelative(-1.062f, -1.996f, -2.066f, -3.882f, -3.936f, -3.882f)
                reflectiveCurveToRelative(-2.873f, 1.886f, -3.936f, 3.882f)
                curveToRelative(-0.58f, 1.09f, -1.719f, 3.118f, -2.374f, 3.118f)
                curveToRelative(0.506f, -1.348f, 0.943f, -3.09f, 1.45f, -5.125f)
                curveToRelative(0.531f, -2.133f, 1.383f, -5.546f, 2.125f, -6.651f)
                curveToRelative(0.401f, 0.556f, 0.849f, 1.717f, 1.274f, 3.012f)
                curveToRelative(0.443f, -0.149f, 0.926f, -0.236f, 1.46f, -0.236f)
                curveToRelative(0.642f, 0.0f, 1.211f, 0.125f, 1.724f, 0.335f)
                curveToRelative(-1.125f, -3.701f, -2.286f, -6.335f, -4.474f, -6.335f)
                curveToRelative(-2.74f, 0.0f, -3.747f, 4.038f, -5.021f, 9.149f)
                curveToRelative(-0.407f, 1.633f, -0.971f, 3.895f, -1.479f, 5.151f)
                lineTo(4.999f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.05f, 0.228f)
                curveToRelative(-0.304f, -0.304f, -0.796f, -0.304f, -1.1f, 0.0f)
                lineTo(0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.772f, -2.95f)
                curveToRelative(0.304f, -0.304f, 0.304f, -0.796f, 0.0f, -1.1f)
                close()
                moveTo(12.011f, 19.0f)
                curveToRelative(0.338f, -0.558f, 0.65f, -1.142f, 0.952f, -1.708f)
                curveToRelative(0.353f, -0.662f, 0.903f, -1.697f, 1.287f, -2.145f)
                curveToRelative(0.384f, 0.448f, 0.935f, 1.483f, 1.287f, 2.145f)
                curveToRelative(0.301f, 0.566f, 0.613f, 1.151f, 0.952f, 1.708f)
                horizontalLineToRelative(-4.477f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
