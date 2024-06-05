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

public val Icons.Filled.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.509f, 8.001f)
                reflectiveCurveToRelative(-1.143f, 0.0f, -1.21f, 0.002f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-3.205f, 0.083f, -6.48f, 2.029f, -8.619f, 3.762f)
                curveToRelative(-0.677f, 0.549f, -1.685f, 0.079f, -1.685f, -0.793f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.298f, 0.123f, -0.583f, 0.35f, -0.777f)
                curveToRelative(0.577f, -0.494f, 1.239f, -0.92f, 1.955f, -1.396f)
                curveToRelative(0.033f, -0.228f, 0.068f, -0.455f, 0.106f, -0.682f)
                lineToRelative(0.466f, -2.765f)
                curveToRelative(2.208f, -0.572f, 3.903f, -2.506f, 4.127f, -4.834f)
                curveToRelative(0.027f, -0.286f, -0.226f, -0.535f, -0.513f, -0.518f)
                curveToRelative(-3.75f, 0.225f, -4.985f, 2.775f, -4.985f, 2.775f)
                curveTo(5.5f, 2.776f, 4.22f, 0.229f, 0.516f, 0.0f)
                curveTo(0.228f, -0.017f, -0.026f, 0.233f, 0.002f, 0.52f)
                curveToRelative(0.197f, 2.047f, 1.539f, 3.794f, 3.356f, 4.57f)
                lineToRelative(-0.504f, 0.756f)
                curveTo(0.993f, 8.638f, 0.0f, 11.918f, 0.0f, 15.273f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 4.82f, 3.907f, 8.727f, 8.727f, 8.727f)
                horizontalLineToRelative(10.273f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-2.499f)
                curveToRelative(0.0f, -4.683f, -3.81f, -8.496f, -8.491f, -8.5f)
                close()
                moveTo(15.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
