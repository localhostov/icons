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

public val Icons.Bold.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 7.805f)
                curveToRelative(0.518f, -0.575f, 0.959f, -1.235f, 1.281f, -1.986f)
                lineToRelative(1.757f, -3.728f)
                lineToRelative(-2.022f, -2.091f)
                lineToRelative(-0.592f, 0.494f)
                curveToRelative(-1.166f, 0.971f, -2.644f, 1.506f, -4.162f, 1.506f)
                lineTo(6.737f, 2.0f)
                curveToRelative(-1.518f, 0.0f, -2.996f, -0.535f, -4.162f, -1.506f)
                lineToRelative(-0.592f, -0.494f)
                lineTo(-0.038f, 2.091f)
                lineToRelative(1.757f, 3.728f)
                curveToRelative(0.322f, 0.751f, 0.763f, 1.411f, 1.281f, 1.986f)
                verticalLineToRelative(4.195f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.195f)
                close()
                moveTo(6.737f, 5.0f)
                horizontalLineToRelative(10.526f)
                curveToRelative(0.812f, 0.0f, 1.615f, -0.107f, 2.392f, -0.31f)
                curveToRelative(-0.627f, 1.404f, -2.014f, 2.31f, -3.555f, 2.31f)
                lineTo(7.9f, 7.0f)
                curveToRelative(-1.541f, 0.0f, -2.928f, -0.906f, -3.555f, -2.31f)
                curveToRelative(0.777f, 0.202f, 1.58f, 0.31f, 2.392f, 0.31f)
                close()
                moveTo(6.0f, 9.722f)
                curveToRelative(0.602f, 0.179f, 1.237f, 0.278f, 1.9f, 0.278f)
                horizontalLineToRelative(2.6f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.278f)
                close()
                moveTo(13.5f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.663f, 0.0f, 1.298f, -0.1f, 1.9f, -0.278f)
                verticalLineToRelative(2.278f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
