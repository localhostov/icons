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

public val Icons.Outline.Mockup: ImageVector
    get() {
        if (_mockup != null) {
            return _mockup!!
        }
        _mockup = Builder(name = "Mockup", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                lineToRelative(10.0f, 3.42f)
                lineToRelative(-4.47f, 2.11f)
                lineToRelative(-2.11f, 4.47f)
                lineToRelative(-3.42f, -10.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 0.0f)
                lineTo(14.0f, 1.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(10.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 6.72f)
                lineToRelative(3.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                lineTo(14.31f, 24.0f)
                lineToRelative(-0.68f, -2.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 6.28f)
                lineToRelative(-3.0f, -1.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(6.13f)
                curveToRelative(0.44f, 1.72f, 2.01f, 3.0f, 3.87f, 3.0f)
                reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3.0f)
                horizontalLineToRelative(6.13f)
                verticalLineToRelative(3.28f)
                lineToRelative(-3.0f, 1.0f)
                verticalLineToRelative(7.75f)
                lineToRelative(2.0f, 0.68f)
                lineTo(21.0f, 7.72f)
                lineToRelative(3.0f, -1.0f)
                lineTo(24.0f, 0.0f)
                lineTo(14.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mockup!!
    }

private var _mockup: ImageVector? = null
