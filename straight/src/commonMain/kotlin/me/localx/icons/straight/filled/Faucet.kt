package me.localx.icons.straight.filled

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

public val Icons.Filled.Faucet: ImageVector
    get() {
        if (_faucet != null) {
            return _faucet!!
        }
        _faucet = Builder(name = "Faucet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.768f, 23.268f)
                curveToRelative(-0.488f, 0.488f, -1.128f, 0.732f, -1.768f, 0.732f)
                curveToRelative(-0.64f, 0.0f, -1.28f, -0.244f, -1.768f, -0.732f)
                curveToRelative(-0.976f, -0.976f, -0.976f, -2.559f, 0.0f, -3.536f)
                lineToRelative(1.768f, -1.729f)
                lineToRelative(1.768f, 1.729f)
                curveToRelative(0.976f, 0.976f, 0.976f, 2.559f, 0.0f, 3.536f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(11.0f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _faucet!!
    }

private var _faucet: ImageVector? = null
