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

public val Icons.Filled.PesoSign: ImageVector
    get() {
        if (_pesoSign != null) {
            return _pesoSign!!
        }
        _pesoSign = Builder(name = "PesoSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(0.04f, -0.33f, 0.07f, -0.66f, 0.07f, -1.0f)
                reflectiveCurveToRelative(-0.03f, -0.67f, -0.07f, -1.0f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.59f)
                curveTo(18.22f, 2.07f, 15.35f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(3.35f, 0.0f, 6.22f, -2.07f, 7.41f, -5.0f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.22f, 0.0f, 4.15f, 1.21f, 5.19f, 3.0f)
                lineTo(6.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(11.91f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1.0f)
                reflectiveCurveToRelative(-0.04f, 0.67f, -0.09f, 1.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.19f)
                curveToRelative(-1.04f, 1.79f, -2.97f, 3.0f, -5.19f, 3.0f)
                close()
            }
        }
        .build()
        return _pesoSign!!
    }

private var _pesoSign: ImageVector? = null
