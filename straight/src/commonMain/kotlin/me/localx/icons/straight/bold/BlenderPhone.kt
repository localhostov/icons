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

public val Icons.Bold.BlenderPhone: ImageVector
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
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.593f)
                curveToRelative(-0.456f, 1.068f, -0.68f, 2.047f, -0.686f, 3.0f)
                curveToRelative(-0.006f, 1.003f, 0.228f, 1.978f, 0.686f, 3.0f)
                horizontalLineToRelative(2.593f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 20.5f)
                verticalLineToRelative(3.5f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.956f, 1.254f, -3.624f, 3.0f, -4.243f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(15.937f)
                lineToRelative(-2.724f, 16.339f)
                curveToRelative(1.634f, 0.675f, 2.786f, 2.286f, 2.786f, 4.161f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.229f)
                lineToRelative(2.167f, -13.0f)
                horizontalLineToRelative(-9.396f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _blenderPhone!!
    }

private var _blenderPhone: ImageVector? = null
