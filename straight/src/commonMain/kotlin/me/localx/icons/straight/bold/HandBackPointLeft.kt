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

public val Icons.Bold.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.861f, 2.025f)
                curveToRelative(-1.364f, -1.365f, -3.585f, -1.365f, -4.95f, 0.0f)
                lineToRelative(-3.975f, 3.975f)
                lineTo(4.0f, 6.0f)
                curveTo(1.794f, 6.0f, 0.0f, 7.794f, 0.0f, 10.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(3.829f)
                lineToRelative(2.0f, 8.0f)
                horizontalLineToRelative(14.169f)
                lineToRelative(0.017f, -14.603f)
                lineToRelative(-5.154f, -5.372f)
                close()
                moveTo(21.002f, 19.0f)
                lineTo(12.171f, 19.0f)
                lineToRelative(-2.0f, -8.0f)
                lineTo(4.0f, 11.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.821f)
                lineToRelative(1.854f, -1.854f)
                curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.686f, -0.022f)
                lineToRelative(4.296f, 4.478f)
                lineToRelative(-0.012f, 10.397f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
