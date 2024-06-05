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

public val Icons.Bold.Booking: ImageVector
    get() {
        if (_booking != null) {
            return _booking!!
        }
        _booking = Builder(name = "Booking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 18.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 4.019f, 2.019f, 2.0f, 4.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(20.374f, 17.333f)
                lineToRelative(-5.374f, -1.535f)
                verticalLineToRelative(-4.169f)
                curveToRelative(0.0f, -0.704f, -0.447f, -1.368f, -1.129f, -1.543f)
                curveToRelative(-1.001f, -0.256f, -1.884f, 0.492f, -1.884f, 1.449f)
                lineToRelative(0.013f, 7.388f)
                lineToRelative(-1.152f, -0.835f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(3.227f, 2.477f)
                curveToRelative(0.349f, 0.268f, 0.778f, 0.414f, 1.218f, 0.414f)
                horizontalLineToRelative(0.321f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.198f)
                lineToRelative(4.55f, 1.3f)
                curveToRelative(0.854f, 0.244f, 1.45f, 1.035f, 1.45f, 1.923f)
                verticalLineToRelative(0.36f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0.0f, -2.221f, -1.491f, -4.197f, -3.626f, -4.808f)
                close()
            }
        }
        .build()
        return _booking!!
    }

private var _booking: ImageVector? = null
