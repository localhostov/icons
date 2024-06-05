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

public val Icons.Outline.OctagonXmark: ImageVector
    get() {
        if (_octagonXmark != null) {
            return _octagonXmark!!
        }
        _octagonXmark = Builder(name = "OctagonXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 6.151f)
                lineTo(17.849f, 0.878f)
                curveToRelative(-0.567f, -0.566f, -1.321f, -0.878f, -2.121f, -0.878f)
                horizontalLineToRelative(-7.456f)
                curveToRelative(-0.801f, 0.0f, -1.554f, 0.312f, -2.121f, 0.879f)
                lineTo(0.879f, 6.151f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.121f)
                verticalLineToRelative(7.456f)
                curveToRelative(0.0f, 0.801f, 0.312f, 1.554f, 0.879f, 2.121f)
                lineToRelative(5.272f, 5.272f)
                curveToRelative(0.567f, 0.567f, 1.32f, 0.879f, 2.121f, 0.879f)
                horizontalLineToRelative(7.456f)
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
                horizontalLineToRelative(-7.456f)
                curveToRelative(-0.263f, 0.0f, -0.521f, -0.107f, -0.707f, -0.293f)
                lineToRelative(-5.272f, -5.272f)
                curveToRelative(-0.186f, -0.187f, -0.293f, -0.444f, -0.293f, -0.707f)
                verticalLineToRelative(-7.456f)
                curveToRelative(0.0f, -0.263f, 0.107f, -0.521f, 0.293f, -0.707f)
                lineTo(7.565f, 2.293f)
                curveToRelative(0.187f, -0.186f, 0.444f, -0.293f, 0.707f, -0.293f)
                horizontalLineToRelative(7.456f)
                curveToRelative(0.267f, 0.0f, 0.519f, 0.104f, 0.708f, 0.293f)
                lineToRelative(5.271f, 5.272f)
                curveToRelative(0.187f, 0.187f, 0.293f, 0.444f, 0.293f, 0.707f)
                verticalLineToRelative(7.456f)
                close()
                moveTo(16.439f, 8.975f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(3.043f, 3.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.043f, -3.043f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(-3.043f, -3.043f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.043f, 3.043f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _octagonXmark!!
    }

private var _octagonXmark: ImageVector? = null
