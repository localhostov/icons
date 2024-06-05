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

public val Icons.Outline.Pets: ImageVector
    get() {
        if (_pets != null) {
            return _pets!!
        }
        _pets = Builder(name = "Pets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.976f, 19.05f)
                lineToRelative(0.192f, 0.315f)
                lineToRelative(-0.339f, 2.111f)
                curveToRelative(-0.235f, 1.462f, -1.48f, 2.524f, -2.962f, 2.524f)
                horizontalLineToRelative(-4.867f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.867f)
                curveToRelative(0.494f, 0.0f, 0.909f, -0.354f, 0.987f, -0.841f)
                lineToRelative(0.223f, -1.385f)
                curveToRelative(-0.534f, -0.897f, -1.104f, -1.961f, -1.175f, -2.516f)
                curveToRelative(-0.14f, -1.106f, -0.662f, -1.792f, -1.747f, -2.295f)
                curveToRelative(-0.059f, -0.027f, -1.905f, -0.963f, -2.604f, -0.963f)
                curveToRelative(-0.798f, 0.0f, -1.256f, 0.22f, -1.261f, 0.222f)
                curveToRelative(-3.243f, 1.909f, -6.29f, 4.437f, -6.29f, 9.778f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -6.4f, 3.916f, -9.523f, 7.327f, -11.529f)
                curveToRelative(0.061f, -0.033f, 0.292f, -0.152f, 0.673f, -0.262f)
                verticalLineToRelative(-0.209f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(3.271f)
                curveToRelative(0.726f, 0.237f, 1.996f, 0.878f, 1.996f, 0.878f)
                curveToRelative(1.693f, 0.784f, 2.666f, 2.083f, 2.891f, 3.858f)
                curveToRelative(0.062f, 0.245f, 0.626f, 1.285f, 1.089f, 2.043f)
                close()
                moveTo(21.273f, 6.0f)
                curveToRelative(-0.829f, 0.0f, -1.609f, -0.365f, -2.14f, -1.002f)
                lineToRelative(-0.229f, -0.275f)
                curveToRelative(-0.912f, -1.094f, -2.251f, -1.722f, -3.676f, -1.722f)
                horizontalLineToRelative(-1.227f)
                lineTo(14.001f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.706f)
                lineToRelative(-4.046f, 6.294f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.046f)
                lineToRelative(4.5f, -7.0f)
                horizontalLineToRelative(2.681f)
                curveToRelative(0.829f, 0.0f, 1.609f, 0.365f, 2.14f, 1.002f)
                lineToRelative(0.229f, 0.275f)
                curveToRelative(0.912f, 1.094f, 2.251f, 1.722f, 3.676f, 1.722f)
                horizontalLineToRelative(0.727f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.001f)
                curveToRelative(0.762f, 0.52f, 1.385f, 1.158f, 1.858f, 1.902f)
                curveToRelative(1.794f, -0.394f, 3.143f, -1.992f, 3.143f, -3.902f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.727f)
                close()
            }
        }
        .build()
        return _pets!!
    }

private var _pets: ImageVector? = null
