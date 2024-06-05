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

public val Icons.Bold.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) {
            return _crystalBall!!
        }
        _crystalBall = Builder(name = "CrystalBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, 0.613f, -0.374f, 1.165f, -0.943f, 1.393f)
                lineToRelative(-1.188f, 0.476f)
                lineToRelative(-0.476f, 1.188f)
                curveToRelative(-0.228f, 0.569f, -0.779f, 0.943f, -1.393f, 0.943f)
                reflectiveCurveToRelative(-1.165f, -0.374f, -1.393f, -0.943f)
                lineToRelative(-0.481f, -1.204f)
                lineToRelative(-1.208f, -0.508f)
                curveToRelative(-0.565f, -0.238f, -0.929f, -0.797f, -0.918f, -1.41f)
                curveToRelative(0.012f, -0.613f, 0.396f, -1.158f, 0.969f, -1.376f)
                lineToRelative(1.169f, -0.442f)
                lineToRelative(0.47f, -1.173f)
                curveToRelative(0.228f, -0.569f, 0.779f, -0.943f, 1.393f, -0.943f)
                reflectiveCurveToRelative(1.165f, 0.374f, 1.393f, 0.943f)
                lineToRelative(0.476f, 1.188f)
                lineToRelative(1.188f, 0.476f)
                curveToRelative(0.569f, 0.228f, 0.943f, 0.779f, 0.943f, 1.393f)
                close()
                moveTo(21.564f, 10.002f)
                curveToRelative(-0.829f, -0.035f, -1.532f, 0.592f, -1.575f, 1.421f)
                curveToRelative(-0.22f, 4.249f, -3.729f, 7.577f, -7.989f, 7.577f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 3.0f, 12.0f, 3.0f)
                curveToRelative(0.426f, 0.0f, 0.852f, 0.033f, 1.263f, 0.1f)
                curveToRelative(0.82f, 0.129f, 1.588f, -0.427f, 1.719f, -1.244f)
                curveToRelative(0.131f, -0.818f, -0.427f, -1.588f, -1.244f, -1.719f)
                curveToRelative(-0.568f, -0.091f, -1.153f, -0.137f, -1.737f, -0.137f)
                curveTo(5.935f, 0.0f, 1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 3.247f, 1.415f, 6.17f, 3.659f, 8.185f)
                lineToRelative(-0.858f, 0.715f)
                curveToRelative(-0.892f, 0.743f, -1.508f, 1.749f, -1.774f, 2.857f)
                curveToRelative(-0.152f, 0.632f, 0.326f, 1.244f, 0.976f, 1.244f)
                lineTo(20.996f, 24.001f)
                curveToRelative(0.65f, 0.0f, 1.128f, -0.611f, 0.976f, -1.244f)
                curveToRelative(-0.266f, -1.108f, -0.882f, -2.113f, -1.774f, -2.857f)
                lineToRelative(-0.851f, -0.709f)
                curveToRelative(2.105f, -1.888f, 3.481f, -4.58f, 3.638f, -7.613f)
                curveToRelative(0.043f, -0.827f, -0.593f, -1.532f, -1.421f, -1.575f)
                close()
                moveTo(14.501f, 7.756f)
                curveToRelative(-0.288f, -1.007f, -1.715f, -1.007f, -2.003f, 0.0f)
                lineToRelative(-0.387f, 1.356f)
                lineToRelative(-1.356f, 0.387f)
                curveToRelative(-1.007f, 0.288f, -1.007f, 1.715f, 0.0f, 2.003f)
                lineToRelative(1.356f, 0.387f)
                lineToRelative(0.387f, 1.356f)
                curveToRelative(0.288f, 1.007f, 1.715f, 1.007f, 2.003f, 0.0f)
                lineToRelative(0.387f, -1.356f)
                lineToRelative(1.356f, -0.387f)
                curveToRelative(1.007f, -0.288f, 1.007f, -1.715f, 0.0f, -2.003f)
                lineToRelative(-1.356f, -0.387f)
                lineToRelative(-0.387f, -1.356f)
                close()
            }
        }
        .build()
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
