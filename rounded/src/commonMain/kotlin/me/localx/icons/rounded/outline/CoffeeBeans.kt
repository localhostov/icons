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
                moveToRelative(18.0f, 9.009f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 3.365f, -6.0f, 7.501f)
                reflectiveCurveToRelative(2.691f, 7.5f, 6.0f, 7.5f)
                reflectiveCurveToRelative(6.0f, -3.364f, 6.0f, -7.5f)
                reflectiveCurveToRelative(-2.691f, -7.501f, -6.0f, -7.501f)
                close()
                moveTo(14.0f, 16.51f)
                curveToRelative(0.0f, -2.76f, 1.485f, -5.051f, 3.414f, -5.442f)
                curveToRelative(0.38f, 0.571f, 1.235f, 2.322f, -0.277f, 4.942f)
                curveToRelative(-1.302f, 2.258f, -1.289f, 4.11f, -0.94f, 5.409f)
                curveToRelative(-1.303f, -0.908f, -2.198f, -2.768f, -2.198f, -4.909f)
                close()
                moveTo(18.592f, 21.95f)
                curveToRelative(-0.38f, -0.572f, -1.232f, -2.321f, 0.278f, -4.94f)
                curveToRelative(1.301f, -2.255f, 1.289f, -4.105f, 0.941f, -5.404f)
                curveToRelative(1.298f, 0.91f, 2.189f, 2.767f, 2.189f, 4.904f)
                curveToRelative(0.0f, 2.756f, -1.482f, 5.045f, -3.408f, 5.44f)
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
                curveToRelative(0.727f, 0.0f, 1.379f, 0.175f, 1.911f, 0.512f)
                curveToRelative(-0.218f, 0.723f, -1.038f, 2.543f, -3.926f, 3.543f)
                curveToRelative(-2.55f, 0.884f, -3.888f, 2.328f, -4.586f, 3.514f)
                curveToRelative(-0.375f, -1.65f, 0.354f, -3.795f, 2.021f, -5.461f)
                close()
                moveTo(9.893f, 9.892f)
                curveToRelative(-1.13f, 1.13f, -2.509f, 1.86f, -3.882f, 2.057f)
                curveToRelative(-1.012f, 0.144f, -1.913f, -0.019f, -2.609f, -0.461f)
                curveToRelative(0.218f, -0.724f, 1.038f, -2.542f, 3.926f, -3.543f)
                curveToRelative(2.55f, -0.884f, 3.888f, -2.328f, 4.586f, -3.514f)
                curveToRelative(0.375f, 1.65f, -0.354f, 3.795f, -2.021f, 5.461f)
                close()
            }
        }
        .build()
        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null
