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

public val Icons.Filled.HundredPoints: ImageVector
    get() {
        if (_hundredPoints != null) {
            return _hundredPoints!!
        }
        _hundredPoints = Builder(name = "HundredPoints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.293f, 7.707f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.286f, -0.287f, 0.716f, -0.371f, 1.09f, -0.217f)
                curveToRelative(0.374f, 0.155f, 0.617f, 0.52f, 0.617f, 0.924f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-6.586f)
                lineToRelative(-0.293f, 0.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                close()
                moveTo(23.976f, 13.778f)
                curveToRelative(-0.123f, -0.539f, -0.662f, -0.88f, -1.197f, -0.753f)
                lineTo(0.778f, 18.025f)
                curveToRelative(-0.538f, 0.123f, -0.876f, 0.658f, -0.754f, 1.197f)
                curveToRelative(0.105f, 0.464f, 0.519f, 0.778f, 0.975f, 0.778f)
                curveToRelative(0.073f, 0.0f, 0.148f, -0.008f, 0.223f, -0.025f)
                lineToRelative(22.0f, -5.0f)
                curveToRelative(0.538f, -0.123f, 0.876f, -0.658f, 0.754f, -1.197f)
                close()
                moveTo(22.79f, 19.022f)
                lineToRelative(-14.0f, 3.0f)
                curveToRelative(-0.54f, 0.116f, -0.884f, 0.647f, -0.768f, 1.188f)
                curveToRelative(0.101f, 0.469f, 0.515f, 0.791f, 0.977f, 0.791f)
                curveToRelative(0.069f, 0.0f, 0.14f, -0.007f, 0.211f, -0.022f)
                lineToRelative(14.0f, -3.0f)
                curveToRelative(0.54f, -0.116f, 0.884f, -0.647f, 0.768f, -1.188f)
                curveToRelative(-0.116f, -0.54f, -0.643f, -0.885f, -1.188f, -0.769f)
                close()
                moveTo(16.0f, 7.5f)
                lineTo(16.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(18.0f, 7.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 9.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(9.0f, 9.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _hundredPoints!!
    }

private var _hundredPoints: ImageVector? = null
