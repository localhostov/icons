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

public val Icons.Outline.OctagonExclamation: ImageVector
    get() {
        if (_octagonExclamation != null) {
            return _octagonExclamation!!
        }
        _octagonExclamation = Builder(name = "OctagonExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 6.151f)
                lineTo(17.849f, 0.878f)
                curveToRelative(-0.567f, -0.566f, -1.321f, -0.878f, -2.121f, -0.878f)
                horizontalLineToRelative(-7.455f)
                curveToRelative(-0.8f, 0.0f, -1.554f, 0.312f, -2.122f, 0.879f)
                lineTo(0.879f, 6.151f)
                curveToRelative(-0.566f, 0.567f, -0.879f, 1.32f, -0.879f, 2.121f)
                verticalLineToRelative(7.456f)
                curveToRelative(0.0f, 0.801f, 0.312f, 1.554f, 0.879f, 2.121f)
                lineToRelative(5.272f, 5.273f)
                curveToRelative(0.567f, 0.566f, 1.321f, 0.878f, 2.121f, 0.878f)
                horizontalLineToRelative(7.455f)
                curveToRelative(0.8f, 0.0f, 1.554f, -0.312f, 2.122f, -0.879f)
                lineToRelative(5.271f, -5.272f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.121f)
                verticalLineToRelative(-7.456f)
                curveToRelative(0.0f, -0.801f, -0.313f, -1.554f, -0.879f, -2.121f)
                close()
                moveTo(22.0f, 15.728f)
                curveToRelative(0.0f, 0.263f, -0.106f, 0.521f, -0.293f, 0.707f)
                lineToRelative(-5.271f, 5.271f)
                curveToRelative(-0.19f, 0.189f, -0.442f, 0.294f, -0.709f, 0.294f)
                horizontalLineToRelative(-7.455f)
                curveToRelative(-0.267f, 0.0f, -0.519f, -0.104f, -0.708f, -0.293f)
                lineToRelative(-5.271f, -5.272f)
                curveToRelative(-0.187f, -0.187f, -0.293f, -0.444f, -0.293f, -0.707f)
                verticalLineToRelative(-7.456f)
                curveToRelative(0.0f, -0.263f, 0.106f, -0.521f, 0.293f, -0.707f)
                lineTo(7.563f, 2.294f)
                curveToRelative(0.19f, -0.189f, 0.442f, -0.294f, 0.709f, -0.294f)
                horizontalLineToRelative(7.455f)
                curveToRelative(0.267f, 0.0f, 0.519f, 0.104f, 0.708f, 0.293f)
                lineToRelative(5.271f, 5.272f)
                curveToRelative(0.187f, 0.187f, 0.293f, 0.444f, 0.293f, 0.707f)
                verticalLineToRelative(7.456f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _octagonExclamation!!
    }

private var _octagonExclamation: ImageVector? = null
