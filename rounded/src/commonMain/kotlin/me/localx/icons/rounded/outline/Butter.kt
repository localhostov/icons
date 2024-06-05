package me.localx.icons.rounded.outline

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

public val Icons.Outline.Butter: ImageVector
    get() {
        if (_butter != null) {
            return _butter!!
        }
        _butter = Builder(name = "Butter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 16.0f)
                lineTo(23.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 2.0f)
                curveTo(3.243f, 2.0f, 1.0f, 4.243f, 1.0f, 7.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.252f, 2.244f, 2.139f, 4.0f, 4.449f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.31f, 0.0f, 4.197f, -1.756f, 4.449f, -4.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 7.0f)
                curveToRelative(0.0f, -1.13f, -0.391f, -2.162f, -1.026f, -3.0f)
                horizontalLineToRelative(1.026f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(18.5f, 20.0f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(17.899f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _butter!!
    }

private var _butter: ImageVector? = null
