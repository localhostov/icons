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

public val Icons.Bold.Loan: ImageVector
    get() {
        if (_loan != null) {
            return _loan!!
        }
        _loan = Builder(name = "Loan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.732f, 9.013f)
                curveToRelative(-0.768f, -0.699f, -1.765f, -1.054f, -2.797f, -1.008f)
                curveToRelative(-1.036f, 0.048f, -1.991f, 0.498f, -2.69f, 1.265f)
                lineToRelative(-2.438f, 2.679f)
                curveToRelative(-0.073f, -0.066f, -0.157f, -0.118f, -0.235f, -0.178f)
                curveToRelative(0.265f, -0.533f, 0.428f, -1.125f, 0.428f, -1.759f)
                curveToRelative(0.0f, -3.192f, -2.479f, -6.225f, -5.367f, -6.878f)
                curveToRelative(0.486f, -0.454f, 1.009f, -1.069f, 1.308f, -1.839f)
                curveToRelative(0.246f, -0.633f, -0.31f, -1.294f, -1.035f, -1.294f)
                horizontalLineToRelative(-2.721f)
                curveToRelative(-0.784f, 0.0f, -1.33f, 0.76f, -0.989f, 1.415f)
                curveToRelative(0.341f, 0.653f, 0.846f, 1.241f, 1.299f, 1.695f)
                curveToRelative(-2.942f, 0.591f, -5.495f, 3.663f, -5.495f, 6.902f)
                curveToRelative(0.0f, 0.559f, 0.118f, 1.089f, 0.327f, 1.573f)
                curveToRelative(-1.38f, 0.769f, -2.327f, 2.227f, -2.327f, 3.916f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5.414f)
                curveToRelative(3.029f, 0.0f, 5.91f, -1.308f, 7.904f, -3.589f)
                lineToRelative(5.196f, -5.943f)
                curveToRelative(1.41f, -1.581f, 1.283f, -4.027f, -0.282f, -5.455f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(1.668f, 0.0f, 3.5f, 2.1f, 3.5f, 4.012f)
                curveToRelative(0.0f, 0.545f, -0.448f, 0.988f, -1.0f, 0.988f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.912f, 1.832f, -4.012f, 3.5f, -4.012f)
                close()
                moveTo(20.767f, 12.482f)
                lineToRelative(-5.206f, 5.955f)
                curveToRelative(-1.425f, 1.629f, -3.482f, 2.563f, -5.646f, 2.563f)
                horizontalLineToRelative(-5.414f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.857f)
                curveToRelative(0.354f, 0.0f, 0.643f, 0.288f, 0.643f, 0.642f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.636f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.82f, 0.117f, -1.391f, 0.877f, -1.273f, 1.697f)
                reflectiveCurveToRelative(0.879f, 1.386f, 1.697f, 1.273f)
                lineToRelative(5.162f, -0.737f)
                curveToRelative(1.618f, -0.231f, 2.875f, -1.531f, 3.093f, -3.115f)
                lineToRelative(3.497f, -3.843f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.231f, -0.012f, 0.463f, 0.071f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.055f, 1.252f)
                close()
            }
        }
        .build()
        return _loan!!
    }

private var _loan: ImageVector? = null
