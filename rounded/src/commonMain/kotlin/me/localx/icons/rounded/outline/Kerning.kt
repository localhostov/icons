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

public val Icons.Outline.Kerning: ImageVector
    get() {
        if (_kerning != null) {
            return _kerning!!
        }
        _kerning = Builder(name = "Kerning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.94f, 1.342f)
                lineTo(8.94f, 23.342f)
                curveToRelative(-0.148f, 0.406f, -0.531f, 0.658f, -0.94f, 0.658f)
                curveToRelative(-0.114f, 0.0f, -0.229f, -0.02f, -0.342f, -0.061f)
                curveToRelative(-0.519f, -0.188f, -0.787f, -0.762f, -0.598f, -1.281f)
                lineTo(15.06f, 0.658f)
                curveToRelative(0.189f, -0.519f, 0.764f, -0.785f, 1.282f, -0.598f)
                curveToRelative(0.519f, 0.188f, 0.787f, 0.762f, 0.598f, 1.281f)
                close()
                moveTo(9.908f, 6.059f)
                curveToRelative(-0.52f, -0.186f, -1.093f, 0.085f, -1.278f, 0.605f)
                lineToRelative(-3.344f, 9.362f)
                lineTo(1.942f, 6.664f)
                curveToRelative(-0.186f, -0.521f, -0.758f, -0.791f, -1.278f, -0.605f)
                reflectiveCurveTo(-0.127f, 6.816f, 0.058f, 7.336f)
                lineToRelative(3.805f, 10.653f)
                curveToRelative(0.218f, 0.608f, 0.776f, 1.002f, 1.423f, 1.002f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.647f, 0.0f, 1.205f, -0.394f, 1.422f, -1.003f)
                lineToRelative(3.805f, -10.652f)
                curveToRelative(0.186f, -0.52f, -0.085f, -1.092f, -0.605f, -1.277f)
                close()
                moveTo(23.336f, 18.942f)
                curveToRelative(-0.111f, 0.04f, -0.225f, 0.059f, -0.336f, 0.059f)
                curveToRelative(-0.411f, 0.0f, -0.796f, -0.255f, -0.942f, -0.664f)
                lineToRelative(-1.192f, -3.336f)
                horizontalLineToRelative(-4.305f)
                lineToRelative(-1.191f, 3.336f)
                curveToRelative(-0.186f, 0.521f, -0.757f, 0.793f, -1.278f, 0.605f)
                curveToRelative(-0.52f, -0.186f, -0.791f, -0.758f, -0.605f, -1.277f)
                lineToRelative(3.805f, -10.652f)
                curveToRelative(0.217f, -0.609f, 0.775f, -1.003f, 1.422f, -1.003f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.647f, 0.0f, 1.206f, 0.394f, 1.423f, 1.002f)
                lineToRelative(3.805f, 10.653f)
                curveToRelative(0.186f, 0.52f, -0.085f, 1.092f, -0.605f, 1.277f)
                close()
                moveTo(20.152f, 13.001f)
                lineToRelative(-1.438f, -4.026f)
                lineToRelative(-1.438f, 4.026f)
                horizontalLineToRelative(2.876f)
                close()
            }
        }
        .build()
        return _kerning!!
    }

private var _kerning: ImageVector? = null
