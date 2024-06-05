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

public val Icons.Outline.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.496f, 8.766f)
                lineToRelative(-3.334f, -5.001f)
                curveToRelative(-0.323f, -0.485f, -0.778f, -0.864f, -1.314f, -1.094f)
                lineTo(13.181f, 0.242f)
                curveToRelative(-0.751f, -0.321f, -1.612f, -0.322f, -2.363f, 0.0f)
                lineTo(5.152f, 2.671f)
                curveToRelative(-0.537f, 0.23f, -0.991f, 0.608f, -1.314f, 1.093f)
                lineTo(0.504f, 8.765f)
                curveToRelative(-0.33f, 0.495f, -0.504f, 1.07f, -0.504f, 1.665f)
                verticalLineToRelative(13.57f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.43f)
                curveToRelative(0.0f, -0.595f, -0.174f, -1.17f, -0.504f, -1.664f)
                close()
                moveTo(13.579f, 18.091f)
                lineToRelative(3.421f, -2.799f)
                verticalLineToRelative(5.598f)
                lineToRelative(-3.421f, -2.799f)
                close()
                moveTo(15.198f, 22.0f)
                horizontalLineToRelative(-6.397f)
                lineToRelative(3.199f, -2.617f)
                lineToRelative(3.199f, 2.617f)
                close()
                moveTo(11.999f, 16.799f)
                lineToRelative(-3.421f, -2.799f)
                horizontalLineToRelative(6.842f)
                lineToRelative(-3.421f, 2.799f)
                close()
                moveTo(6.999f, 15.292f)
                lineToRelative(3.421f, 2.799f)
                lineToRelative(-3.421f, 2.799f)
                verticalLineToRelative(-5.598f)
                close()
                moveTo(21.999f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(8.0f, 12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.43f)
                curveToRelative(0.0f, -0.198f, 0.058f, -0.39f, 0.168f, -0.555f)
                lineToRelative(3.335f, -5.002f)
                curveToRelative(0.107f, -0.162f, 0.259f, -0.288f, 0.438f, -0.364f)
                lineToRelative(5.666f, -2.428f)
                curveToRelative(0.251f, -0.107f, 0.538f, -0.107f, 0.788f, 0.0f)
                lineToRelative(5.666f, 2.428f)
                curveToRelative(0.179f, 0.077f, 0.33f, 0.203f, 0.438f, 0.365f)
                lineToRelative(3.334f, 5.002f)
                curveToRelative(0.11f, 0.165f, 0.168f, 0.356f, 0.168f, 0.554f)
                verticalLineToRelative(11.57f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
