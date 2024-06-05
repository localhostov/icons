package me.localx.icons.rounded.bold

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

public val Icons.Bold.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.063f, viewportHeight = 512.063f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.992f, 299.082f)
                curveTo(68.075f, 307.3f, -1.191f, 384.123f, 0.016f, 475.402f)
                verticalLineToRelative(4.629f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-5.909f)
                curveToRelative(-0.962f, -56.045f, 40.398f, -103.838f, 96.0f, -110.933f)
                curveToRelative(58.693f, -5.82f, 110.992f, 37.042f, 116.812f, 95.735f)
                curveToRelative(0.344f, 3.47f, 0.518f, 6.954f, 0.521f, 10.441f)
                verticalLineToRelative(10.667f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-10.667f)
                curveToRelative(-0.104f, -94.363f, -76.685f, -170.774f, -171.047f, -170.67f)
                curveTo(166.528f, 298.699f, 162.756f, 298.828f, 158.992f, 299.082f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.682f, 256.031f)
                curveToRelative(70.692f, 0.0f, 128.0f, -57.308f, 128.0f, -128.0f)
                reflectiveCurveToRelative(-57.308f, -128.0f, -128.0f, -128.0f)
                reflectiveCurveToRelative(-128.0f, 57.308f, -128.0f, 128.0f)
                curveTo(42.753f, 198.695f, 100.019f, 255.961f, 170.682f, 256.031f)
                close()
                moveTo(170.682f, 64.031f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                reflectiveCurveTo(135.336f, 64.031f, 170.682f, 64.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.349f, 168.031f)
                curveToRelative(-24.717f, 1.231f, -43.79f, 22.211f, -42.667f, 46.933f)
                curveToRelative(1.123f, -24.722f, -17.949f, -45.702f, -42.667f, -46.933f)
                curveToRelative(-24.717f, 1.231f, -43.79f, 22.211f, -42.667f, 46.933f)
                curveToRelative(0.0f, 36.907f, 48.128f, 80.149f, 72.107f, 99.392f)
                curveToRelative(7.731f, 6.19f, 18.722f, 6.19f, 26.453f, 0.0f)
                curveToRelative(23.979f, -19.2f, 72.107f, -62.485f, 72.107f, -99.392f)
                curveTo(513.138f, 190.242f, 494.066f, 169.263f, 469.349f, 168.031f)
                close()
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null
