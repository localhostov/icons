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

public val Icons.Bold.Leadership: ImageVector
    get() {
        if (_leadership != null) {
            return _leadership!!
        }
        _leadership = Builder(name = "Leadership", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.0f, 14.225f)
                lineToRelative(5.0f, -3.469f)
                verticalLineToRelative(3.651f)
                lineToRelative(-13.825f, 9.593f)
                horizontalLineToRelative(-5.262f)
                lineToRelative(1.087f, -0.754f)
                verticalLineToRelative(-3.246f)
                horizontalLineToRelative(-2.032f)
                lineToRelative(-0.018f, 1.382f)
                lineToRelative(-0.848f, 2.618f)
                lineTo(0.0f, 24.0f)
                lineToRelative(1.0f, -3.194f)
                verticalLineToRelative(-6.306f)
                curveToRelative(0.0f, -1.266f, 0.945f, -2.302f, 2.166f, -2.466f)
                lineToRelative(4.468f, -1.364f)
                lineToRelative(4.126f, -3.971f)
                lineToRelative(0.006f, 0.006f)
                curveToRelative(0.45f, -0.435f, 1.06f, -0.705f, 1.735f, -0.705f)
                horizontalLineToRelative(4.5f)
                lineTo(18.001f, 0.0f)
                lineToRelative(6.0f, 2.5f)
                lineToRelative(-3.0f, 2.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.225f)
                close()
                moveTo(11.0f, 11.594f)
                lineToRelative(-1.804f, 1.736f)
                lineToRelative(-3.196f, 0.975f)
                verticalLineToRelative(2.695f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.164f)
                lineToRelative(2.0f, -1.388f)
                verticalLineToRelative(-8.182f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.695f)
                lineToRelative(2.0f, -1.388f)
                verticalLineToRelative(-2.307f)
                close()
                moveTo(3.5f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _leadership!!
    }

private var _leadership: ImageVector? = null
