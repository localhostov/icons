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

public val Icons.Outline.BlenderPhone: ImageVector
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
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.86f, 1.276f, -3.428f, 3.0f, -3.873f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(16.007f)
                lineToRelative(-2.855f, 17.169f)
                curveToRelative(1.646f, 0.496f, 2.848f, 2.025f, 2.848f, 3.831f)
                close()
                moveTo(10.0f, 2.0f)
                verticalLineToRelative(3.0f)
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
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.152f)
                lineToRelative(2.495f, -15.0f)
                horizontalLineToRelative(-11.647f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _blenderPhone!!
    }

private var _blenderPhone: ImageVector? = null
