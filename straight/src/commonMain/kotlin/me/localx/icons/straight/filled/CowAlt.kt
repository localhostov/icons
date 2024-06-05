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

public val Icons.Filled.CowAlt: ImageVector
    get() {
        if (_cowAlt != null) {
            return _cowAlt!!
        }
        _cowAlt = Builder(name = "CowAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.344f)
                curveToRelative(-0.721f, 1.636f, -2.527f, 3.0f, -4.656f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-12.531f)
                lineToRelative(-0.608f, 0.572f)
                lineTo(0.022f, 10.584f)
                lineToRelative(2.752f, -2.588f)
                lineToRelative(0.004f, 0.004f)
                curveToRelative(0.57f, -0.632f, 1.368f, -1.0f, 2.222f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.732f)
                lineToRelative(0.653f, 3.301f)
                curveToRelative(-0.252f, 0.529f, -0.385f, 1.109f, -0.385f, 1.699f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(21.488f, 2.0f)
                curveToRelative(0.317f, -0.591f, 0.512f, -1.268f, 0.512f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.753f, 2.0f, -1.679f, 2.0f)
                horizontalLineToRelative(-1.643f)
                curveToRelative(-0.926f, 0.0f, -1.679f, -0.897f, -1.679f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.732f, 0.195f, 1.409f, 0.512f, 2.0f)
                horizontalLineToRelative(-2.512f)
                curveToRelative(0.0f, 1.437f, 1.012f, 2.707f, 2.361f, 3.0f)
                lineToRelative(1.139f, 5.69f)
                curveToRelative(-0.307f, 0.352f, -0.5f, 0.806f, -0.5f, 1.31f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.504f, -0.193f, -0.959f, -0.5f, -1.31f)
                lineToRelative(1.139f, -5.69f)
                curveToRelative(1.349f, -0.293f, 2.361f, -1.563f, 2.361f, -3.0f)
                horizontalLineToRelative(-2.512f)
                close()
            }
        }
        .build()
        return _cowAlt!!
    }

private var _cowAlt: ImageVector? = null
