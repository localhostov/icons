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

public val Icons.Bold.Lettuce: ImageVector
    get() {
        if (_lettuce != null) {
            return _lettuce!!
        }
        _lettuce = Builder(name = "Lettuce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineToRelative(-0.029f, 0.0f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineToRelative(-0.388f)
                arcTo(5.045f, 5.045f, 0.0f, false, false, 7.388f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(4.951f, 4.951f, 0.0f, false, false, 4.029f, 4.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, -2.5f, 7.1f)
                arcTo(3.96f, 3.96f, 0.0f, false, false, 1.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.169f, 3.911f)
                arcTo(3.953f, 3.953f, 0.0f, false, false, 4.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                curveToRelative(0.122f, 0.0f, 0.239f, -0.019f, 0.359f, -0.03f)
                arcToRelative(6.937f, 6.937f, 0.0f, false, false, 2.141f, 0.86f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(22.83f)
                arcToRelative(6.937f, 6.937f, 0.0f, false, false, 2.141f, -0.86f)
                curveToRelative(0.119f, 0.011f, 0.237f, 0.03f, 0.359f, 0.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, false, -0.169f, -1.089f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 13.0f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -0.5f, -1.9f)
                arcTo(3.973f, 3.973f, 0.0f, false, false, 24.0f, 8.0f)
                close()
                moveTo(10.5f, 9.0f)
                verticalLineTo(19.7f)
                arcTo(4.013f, 4.013f, 0.0f, false, true, 8.0f, 16.035f)
                lineTo(8.0f, 15.142f)
                lineTo(7.2f, 14.723f)
                arcTo(2.235f, 2.235f, 0.0f, false, true, 6.0f, 12.75f)
                arcToRelative(2.212f, 2.212f, 0.0f, false, true, 0.318f, -1.125f)
                lineToRelative(0.7f, -1.2f)
                lineToRelative(-1.146f, -0.79f)
                arcTo(1.967f, 1.967f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 6.0f)
                horizontalLineTo(9.86f)
                lineToRelative(0.15f, -1.331f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, true, 3.98f, 0.0f)
                lineTo(14.14f, 6.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(1.967f, 1.967f, 0.0f, false, true, -0.875f, 1.633f)
                lineToRelative(-1.146f, 0.79f)
                lineToRelative(0.7f, 1.2f)
                arcTo(2.212f, 2.212f, 0.0f, false, true, 18.0f, 12.75f)
                arcToRelative(2.235f, 2.235f, 0.0f, false, true, -1.2f, 1.973f)
                lineToRelative(-0.791f, 0.419f)
                lineTo(16.0f, 16.035f)
                arcTo(4.011f, 4.011f, 0.0f, false, true, 13.5f, 19.7f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _lettuce!!
    }

private var _lettuce: ImageVector? = null
