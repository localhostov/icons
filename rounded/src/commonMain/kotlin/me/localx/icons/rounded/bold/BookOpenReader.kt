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

public val Icons.Bold.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.5f)
                curveToRelative(0.151f, -5.935f, 8.85f, -5.934f, 9.0f, 0.0f)
                curveToRelative(-0.151f, 5.935f, -8.85f, 5.934f, -9.0f, 0.0f)
                close()
                moveTo(24.0f, 15.5f)
                verticalLineToRelative(1.793f)
                curveToRelative(0.0f, 2.659f, -1.899f, 4.935f, -4.516f, 5.411f)
                lineToRelative(-5.763f, 1.139f)
                curveToRelative(-1.142f, 0.207f, -2.285f, 0.21f, -3.421f, 0.004f)
                lineToRelative(-5.807f, -1.147f)
                curveToRelative(-2.595f, -0.472f, -4.494f, -2.748f, -4.494f, -5.407f)
                verticalLineToRelative(-1.793f)
                curveToRelative(-0.083f, -3.331f, 3.222f, -6.087f, 6.483f, -5.411f)
                lineToRelative(3.36f, 0.702f)
                curveToRelative(0.824f, 0.15f, 1.564f, 0.527f, 2.16f, 1.062f)
                curveToRelative(0.601f, -0.537f, 1.351f, -0.916f, 2.191f, -1.069f)
                lineToRelative(3.282f, -0.688f)
                curveToRelative(1.653f, -0.301f, 3.293f, 0.134f, 4.548f, 1.181f)
                curveToRelative(1.256f, 1.048f, 1.976f, 2.587f, 1.976f, 4.223f)
                close()
                moveTo(10.5f, 15.211f)
                curveToRelative(0.0f, -0.726f, -0.518f, -1.346f, -1.231f, -1.476f)
                lineToRelative(-3.36f, -0.702f)
                curveToRelative(-0.707f, -0.126f, -1.439f, 0.075f, -2.01f, 0.548f)
                curveToRelative(-0.571f, 0.477f, -0.898f, 1.176f, -0.898f, 1.919f)
                verticalLineToRelative(1.793f)
                curveToRelative(0.0f, 1.209f, 0.863f, 2.243f, 2.053f, 2.46f)
                lineToRelative(5.447f, 1.076f)
                verticalLineToRelative(-5.618f)
                close()
                moveTo(21.0f, 15.5f)
                curveToRelative(0.0f, -0.744f, -0.327f, -1.443f, -0.897f, -1.919f)
                curveToRelative(-0.57f, -0.476f, -1.318f, -0.674f, -2.05f, -0.54f)
                lineToRelative(-3.282f, 0.687f)
                curveToRelative(-0.753f, 0.137f, -1.271f, 0.758f, -1.271f, 1.483f)
                verticalLineToRelative(5.618f)
                lineToRelative(5.425f, -1.072f)
                curveToRelative(1.212f, -0.221f, 2.075f, -1.255f, 2.075f, -2.464f)
                verticalLineToRelative(-1.793f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
