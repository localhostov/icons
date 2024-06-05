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

public val Icons.Outline.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, true, -4.242f, -1.759f)
                arcToRelative(6.029f, 6.029f, 0.0f, false, true, 0.0f, -8.487f)
                lineTo(14.0f, 9.253f)
                lineToRelative(4.263f, 4.519f)
                arcToRelative(6.032f, 6.032f, 0.0f, false, true, -0.021f, 8.466f)
                horizontalLineToRelative(0.0f)
                arcTo(5.953f, 5.953f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(14.0f, 12.171f)
                lineTo(11.192f, 15.148f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, false, -0.02f, 5.679f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, false, 5.656f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, false, 0.0f, -5.658f)
                close()
                moveTo(5.0f, 11.996f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, true, -3.535f, -1.465f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, true, 0.0f, -7.072f)
                lineTo(5.0f, 0.0f)
                lineTo(8.527f, 3.448f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, true, 0.008f, 7.08f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 5.0f, 11.993f)
                close()
                moveTo(5.0f, 2.796f)
                lineTo(2.871f, 4.878f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.12f, 9.113f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, false, 0.0f, -4.243f)
                close()
                moveTo(20.0f, 9.996f)
                arcTo(3.974f, 3.974f, 0.0f, false, true, 17.172f, 8.82f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, true, 0.0f, -5.657f)
                lineTo(19.982f, 0.039f)
                lineTo(22.86f, 3.2f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, true, -0.032f, 5.624f)
                horizontalLineToRelative(0.0f)
                arcTo(3.974f, 3.974f, 0.0f, false, true, 20.0f, 9.993f)
                close()
                moveTo(19.992f, 3.021f)
                lineTo(18.622f, 4.542f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.792f, 2.867f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 0.0f, -2.829f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
