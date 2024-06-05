package me.localx.icons.rounded.outline

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

public val Icons.Outline.Drum: ImageVector
    get() {
        if (_drum != null) {
            return _drum!!
        }
        _drum = Builder(name = "Drum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.499f, 6.285f)
                curveToRelative(-0.396f, -0.387f, -1.029f, -0.378f, -1.414f, 0.016f)
                curveToRelative(-0.387f, 0.396f, -0.379f, 1.028f, 0.016f, 1.414f)
                curveToRelative(0.597f, 0.583f, 0.899f, 1.184f, 0.899f, 1.785f)
                curveToRelative(0.0f, 2.129f, -4.106f, 4.5f, -10.0f, 4.5f)
                reflectiveCurveTo(2.0f, 11.629f, 2.0f, 9.5f)
                reflectiveCurveToRelative(4.106f, -4.5f, 10.0f, -4.5f)
                curveToRelative(0.641f, 0.0f, 1.283f, 0.029f, 1.908f, 0.087f)
                curveToRelative(0.566f, 0.054f, 1.037f, -0.354f, 1.088f, -0.904f)
                curveToRelative(0.05f, -0.55f, -0.354f, -1.037f, -0.904f, -1.088f)
                curveToRelative(-0.687f, -0.062f, -1.391f, -0.095f, -2.092f, -0.095f)
                curveTo(5.271f, 3.0f, 0.0f, 5.855f, 0.0f, 9.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.144f, -0.52f, -2.256f, -1.501f, -3.215f)
                close()
                moveTo(11.0f, 21.976f)
                curveToRelative(-1.477f, -0.069f, -2.824f, -0.288f, -4.0f, -0.611f)
                verticalLineToRelative(-5.936f)
                curveToRelative(1.23f, 0.298f, 2.576f, 0.488f, 4.0f, 0.549f)
                verticalLineToRelative(5.998f)
                close()
                moveTo(13.0f, 15.978f)
                curveToRelative(1.424f, -0.061f, 2.77f, -0.251f, 4.0f, -0.549f)
                verticalLineToRelative(5.936f)
                curveToRelative(-1.176f, 0.323f, -2.523f, 0.542f, -4.0f, 0.611f)
                verticalLineToRelative(-5.998f)
                close()
                moveTo(2.0f, 17.5f)
                verticalLineToRelative(-4.361f)
                curveToRelative(0.802f, 0.654f, 1.819f, 1.22f, 3.0f, 1.673f)
                verticalLineToRelative(5.835f)
                curveToRelative(-1.891f, -0.87f, -3.0f, -2.042f, -3.0f, -3.147f)
                close()
                moveTo(19.0f, 20.647f)
                verticalLineToRelative(-5.835f)
                curveToRelative(1.181f, -0.453f, 2.198f, -1.019f, 3.0f, -1.673f)
                verticalLineToRelative(4.361f)
                curveToRelative(0.0f, 1.106f, -1.109f, 2.277f, -3.0f, 3.147f)
                close()
                moveTo(12.293f, 9.255f)
                lineTo(22.306f, 0.256f)
                curveToRelative(0.41f, -0.367f, 1.041f, -0.337f, 1.413f, 0.075f)
                curveToRelative(0.369f, 0.411f, 0.335f, 1.044f, -0.075f, 1.413f)
                lineToRelative(-10.013f, 9.0f)
                curveToRelative(-0.191f, 0.171f, -0.431f, 0.256f, -0.669f, 0.256f)
                curveToRelative(-0.273f, 0.0f, -0.546f, -0.111f, -0.744f, -0.331f)
                curveToRelative(-0.369f, -0.411f, -0.335f, -1.044f, 0.075f, -1.413f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
