package me.localx.icons.straight.filled

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
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(4.418f)
                curveToRelative(1.371f, -1.483f, 3.326f, -2.418f, 5.5f, -2.418f)
                reflectiveCurveToRelative(4.129f, 0.935f, 5.5f, 2.418f)
                verticalLineToRelative(-3.418f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.418f)
                curveToRelative(1.371f, -1.483f, 3.326f, -2.418f, 5.5f, -2.418f)
                reflectiveCurveToRelative(4.129f, 0.935f, 5.5f, 2.418f)
                verticalLineToRelative(-4.418f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
