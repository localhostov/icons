package me.localx.icons.straight.bold

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

public val Icons.Bold.LeafMaple: ImageVector
    get() {
        if (_leafMaple != null) {
            return _leafMaple!!
        }
        _leafMaple = Builder(name = "LeafMaple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.024f, 17.067f)
                lineToRelative(2.27f, -3.216f)
                lineToRelative(-2.902f, -1.244f)
                lineToRelative(4.557f, -3.646f)
                lineToRelative(-2.684f, -2.013f)
                lineToRelative(2.106f, -6.32f)
                lineToRelative(-6.32f, 2.106f)
                lineTo(15.038f, 0.051f)
                lineToRelative(-3.646f, 4.557f)
                lineToRelative(-1.252f, -2.921f)
                lineToRelative(-3.174f, 2.292f)
                lineTo(3.5f, -0.025f)
                verticalLineToRelative(5.025f)
                lineTo(-0.081f, 5.0f)
                lineToRelative(2.461f, 7.385f)
                lineTo(0.28f, 16.586f)
                lineToRelative(4.185f, 0.837f)
                lineTo(0.014f, 21.875f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.445f, -4.445f)
                lineToRelative(0.834f, 4.169f)
                lineToRelative(4.201f, -2.1f)
                lineToRelative(7.385f, 2.461f)
                verticalLineToRelative(-3.581f)
                horizontalLineToRelative(5.144f)
                lineToRelative(-4.12f, -3.433f)
                close()
                moveTo(13.608f, 13.392f)
                lineToRelative(4.098f, 1.756f)
                lineToRelative(-1.66f, 2.351f)
                lineToRelative(-0.046f, 2.419f)
                lineToRelative(-4.615f, -1.539f)
                lineToRelative(-1.799f, 0.9f)
                lineToRelative(-0.456f, -2.28f)
                lineToRelative(2.685f, -2.685f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.679f, 2.679f)
                lineToRelative(-2.296f, -0.459f)
                lineToRelative(0.9f, -1.799f)
                lineToRelative(-1.539f, -4.615f)
                horizontalLineToRelative(2.397f)
                lineToRelative(0.018f, 0.021f)
                lineToRelative(2.364f, -1.708f)
                lineToRelative(1.748f, 4.079f)
                lineToRelative(4.354f, -5.443f)
                lineToRelative(0.987f, 1.316f)
                lineToRelative(2.68f, -0.894f)
                lineToRelative(-0.894f, 2.68f)
                lineToRelative(1.316f, 0.987f)
                lineToRelative(-5.443f, 4.354f)
                close()
            }
        }
        .build()
        return _leafMaple!!
    }

private var _leafMaple: ImageVector? = null
