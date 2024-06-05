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

public val Icons.Bold.Mockup: ImageVector
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
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(14.15f, 0.0f)
                lineToRelative(-0.19f, 1.29f)
                curveToRelative(-0.14f, 0.98f, -0.99f, 1.71f, -1.97f, 1.71f)
                reflectiveCurveToRelative(-1.82f, -0.74f, -1.96f, -1.71f)
                lineToRelative(-0.19f, -1.29f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 7.43f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(15.57f)
                lineTo(14.31f, 24.0f)
                reflectiveCurveToRelative(-1.08f, -3.0f, -1.08f, -3.0f)
                lineTo(5.0f, 21.0f)
                reflectiveCurveToRelative(0.0f, -14.43f, 0.0f, -14.43f)
                lineToRelative(-2.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                lineTo(7.43f, 3.0f)
                curveToRelative(0.78f, 1.78f, 2.56f, 3.0f, 4.57f, 3.0f)
                reflectiveCurveToRelative(3.79f, -1.22f, 4.57f, -3.0f)
                horizontalLineToRelative(4.43f)
                verticalLineToRelative(2.57f)
                lineToRelative(-2.0f, 1.0f)
                verticalLineToRelative(7.41f)
                reflectiveCurveToRelative(3.0f, 1.05f, 3.0f, 1.05f)
                verticalLineToRelative(-6.61f)
                reflectiveCurveToRelative(2.0f, -1.0f, 2.0f, -1.0f)
                lineTo(24.0f, 0.0f)
                lineTo(14.15f, 0.0f)
                close()
            }
        }
        .build()
        return _mockup!!
    }

private var _mockup: ImageVector? = null
