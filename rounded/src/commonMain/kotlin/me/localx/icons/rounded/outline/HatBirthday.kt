package me.localx.icons.rounded.outline

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

public val Icons.Outline.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.299f, 379.264f)
                lineTo(289.963f, 118.059f)
                curveToRelative(29.959f, -18.757f, 39.04f, -58.249f, 20.283f, -88.208f)
                curveToRelative(-18.757f, -29.959f, -58.249f, -39.04f, -88.208f, -20.282f)
                reflectiveCurveToRelative(-39.04f, 58.249f, -20.282f, 88.208f)
                curveToRelative(5.139f, 8.208f, 12.074f, 15.143f, 20.282f, 20.282f)
                lineTo(39.701f, 379.264f)
                curveToRelative(-19.843f, 25.985f, -23.631f, 60.833f, -9.835f, 90.475f)
                curveTo(46.136f, 497.842f, 76.98f, 514.237f, 109.376f, 512.0f)
                horizontalLineToRelative(293.248f)
                curveToRelative(32.396f, 2.237f, 63.24f, -14.158f, 79.509f, -42.261f)
                curveTo(495.929f, 440.097f, 492.141f, 405.249f, 472.299f, 379.264f)
                close()
                moveTo(250.261f, 469.333f)
                lineToRelative(116.437f, -166.805f)
                lineToRelative(30.101f, 43.243f)
                lineToRelative(-86.165f, 123.563f)
                horizontalLineTo(250.261f)
                close()
                moveTo(139.499f, 469.333f)
                lineToRelative(171.819f, -246.144f)
                lineToRelative(29.355f, 42.069f)
                lineTo(198.229f, 469.333f)
                horizontalLineTo(139.499f)
                close()
                moveTo(67.627f, 450.005f)
                curveToRelative(-6.327f, -15.568f, -3.625f, -33.35f, 7.04f, -46.336f)
                lineTo(256.0f, 143.936f)
                lineToRelative(29.461f, 42.197f)
                curveToRelative(-0.299f, 0.384f, -0.725f, 0.576f, -1.003f, 0.96f)
                lineTo(89.6f, 466.325f)
                curveTo(80.361f, 464.1f, 72.427f, 458.207f, 67.627f, 450.005f)
                close()
                moveTo(444.373f, 450.005f)
                curveToRelative(-9.143f, 13.818f, -25.298f, 21.297f, -41.749f, 19.328f)
                horizontalLineToRelative(-39.957f)
                lineToRelative(60.203f, -86.272f)
                lineToRelative(14.4f, 20.608f)
                curveTo(447.956f, 416.643f, 450.683f, 434.426f, 444.373f, 450.005f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
