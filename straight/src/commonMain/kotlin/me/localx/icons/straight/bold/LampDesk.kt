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

public val Icons.Bold.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) {
            return _lampDesk!!
        }
        _lampDesk = Builder(name = "LampDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.461f, 5.846f)
                lineTo(15.986f, 0.863f)
                curveToRelative(-2.028f, -1.353f, -4.755f, -1.085f, -6.481f, 0.642f)
                curveToRelative(-1.464f, 1.464f, -1.88f, 3.647f, -1.146f, 5.515f)
                lineToRelative(-3.359f, 3.359f)
                verticalLineToRelative(10.621f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-9.379f)
                lineToRelative(1.972f, -1.972f)
                lineToRelative(3.874f, 5.812f)
                lineToRelative(3.047f, -3.047f)
                curveToRelative(0.435f, 0.365f, 0.995f, 0.586f, 1.608f, 0.586f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.612f, -0.22f, -1.173f, -0.586f, -1.608f)
                lineToRelative(3.047f, -3.047f)
                close()
                moveTo(11.359f, 6.323f)
                curveToRelative(-0.563f, -0.845f, -0.451f, -1.979f, 0.267f, -2.696f)
                curveToRelative(0.412f, -0.412f, 0.961f, -0.624f, 1.513f, -0.624f)
                curveToRelative(0.411f, 0.0f, 0.823f, 0.117f, 1.184f, 0.357f)
                lineToRelative(4.43f, 2.953f)
                lineToRelative(-4.439f, 4.439f)
                lineToRelative(-2.953f, -4.43f)
                close()
            }
        }
        .build()
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
