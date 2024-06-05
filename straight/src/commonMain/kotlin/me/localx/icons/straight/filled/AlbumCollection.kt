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

public val Icons.Filled.AlbumCollection: ImageVector
    get() {
        if (_albumCollection != null) {
            return _albumCollection!!
        }
        _albumCollection = Builder(name = "AlbumCollection", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveToRelative(-4.01f, 0.0f, -7.0f, 1.58f, -7.0f, 3.0f)
                reflectiveCurveToRelative(2.99f, 3.0f, 7.0f, 3.0f)
                reflectiveCurveToRelative(7.0f, -1.58f, 7.0f, -3.0f)
                reflectiveCurveToRelative(-2.99f, -3.0f, -7.0f, -3.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.45f, -1.5f, -1.0f)
                reflectiveCurveToRelative(0.67f, -1.0f, 1.5f, -1.0f)
                reflectiveCurveToRelative(1.5f, 0.45f, 1.5f, 1.0f)
                reflectiveCurveToRelative(-0.67f, 1.0f, -1.5f, 1.0f)
                close()
                moveTo(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-5.13f, 0.0f, -9.0f, -2.15f, -9.0f, -5.0f)
                reflectiveCurveToRelative(3.87f, -5.0f, 9.0f, -5.0f)
                reflectiveCurveToRelative(9.0f, 2.15f, 9.0f, 5.0f)
                reflectiveCurveToRelative(-3.87f, 5.0f, -9.0f, 5.0f)
                close()
                moveTo(0.0f, 3.03f)
                verticalLineToRelative(-0.03f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3.0f, -1.03f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.13f, 0.0f, -2.16f, 0.39f, -3.0f, 1.03f)
                close()
                moveTo(0.0f, 7.03f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3.0f, -1.03f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.13f, 0.0f, -2.16f, 0.39f, -3.0f, 1.03f)
                close()
            }
        }
        .build()
        return _albumCollection!!
    }

private var _albumCollection: ImageVector? = null
