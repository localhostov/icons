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

public val Icons.Bold.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = Builder(name = "Salad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.145f, 11.7f)
                arcToRelative(4.218f, 4.218f, 0.0f, false, false, -2.036f, -1.473f)
                arcToRelative(19.929f, 19.929f, 0.0f, false, false, 0.86f, -3.465f)
                arcToRelative(3.306f, 3.306f, 0.0f, false, false, -3.732f, -3.728f)
                curveToRelative(-0.173f, 0.024f, -0.841f, 0.123f, -1.707f, 0.324f)
                lineTo(16.5f, 2.744f)
                curveTo(16.4f, 0.1f, 13.213f, -0.956f, 11.0f, 1.092f)
                curveTo(8.154f, -1.492f, 4.366f, 0.936f, 5.815f, 4.267f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -3.7f, 6.311f)
                arcTo(4.255f, 4.255f, 0.0f, false, false, 0.174f, 15.467f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 3.547f, 6.04f)
                arcTo(8.763f, 8.763f, 0.0f, false, false, 9.878f, 24.0f)
                horizontalLineToRelative(4.244f)
                arcToRelative(8.763f, 8.763f, 0.0f, false, false, 6.157f, -2.493f)
                arcToRelative(14.11f, 14.11f, 0.0f, false, false, 3.548f, -6.04f)
                arcTo(4.249f, 4.249f, 0.0f, false, false, 23.145f, 11.7f)
                close()
                moveTo(18.647f, 6.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.262f, 0.085f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, true, 0.087f, 0.27f)
                arcToRelative(17.508f, 17.508f, 0.0f, false, true, -0.912f, 3.44f)
                arcToRelative(1.471f, 1.471f, 0.0f, false, false, -0.054f, 0.2f)
                lineTo(13.056f, 9.995f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.679f, -2.289f)
                curveTo(14.405f, 7.042f, 16.563f, 6.291f, 18.647f, 6.0f)
                close()
                moveTo(7.5f, 7.0f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, true, 2.437f, 3.0f)
                lineTo(5.063f, 10.0f)
                arcTo(2.491f, 2.491f, 0.0f, false, true, 7.5f, 7.0f)
                close()
                moveTo(20.947f, 14.626f)
                arcToRelative(11.247f, 11.247f, 0.0f, false, true, -2.785f, 4.756f)
                arcTo(5.744f, 5.744f, 0.0f, false, true, 14.122f, 21.0f)
                lineTo(9.878f, 21.0f)
                arcToRelative(5.741f, 5.741f, 0.0f, false, true, -4.04f, -1.619f)
                arcToRelative(11.228f, 11.228f, 0.0f, false, true, -2.784f, -4.754f)
                arcToRelative(1.268f, 1.268f, 0.0f, false, true, 0.2f, -1.129f)
                arcToRelative(1.222f, 1.222f, 0.0f, false, true, 1.0f, -0.5f)
                horizontalLineToRelative(15.5f)
                arcToRelative(1.222f, 1.222f, 0.0f, false, true, 1.0f, 0.5f)
                arcTo(1.27f, 1.27f, 0.0f, false, true, 20.947f, 14.626f)
                close()
            }
        }
        .build()
        return _salad!!
    }

private var _salad: ImageVector? = null
