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

public val Icons.Filled.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.5f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.467f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.467f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(2.239f, 6.0f, 0.0f, 8.239f, 0.0f, 11.0f)
                verticalLineToRelative(2.418f)
                curveToRelative(1.371f, -1.483f, 3.326f, -2.418f, 5.5f, -2.418f)
                reflectiveCurveToRelative(4.129f, 0.935f, 5.5f, 2.418f)
                verticalLineToRelative(-3.418f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.418f)
                curveToRelative(1.371f, -1.483f, 3.326f, -2.418f, 5.5f, -2.418f)
                reflectiveCurveToRelative(4.129f, 0.935f, 5.5f, 2.418f)
                verticalLineToRelative(-2.418f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-1.381f, 0.0f, -2.514f, 1.13f, -2.518f, 2.51f)
                lineToRelative(-0.004f, 1.49f)
                horizontalLineToRelative(5.03f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
