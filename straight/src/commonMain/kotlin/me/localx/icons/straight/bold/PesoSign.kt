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

public val Icons.Bold.PesoSign: ImageVector
    get() {
        if (_pesoSign != null) {
            return _pesoSign!!
        }
        _pesoSign = Builder(name = "PesoSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 5.0f)
                horizontalLineToRelative(-2.94f)
                curveTo(18.59f, 2.04f, 15.53f, 0.0f, 12.0f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(3.53f, 0.0f, 6.59f, -2.04f, 8.06f, -5.0f)
                horizontalLineToRelative(2.94f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(0.04f, -0.33f, 0.06f, -0.66f, 0.06f, -1.0f)
                reflectiveCurveToRelative(-0.02f, -0.67f, -0.06f, -1.0f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.77f, 0.0f, 3.37f, 0.77f, 4.47f, 2.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.47f)
                curveToRelative(-1.1f, 1.23f, -2.7f, 2.0f, -4.47f, 2.0f)
                close()
                moveTo(18.0f, 9.0f)
                curveToRelative(0.0f, 0.34f, -0.03f, 0.67f, -0.08f, 1.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.92f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                close()
            }
        }
        .build()
        return _pesoSign!!
    }

private var _pesoSign: ImageVector? = null
