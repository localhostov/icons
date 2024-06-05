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
                moveTo(7.021f, 18.591f)
                curveToRelative(0.528f, 0.527f, 1.447f, 0.527f, 1.975f, 0.0f)
                lineToRelative(5.908f, -5.908f)
                curveToRelative(-0.518f, -0.427f, -1.182f, -0.683f, -1.904f, -0.683f)
                lineTo(3.0f, 12.0f)
                curveToRelative(-0.718f, 0.0f, -1.378f, 0.254f, -1.894f, 0.676f)
                lineToRelative(5.915f, 5.915f)
                close()
                moveTo(10.41f, 20.005f)
                curveToRelative(-0.641f, 0.642f, -1.495f, 0.995f, -2.402f, 0.995f)
                reflectiveCurveToRelative(-1.76f, -0.354f, -2.402f, -0.995f)
                lineTo(0.051f, 14.45f)
                curveToRelative(-0.033f, 0.178f, -0.051f, 0.362f, -0.051f, 0.55f)
                verticalLineToRelative(9.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 15.0f)
                curveToRelative(0.0f, -0.183f, -0.017f, -0.362f, -0.049f, -0.536f)
                lineToRelative(-5.541f, 5.541f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _envelopeBulk!!
    }

private var _envelopeBulk: ImageVector? = null
