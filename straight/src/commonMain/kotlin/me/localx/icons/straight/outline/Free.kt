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

public val Icons.Outline.Free: ImageVector
    get() {
        if (_free != null) {
            return _free!!
        }
        _free = Builder(name = "Free", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.601f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.601f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.601f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.601f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(12.5f, 10.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.284f)
                lineToRelative(0.872f, 3.0f)
                horizontalLineToRelative(1.744f)
                lineToRelative(-1.054f, -3.462f)
                curveToRelative(0.023f, -0.017f, 0.024f, -0.016f, 0.042f, -0.029f)
                curveToRelative(-0.019f, 0.012f, -0.031f, 0.021f, -0.055f, 0.035f)
                curveToRelative(0.644f, -0.452f, 1.067f, -1.198f, 1.067f, -2.044f)
                close()
                moveTo(10.0f, 11.4f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }
        .build()
        return _free!!
    }

private var _free: ImageVector? = null
