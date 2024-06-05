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

public val Icons.Outline.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 0.0f)
                lineTo(1.879f, 5.121f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.885f, 2.127f)
                lineToRelative(4.115f, 4.049f)
                verticalLineToRelative(7.581f)
                curveToRelative(0.0f, 0.881f, 0.385f, 1.714f, 1.057f, 2.286f)
                curveToRelative(0.546f, 0.465f, 1.236f, 0.714f, 1.948f, 0.714f)
                curveToRelative(0.163f, 0.0f, 0.328f, -0.013f, 0.492f, -0.04f)
                curveToRelative(1.427f, -0.232f, 2.503f, -1.551f, 2.503f, -3.066f)
                verticalLineToRelative(-5.073f)
                lineToRelative(10.0f, -2.0f)
                lineTo(22.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                close()
                moveTo(20.0f, 12.18f)
                lineToRelative(-10.0f, 2.0f)
                verticalLineToRelative(6.713f)
                curveToRelative(0.0f, 0.537f, -0.362f, 1.017f, -0.825f, 1.093f)
                curveToRelative(-0.301f, 0.048f, -0.595f, -0.03f, -0.823f, -0.224f)
                curveToRelative(-0.224f, -0.19f, -0.353f, -0.468f, -0.353f, -0.762f)
                lineTo(7.999f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.613f)
                lineToRelative(-2.707f, -2.664f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.439f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.293f, -0.707f)
                lineTo(7.828f, 2.0f)
                horizontalLineToRelative(12.172f)
                lineTo(20.0f, 12.18f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
