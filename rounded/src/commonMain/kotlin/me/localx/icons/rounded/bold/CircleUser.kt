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

public val Icons.Bold.CircleUser: ImageVector
    get() {
        if (_circleUser != null) {
            return _circleUser!!
        }
        _circleUser = Builder(name = "CircleUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.52f, 20.299f)
                curveToRelative(0.107f, -1.835f, 1.619f, -3.299f, 3.48f, -3.299f)
                reflectiveCurveToRelative(3.373f, 1.464f, 3.48f, 3.299f)
                curveToRelative(-1.071f, 0.451f, -2.247f, 0.701f, -3.48f, 0.701f)
                reflectiveCurveToRelative(-2.409f, -0.25f, -3.48f, -0.701f)
                close()
                moveTo(18.188f, 18.518f)
                curveToRelative(-0.84f, -2.617f, -3.296f, -4.518f, -6.188f, -4.518f)
                reflectiveCurveToRelative(-5.348f, 1.901f, -6.188f, 4.518f)
                curveToRelative(-1.727f, -1.641f, -2.812f, -3.953f, -2.812f, -6.518f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                curveToRelative(0.0f, 2.565f, -1.084f, 4.877f, -2.812f, 6.518f)
                close()
                moveTo(15.499f, 8.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _circleUser!!
    }

private var _circleUser: ImageVector? = null
