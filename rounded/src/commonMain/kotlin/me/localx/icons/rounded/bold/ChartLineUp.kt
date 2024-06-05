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

public val Icons.Bold.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) {
            return _chartLineUp!!
        }
        _chartLineUp = Builder(name = "ChartLineUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 1.5f)
                curveTo(0.033f, -0.472f, 2.967f, -0.471f, 3.0f, 1.5f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                lineTo(22.5f, 21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.972f, 0.033f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(1.348f)
                lineToRelative(-2.909f, 2.854f)
                curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.708f, 0.0f)
                curveToRelative(-0.06f, -0.06f, -1.276f, -0.929f, -1.276f, -0.929f)
                curveToRelative(-1.371f, -1.264f, -3.513f, -1.231f, -4.806f, 0.062f)
                lineToRelative(-3.671f, 3.414f)
                curveToRelative(-0.606f, 0.564f, -0.641f, 1.514f, -0.077f, 2.12f)
                curveToRelative(0.566f, 0.608f, 1.514f, 0.64f, 2.12f, 0.077f)
                lineToRelative(3.71f, -3.452f)
                curveToRelative(0.195f, -0.194f, 0.512f, -0.195f, 0.708f, 0.0f)
                curveToRelative(0.06f, 0.06f, 1.276f, 0.929f, 1.276f, 0.929f)
                curveToRelative(1.373f, 1.264f, 3.515f, 1.23f, 4.835f, -0.09f)
                lineToRelative(2.95f, -2.893f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.033f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
