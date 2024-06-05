package me.localx.icons.straight.outline

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

public val Icons.Outline.SupplierAlt: ImageVector
    get() {
        if (_supplierAlt != null) {
            return _supplierAlt!!
        }
        _supplierAlt = Builder(name = "SupplierAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(6.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(16.0f, 18.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(22.0f, 18.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _supplierAlt!!
    }

private var _supplierAlt: ImageVector? = null
