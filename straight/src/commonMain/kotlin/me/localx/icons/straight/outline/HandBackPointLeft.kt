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

public val Icons.Outline.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.879f, 1.879f)
                curveToRelative(-1.134f, -1.134f, -3.104f, -1.14f, -4.249f, 0.006f)
                lineToRelative(-4.049f, 4.115f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-0.881f, 0.0f, -1.714f, 0.385f, -2.286f, 1.057f)
                curveTo(0.143f, 7.729f, -0.103f, 8.618f, 0.041f, 9.497f)
                curveToRelative(0.232f, 1.427f, 1.551f, 2.503f, 3.066f, 2.503f)
                horizontalLineToRelative(5.073f)
                lineToRelative(2.0f, 10.0f)
                horizontalLineToRelative(13.82f)
                lineTo(24.0f, 7.0f)
                lineTo(18.879f, 1.879f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(11.82f, 20.0f)
                lineToRelative(-2.0f, -10.0f)
                lineTo(3.107f, 10.0f)
                curveToRelative(-0.537f, 0.0f, -1.017f, -0.362f, -1.093f, -0.825f)
                curveToRelative(-0.049f, -0.303f, 0.03f, -0.595f, 0.224f, -0.823f)
                curveToRelative(0.19f, -0.224f, 0.468f, -0.353f, 0.762f, -0.353f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.613f)
                lineToRelative(2.664f, -2.707f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                lineToRelative(4.536f, 4.535f)
                verticalLineToRelative(12.172f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
