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

public val Icons.Bold.PointOfSaleSignal: ImageVector
    get() {
        if (_pointOfSaleSignal != null) {
            return _pointOfSaleSignal!!
        }
        _pointOfSaleSignal = Builder(name = "PointOfSaleSignal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 10.0f)
                verticalLineToRelative(11.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.388f)
                lineToRelative(1.051f, -1.051f)
                curveToRelative(0.765f, -0.765f, 1.607f, -1.406f, 2.491f, -1.949f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(16.915f, 8.586f)
                lineToRelative(2.121f, -2.122f)
                curveToRelative(-1.949f, -1.948f, -5.122f, -1.948f, -7.071f, 0.0f)
                lineToRelative(2.121f, 2.122f)
                curveToRelative(0.78f, -0.78f, 2.049f, -0.78f, 2.829f, 0.0f)
                close()
                moveTo(15.5f, 0.0f)
                curveToRelative(-2.671f, 0.0f, -5.182f, 1.04f, -7.071f, 2.929f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.627f, 0.728f, 4.95f, 2.05f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(-1.889f, -1.889f, -4.4f, -2.929f, -7.071f, -2.929f)
                close()
            }
        }
        .build()
        return _pointOfSaleSignal!!
    }

private var _pointOfSaleSignal: ImageVector? = null
