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

public val Icons.Bold.HandsHolding: ImageVector
    get() {
        if (_handsHolding != null) {
            return _handsHolding!!
        }
        _handsHolding = Builder(name = "HandsHolding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(11.015f)
                curveToRelative(0.0f, 2.003f, -0.78f, 3.887f, -2.197f, 5.303f)
                lineToRelative(-0.743f, 0.743f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(0.743f, -0.743f)
                curveToRelative(0.85f, -0.85f, 1.318f, -1.98f, 1.318f, -3.182f)
                verticalLineToRelative(-1.145f)
                lineToRelative(-2.443f, 2.425f)
                curveToRelative(-0.292f, 0.291f, -0.675f, 0.436f, -1.057f, 0.436f)
                curveToRelative(-0.386f, 0.0f, -0.771f, -0.148f, -1.064f, -0.443f)
                curveToRelative(-0.584f, -0.588f, -0.58f, -1.538f, 0.008f, -2.121f)
                lineToRelative(2.423f, -2.405f)
                curveToRelative(0.195f, -0.322f, 0.148f, -0.746f, -0.123f, -1.017f)
                curveToRelative(-0.314f, -0.313f, -0.86f, -0.313f, -1.173f, 0.0f)
                lineToRelative(-4.012f, 4.012f)
                curveToRelative(0.28f, 0.781f, 0.429f, 1.593f, 0.429f, 2.436f)
                verticalLineToRelative(2.81f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.81f)
                curveToRelative(0.0f, -1.254f, -0.532f, -2.396f, -1.627f, -3.492f)
                lineToRelative(-2.876f, -2.876f)
                curveToRelative(-0.323f, -0.324f, -0.824f, -0.401f, -1.137f, -0.178f)
                curveToRelative(-0.245f, 0.174f, -0.325f, 0.398f, -0.35f, 0.557f)
                curveToRelative(-0.03f, 0.196f, 0.008f, 0.391f, 0.11f, 0.558f)
                lineToRelative(2.45f, 2.431f)
                curveToRelative(0.588f, 0.583f, 0.592f, 1.534f, 0.008f, 2.122f)
                curveToRelative(-0.584f, 0.588f, -1.534f, 0.591f, -2.122f, 0.008f)
                lineToRelative(-2.443f, -2.425f)
                verticalLineToRelative(1.119f)
                curveToRelative(0.0f, 1.202f, 0.468f, 2.332f, 1.318f, 3.182f)
                lineToRelative(0.743f, 0.743f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-0.743f, -0.743f)
                curveToRelative(-1.417f, -1.417f, -2.197f, -3.3f, -2.197f, -5.303f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(3.602f)
                curveToRelative(1.255f, -0.264f, 2.618f, 0.111f, 3.605f, 1.099f)
                lineToRelative(2.876f, 2.876f)
                curveToRelative(0.173f, 0.173f, 0.331f, 0.349f, 0.486f, 0.527f)
                lineToRelative(3.482f, -3.482f)
                curveToRelative(0.93f, -0.93f, 2.303f, -1.255f, 3.551f, -0.988f)
                verticalLineToRelative(-3.634f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _handsHolding!!
    }

private var _handsHolding: ImageVector? = null
