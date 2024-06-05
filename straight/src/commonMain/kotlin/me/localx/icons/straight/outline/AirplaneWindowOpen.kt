package me.localx.icons.straight.outline

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

public val Icons.Outline.AirplaneWindowOpen: ImageVector
    get() {
        if (_airplaneWindowOpen != null) {
            return _airplaneWindowOpen!!
        }
        _airplaneWindowOpen = Builder(name = "AirplaneWindowOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.038f, 0.0f, 3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                verticalLineToRelative(-6.0f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.646f, 15.017f)
                curveToRelative(-0.099f, -0.27f, -0.146f, -0.521f, -0.146f, -0.767f)
                curveToRelative(0.0f, -1.24f, 1.009f, -2.25f, 2.25f, -2.25f)
                curveToRelative(1.177f, 0.0f, 2.158f, 0.928f, 2.231f, 2.111f)
                lineToRelative(0.048f, 0.771f)
                lineToRelative(0.759f, 0.147f)
                curveToRelative(0.702f, 0.137f, 1.211f, 0.755f, 1.211f, 1.47f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.674f)
                curveToRelative(-0.456f, 0.0f, -0.826f, -0.371f, -0.826f, -0.826f)
                curveToRelative(0.0f, -0.43f, 0.339f, -0.788f, 0.772f, -0.816f)
                lineToRelative(1.332f, -0.088f)
                lineToRelative(-0.458f, -1.253f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.785f, 0.0f, 5.189f, 1.639f, 6.315f, 4.0f)
                lineTo(5.685f, 6.0f)
                curveToRelative(1.126f, -2.361f, 3.53f, -4.0f, 6.315f, -4.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.34f, 0.033f, -0.672f, 0.08f, -1.0f)
                horizontalLineToRelative(13.84f)
                curveToRelative(0.047f, 0.328f, 0.08f, 0.66f, 0.08f, 1.0f)
                verticalLineToRelative(5.065f)
                curveToRelative(-0.318f, -0.327f, -0.696f, -0.598f, -1.125f, -0.781f)
                curveToRelative(-0.44f, -1.889f, -2.133f, -3.283f, -4.125f, -3.283f)
                curveToRelative(-2.343f, 0.0f, -4.25f, 1.906f, -4.25f, 4.25f)
                curveToRelative(0.0f, 0.141f, 0.008f, 0.282f, 0.023f, 0.424f)
                curveToRelative(-0.907f, 0.474f, -1.523f, 1.422f, -1.523f, 2.5f)
                curveToRelative(0.0f, 1.559f, 1.268f, 2.826f, 2.826f, 2.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.15f, 0.0f, 0.293f, -0.026f, 0.438f, -0.044f)
                curveToRelative(-1.267f, 1.262f, -3.013f, 2.044f, -4.938f, 2.044f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _airplaneWindowOpen!!
    }

private var _airplaneWindowOpen: ImageVector? = null
