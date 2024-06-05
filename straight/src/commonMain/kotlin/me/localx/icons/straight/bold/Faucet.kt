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

public val Icons.Bold.Faucet: ImageVector
    get() {
        if (_faucet != null) {
            return _faucet!!
        }
        _faucet = Builder(name = "Faucet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.268f, 19.732f)
                curveToRelative(0.976f, 0.976f, 0.976f, 2.559f, 0.0f, 3.536f)
                curveToRelative(-0.488f, 0.488f, -1.128f, 0.732f, -1.768f, 0.732f)
                curveToRelative(-0.64f, 0.0f, -1.28f, -0.244f, -1.768f, -0.732f)
                curveToRelative(-0.976f, -0.976f, -0.976f, -2.559f, 0.0f, -3.536f)
                lineToRelative(1.768f, -1.729f)
                lineToRelative(1.768f, 1.729f)
                close()
                moveTo(24.0f, 14.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(5.238f, 0.0f, 9.5f, 4.262f, 9.5f, 9.5f)
                close()
                moveTo(20.981f, 14.0f)
                curveToRelative(-0.256f, -3.352f, -3.065f, -6.0f, -6.481f, -6.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.76f, 0.0f, 3.221f, 1.306f, 3.464f, 3.0f)
                horizontalLineToRelative(3.017f)
                close()
            }
        }
        .build()
        return _faucet!!
    }

private var _faucet: ImageVector? = null
