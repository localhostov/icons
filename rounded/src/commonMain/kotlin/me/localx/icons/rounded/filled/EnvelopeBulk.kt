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

public val Icons.Filled.EnvelopeBulk: ImageVector
    get() {
        if (_envelopeBulk != null) {
            return _envelopeBulk!!
        }
        _envelopeBulk = Builder(name = "EnvelopeBulk", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 4.0f)
                curveTo(3.0f, 1.791f, 4.791f, 0.0f, 7.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                close()
                moveTo(8.996f, 18.591f)
                lineToRelative(5.908f, -5.908f)
                curveToRelative(-0.518f, -0.427f, -1.182f, -0.683f, -1.904f, -0.683f)
                lineTo(3.0f, 12.0f)
                curveToRelative(-0.718f, 0.0f, -1.378f, 0.254f, -1.894f, 0.676f)
                lineToRelative(5.915f, 5.915f)
                curveToRelative(0.528f, 0.527f, 1.447f, 0.527f, 1.975f, 0.0f)
                close()
                moveTo(10.411f, 20.005f)
                curveToRelative(-0.79f, 0.79f, -1.902f, 1.144f, -3.039f, 0.937f)
                curveToRelative(-0.708f, -0.128f, -1.345f, -0.518f, -1.854f, -1.027f)
                lineTo(0.0f, 14.398f)
                verticalLineToRelative(5.602f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-5.516f)
                lineToRelative(-0.049f, -0.02f)
                lineToRelative(-5.541f, 5.541f)
                close()
            }
        }
        .build()
        return _envelopeBulk!!
    }

private var _envelopeBulk: ImageVector? = null
