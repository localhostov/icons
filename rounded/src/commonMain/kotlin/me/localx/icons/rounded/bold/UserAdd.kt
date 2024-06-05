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

public val Icons.Bold.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.016f, viewportHeight = 512.016f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.992f, 299.058f)
                curveTo(68.075f, 307.276f, -1.191f, 384.099f, 0.016f, 475.378f)
                verticalLineToRelative(4.629f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-5.909f)
                curveToRelative(-0.962f, -56.045f, 40.398f, -103.838f, 96.0f, -110.933f)
                curveToRelative(58.693f, -5.82f, 110.992f, 37.042f, 116.812f, 95.735f)
                curveToRelative(0.344f, 3.47f, 0.518f, 6.954f, 0.521f, 10.441f)
                verticalLineToRelative(10.667f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-10.667f)
                curveToRelative(-0.104f, -94.363f, -76.685f, -170.774f, -171.047f, -170.67f)
                curveTo(166.528f, 298.675f, 162.756f, 298.804f, 158.992f, 299.058f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.682f, 256.008f)
                curveToRelative(70.692f, 0.0f, 128.0f, -57.308f, 128.0f, -128.0f)
                reflectiveCurveToRelative(-57.308f, -128.0f, -128.0f, -128.0f)
                reflectiveCurveToRelative(-128.0f, 57.308f, -128.0f, 128.0f)
                curveTo(42.753f, 198.671f, 100.019f, 255.937f, 170.682f, 256.008f)
                close()
                moveTo(170.682f, 64.008f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                reflectiveCurveTo(135.336f, 64.008f, 170.682f, 64.008f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.016f, 213.341f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.327f, 32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveTo(497.689f, 213.341f, 480.016f, 213.341f)
                close()
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
