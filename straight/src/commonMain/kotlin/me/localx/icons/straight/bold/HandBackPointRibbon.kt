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

public val Icons.Bold.HandBackPointRibbon: ImageVector
    get() {
        if (_handBackPointRibbon != null) {
            return _handBackPointRibbon!!
        }
        _handBackPointRibbon = Builder(name = "HandBackPointRibbon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.829f)
                verticalLineToRelative(-3.829f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(6.0f, 1.794f, 6.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 5.0f)
                lineToRelative(2.0f, 1.5f)
                lineToRelative(-2.0f, 1.5f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(1.937f)
                lineToRelative(-3.975f, 3.975f)
                curveToRelative(-1.365f, 1.365f, -1.365f, 3.585f, 0.022f, 4.972f)
                lineToRelative(5.351f, 5.132f)
                lineToRelative(14.602f, -0.018f)
                lineTo(22.0f, 9.829f)
                lineToRelative(-8.0f, -2.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 21.002f)
                lineToRelative(-10.398f, 0.012f)
                lineToRelative(-4.456f, -4.273f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0.0f, -0.708f)
                lineToRelative(1.854f, -1.854f)
                verticalLineToRelative(1.821f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.171f)
                lineToRelative(8.0f, 2.0f)
                verticalLineToRelative(8.831f)
                close()
            }
        }
        .build()
        return _handBackPointRibbon!!
    }

private var _handBackPointRibbon: ImageVector? = null
