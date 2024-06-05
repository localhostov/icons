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

public val Icons.Filled.VestPatches: ImageVector
    get() {
        if (_vestPatches != null) {
            return _vestPatches!!
        }
        _vestPatches = Builder(name = "VestPatches", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.065f)
                verticalLineToRelative(2.935f)
                curveToRelative(0.0f, 0.561f, -0.408f, 1.473f, -1.12f, 2.504f)
                curveToRelative(-0.576f, 0.833f, -0.88f, 1.811f, -0.88f, 2.83f)
                verticalLineToRelative(5.666f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 12.179f)
                lineTo(6.611f, 0.265f)
                curveToRelative(-2.106f, 0.598f, -3.611f, 2.528f, -3.611f, 4.801f)
                close()
                moveTo(6.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(15.352f, 0.008f)
                lineToRelative(-3.352f, 9.099f)
                lineTo(8.648f, 0.008f)
                curveToRelative(0.21f, -0.008f, 0.341f, -0.008f, 0.352f, -0.008f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.011f, 0.0f, 0.142f, 0.0f, 0.352f, 0.008f)
                close()
                moveTo(22.12f, 10.503f)
                curveToRelative(-0.712f, -1.031f, -1.12f, -1.943f, -1.12f, -2.504f)
                verticalLineToRelative(-2.935f)
                curveToRelative(0.0f, -2.272f, -1.505f, -4.203f, -3.611f, -4.801f)
                lineToRelative(-4.389f, 11.914f)
                verticalLineToRelative(11.821f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.666f)
                curveToRelative(0.0f, -1.019f, -0.304f, -1.998f, -0.88f, -2.83f)
                close()
                moveTo(19.437f, 14.999f)
                horizontalLineToRelative(-2.795f)
                curveToRelative(-0.449f, 0.0f, -0.716f, -0.5f, -0.467f, -0.873f)
                lineToRelative(1.17f, -1.755f)
                curveToRelative(0.331f, -0.496f, 1.059f, -0.496f, 1.39f, 0.0f)
                lineToRelative(1.17f, 1.755f)
                curveToRelative(0.249f, 0.373f, -0.019f, 0.873f, -0.467f, 0.873f)
                close()
            }
        }
        .build()
        return _vestPatches!!
    }

private var _vestPatches: ImageVector? = null
