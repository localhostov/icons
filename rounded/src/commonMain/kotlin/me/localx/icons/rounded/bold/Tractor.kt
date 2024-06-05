package me.localx.icons.rounded.bold

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

public val Icons.Bold.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, false, -4.0f, -4.472f)
                lineTo(20.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(17.0f, 7.0f)
                lineTo(15.706f, 7.0f)
                lineTo(12.947f, 2.585f)
                arcTo(5.469f, 5.469f, 0.0f, false, false, 8.283f, 0.0f)
                lineTo(6.5f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.5f)
                lineTo(3.0f, 7.036f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, true, 1.2f, 2.4f)
                lineToRelative(-1.92f, 2.56f)
                curveToRelative(-0.012f, 0.016f, -0.022f, 0.031f, -0.033f, 0.047f)
                curveToRelative(-6.093f, -0.153f, -6.338f, 8.812f, -0.247f, 8.993f)
                arcToRelative(4.522f, 4.522f, 0.0f, false, false, 3.082f, -7.776f)
                lineTo(23.1f, 14.2f)
                arcTo(4.535f, 4.535f, 0.0f, false, false, 24.0f, 11.5f)
                close()
                moveTo(6.5f, 3.0f)
                lineTo(8.283f, 3.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, true, 10.4f, 4.175f)
                lineTo(12.169f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 3.0f)
                close()
                moveTo(18.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 21.0f)
                close()
                moveTo(11.136f, 14.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.811f, -0.629f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.851f, -1.048f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, false, -2.948f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.674f, 14.27f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.526f, 2.522f)
                arcToRelative(5.037f, 5.037f, 0.0f, false, false, 0.0f, 2.416f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.674f, 21.73f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.852f, 1.048f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, false, 2.948f, 0.0f)
                arcTo(4.989f, 4.989f, 0.0f, false, false, 9.325f, 21.73f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.527f, -2.522f)
                arcToRelative(5.037f, 5.037f, 0.0f, false, false, 0.0f, -2.416f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.136f, 14.9f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 20.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
