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

public val Icons.Outline.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.07f, -0.047f)
                curveTo(114.467f, -0.047f, -0.326f, 114.746f, -0.326f, 256.349f)
                reflectiveCurveTo(114.467f, 512.744f, 256.07f, 512.744f)
                reflectiveCurveToRelative(256.395f, -114.792f, 256.395f, -256.395f)
                reflectiveCurveTo(397.673f, -0.047f, 256.07f, -0.047f)
                close()
                moveTo(468.117f, 233.429f)
                lineToRelative(-0.107f, -0.085f)
                curveToRelative(-41.298f, -4.284f, -80.429f, -20.604f, -112.533f, -46.933f)
                lineToRelative(65.493f, -65.493f)
                curveTo(447.356f, 153.001f, 463.748f, 192.12f, 468.117f, 233.429f)
                close()
                moveTo(390.72f, 90.731f)
                lineToRelative(-65.408f, 65.6f)
                curveToRelative(-26.338f, -32.099f, -42.659f, -71.232f, -46.933f, -112.533f)
                curveTo(319.605f, 48.138f, 358.659f, 64.453f, 390.72f, 90.731f)
                close()
                moveTo(235.797f, 43.691f)
                curveToRelative(4.468f, 52.666f, 25.218f, 102.636f, 59.371f, 142.976f)
                lineTo(256.0f, 225.835f)
                lineTo(121.088f, 90.923f)
                curveTo(153.772f, 64.114f, 193.713f, 47.669f, 235.797f, 43.691f)
                close()
                moveTo(90.913f, 121.1f)
                lineToRelative(-0.097f, -0.097f)
                lineToRelative(0.107f, 0.085f)
                curveTo(90.919f, 121.092f, 90.916f, 121.096f, 90.913f, 121.1f)
                lineTo(225.835f, 256.0f)
                lineToRelative(-39.189f, 39.189f)
                curveToRelative(-40.316f, -34.167f, -90.275f, -54.926f, -142.933f, -59.392f)
                curveTo(47.683f, 193.72f, 64.118f, 153.784f, 90.913f, 121.1f)
                close()
                moveTo(43.883f, 278.571f)
                verticalLineToRelative(-0.085f)
                curveToRelative(41.301f, 4.274f, 80.434f, 20.595f, 112.533f, 46.933f)
                lineToRelative(-65.493f, 65.493f)
                curveTo(64.607f, 358.863f, 48.254f, 319.808f, 43.883f, 278.571f)
                close()
                moveTo(121.173f, 421.077f)
                lineToRelative(65.408f, -65.493f)
                curveToRelative(26.338f, 32.099f, 42.659f, 71.232f, 46.933f, 112.533f)
                curveTo(192.277f, 463.746f, 153.222f, 447.393f, 121.173f, 421.077f)
                close()
                moveTo(276.203f, 468.309f)
                curveToRelative(-4.461f, -52.666f, -25.221f, -102.633f, -59.392f, -142.955f)
                lineTo(256.0f, 286.165f)
                lineToRelative(134.912f, 134.912f)
                curveTo(358.233f, 447.895f, 318.29f, 464.341f, 276.203f, 468.309f)
                close()
                moveTo(421.035f, 390.912f)
                lineTo(286.165f, 256.0f)
                lineToRelative(39.168f, -39.168f)
                curveToRelative(40.328f, 34.145f, 90.282f, 54.895f, 142.933f, 59.371f)
                curveTo(464.289f, 318.287f, 447.843f, 358.228f, 421.035f, 390.912f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
