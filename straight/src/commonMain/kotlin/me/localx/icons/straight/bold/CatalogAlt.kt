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

public val Icons.Bold.CatalogAlt: ImageVector
    get() {
        if (_catalogAlt != null) {
            return _catalogAlt!!
        }
        _catalogAlt = Builder(name = "CatalogAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 10.8f)
                lineToRelative(4.0f, -0.797f)
                verticalLineToRelative(3.049f)
                lineToRelative(-4.0f, 0.797f)
                verticalLineToRelative(-3.049f)
                close()
                moveTo(15.0f, 18.549f)
                lineToRelative(4.0f, -0.797f)
                verticalLineToRelative(-3.049f)
                lineToRelative(-4.0f, 0.797f)
                verticalLineToRelative(3.049f)
                close()
                moveTo(15.0f, 9.049f)
                lineToRelative(4.0f, -0.797f)
                verticalLineToRelative(-3.049f)
                lineToRelative(-4.0f, 0.797f)
                verticalLineToRelative(3.049f)
                close()
                moveTo(24.0f, 3.409f)
                verticalLineToRelative(18.421f)
                lineToRelative(-12.252f, 2.228f)
                lineToRelative(-5.208f, -2.829f)
                lineToRelative(-4.578f, 2.771f)
                lineTo(0.043f, 24.0f)
                lineToRelative(-0.043f, -1.5f)
                lineTo(0.0f, 4.865f)
                curveToRelative(0.0f, -1.341f, 0.747f, -2.543f, 1.949f, -3.138f)
                lineTo(4.508f, 0.465f)
                curveToRelative(1.248f, -0.617f, 2.736f, -0.617f, 3.984f, 0.0f)
                lineToRelative(2.881f, 1.423f)
                lineTo(19.98f, 0.056f)
                curveToRelative(0.996f, -0.18f, 2.016f, 0.086f, 2.795f, 0.737f)
                curveToRelative(0.778f, 0.649f, 1.225f, 1.603f, 1.225f, 2.616f)
                close()
                moveTo(8.0f, 3.567f)
                verticalLineToRelative(15.041f)
                lineToRelative(2.0f, 1.086f)
                lineTo(10.0f, 4.555f)
                lineToRelative(-2.0f, -0.988f)
                close()
                moveTo(3.0f, 19.865f)
                lineToRelative(2.0f, -1.21f)
                lineTo(5.0f, 3.567f)
                lineToRelative(-1.722f, 0.85f)
                curveToRelative(-0.169f, 0.084f, -0.278f, 0.26f, -0.278f, 0.448f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(21.0f, 3.409f)
                curveToRelative(0.0f, -0.166f, -0.092f, -0.268f, -0.146f, -0.313f)
                curveToRelative(-0.055f, -0.044f, -0.162f, -0.111f, -0.322f, -0.091f)
                lineToRelative(-7.531f, 1.603f)
                verticalLineToRelative(16.173f)
                lineToRelative(8.0f, -1.455f)
                lineTo(21.001f, 3.409f)
                close()
            }
        }
        .build()
        return _catalogAlt!!
    }

private var _catalogAlt: ImageVector? = null
