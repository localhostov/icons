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

public val Icons.Outline.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) {
            return _fishingRod!!
        }
        _fishingRod = Builder(name = "FishingRod", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.619f, 20.23f)
                curveToRelative(1.003f, -1.017f, 2.381f, -2.794f, 2.381f, -4.891f)
                curveToRelative(0.0f, -3.227f, -3.263f, -5.698f, -3.402f, -5.802f)
                lineToRelative(-0.598f, -0.446f)
                lineToRelative(-0.598f, 0.446f)
                curveToRelative(-0.139f, 0.104f, -3.402f, 2.575f, -3.402f, 5.802f)
                curveToRelative(0.0f, 2.096f, 1.378f, 3.874f, 2.381f, 4.891f)
                curveToRelative(-0.536f, 0.65f, -1.104f, 1.566f, -1.239f, 2.642f)
                lineToRelative(-0.142f, 1.129f)
                lineToRelative(3.0f, -1.0f)
                lineToRelative(3.0f, 1.0f)
                lineToRelative(-0.142f, -1.129f)
                curveToRelative(-0.135f, -1.075f, -0.703f, -1.992f, -1.239f, -2.642f)
                close()
                moveTo(19.998f, 11.664f)
                curveToRelative(0.767f, 0.733f, 2.002f, 2.152f, 2.002f, 3.676f)
                curveToRelative(0.0f, 1.534f, -1.233f, 2.947f, -2.0f, 3.678f)
                curveToRelative(-0.768f, -0.731f, -2.0f, -2.144f, -2.0f, -3.678f)
                reflectiveCurveToRelative(1.231f, -2.945f, 1.998f, -3.676f)
                close()
                moveTo(5.0f, 12.001f)
                curveToRelative(-0.591f, 0.0f, -1.142f, 0.173f, -1.607f, 0.469f)
                curveTo(4.417f, 7.997f, 7.915f, 2.335f, 19.0f, 2.015f)
                verticalLineToRelative(5.985f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(4.592f, 0.0f, 1.604f, 9.354f, 1.095f, 14.217f)
                curveToRelative(-0.649f, 0.331f, -1.095f, 1.006f, -1.095f, 1.783f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.172f)
                curveToRelative(0.313f, 0.111f, 0.649f, 0.172f, 1.0f, 0.172f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 16.001f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null
