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

public val Icons.Filled.Chatbot: ImageVector
    get() {
        if (_chatbot != null) {
            return _chatbot!!
        }
        _chatbot = Builder(name = "Chatbot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.498f)
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
                moveTo(16.0f, 15.0f)
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
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.217f, 1.081f, 0.977f, 2.025f, 1.973f, 2.558f)
                curveToRelative(0.539f, 0.288f, 1.146f, 0.44f, 1.755f, 0.44f)
                curveToRelative(0.746f, 0.0f, 1.525f, -0.259f, 2.181f, -0.699f)
                curveToRelative(0.054f, 0.226f, 0.091f, 0.458f, 0.091f, 0.701f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _chatbot!!
    }

private var _chatbot: ImageVector? = null
