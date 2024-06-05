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

public val Icons.Filled.RocketLunch: ImageVector
    get() {
        if (_rocketLunch != null) {
            return _rocketLunch!!
        }
        _rocketLunch = Builder(name = "RocketLunch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.815f, 289.919f)
                curveToRelative(-11.596f, -17.06f, -13.914f, -38.781f, -6.179f, -57.904f)
                curveToRelative(17.287f, -35.265f, 46.246f, -63.459f, 81.961f, -79.795f)
                curveToRelative(25.858f, -12.859f, 53.867f, -20.834f, 82.619f, -23.527f)
                curveToRelative(-12.528f, 15.416f, -25.07f, 31.864f, -37.626f, 49.347f)
                curveToRelative(-25.554f, 38.696f, -47.428f, 79.7f, -65.335f, 122.475f)
                lineToRelative(-7.708f, 17.284f)
                curveTo(40.239f, 316.201f, 22.691f, 305.952f, 11.815f, 289.919f)
                close()
                moveTo(41.181f, 379.609f)
                curveToRelative(-18.448f, 25.473f, -31.689f, 54.335f, -38.963f, 84.934f)
                curveToRelative(-4.535f, 19.882f, 7.906f, 39.677f, 27.789f, 44.212f)
                curveToRelative(5.411f, 1.234f, 11.03f, 1.233f, 16.441f, -0.004f)
                curveToRelative(30.552f, -7.286f, 59.369f, -20.518f, 84.807f, -38.942f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(24.908f, -24.896f, 24.918f, -65.271f, 0.021f, -90.179f)
                curveToRelative(-24.896f, -24.908f, -65.271f, -24.918f, -90.179f, -0.021f)
                horizontalLineTo(41.181f)
                close()
                moveTo(209.711f, 442.885f)
                lineToRelative(-17.411f, 7.729f)
                verticalLineToRelative(6.243f)
                curveToRelative(0.042f, 14.955f, 6.031f, 29.279f, 16.647f, 39.813f)
                curveToRelative(10.098f, 9.821f, 23.625f, 15.32f, 37.711f, 15.331f)
                curveToRelative(50.047f, -0.722f, 90.625f, -46.289f, 111.922f, -88.713f)
                curveToRelative(13.047f, -26.256f, 21.049f, -54.727f, 23.59f, -83.936f)
                curveToRelative(-15.571f, 12.74f, -32.268f, 25.48f, -50.09f, 38.22f)
                curveToRelative(-38.681f, 25.561f, -79.679f, 47.428f, -122.454f, 65.314f)
                horizontalLineTo(209.711f)
                close()
                moveTo(510.802f, 62.827f)
                curveToRelative(-2.824f, 92.429f, -69.37f, 184.094f, -203.459f, 280.282f)
                curveToRelative(-36.49f, 23.654f, -74.985f, 44.06f, -115.043f, 60.983f)
                verticalLineToRelative(-11.954f)
                curveToRelative(-0.198f, -40.962f, -33.355f, -74.12f, -74.317f, -74.317f)
                horizontalLineToRelative(-11.954f)
                curveToRelative(16.962f, -40.059f, 37.403f, -78.554f, 61.089f, -115.043f)
                curveTo(263.071f, 69.006f, 354.587f, 2.375f, 446.868f, -0.64f)
                curveTo(492.859f, -0.64f, 510.802f, 18.088f, 510.802f, 62.827f)
                close()
                moveTo(383.401f, 179.802f)
                curveToRelative(0.0f, -29.317f, -23.766f, -53.084f, -53.084f, -53.084f)
                reflectiveCurveToRelative(-53.084f, 23.766f, -53.084f, 53.084f)
                curveToRelative(0.0f, 29.317f, 23.766f, 53.084f, 53.084f, 53.084f)
                reflectiveCurveTo(383.401f, 209.119f, 383.401f, 179.802f)
                close()
            }
        }
        .build()
        return _rocketLunch!!
    }

private var _rocketLunch: ImageVector? = null
