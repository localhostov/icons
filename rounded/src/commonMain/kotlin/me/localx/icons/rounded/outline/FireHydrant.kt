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

public val Icons.Outline.FireHydrant: ImageVector
    get() {
        if (_fireHydrant != null) {
            return _fireHydrant!!
        }
        _fireHydrant = Builder(name = "FireHydrant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.968f, -2.166f, -5.439f, -5.0f, -5.916f)
                verticalLineToRelative(-1.084f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.084f)
                curveToRelative(-2.834f, 0.477f, -5.0f, 2.948f, -5.0f, 5.916f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(13.5f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _fireHydrant!!
    }

private var _fireHydrant: ImageVector? = null
