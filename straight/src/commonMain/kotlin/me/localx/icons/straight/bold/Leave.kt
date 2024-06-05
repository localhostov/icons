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

public val Icons.Bold.Leave: ImageVector
    get() {
        if (_leave != null) {
            return _leave!!
        }
        _leave = Builder(name = "Leave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 4.7f)
                curveTo(0.0f, 3.039f, 1.183f, 1.596f, 2.813f, 1.269f)
                lineTo(8.813f, 0.068f)
                curveToRelative(1.034f, -0.207f, 2.092f, 0.059f, 2.906f, 0.726f)
                curveToRelative(0.406f, 0.333f, 0.725f, 0.746f, 0.944f, 1.206f)
                horizontalLineToRelative(1.837f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 3.501f)
                curveToRelative(0.0f, -0.206f, -0.115f, -0.331f, -0.183f, -0.387f)
                curveToRelative(-0.068f, -0.057f, -0.214f, -0.142f, -0.415f, -0.104f)
                lineToRelative(-6.0f, 1.2f)
                curveToRelative(-0.233f, 0.047f, -0.402f, 0.253f, -0.402f, 0.49f)
                verticalLineToRelative(16.3f)
                horizontalLineToRelative(7.0f)
                lineTo(10.0f, 3.501f)
                close()
                moveTo(23.658f, 13.793f)
                lineToRelative(-3.707f, -3.793f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.951f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.951f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.707f, -3.793f)
                curveToRelative(0.391f, -0.39f, 0.391f, -1.024f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _leave!!
    }

private var _leave: ImageVector? = null
