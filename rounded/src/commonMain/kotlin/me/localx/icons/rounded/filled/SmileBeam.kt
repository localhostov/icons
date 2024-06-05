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

public val Icons.Filled.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.824f)
                curveTo(114.678f, 0.977f, 0.153f, 115.502f, 0.0f, 256.824f)
                curveToRelative(12.8f, 339.2f, 499.2f, 339.072f, 512.0f, 0.0f)
                curveTo(511.847f, 115.502f, 397.322f, 0.977f, 256.0f, 0.824f)
                close()
                moveTo(106.667f, 240.419f)
                curveToRelative(5.291f, -112.747f, 122.731f, -112.683f, 128.0f, 0.0f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                curveToRelative(0.0f, -22.485f, -14.507f, -42.667f, -21.333f, -42.667f)
                curveToRelative(-6.827f, 0.0f, -21.333f, 20.181f, -21.333f, 42.667f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                reflectiveCurveTo(106.667f, 252.201f, 106.667f, 240.419f)
                close()
                moveTo(376.875f, 341.667f)
                curveToRelative(-68.354f, 62.783f, -173.395f, 62.783f, -241.749f, 0.0f)
                curveToRelative(-8.789f, -7.847f, -9.554f, -21.333f, -1.707f, -30.123f)
                reflectiveCurveToRelative(21.333f, -9.554f, 30.123f, -1.707f)
                curveToRelative(52.098f, 48.544f, 132.862f, 48.544f, 184.96f, 0.0f)
                curveToRelative(8.973f, -7.636f, 22.437f, -6.552f, 30.073f, 2.421f)
                curveToRelative(7.392f, 8.687f, 6.644f, 21.652f, -1.699f, 29.43f)
                verticalLineTo(341.667f)
                close()
                moveTo(384.0f, 261.752f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                curveToRelative(0.0f, -22.485f, -14.507f, -42.667f, -21.333f, -42.667f)
                reflectiveCurveTo(320.0f, 217.933f, 320.0f, 240.419f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                curveToRelative(0.0f, -40.363f, 26.283f, -85.333f, 64.0f, -85.333f)
                reflectiveCurveToRelative(64.0f, 44.971f, 64.0f, 85.333f)
                curveTo(405.333f, 252.201f, 395.782f, 261.752f, 384.0f, 261.752f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
