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

public val Icons.Outline.EmailPending: ImageVector
    get() {
        if (_emailPending != null) {
            return _emailPending!!
        }
        _emailPending = Builder(name = "EmailPending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-11.0f)
                curveTo(0.0f, 5.243f, 2.243f, 3.0f, 5.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.119f, 0.0f, -2.086f, 0.623f, -2.601f, 1.534f)
                lineToRelative(7.587f, 7.587f)
                curveToRelative(1.134f, 1.133f, 3.109f, 1.133f, 4.243f, 0.0f)
                lineToRelative(0.329f, -0.329f)
                curveToRelative(0.391f, -0.389f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.392f, 0.39f, 1.024f, 0.0f, 1.415f)
                lineToRelative(-0.329f, 0.328f)
                curveToRelative(-0.944f, 0.943f, -2.199f, 1.464f, -3.535f, 1.464f)
                reflectiveCurveToRelative(-2.591f, -0.521f, -3.535f, -1.465f)
                lineToRelative(-6.571f, -6.571f)
                verticalLineToRelative(10.036f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(18.293f, 7.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null
