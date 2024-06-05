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

public val Icons.Filled.LaptopMobile: ImageVector
    get() {
        if (_laptopMobile != null) {
            return _laptopMobile!!
        }
        _laptopMobile = Builder(name = "LaptopMobile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.25f, -0.29f)
                curveToRelative(-0.38f, -0.45f, -0.94f, -0.71f, -1.53f, -0.71f)
                lineTo(2.5f, 13.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(12.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(7.23f, 11.0f)
                curveToRelative(0.98f, 0.0f, 1.92f, 0.36f, 2.65f, 1.0f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5.0f, 5.91f, -5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.13f, 2.0f, 0.35f)
                verticalLineToRelative(-2.35f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1.0f, -0.11f)
                lineTo(7.23f, 11.0f)
                close()
            }
        }
        .build()
        return _laptopMobile!!
    }

private var _laptopMobile: ImageVector? = null
