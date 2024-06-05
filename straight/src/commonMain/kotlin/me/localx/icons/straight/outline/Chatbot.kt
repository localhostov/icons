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

public val Icons.Outline.Chatbot: ImageVector
    get() {
        if (_chatbot != null) {
            return _chatbot!!
        }
        _chatbot = Builder(name = "Chatbot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                reflectiveCurveToRelative(-5.0f, 0.0f, -5.0f, 0.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 2.498f)
                verticalLineToRelative(7.502f)
                horizontalLineToRelative(-6.854f)
                lineToRelative(-2.435f, 1.696f)
                curveToRelative(-0.301f, 0.202f, -0.643f, 0.302f, -0.983f, 0.302f)
                curveToRelative(-0.279f, 0.0f, -0.558f, -0.068f, -0.812f, -0.204f)
                curveToRelative(-0.565f, -0.302f, -0.916f, -0.888f, -0.916f, -1.529f)
                lineTo(12.0f, 2.498f)
                curveTo(12.0f, 1.119f, 13.121f, -0.002f, 14.5f, -0.002f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(22.0f, 2.498f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(7.257f)
                lineToRelative(2.519f, -1.755f)
                horizontalLineToRelative(5.481f)
                lineTo(22.0f, 2.498f)
                close()
                moveTo(5.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _chatbot!!
    }

private var _chatbot: ImageVector? = null
