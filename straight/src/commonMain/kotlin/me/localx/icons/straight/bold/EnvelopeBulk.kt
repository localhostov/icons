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
                moveTo(24.0f, 10.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(19.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.536f)
                curveToRelative(-1.694f, 0.243f, -3.0f, 1.704f, -3.0f, 3.464f)
                verticalLineToRelative(10.5f)
                lineTo(16.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 10.5f)
                close()
                moveTo(6.5f, 3.0f)
                lineTo(15.5f, 3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.76f, 0.0f, -3.221f, 1.306f, -3.464f, 3.0f)
                horizontalLineToRelative(-2.036f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(11.38f, 13.0f)
                lineToRelative(-2.738f, 2.737f)
                curveToRelative(-0.34f, 0.34f, -0.929f, 0.339f, -1.268f, 0.0f)
                lineToRelative(-2.738f, -2.737f)
                horizontalLineToRelative(6.743f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.395f)
                lineToRelative(2.253f, 2.253f)
                curveToRelative(0.736f, 0.736f, 1.715f, 1.142f, 2.756f, 1.142f)
                reflectiveCurveToRelative(2.019f, -0.405f, 2.755f, -1.142f)
                lineToRelative(2.236f, -2.236f)
                verticalLineToRelative(5.378f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _envelopeBulk!!
    }

private var _envelopeBulk: ImageVector? = null
