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

public val Icons.Filled.AirplaneWindowOpen: ImageVector
    get() {
        if (_airplaneWindowOpen != null) {
            return _airplaneWindowOpen!!
        }
        _airplaneWindowOpen = Builder(name = "AirplaneWindowOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.525f, 6.0f)
                curveTo(4.765f, 2.51f, 8.091f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(7.235f, 2.51f, 8.475f, 6.0f)
                lineTo(3.525f, 6.0f)
                close()
                moveTo(15.789f, 15.03f)
                lineToRelative(-0.759f, -0.147f)
                lineToRelative(-0.048f, -0.771f)
                curveToRelative(-0.074f, -1.184f, -1.054f, -2.111f, -2.231f, -2.111f)
                curveToRelative(-1.241f, 0.0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0.0f, 0.246f, 0.048f, 0.497f, 0.146f, 0.767f)
                lineToRelative(0.458f, 1.253f)
                lineToRelative(-1.332f, 0.088f)
                curveToRelative(-0.433f, 0.028f, -0.772f, 0.387f, -0.772f, 0.816f)
                curveToRelative(0.0f, 0.455f, 0.371f, 0.826f, 0.826f, 0.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.715f, -0.509f, -1.333f, -1.211f, -1.47f)
                close()
                moveTo(20.941f, 8.0f)
                curveToRelative(0.037f, 0.329f, 0.059f, 0.662f, 0.059f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.338f, 0.022f, -0.671f, 0.059f, -1.0f)
                lineTo(20.941f, 8.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveToRelative(0.0f, -1.42f, -0.86f, -2.677f, -2.125f, -3.217f)
                curveToRelative(-0.44f, -1.889f, -2.133f, -3.283f, -4.125f, -3.283f)
                curveToRelative(-2.343f, 0.0f, -4.25f, 1.906f, -4.25f, 4.25f)
                curveToRelative(0.0f, 0.141f, 0.008f, 0.282f, 0.023f, 0.424f)
                curveToRelative(-0.907f, 0.474f, -1.523f, 1.422f, -1.523f, 2.5f)
                curveToRelative(0.0f, 1.559f, 1.268f, 2.826f, 2.826f, 2.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _airplaneWindowOpen!!
    }

private var _airplaneWindowOpen: ImageVector? = null
