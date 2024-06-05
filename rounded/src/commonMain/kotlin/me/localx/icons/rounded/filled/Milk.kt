package me.localx.icons.rounded.filled

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

public val Icons.Filled.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(9.54f)
                curveToRelative(-0.954f, -1.063f, -1.54f, -2.462f, -1.54f, -4.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineToRelative(-2.867f, 3.498f)
                curveToRelative(-0.733f, 0.894f, -1.133f, 2.014f, -1.133f, 3.169f)
                verticalLineToRelative(7.16f)
                curveToRelative(0.0f, 2.089f, 1.527f, 3.955f, 3.607f, 4.153f)
                curveToRelative(2.386f, 0.227f, 4.393f, -1.643f, 4.393f, -3.981f)
                verticalLineToRelative(-7.59f)
                curveToRelative(0.0f, -1.222f, -0.448f, -2.402f, -1.258f, -3.317f)
                lineToRelative(-2.742f, -3.093f)
                close()
                moveTo(3.714f, 6.0f)
                lineToRelative(-1.952f, 3.011f)
                curveToRelative(-0.176f, 0.318f, -0.323f, 0.647f, -0.438f, 0.989f)
                horizontalLineToRelative(12.227f)
                curveToRelative(0.261f, -0.632f, 0.596f, -1.235f, 1.034f, -1.77f)
                lineToRelative(1.828f, -2.23f)
                lineTo(3.714f, 6.0f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
