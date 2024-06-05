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

public val Icons.Outline.Life: ImageVector
    get() {
        if (_life != null) {
            return _life!!
        }
        _life = Builder(name = "Life", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(22.179f, 12.735f)
                lineToRelative(-1.357f, -1.47f)
                lineToRelative(-6.212f, 5.735f)
                horizontalLineToRelative(-5.219f)
                lineToRelative(-6.212f, -5.735f)
                lineToRelative(-1.357f, 1.47f)
                lineToRelative(6.179f, 5.703f)
                verticalLineToRelative(5.562f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.562f)
                lineToRelative(6.179f, -5.703f)
                close()
                moveTo(7.0f, 3.186f)
                curveTo(7.0f, 1.443f, 8.346f, 0.026f, 10.0f, 0.026f)
                curveToRelative(0.782f, 0.0f, 1.477f, 0.27f, 2.0f, 0.727f)
                curveTo(12.523f, 0.296f, 13.218f, 0.026f, 14.0f, 0.026f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.417f, 3.0f, 3.16f)
                curveToRelative(0.0f, 2.729f, -4.002f, 5.387f, -4.458f, 5.681f)
                lineToRelative(-0.542f, 0.35f)
                lineToRelative(-0.542f, -0.35f)
                curveToRelative(-0.456f, -0.294f, -4.458f, -2.952f, -4.458f, -5.681f)
                close()
                moveTo(9.0f, 3.186f)
                curveToRelative(0.0f, 1.04f, 1.61f, 2.617f, 3.0f, 3.627f)
                curveToRelative(1.39f, -1.01f, 3.0f, -2.587f, 3.0f, -3.627f)
                curveToRelative(0.0f, -0.64f, -0.448f, -1.16f, -1.0f, -1.16f)
                curveToRelative(-0.498f, 0.0f, -1.0f, 0.309f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.691f, -0.502f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.52f, -1.0f, 1.16f)
                close()
            }
        }
        .build()
        return _life!!
    }

private var _life: ImageVector? = null
