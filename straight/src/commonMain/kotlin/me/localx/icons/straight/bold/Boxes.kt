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

public val Icons.Bold.Boxes: ImageVector
    get() {
        if (_boxes != null) {
            return _boxes!!
        }
        _boxes = Builder(name = "Boxes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(7.5f)
                lineTo(10.5f, 13.0f)
                lineTo(3.5f, 13.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(21.0f, 13.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _boxes!!
    }

private var _boxes: ImageVector? = null
