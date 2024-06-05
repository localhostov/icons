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

public val Icons.Outline.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.28f, 8.061f)
                lineToRelative(9.72f, 3.92f)
                verticalLineToRelative(-4.981f)
                horizontalLineToRelative(2.278f)
                curveToRelative(0.347f, 0.595f, 0.985f, 1.0f, 1.722f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.737f, 0.0f, -1.375f, 0.405f, -1.722f, 1.0f)
                horizontalLineToRelative(-2.278f)
                lineTo(11.0f, 0.019f)
                lineTo(1.28f, 3.939f)
                curveToRelative(-0.79f, 0.4f, -1.28f, 1.189f, -1.28f, 2.061f)
                reflectiveCurveToRelative(0.49f, 1.661f, 1.28f, 2.061f)
                close()
                moveTo(2.105f, 5.76f)
                lineToRelative(6.895f, -2.778f)
                verticalLineToRelative(6.038f)
                lineToRelative(-6.844f, -2.758f)
                curveToRelative(-0.128f, -0.076f, -0.156f, -0.183f, -0.156f, -0.261f)
                curveToRelative(0.0f, -0.083f, 0.032f, -0.2f, 0.105f, -0.241f)
                close()
                moveTo(13.0f, 10.001f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 16.001f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(16.0f, 18.001f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(2.0f, 18.001f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 22.001f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 22.001f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 16.001f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
