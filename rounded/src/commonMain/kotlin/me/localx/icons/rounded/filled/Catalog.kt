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

public val Icons.Filled.Catalog: ImageVector
    get() {
        if (_catalog != null) {
            return _catalog!!
        }
        _catalog = Builder(name = "Catalog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 7.0f)
                lineTo(6.678f, 7.0f)
                curveToRelative(-0.431f, 0.644f, -0.678f, 1.409f, -0.678f, 2.219f)
                verticalLineToRelative(10.281f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(13.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-9.528f)
                lineTo(17.91f, 0.705f)
                curveToRelative(0.66f, 0.55f, 1.09f, 1.369f, 1.09f, 2.295f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.884f, 0.0f)
                lineToRelative(-7.606f, 3.872f)
                curveToRelative(-2.011f, 1.024f, -3.278f, 3.09f, -3.278f, 5.347f)
                verticalLineToRelative(8.68f)
                curveToRelative(-2.282f, -0.463f, -4.0f, -2.48f, -4.0f, -4.899f)
                lineTo(-0.0f, 5.0f)
                curveTo(0.0f, 2.239f, 2.239f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(9.884f)
                close()
            }
        }
        .build()
        return _catalog!!
    }

private var _catalog: ImageVector? = null
