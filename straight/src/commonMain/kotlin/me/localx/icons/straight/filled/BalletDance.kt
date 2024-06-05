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

public val Icons.Filled.BalletDance: ImageVector
    get() {
        if (_balletDance != null) {
            return _balletDance!!
        }
        _balletDance = Builder(name = "BalletDance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(23.278f, 10.04f)
                lineToRelative(-3.732f, 1.089f)
                curveToRelative(0.089f, -0.159f, 0.187f, -0.319f, 0.247f, -0.474f)
                curveToRelative(0.35f, -0.894f, 0.191f, -1.574f, -0.003f, -1.987f)
                curveToRelative(-0.42f, -0.892f, -1.607f, -1.898f, -4.917f, -1.617f)
                curveToRelative(-1.104f, 0.142f, -1.942f, 0.343f, -2.666f, 0.546f)
                curveToRelative(0.239f, 0.493f, 0.689f, 1.25f, 1.491f, 2.071f)
                lineToRelative(0.584f, 0.576f)
                lineToRelative(-1.523f, 1.244f)
                reflectiveCurveToRelative(-0.325f, -0.273f, -0.812f, -0.767f)
                curveToRelative(-0.861f, -0.961f, -1.402f, -2.029f, -1.671f, -2.62f)
                curveToRelative(2.527f, -1.729f, 4.725f, -5.878f, 4.725f, -8.098f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.357f, -1.464f, 4.397f, -3.278f, 6.0f)
                horizontalLineToRelative(-5.496f)
                curveTo(2.5f, 3.5f, 2.0f, 1.718f, 2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                curveToRelative(0.0f, 3.769f, 2.83f, 7.494f, 3.045f, 7.813f)
                curveToRelative(2.147f, 3.187f, 5.124f, 5.553f, 5.124f, 5.553f)
                curveToRelative(-0.21f, 0.01f, -0.41f, 0.015f, -0.586f, 0.015f)
                curveToRelative(-1.391f, 0.0f, -2.727f, -0.544f, -2.727f, -0.544f)
                curveToRelative(0.0f, 0.0f, -0.324f, -0.213f, -1.313f, -1.269f)
                curveToRelative(-2.113f, 1.673f, -2.99f, 3.37f, -2.334f, 4.762f)
                curveToRelative(0.552f, 1.171f, 2.005f, 1.664f, 3.869f, 1.664f)
                curveToRelative(1.183f, 0.0f, 2.533f, -0.204f, 3.92f, -0.554f)
                verticalLineToRelative(6.561f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0.424f, -0.147f, 0.847f, -0.301f, 1.264f, -0.47f)
                curveToRelative(1.631f, -0.662f, 3.087f, -1.453f, 4.298f, -2.288f)
                lineToRelative(7.275f, -2.122f)
                lineToRelative(-0.56f, -1.92f)
                close()
            }
        }
        .build()
        return _balletDance!!
    }

private var _balletDance: ImageVector? = null
