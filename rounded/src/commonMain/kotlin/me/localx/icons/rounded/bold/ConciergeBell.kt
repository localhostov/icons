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

public val Icons.Bold.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) {
            return _conciergeBell!!
        }
        _conciergeBell = Builder(name = "ConciergeBell", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.942f)
                curveToRelative(1.097f, 0.0f, 2.117f, -0.494f, 2.8f, -1.355f)
                curveToRelative(0.666f, -0.839f, 0.908f, -1.911f, 0.667f, -2.941f)
                curveToRelative(-1.196f, -5.114f, -5.447f, -8.951f, -10.409f, -9.604f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.099f)
                curveTo(5.539f, 5.752f, 1.288f, 9.589f, 0.091f, 14.703f)
                curveToRelative(-0.241f, 1.031f, 0.001f, 2.103f, 0.667f, 2.942f)
                curveToRelative(0.683f, 0.861f, 1.703f, 1.355f, 2.8f, 1.355f)
                horizontalLineToRelative(6.942f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(22.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.109f, 15.781f)
                curveToRelative(-0.066f, -0.084f, -0.137f, -0.22f, -0.097f, -0.394f)
                curveToRelative(1.001f, -4.28f, 4.781f, -7.387f, 8.988f, -7.387f)
                reflectiveCurveToRelative(7.986f, 3.106f, 8.988f, 7.387f)
                curveToRelative(0.041f, 0.173f, -0.03f, 0.31f, -0.097f, 0.394f)
                curveToRelative(-0.052f, 0.066f, -0.201f, 0.219f, -0.449f, 0.219f)
                horizontalLineTo(3.558f)
                curveToRelative(-0.249f, 0.0f, -0.397f, -0.153f, -0.449f, -0.219f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
