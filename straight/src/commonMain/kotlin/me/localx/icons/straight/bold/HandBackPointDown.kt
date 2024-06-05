package me.localx.icons.straight.bold

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

public val Icons.Bold.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.397f, 0.0f)
                lineTo(2.025f, 5.153f)
                curveToRelative(-1.365f, 1.365f, -1.365f, 3.585f, 0.0f, 4.95f)
                lineToRelative(3.975f, 3.975f)
                verticalLineToRelative(5.937f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.829f)
                lineToRelative(8.0f, -2.0f)
                lineTo(22.0f, 0.017f)
                lineTo(7.397f, 0.0f)
                close()
                moveTo(19.0f, 11.844f)
                lineToRelative(-8.0f, 2.0f)
                verticalLineToRelative(6.171f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(9.0f, 8.014f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.821f)
                lineToRelative(-1.854f, -1.854f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, -0.022f, -0.686f)
                lineTo(8.603f, 3.0f)
                lineToRelative(10.397f, 0.012f)
                lineTo(19.0f, 11.843f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
