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

public val Icons.Filled.PicpeopleFilled: ImageVector
    get() {
        if (_picpeopleFilled != null) {
            return _picpeopleFilled!!
        }
        _picpeopleFilled = Builder(name = "PicpeopleFilled", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.24f, 2.0f, 0.0f, 4.24f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(7.64f, 20.0f)
                curveToRelative(-0.64f, 0.0f, -1.02f, -0.72f, -0.67f, -1.26f)
                curveToRelative(1.07f, -1.65f, 2.92f, -2.74f, 5.03f, -2.74f)
                reflectiveCurveToRelative(3.97f, 1.09f, 5.03f, 2.74f)
                curveToRelative(0.35f, 0.54f, -0.03f, 1.26f, -0.67f, 1.26f)
                lineTo(7.64f, 20.0f)
                close()
            }
        }
        .build()
        return _picpeopleFilled!!
    }

private var _picpeopleFilled: ImageVector? = null
