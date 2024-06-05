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

public val Icons.Outline.AlbumCollection: ImageVector
    get() {
        if (_albumCollection != null) {
            return _albumCollection!!
        }
        _albumCollection = Builder(name = "AlbumCollection", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 11.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-3.98f, 0.0f, -8.0f, 1.37f, -8.0f, 4.0f)
                reflectiveCurveToRelative(4.02f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.37f, 8.0f, -4.0f)
                reflectiveCurveToRelative(-4.02f, -4.0f, -8.0f, -4.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.72f, 0.0f, -6.0f, -1.29f, -6.0f, -2.0f)
                reflectiveCurveToRelative(2.28f, -2.0f, 6.0f, -2.0f)
                reflectiveCurveToRelative(6.0f, 1.29f, 6.0f, 2.0f)
                reflectiveCurveToRelative(-2.28f, 2.0f, -6.0f, 2.0f)
                close()
                moveTo(13.5f, 16.0f)
                curveToRelative(0.0f, 0.55f, -0.67f, 1.0f, -1.5f, 1.0f)
                reflectiveCurveToRelative(-1.5f, -0.45f, -1.5f, -1.0f)
                reflectiveCurveToRelative(0.67f, -1.0f, 1.5f, -1.0f)
                reflectiveCurveToRelative(1.5f, 0.45f, 1.5f, 1.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3.0f, -1.03f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.13f, 0.0f, -2.16f, 0.39f, -3.0f, 1.03f)
                verticalLineToRelative(-0.03f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3.0f, -1.03f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.13f, 0.0f, -2.16f, 0.39f, -3.0f, 1.03f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _albumCollection!!
    }

private var _albumCollection: ImageVector? = null
