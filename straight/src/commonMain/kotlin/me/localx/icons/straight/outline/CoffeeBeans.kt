package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.CoffeeBeans: ImageVector
    get() {
        if (_coffeeBeans != null) {
            return _coffeeBeans!!
        }
        _coffeeBeans = Builder(name = "CoffeeBeans", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.833f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 3.439f, -6.0f, 7.667f)
                reflectiveCurveToRelative(2.691f, 7.667f, 6.0f, 7.667f)
                reflectiveCurveToRelative(6.0f, -3.439f, 6.0f, -7.667f)
                reflectiveCurveToRelative(-2.691f, -7.667f, -6.0f, -7.667f)
                close()
                moveTo(14.0f, 16.5f)
                curveToRelative(0.0f, -2.823f, 1.466f, -5.163f, 3.374f, -5.591f)
                curveToRelative(0.352f, 0.662f, 1.024f, 2.48f, -0.274f, 5.154f)
                curveToRelative(-1.146f, 2.36f, -1.087f, 4.277f, -0.758f, 5.588f)
                curveToRelative(-1.38f, -0.895f, -2.343f, -2.865f, -2.343f, -5.152f)
                close()
                moveTo(18.626f, 22.091f)
                curveToRelative(-0.352f, -0.662f, -1.024f, -2.48f, 0.274f, -5.154f)
                curveToRelative(1.146f, -2.36f, 1.087f, -4.278f, 0.758f, -5.588f)
                curveToRelative(1.38f, 0.895f, 2.343f, 2.865f, 2.343f, 5.152f)
                curveToRelative(0.0f, 2.823f, -1.466f, 5.163f, -3.374f, 5.591f)
                close()
                moveTo(12.507f, 1.493f)
                curveTo(11.317f, 0.303f, 9.609f, -0.201f, 7.707f, 0.07f)
                curveToRelative(-1.799f, 0.257f, -3.58f, 1.188f, -5.014f, 2.623f)
                curveTo(-0.343f, 5.729f, -0.882f, 10.132f, 1.493f, 12.507f)
                curveToRelative(0.979f, 0.979f, 2.307f, 1.495f, 3.809f, 1.495f)
                curveToRelative(0.323f, 0.0f, 0.654f, -0.024f, 0.991f, -0.072f)
                curveToRelative(1.799f, -0.257f, 3.58f, -1.188f, 5.014f, -2.623f)
                curveToRelative(3.036f, -3.036f, 3.575f, -7.438f, 1.2f, -9.813f)
                close()
                moveTo(4.108f, 4.107f)
                curveToRelative(1.13f, -1.13f, 2.509f, -1.86f, 3.882f, -2.057f)
                curveToRelative(0.239f, -0.034f, 0.472f, -0.052f, 0.698f, -0.052f)
                curveToRelative(0.727f, 0.0f, 1.379f, 0.175f, 1.91f, 0.512f)
                curveToRelative(-0.217f, 0.723f, -1.036f, 2.542f, -3.926f, 3.543f)
                curveToRelative(-2.547f, 0.883f, -3.885f, 2.325f, -4.583f, 3.51f)
                curveToRelative(-0.374f, -1.65f, 0.352f, -3.791f, 2.018f, -5.457f)
                close()
                moveTo(9.893f, 9.892f)
                curveToRelative(-1.13f, 1.13f, -2.509f, 1.86f, -3.882f, 2.057f)
                curveToRelative(-1.012f, 0.144f, -1.911f, -0.024f, -2.606f, -0.466f)
                curveToRelative(0.219f, -0.726f, 1.041f, -2.539f, 3.924f, -3.538f)
                curveToRelative(2.547f, -0.883f, 3.885f, -2.325f, 4.583f, -3.51f)
                curveToRelative(0.374f, 1.65f, -0.352f, 3.791f, -2.018f, 5.457f)
                close()
            }
        }
        .build()
        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null
