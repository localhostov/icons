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

public val Icons.Bold.EnvelopeBulk: ImageVector
    get() {
        if (_envelopeBulk != null) {
            return _envelopeBulk!!
        }
        _envelopeBulk = Builder(name = "EnvelopeBulk", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                lineTo(7.5f, 0.0f)
                curveTo(5.019f, 0.0f, 3.0f, 2.019f, 3.0f, 4.5f)
                verticalLineToRelative(5.757f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(7.5f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.864f, 0.0f, -3.43f, 1.275f, -3.874f, 3.0f)
                horizontalLineToRelative(-2.126f)
                lineTo(6.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.38f, 13.0f)
                lineToRelative(-2.738f, 2.737f)
                curveToRelative(-0.34f, 0.34f, -0.929f, 0.339f, -1.268f, 0.0f)
                lineToRelative(-2.738f, -2.737f)
                horizontalLineToRelative(6.743f)
                close()
                moveTo(13.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-3.895f)
                lineToRelative(2.253f, 2.253f)
                curveToRelative(1.451f, 1.512f, 4.06f, 1.512f, 5.511f, 0.0f)
                lineToRelative(2.236f, -2.236f)
                verticalLineToRelative(3.878f)
                close()
                moveTo(19.5f, 13.0f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.967f, 0.0f, -3.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _envelopeBulk!!
    }

private var _envelopeBulk: ImageVector? = null
