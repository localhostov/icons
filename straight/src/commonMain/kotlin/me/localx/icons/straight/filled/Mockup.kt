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

public val Icons.Filled.Mockup: ImageVector
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
                moveTo(3.0f, 24.0f)
                lineTo(3.0f, 7.72f)
                lineTo(0.0f, 6.72f)
                lineTo(0.0f, 0.0f)
                lineTo(8.48f, 0.0f)
                lineToRelative(0.24f, 0.67f)
                curveToRelative(0.5f, 1.4f, 1.82f, 2.33f, 3.28f, 2.33f)
                reflectiveCurveToRelative(2.79f, -0.94f, 3.28f, -2.33f)
                lineToRelative(0.24f, -0.67f)
                horizontalLineToRelative(8.48f)
                lineTo(24.0f, 6.72f)
                lineToRelative(-3.0f, 1.0f)
                verticalLineToRelative(6.9f)
                lineToRelative(-11.21f, -3.84f)
                lineToRelative(4.52f, 13.21f)
                lineTo(3.0f, 23.99f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _mockup!!
    }

private var _mockup: ImageVector? = null
