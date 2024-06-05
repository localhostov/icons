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
                moveTo(22.5f, 10.0f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(0.04f, -0.33f, 0.06f, -0.66f, 0.06f, -1.0f)
                reflectiveCurveToRelative(-0.02f, -0.67f, -0.06f, -1.0f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.44f)
                curveTo(18.59f, 2.04f, 15.53f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(5.64f, 0.0f, 3.28f, 2.2f, 3.02f, 5.0f)
                lineTo(1.5f, 5.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                lineTo(1.5f, 10.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(3.53f, 0.0f, 6.59f, -2.04f, 8.06f, -5.0f)
                horizontalLineToRelative(2.44f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.77f, 0.0f, 3.37f, 0.77f, 4.47f, 2.0f)
                lineTo(6.05f, 5.0f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2.0f, 2.45f, -2.0f)
                close()
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(11.92f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                reflectiveCurveToRelative(-0.03f, 0.67f, -0.08f, 1.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.47f)
                curveToRelative(-1.1f, 1.23f, -2.7f, 2.0f, -4.47f, 2.0f)
                close()
            }
        }
        .build()
        return _pesoSign!!
    }

private var _pesoSign: ImageVector? = null
