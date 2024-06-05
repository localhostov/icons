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

public val Icons.Outline.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.941f, 12.493f)
                lineToRelative(-8.941f, -6.502f)
                verticalLineToRelative(-1.991f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.991f)
                lineTo(2.059f, 12.493f)
                curveToRelative(-1.289f, 0.938f, -2.059f, 2.45f, -2.059f, 4.044f)
                verticalLineToRelative(3.463f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.463f)
                curveToRelative(0.0f, -1.594f, -0.77f, -3.106f, -2.059f, -4.044f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.627f)
                lineToRelative(5.0f, -3.636f)
                lineToRelative(5.0f, 3.636f)
                verticalLineToRelative(10.627f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 20.0f)
                verticalLineToRelative(-3.463f)
                curveToRelative(0.0f, -0.957f, 0.462f, -1.864f, 1.236f, -2.427f)
                lineToRelative(1.764f, -1.283f)
                verticalLineToRelative(9.173f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.173f)
                lineToRelative(1.764f, 1.283f)
                curveToRelative(0.774f, 0.563f, 1.236f, 1.47f, 1.236f, 2.427f)
                verticalLineToRelative(3.463f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
