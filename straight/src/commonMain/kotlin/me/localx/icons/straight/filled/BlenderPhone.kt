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

public val Icons.Filled.BlenderPhone: ImageVector
    get() {
        if (_blenderPhone != null) {
            return _blenderPhone!!
        }
        _blenderPhone = Builder(name = "BlenderPhone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 16.0f)
                horizontalLineToRelative(-2.023f)
                curveToRelative(-0.768f, 0.0f, -1.456f, -0.323f, -1.96f, -0.827f)
                curveTo(0.709f, 13.865f, 0.011f, 11.44f, 0.0f, 9.0f)
                curveToRelative(-0.011f, -2.39f, 0.637f, -4.793f, 2.017f, -6.173f)
                curveToRelative(0.504f, -0.504f, 1.192f, -0.828f, 1.96f, -0.827f)
                horizontalLineToRelative(2.023f)
                reflectiveCurveToRelative(0.0f, 4.0f, 0.0f, 4.0f)
                horizontalLineToRelative(-2.593f)
                curveToRelative(-0.456f, 1.068f, -0.68f, 2.047f, -0.686f, 3.0f)
                curveToRelative(-0.006f, 1.003f, 0.228f, 1.978f, 0.686f, 3.0f)
                horizontalLineToRelative(2.593f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 22.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.18f)
                lineTo(24.007f, 0.0f)
                lineTo(8.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _blenderPhone!!
    }

private var _blenderPhone: ImageVector? = null
