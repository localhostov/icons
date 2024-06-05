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

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.629f, viewportHeight = 512.629f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.006f, 256.014f)
                curveToRelative(-0.218f, 54.774f, 44.009f, 99.354f, 98.784f, 99.572f)
                curveToRelative(25.226f, 0.1f, 49.543f, -9.416f, 68.0f, -26.612f)
                lineToRelative(147.797f, 66.731f)
                curveToRelative(-1.027f, 5.526f, -1.59f, 11.127f, -1.685f, 16.747f)
                curveToRelative(-0.174f, 55.152f, 44.393f, 100.002f, 99.545f, 100.177f)
                reflectiveCurveToRelative(100.002f, -44.393f, 100.177f, -99.545f)
                reflectiveCurveToRelative(-44.393f, -100.002f, -99.545f, -100.177f)
                curveToRelative(-32.951f, -0.104f, -63.832f, 16.053f, -82.534f, 43.182f)
                lineTo(191.686f, 293.39f)
                curveToRelative(9.863f, -23.816f, 9.901f, -50.567f, 0.107f, -74.411f)
                lineToRelative(138.667f, -63.019f)
                curveToRelative(31.225f, 45.161f, 93.148f, 56.457f, 138.309f, 25.232f)
                reflectiveCurveTo(525.225f, 88.045f, 494.0f, 42.884f)
                reflectiveCurveToRelative(-93.148f, -56.457f, -138.309f, -25.232f)
                curveToRelative(-26.895f, 18.596f, -42.926f, 49.227f, -42.875f, 81.925f)
                curveToRelative(0.09f, 5.628f, 0.661f, 11.237f, 1.707f, 16.768f)
                lineTo(167.11f, 183.331f)
                curveToRelative(-39.939f, -37.503f, -102.718f, -35.528f, -140.221f, 4.411f)
                curveTo(9.532f, 206.228f, -0.088f, 230.657f, 0.006f, 256.014f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
