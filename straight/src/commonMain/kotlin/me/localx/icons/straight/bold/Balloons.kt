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

public val Icons.Bold.Balloons: ImageVector
    get() {
        if (_balloons != null) {
            return _balloons!!
        }
        _balloons = Builder(name = "Balloons", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.391f, 16.538f)
                arcTo(2.846f, 2.846f, 0.0f, false, false, 5.0f, 17.875f)
                curveToRelative(0.0f, 1.9f, 1.716f, 2.725f, 2.852f, 3.269f)
                arcToRelative(6.713f, 6.713f, 0.0f, false, true, 1.113f, 0.615f)
                arcToRelative(4.971f, 4.971f, 0.0f, false, true, -0.322f, 0.577f)
                lineToRelative(2.543f, 1.593f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 12.0f, 21.708f)
                curveToRelative(0.0f, -1.9f, -1.716f, -2.726f, -2.852f, -3.27f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -1.066f, -0.578f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, 0.635f, -1.023f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, 4.743f, -4.078f)
                arcToRelative(6.619f, 6.619f, 0.0f, false, false, 2.833f, 2.849f)
                arcToRelative(3.928f, 3.928f, 0.0f, false, false, -0.2f, 2.27f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 2.7f, 2.879f)
                curveToRelative(1.432f, 0.816f, 1.423f, 0.834f, 0.922f, 1.763f)
                lineToRelative(2.643f, 1.422f)
                curveToRelative(1.9f, -3.526f, -0.79f, -5.056f, -2.081f, -5.792f)
                curveToRelative(-0.506f, -0.288f, -1.2f, -0.683f, -1.264f, -0.957f)
                curveToRelative(-0.018f, -0.075f, -0.059f, -0.5f, 0.62f, -1.553f)
                curveTo(22.268f, 14.48f, 24.0f, 10.635f, 24.0f, 7.115f)
                arcTo(5.86f, 5.86f, 0.0f, false, false, 18.0f, 1.0f)
                arcToRelative(5.892f, 5.892f, 0.0f, false, false, -4.461f, 1.907f)
                arcTo(7.628f, 7.628f, 0.0f, false, false, 7.5f, 0.0f)
                arcTo(7.316f, 7.316f, 0.0f, false, false, 0.0f, 7.1f)
                curveTo(0.0f, 10.88f, 2.236f, 15.158f, 5.391f, 16.538f)
                close()
                moveTo(18.0f, 4.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 3.0f, 3.115f)
                curveTo(21.0f, 10.09f, 19.282f, 13.0f, 18.0f, 13.0f)
                reflectiveCurveToRelative(-3.0f, -2.91f, -3.0f, -5.885f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 18.0f, 4.0f)
                close()
                moveTo(7.5f, 3.0f)
                arcTo(4.319f, 4.319f, 0.0f, false, true, 12.0f, 7.1f)
                curveTo(12.0f, 10.113f, 9.817f, 14.0f, 7.5f, 14.0f)
                reflectiveCurveTo(3.0f, 10.113f, 3.0f, 7.1f)
                arcTo(4.319f, 4.319f, 0.0f, false, true, 7.5f, 3.0f)
                close()
            }
        }
        .build()
        return _balloons!!
    }

private var _balloons: ImageVector? = null
