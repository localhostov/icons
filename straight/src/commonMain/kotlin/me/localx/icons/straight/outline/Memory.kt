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

public val Icons.Outline.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory = Builder(name = "Memory", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.28f, 8.46f)
                lineToRelative(0.72f, -0.21f)
                verticalLineToRelative(-3.25f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.35f, 2.0f, 0.0f, 3.35f, 0.0f, 5.0f)
                verticalLineToRelative(3.24f)
                reflectiveCurveToRelative(0.71f, 0.22f, 0.71f, 0.22f)
                curveToRelative(0.13f, 0.04f, 1.29f, 0.43f, 1.29f, 1.54f)
                reflectiveCurveToRelative(-1.15f, 1.5f, -1.28f, 1.54f)
                lineToRelative(-0.72f, 0.21f)
                verticalLineToRelative(10.25f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 11.76f)
                reflectiveCurveToRelative(-0.71f, -0.22f, -0.71f, -0.22f)
                curveToRelative(-0.13f, -0.04f, -1.29f, -0.43f, -1.29f, -1.54f)
                reflectiveCurveToRelative(1.15f, -1.5f, 1.28f, -1.54f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 6.84f)
                curveToRelative(-0.92f, 0.5f, -2.0f, 1.51f, -2.0f, 3.16f)
                reflectiveCurveToRelative(1.08f, 2.66f, 2.0f, 3.16f)
                verticalLineToRelative(2.84f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0.92f, -0.5f, 2.0f, -1.51f, 2.0f, -3.16f)
                reflectiveCurveToRelative(-1.08f, -2.66f, -2.0f, -3.16f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.84f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _memory!!
    }

private var _memory: ImageVector? = null
