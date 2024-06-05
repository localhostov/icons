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

public val Icons.Bold.CarCircleBolt: ImageVector
    get() {
        if (_carCircleBolt != null) {
            return _carCircleBolt!!
        }
        _carCircleBolt = Builder(name = "CarCircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.5f)
                curveToRelative(0.0f, -2.609f, 1.178f, -4.941f, 3.028f, -6.5f)
                lineTo(3.878f, 11.0f)
                curveToRelative(0.118f, -0.416f, 0.246f, -0.829f, 0.393f, -1.235f)
                lineToRelative(2.16f, -5.436f)
                curveToRelative(0.071f, -0.196f, 0.26f, -0.329f, 0.469f, -0.329f)
                horizontalLineToRelative(10.199f)
                curveToRelative(0.209f, 0.0f, 0.397f, 0.132f, 0.485f, 0.37f)
                lineToRelative(1.941f, 4.883f)
                curveToRelative(1.435f, 0.351f, 2.724f, 1.064f, 3.769f, 2.041f)
                curveToRelative(-0.215f, -0.886f, -0.463f, -1.767f, -0.779f, -2.637f)
                lineToRelative(-2.127f, -5.353f)
                curveToRelative(-0.501f, -1.378f, -1.823f, -2.304f, -3.289f, -2.304f)
                lineTo(6.9f, 1.0f)
                curveToRelative(-1.466f, 0.0f, -2.788f, 0.926f, -3.272f, 2.263f)
                lineTo(1.469f, 8.698f)
                curveToRelative(-0.975f, 2.678f, -1.469f, 5.481f, -1.469f, 8.333f)
                verticalLineToRelative(2.968f)
                lineTo(3.0f, 19.999f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 22.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.375f)
                curveToRelative(-0.243f, -0.791f, -0.375f, -1.63f, -0.375f, -2.5f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(20.648f, 19.266f)
                lineToRelative(-2.7f, 3.375f)
                lineToRelative(-2.361f, -1.85f)
                lineToRelative(1.465f, -1.791f)
                horizontalLineToRelative(-0.938f)
                curveToRelative(-0.666f, 0.0f, -1.301f, -0.319f, -1.698f, -0.854f)
                curveToRelative(-0.396f, -0.535f, -0.52f, -1.235f, -0.326f, -1.873f)
                lineToRelative(2.303f, -3.846f)
                lineToRelative(2.555f, 1.572f)
                lineToRelative(-1.226f, 2.0f)
                horizontalLineToRelative(1.173f)
                curveToRelative(0.775f, 0.0f, 1.486f, 0.425f, 1.853f, 1.108f)
                curveToRelative(0.367f, 0.684f, 0.329f, 1.51f, -0.1f, 2.157f)
                close()
            }
        }
        .build()
        return _carCircleBolt!!
    }

private var _carCircleBolt: ImageVector? = null
