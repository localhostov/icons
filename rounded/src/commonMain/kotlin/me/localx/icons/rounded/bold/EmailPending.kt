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

public val Icons.Bold.EmailPending: ImageVector
    get() {
        if (_emailPending != null) {
            return _emailPending!!
        }
        _emailPending = Builder(name = "EmailPending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-10.0f)
                curveTo(0.0f, 5.468f, 2.467f, 3.0f, 5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.92f, 0.0f, -1.717f, 0.505f, -2.151f, 1.248f)
                lineToRelative(7.025f, 7.081f)
                curveToRelative(0.861f, 0.861f, 2.386f, 0.866f, 3.258f, -0.005f)
                lineToRelative(2.228f, -2.228f)
                curveToRelative(0.339f, -0.339f, 0.816f, -0.492f, 1.29f, -0.413f)
                curveToRelative(0.014f, 0.002f, 0.028f, 0.005f, 0.042f, 0.007f)
                curveToRelative(1.189f, 0.194f, 1.659f, 1.658f, 0.807f, 2.509f)
                lineToRelative(-2.098f, 2.098f)
                curveToRelative(-0.871f, 0.871f, -1.985f, 1.505f, -3.208f, 1.659f)
                curveToRelative(-1.67f, 0.21f, -3.281f, -0.346f, -4.446f, -1.511f)
                lineToRelative(-5.247f, -5.299f)
                verticalLineToRelative(7.353f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(14.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(0.0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.391f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null
