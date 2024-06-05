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

public val Icons.Bold.AlbumCollection: ImageVector
    get() {
        if (_albumCollection != null) {
            return _albumCollection!!
        }
        _albumCollection = Builder(name = "AlbumCollection", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 10.0f)
                lineTo(3.5f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 13.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 1.34f, -7.0f, 3.0f)
                reflectiveCurveToRelative(3.13f, 3.0f, 7.0f, 3.0f)
                reflectiveCurveToRelative(7.0f, -1.34f, 7.0f, -3.0f)
                reflectiveCurveToRelative(-3.13f, -3.0f, -7.0f, -3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -0.45f, -2.5f, -1.0f)
                reflectiveCurveToRelative(1.12f, -1.0f, 2.5f, -1.0f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1.0f)
                reflectiveCurveToRelative(-1.12f, 1.0f, -2.5f, 1.0f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(0.76f)
                curveToRelative(-0.95f, -0.79f, -2.17f, -1.26f, -3.5f, -1.26f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-1.33f, 0.0f, -2.55f, 0.47f, -3.5f, 1.26f)
                verticalLineToRelative(-0.76f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(0.76f)
                curveToRelative(-0.95f, -0.79f, -2.17f, -1.26f, -3.5f, -1.26f)
                lineTo(3.5f, 8.0f)
                curveToRelative(-1.33f, 0.0f, -2.55f, 0.47f, -3.5f, 1.26f)
                verticalLineToRelative(-0.76f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _albumCollection!!
    }

private var _albumCollection: ImageVector? = null
