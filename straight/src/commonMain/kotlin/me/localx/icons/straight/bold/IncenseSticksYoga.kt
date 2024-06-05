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

public val Icons.Bold.IncenseSticksYoga: ImageVector
    get() {
        if (_incenseSticksYoga != null) {
            return _incenseSticksYoga!!
        }
        _incenseSticksYoga = Builder(name = "IncenseSticksYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.401f, 15.0f)
                lineToRelative(2.573f, -13.724f)
                lineToRelative(-2.949f, -0.553f)
                lineToRelative(-2.677f, 14.276f)
                horizontalLineToRelative(-0.849f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-0.849f)
                lineTo(6.974f, 0.724f)
                lineToRelative(-2.949f, 0.553f)
                lineToRelative(2.573f, 13.724f)
                horizontalLineTo(0.0f)
                lineToRelative(1.286f, 3.195f)
                curveToRelative(0.795f, 1.326f, 1.685f, 2.026f, 2.638f, 2.398f)
                curveToRelative(-0.046f, 0.071f, -0.092f, 0.137f, -0.138f, 0.212f)
                lineToRelative(-1.286f, 3.195f)
                horizontalLineToRelative(3.239f)
                lineToRelative(0.684f, -1.757f)
                curveToRelative(0.645f, -1.04f, 1.14f, -1.226f, 2.577f, -1.243f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.488f, 0.032f, 1.985f, 0.261f, 2.597f, 1.244f)
                lineToRelative(0.682f, 1.756f)
                horizontalLineToRelative(3.221f)
                lineToRelative(-1.268f, -3.195f)
                curveToRelative(-0.049f, -0.081f, -0.101f, -0.14f, -0.15f, -0.216f)
                curveToRelative(0.963f, -0.374f, 1.859f, -1.074f, 2.65f, -2.393f)
                lineToRelative(1.268f, -3.195f)
                horizontalLineToRelative(-6.599f)
                close()
            }
        }
        .build()
        return _incenseSticksYoga!!
    }

private var _incenseSticksYoga: ImageVector? = null
