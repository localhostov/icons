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

public val Icons.Outline.LandLayerLocation: ImageVector
    get() {
        if (_landLayerLocation != null) {
            return _landLayerLocation!!
        }
        _landLayerLocation = Builder(name = "LandLayerLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.943f, 16.846f)
                lineToRelative(-11.943f, 7.166f)
                lineTo(0.057f, 16.846f)
                lineToRelative(5.664f, -3.398f)
                lineToRelative(1.478f, 1.445f)
                lineToRelative(-3.255f, 1.953f)
                lineToRelative(8.057f, 4.834f)
                lineToRelative(8.057f, -4.834f)
                lineToRelative(-3.256f, -1.953f)
                lineToRelative(1.478f, -1.445f)
                lineToRelative(5.665f, 3.399f)
                close()
                moveTo(7.058f, 11.958f)
                curveToRelative(-2.736f, -2.737f, -2.736f, -7.178f, -0.008f, -9.907f)
                curveToRelative(1.322f, -1.322f, 3.081f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.628f, 0.728f, 4.949f, 2.05f)
                curveToRelative(1.322f, 1.322f, 2.051f, 3.08f, 2.051f, 4.95f)
                reflectiveCurveToRelative(-0.729f, 3.627f, -2.051f, 4.95f)
                lineToRelative(-4.949f, 4.841f)
                lineToRelative(-4.942f, -4.833f)
                close()
                moveTo(8.464f, 10.536f)
                lineToRelative(3.536f, 3.458f)
                lineToRelative(3.543f, -3.466f)
                curveToRelative(0.937f, -0.937f, 1.457f, -2.192f, 1.457f, -3.528f)
                reflectiveCurveToRelative(-0.521f, -2.591f, -1.465f, -3.536f)
                reflectiveCurveToRelative(-2.199f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.592f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.949f, 1.95f, -1.949f, 5.122f, 0.0f, 7.071f)
                close()
                moveTo(12.0f, 9.991f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _landLayerLocation!!
    }

private var _landLayerLocation: ImageVector? = null
