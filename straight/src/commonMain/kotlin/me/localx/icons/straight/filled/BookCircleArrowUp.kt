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

public val Icons.Filled.BookCircleArrowUp: ImageVector
    get() {
        if (_bookCircleArrowUp != null) {
            return _bookCircleArrowUp!!
        }
        _bookCircleArrowUp = Builder(name = "BookCircleArrowUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                close()
                moveTo(18.744f, 15.313f)
                lineToRelative(2.687f, 2.687f)
                horizontalLineToRelative(-2.431f)
                reflectiveCurveToRelative(0.0f, 3.0f, 0.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(-2.454f, 0.0f, -2.454f, 0.0f)
                lineToRelative(2.687f, -2.687f)
                curveToRelative(0.417f, -0.417f, 1.093f, -0.417f, 1.51f, 0.0f)
                close()
                moveTo(2.001f, 18.0f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(0.001f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.001f, 18.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(6.001f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(8.252f)
                curveToRelative(-0.639f, -0.165f, -1.309f, -0.252f, -2.0f, -0.252f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                close()
                moveTo(12.71f, 24.0f)
                lineTo(2.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.252f)
                curveToRelative(0.405f, 1.573f, 1.276f, 2.958f, 2.457f, 4.0f)
                close()
            }
        }
        .build()
        return _bookCircleArrowUp!!
    }

private var _bookCircleArrowUp: ImageVector? = null
