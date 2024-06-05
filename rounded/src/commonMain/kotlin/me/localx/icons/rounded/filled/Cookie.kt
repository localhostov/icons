package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.667f, 32.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.667f, 138.667f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.784f, 231.552f)
                curveToRelative(-0.975f, -10.173f, -9.027f, -18.225f, -19.2f, -19.2f)
                curveToRelative(-101.655f, -9.794f, -182.111f, -90.258f, -191.893f, -191.915f)
                curveToRelative(-0.975f, -10.173f, -9.027f, -18.225f, -19.2f, -19.2f)
                curveTo(272.405f, 0.448f, 264.256f, 0.0f, 256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 114.615f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.615f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.615f, 256.0f, -256.0f)
                curveTo(512.0f, 247.744f, 511.552f, 239.595f, 510.784f, 231.552f)
                close()
                moveTo(309.333f, 341.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.327f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.327f, 32.0f, 32.0f)
                reflectiveCurveTo(327.006f, 341.333f, 309.333f, 341.333f)
                lineTo(309.333f, 341.333f)
                close()
                moveTo(202.667f, 234.667f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.327f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.327f, 32.0f, 32.0f)
                reflectiveCurveTo(220.34f, 234.667f, 202.667f, 234.667f)
                close()
                moveTo(234.667f, 309.333f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.327f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.327f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(220.34f, 277.333f, 234.667f, 291.66f, 234.667f, 309.333f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
