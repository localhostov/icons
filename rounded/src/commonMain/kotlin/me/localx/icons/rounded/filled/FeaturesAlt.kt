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

public val Icons.Filled.FeaturesAlt: ImageVector
    get() {
        if (_featuresAlt != null) {
            return _featuresAlt!!
        }
        _featuresAlt = Builder(name = "FeaturesAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 11.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(0.5f, 8.794f, 0.5f, 11.0f)
                curveToRelative(0.0f, 1.255f, 0.593f, 2.363f, 1.5f, 3.097f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.907f, -0.734f, 1.5f, -1.842f, 1.5f, -3.097f)
                close()
                moveTo(24.0f, 10.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.103f, 0.0f, -3.899f, -1.309f, -4.636f, -3.151f)
                curveToRelative(0.043f, -0.037f, 0.095f, -0.06f, 0.136f, -0.1f)
                curveToRelative(0.499f, 0.486f, 1.164f, 0.751f, 1.848f, 0.751f)
                curveToRelative(0.284f, 0.0f, 0.571f, -0.045f, 0.851f, -0.14f)
                curveToRelative(1.028f, -0.349f, 1.727f, -1.286f, 1.789f, -2.359f)
                horizontalLineToRelative(9.012f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.858f)
                curveToRelative(0.229f, -0.635f, 0.358f, -1.308f, 0.358f, -2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.169f, 0.0f, -0.335f, 0.012f, -0.5f, 0.025f)
                verticalLineToRelative(-0.025f)
                curveTo(4.0f, 2.243f, 6.243f, 0.0f, 9.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.324f, 0.013f, 0.485f, 0.024f)
                verticalLineToRelative(6.976f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.976f)
                curveToRelative(0.011f, 0.161f, 0.024f, 0.322f, 0.024f, 0.485f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _featuresAlt!!
    }

private var _featuresAlt: ImageVector? = null
