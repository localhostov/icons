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

public val Icons.Outline.DumbbellFitness: ImageVector
    get() {
        if (_dumbbellFitness != null) {
            return _dumbbellFitness!!
        }
        _dumbbellFitness = Builder(name = "DumbbellFitness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 10.91f)
                verticalLineToRelative(9.407f)
                curveToRelative(-0.161f, 0.138f, -4.385f, 3.683f, -12.0f, 3.683f)
                curveTo(4.235f, 24.0f, 0.162f, 18.309f, 0.0f, 18.077f)
                curveToRelative(0.0f, -3.608f, 1.673f, -8.043f, 3.295f, -10.814f)
                curveToRelative(-0.188f, -0.555f, -0.295f, -1.146f, -0.295f, -1.764f)
                curveTo(3.0f, 2.467f, 5.467f, 0.0f, 8.5f, 0.0f)
                reflectiveCurveToRelative(5.5f, 2.467f, 5.5f, 5.5f)
                curveToRelative(0.0f, 2.849f, -2.178f, 5.198f, -4.956f, 5.472f)
                curveToRelative(-0.003f, 1.016f, -0.05f, 2.084f, -0.212f, 3.138f)
                curveToRelative(1.042f, -0.616f, 2.3f, -1.11f, 3.668f, -1.11f)
                curveToRelative(0.695f, 0.0f, 1.317f, 0.132f, 1.879f, 0.322f)
                curveToRelative(0.4f, -0.506f, 2.754f, -3.322f, 5.621f, -3.322f)
                curveToRelative(2.286f, 0.0f, 3.885f, 0.846f, 4.0f, 0.91f)
                close()
                moveTo(5.0f, 5.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(22.0f, 12.209f)
                curveToRelative(-0.408f, -0.101f, -1.065f, -0.209f, -2.0f, -0.209f)
                curveToRelative(-1.502f, 0.0f, -3.062f, 1.42f, -3.805f, 2.267f)
                curveToRelative(0.802f, 0.592f, 1.258f, 1.179f, 1.295f, 1.228f)
                lineToRelative(-1.597f, 1.204f)
                curveToRelative(-0.013f, -0.017f, -1.328f, -1.699f, -3.394f, -1.699f)
                curveToRelative(-2.194f, 0.0f, -4.349f, 2.009f, -4.994f, 2.783f)
                lineToRelative(-1.536f, -1.28f)
                curveToRelative(0.812f, -1.579f, 1.078f, -3.843f, 1.075f, -5.705f)
                curveToRelative(-0.996f, -0.274f, -1.878f, -0.82f, -2.563f, -1.555f)
                curveToRelative(-1.246f, 2.37f, -2.39f, 5.445f, -2.477f, 8.187f)
                curveToRelative(0.797f, 0.986f, 4.099f, 4.569f, 9.995f, 4.569f)
                curveToRelative(5.644f, 0.0f, 8.967f, -1.932f, 10.0f, -2.643f)
                verticalLineToRelative(-7.147f)
                close()
            }
        }
        .build()
        return _dumbbellFitness!!
    }

private var _dumbbellFitness: ImageVector? = null
