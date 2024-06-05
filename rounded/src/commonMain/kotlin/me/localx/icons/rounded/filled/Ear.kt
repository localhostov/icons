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

public val Icons.Filled.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.829f, 2.416f)
                curveTo(16.815f, 0.617f, 14.111f, -0.245f, 11.403f, 0.063f)
                curveTo(7.174f, 0.539f, 3.898f, 3.976f, 3.095f, 8.15f)
                curveToRelative(-0.13f, 0.673f, -0.078f, 1.594f, -0.078f, 1.908f)
                reflectiveCurveToRelative(0.264f, 1.308f, 0.385f, 1.808f)
                curveToRelative(0.327f, 1.354f, 0.61f, 2.523f, 0.61f, 6.131f)
                curveToRelative(-0.011f, 1.916f, 0.873f, 3.678f, 2.426f, 4.835f)
                curveToRelative(1.038f, 0.773f, 2.304f, 1.163f, 3.569f, 1.163f)
                curveToRelative(1.159f, 0.0f, 2.318f, -0.327f, 3.303f, -0.985f)
                curveToRelative(0.89f, -0.596f, 1.603f, -1.405f, 2.061f, -2.34f)
                curveToRelative(0.797f, -1.626f, 1.633f, -2.714f, 2.632f, -3.425f)
                curveToRelative(2.503f, -1.781f, 3.998f, -4.675f, 3.998f, -7.743f)
                curveToRelative(0.0f, -2.701f, -1.156f, -5.284f, -3.171f, -7.085f)
                close()
                moveTo(17.0f, 10.501f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.765f, 0.0f, -3.247f, 1.282f, -3.492f, 2.999f)
                curveToRelative(1.65f, 0.005f, 2.992f, 1.35f, 2.992f, 3.001f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.97f, 0.0f, -1.994f, -0.812f, -1.994f, -2.111f)
                curveToRelative(0.309f, -2.787f, 2.671f, -4.889f, 5.494f, -4.889f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
