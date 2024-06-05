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

public val Icons.Bold.Male: ImageVector
    get() {
        if (_male != null) {
            return _male!!
        }
        _male = Builder(name = "Male", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.46f, 0.0f)
                horizontalLineToRelative(-85.189f)
                curveToRelative(-17.643f, 0.0f, -31.946f, 14.303f, -31.946f, 31.946f)
                reflectiveCurveToRelative(14.303f, 31.946f, 31.946f, 31.946f)
                horizontalLineToRelative(50.666f)
                lineTo(285.185f, 181.644f)
                curveToRelative(-82.229f, -57.281f, -195.324f, -37.057f, -252.605f, 45.171f)
                reflectiveCurveTo(-4.477f, 422.139f, 77.751f, 479.42f)
                reflectiveCurveToRelative(195.324f, 37.057f, 252.605f, -45.171f)
                curveToRelative(43.419f, -62.328f, 43.419f, -145.105f, 0.0f, -207.434f)
                lineToRelative(117.752f, -117.752f)
                verticalLineToRelative(50.666f)
                curveToRelative(0.0f, 17.643f, 14.303f, 31.946f, 31.946f, 31.946f)
                reflectiveCurveTo(512.0f, 177.372f, 512.0f, 159.729f)
                verticalLineTo(74.54f)
                curveTo(512.0f, 33.373f, 478.627f, 0.0f, 437.46f, 0.0f)
                close()
                moveTo(181.893f, 447.241f)
                curveToRelative(-64.692f, 0.0f, -117.135f, -52.443f, -117.135f, -117.135f)
                reflectiveCurveToRelative(52.443f, -117.135f, 117.135f, -117.135f)
                reflectiveCurveToRelative(117.135f, 52.443f, 117.135f, 117.135f)
                curveTo(298.958f, 394.769f, 246.556f, 447.171f, 181.893f, 447.241f)
                close()
            }
        }
        .build()
        return _male!!
    }

private var _male: ImageVector? = null
