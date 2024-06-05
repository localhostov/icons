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

public val Icons.Bold.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.317f, 299.051f)
                curveToRelative(-90.917f, 8.218f, -160.183f, 85.041f, -158.976f, 176.32f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-5.909f)
                curveToRelative(-0.962f, -56.045f, 40.398f, -103.838f, 96.0f, -110.933f)
                curveToRelative(58.693f, -5.82f, 110.992f, 37.042f, 116.812f, 95.735f)
                curveToRelative(0.344f, 3.47f, 0.518f, 6.954f, 0.521f, 10.441f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineToRelative(-10.667f)
                curveToRelative(-0.104f, -94.363f, -76.685f, -170.774f, -171.047f, -170.67f)
                curveTo(251.854f, 298.668f, 248.082f, 298.797f, 244.317f, 299.051f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.008f, 256.0f)
                curveToRelative(70.692f, 0.0f, 128.0f, -57.308f, 128.0f, -128.0f)
                reflectiveCurveTo(326.7f, 0.0f, 256.008f, 0.0f)
                reflectiveCurveToRelative(-128.0f, 57.308f, -128.0f, 128.0f)
                curveTo(128.078f, 198.663f, 185.345f, 255.929f, 256.008f, 256.0f)
                close()
                moveTo(256.008f, 64.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                reflectiveCurveTo(220.662f, 64.0f, 256.008f, 64.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
