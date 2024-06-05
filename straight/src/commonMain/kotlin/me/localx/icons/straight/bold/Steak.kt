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

public val Icons.Bold.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 24.0f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, -4.9f, -2.309f)
                arcToRelative(3.625f, 3.625f, 0.0f, false, false, -3.212f, -1.509f)
                curveTo(4.269f, 20.182f, 0.0f, 15.466f, 0.0f, 10.091f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 10.091f, 0.0f)
                curveTo(19.8f, 0.0f, 24.0f, 11.423f, 24.0f, 17.25f)
                arcTo(6.758f, 6.758f, 0.0f, false, true, 17.25f, 24.0f)
                close()
                moveTo(10.091f, 3.0f)
                arcTo(7.1f, 7.1f, 0.0f, false, false, 3.0f, 10.091f)
                curveToRelative(0.0f, 4.058f, 3.24f, 7.091f, 6.136f, 7.091f)
                arcToRelative(6.566f, 6.566f, 0.0f, false, true, 5.4f, 2.459f)
                arcTo(3.117f, 3.117f, 0.0f, false, false, 17.25f, 21.0f)
                arcTo(3.754f, 3.754f, 0.0f, false, false, 21.0f, 17.25f)
                curveTo(21.0f, 13.057f, 17.861f, 3.0f, 10.091f, 3.0f)
                close()
                moveTo(10.091f, 5.0f)
                arcTo(5.1f, 5.1f, 0.0f, false, false, 5.0f, 10.091f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, 0.132f, 1.184f)
                lineTo(11.29f, 5.118f)
                arcTo(6.323f, 6.323f, 0.0f, false, false, 10.091f, 5.0f)
                close()
                moveTo(18.062f, 12.491f)
                arcToRelative(17.043f, 17.043f, 0.0f, false, false, -1.32f, -2.923f)
                lineToRelative(-5.784f, 5.784f)
                arcToRelative(7.989f, 7.989f, 0.0f, false, true, 3.058f, 1.184f)
                close()
                moveTo(16.0f, 18.272f)
                curveToRelative(0.5f, 0.562f, 0.68f, 0.728f, 1.253f, 0.728f)
                arcTo(1.752f, 1.752f, 0.0f, false, false, 19.0f, 17.25f)
                arcToRelative(12.664f, 12.664f, 0.0f, false, false, -0.31f, -2.527f)
                lineToRelative(-3.111f, 3.111f)
                curveTo(15.729f, 17.988f, 15.872f, 18.133f, 16.0f, 18.272f)
                close()
                moveTo(13.357f, 5.911f)
                lineTo(6.019f, 13.249f)
                arcToRelative(4.779f, 4.779f, 0.0f, false, false, 2.419f, 1.823f)
                lineTo(15.61f, 7.9f)
                arcTo(8.572f, 8.572f, 0.0f, false, false, 13.357f, 5.911f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null
