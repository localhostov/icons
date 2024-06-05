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

public val Icons.Bold.Lips: ImageVector
    get() {
        if (_lips != null) {
            return _lips!!
        }
        _lips = Builder(name = "Lips", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.502f, 10.594f)
                curveToRelative(-1.975f, -3.353f, -4.476f, -5.777f, -6.158f, -6.928f)
                curveToRelative(-0.642f, -0.438f, -1.388f, -0.684f, -2.085f, -0.662f)
                curveToRelative(-1.029f, 0.008f, -1.957f, 0.39f, -2.612f, 1.077f)
                lineToRelative(-0.647f, 0.678f)
                lineToRelative(-0.647f, -0.678f)
                curveToRelative(-0.666f, -0.697f, -1.557f, -1.08f, -2.51f, -1.08f)
                curveToRelative(-0.794f, 0.0f, -1.532f, 0.217f, -2.132f, 0.627f)
                curveToRelative(-1.579f, 1.08f, -4.149f, 3.549f, -6.197f, 6.954f)
                curveToRelative(-0.738f, 1.226f, -0.68f, 2.771f, 0.148f, 3.936f)
                curveToRelative(0.769f, 1.083f, 4.931f, 6.483f, 11.338f, 6.483f)
                reflectiveCurveToRelative(10.57f, -5.41f, 11.339f, -6.495f)
                curveToRelative(0.819f, -1.155f, 0.883f, -2.69f, 0.163f, -3.911f)
                close()
                moveTo(8.404f, 6.104f)
                curveToRelative(0.045f, -0.031f, 0.179f, -0.104f, 0.438f, -0.104f)
                curveToRelative(0.089f, 0.0f, 0.221f, 0.026f, 0.341f, 0.152f)
                lineToRelative(1.049f, 1.099f)
                curveToRelative(0.923f, 0.967f, 2.613f, 0.967f, 3.536f, 0.0f)
                lineToRelative(1.048f, -1.099f)
                curveToRelative(0.115f, -0.121f, 0.317f, -0.147f, 0.466f, -0.148f)
                curveToRelative(0.062f, 0.002f, 0.232f, 0.046f, 0.368f, 0.138f)
                curveToRelative(1.4f, 0.957f, 3.494f, 3.0f, 5.208f, 5.877f)
                curveToRelative(-2.158f, -0.439f, -5.622f, -1.019f, -8.859f, -1.019f)
                reflectiveCurveToRelative(-6.681f, 0.57f, -8.84f, 1.003f)
                curveToRelative(1.674f, -2.741f, 3.831f, -4.933f, 5.244f, -5.9f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.58f, 0.0f, -7.868f, -3.872f, -8.713f, -4.978f)
                curveToRelative(2.166f, 0.43f, 5.548f, 0.978f, 8.713f, 0.978f)
                reflectiveCurveToRelative(6.535f, -0.544f, 8.701f, -0.973f)
                curveToRelative(-0.863f, 1.128f, -4.143f, 4.973f, -8.701f, 4.973f)
                close()
            }
        }
        .build()
        return _lips!!
    }

private var _lips: ImageVector? = null
