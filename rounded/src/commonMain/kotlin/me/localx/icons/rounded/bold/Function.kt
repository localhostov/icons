package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.721f, 21.628f)
                curveToRelative(0.481f, 0.675f, 0.325f, 1.611f, -0.349f, 2.093f)
                curveToRelative(-0.265f, 0.188f, -0.569f, 0.279f, -0.871f, 0.279f)
                curveToRelative(-0.468f, 0.0f, -0.929f, -0.218f, -1.222f, -0.628f)
                lineToRelative(-1.279f, -1.791f)
                lineToRelative(-1.279f, 1.791f)
                curveToRelative(-0.293f, 0.409f, -0.754f, 0.628f, -1.222f, 0.628f)
                curveToRelative(-0.302f, 0.0f, -0.606f, -0.091f, -0.871f, -0.279f)
                curveToRelative(-0.674f, -0.481f, -0.83f, -1.418f, -0.349f, -2.093f)
                lineToRelative(1.877f, -2.628f)
                lineToRelative(-1.877f, -2.628f)
                curveToRelative(-0.481f, -0.675f, -0.325f, -1.611f, 0.349f, -2.093f)
                curveToRelative(0.674f, -0.481f, 1.611f, -0.327f, 2.093f, 0.349f)
                lineToRelative(1.279f, 1.791f)
                lineToRelative(1.279f, -1.791f)
                curveToRelative(0.481f, -0.673f, 1.417f, -0.829f, 2.093f, -0.349f)
                curveToRelative(0.674f, 0.481f, 0.83f, 1.418f, 0.349f, 2.093f)
                lineToRelative(-1.877f, 2.628f)
                lineToRelative(1.877f, 2.628f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineToRelative(-0.699f)
                lineToRelative(0.689f, -4.823f)
                curveToRelative(0.177f, -1.241f, 1.257f, -2.177f, 2.51f, -2.177f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-2.737f, 0.0f, -5.093f, 2.043f, -5.48f, 4.753f)
                lineToRelative(-0.749f, 5.247f)
                horizontalLineToRelative(-1.271f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.842f)
                lineToRelative(-0.832f, 5.823f)
                curveToRelative(-0.177f, 1.241f, -1.257f, 2.177f, -2.51f, 2.177f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(2.737f, 0.0f, 5.093f, -2.043f, 5.48f, -4.753f)
                lineToRelative(0.892f, -6.247f)
                horizontalLineToRelative(1.128f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
