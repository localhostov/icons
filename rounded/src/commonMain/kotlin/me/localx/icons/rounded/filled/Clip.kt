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

public val Icons.Filled.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 511.201f, viewportHeight = 511.201f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.108f, 203.908f)
                curveToRelative(-8.331f, -8.328f, -21.835f, -8.328f, -30.165f, 0.0f)
                lineTo(233.58f, 437.274f)
                curveToRelative(-41.656f, 41.661f, -109.197f, 41.666f, -150.859f, 0.011f)
                reflectiveCurveToRelative(-41.666f, -109.197f, -0.011f, -150.859f)
                lineTo(307.756f, 60.463f)
                curveToRelative(25.193f, -24.792f, 65.715f, -24.467f, 90.507f, 0.726f)
                curveToRelative(24.507f, 24.904f, 24.512f, 64.86f, 0.011f, 89.77f)
                lineTo(173.228f, 376.922f)
                curveToRelative(-8.433f, 8.078f, -21.733f, 8.078f, -30.165f, 0.0f)
                curveToRelative(-8.328f, -8.331f, -8.328f, -21.835f, 0.0f, -30.165f)
                lineToRelative(200.363f, -201.28f)
                curveToRelative(8.185f, -8.475f, 7.951f, -21.98f, -0.524f, -30.165f)
                curveToRelative(-8.267f, -7.985f, -21.374f, -7.985f, -29.641f, 0.0f)
                lineToRelative(-200.363f, 201.28f)
                curveToRelative(-24.996f, 24.991f, -24.999f, 65.514f, -0.008f, 90.51f)
                curveToRelative(0.003f, 0.003f, 0.005f, 0.005f, 0.008f, 0.008f)
                curveToRelative(25.331f, 24.172f, 65.186f, 24.172f, 90.517f, 0.0f)
                lineToRelative(225.024f, -225.984f)
                curveToRelative(41.122f, -42.183f, 40.261f, -109.715f, -1.922f, -150.837f)
                curveTo(385.087f, -10.1f, 319.014f, -10.095f, 277.591f, 30.298f)
                lineTo(52.545f, 256.26f)
                curveToRelative(-58.321f, 58.321f, -58.321f, 152.879f, 0.0f, 211.2f)
                reflectiveCurveToRelative(152.879f, 58.321f, 211.2f, 0.0f)
                lineToRelative(232.363f, -233.301f)
                curveToRelative(8.353f, -8.309f, 8.39f, -21.816f, 0.081f, -30.17f)
                curveTo(496.162f, 203.962f, 496.135f, 203.935f, 496.108f, 203.908f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
