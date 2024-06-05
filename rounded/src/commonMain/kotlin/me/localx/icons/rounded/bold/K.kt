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

public val Icons.Bold.K: ImageVector
    get() {
        if (_k != null) {
            return _k!!
        }
        _k = Builder(name = "K", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.845f, 12.917f)
                lineTo(21.756f, 2.319f)
                curveToRelative(0.453f, -0.694f, 0.257f, -1.623f, -0.437f, -2.076f)
                curveToRelative(-0.694f, -0.454f, -1.624f, -0.256f, -2.076f, 0.437f)
                lineToRelative(-6.73f, 10.319f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.5f)
                curveToRelative(-0.033f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineTo(22.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(6.878f)
                lineToRelative(7.445f, 9.43f)
                curveToRelative(0.516f, 0.654f, 1.461f, 0.758f, 2.107f, 0.248f)
                curveToRelative(0.65f, -0.514f, 0.761f, -1.457f, 0.248f, -2.107f)
                lineToRelative(-6.832f, -8.654f)
                close()
            }
        }
        .build()
        return _k!!
    }

private var _k: ImageVector? = null
