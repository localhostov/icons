package me.localx.icons.straight.filled

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

public val Icons.Filled.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.421f, 19.092f)
                lineToRelative(-3.421f, 2.799f)
                verticalLineToRelative(-5.598f)
                lineToRelative(3.421f, 2.799f)
                close()
                moveTo(12.0f, 17.8f)
                lineToRelative(3.421f, -2.799f)
                horizontalLineToRelative(-6.842f)
                lineToRelative(3.421f, 2.799f)
                close()
                moveTo(17.0f, 21.891f)
                verticalLineToRelative(-5.598f)
                lineToRelative(-3.421f, 2.799f)
                lineToRelative(3.421f, 2.799f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 10.429f)
                verticalLineToRelative(13.57f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-7.998f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(8.0f, 13.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.998f)
                lineTo(0.0f, 23.999f)
                lineTo(0.0f, 10.429f)
                curveToRelative(0.0f, -0.595f, 0.174f, -1.17f, 0.504f, -1.665f)
                lineTo(3.838f, 3.763f)
                curveToRelative(0.323f, -0.485f, 0.777f, -0.863f, 1.314f, -1.093f)
                lineTo(10.818f, 0.242f)
                curveToRelative(0.751f, -0.322f, 1.612f, -0.322f, 2.363f, 0.0f)
                lineToRelative(5.667f, 2.429f)
                curveToRelative(0.537f, 0.23f, 0.991f, 0.608f, 1.314f, 1.094f)
                lineToRelative(3.334f, 5.001f)
                curveToRelative(0.33f, 0.494f, 0.504f, 1.069f, 0.504f, 1.664f)
                close()
                moveTo(15.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(16.419f, 24.0f)
                lineToRelative(-4.419f, -3.616f)
                lineToRelative(-4.419f, 3.616f)
                horizontalLineToRelative(8.839f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
