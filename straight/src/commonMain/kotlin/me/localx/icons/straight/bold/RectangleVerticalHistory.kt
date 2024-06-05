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

public val Icons.Bold.RectangleVerticalHistory: ImageVector
    get() {
        if (_rectangleVerticalHistory != null) {
            return _rectangleVerticalHistory!!
        }
        _rectangleVerticalHistory = Builder(name = "RectangleVerticalHistory", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(13.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(0.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _rectangleVerticalHistory!!
    }

private var _rectangleVerticalHistory: ImageVector? = null
