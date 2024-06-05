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

public val Icons.Outline.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.083f, 0.0f, 11.33f)
                arcToRelative(3.642f, 3.642f, 0.0f, false, false, 2.785f, 3.629f)
                lineToRelative(0.445f, 0.1f)
                lineToRelative(0.367f, -0.271f)
                arcToRelative(16.588f, 16.588f, 0.0f, false, true, 4.2f, -2.069f)
                arcTo(43.128f, 43.128f, 0.0f, false, false, 7.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(43.144f, 43.144f, 0.0f, false, false, -0.8f, -6.283f)
                arcToRelative(16.588f, 16.588f, 0.0f, false, true, 4.2f, 2.069f)
                lineToRelative(0.368f, 0.272f)
                lineToRelative(0.444f, -0.1f)
                arcTo(3.642f, 3.642f, 0.0f, false, false, 24.0f, 11.33f)
                curveTo(24.0f, 5.083f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(42.608f, 42.608f, 0.0f, false, true, 0.956f, -6.819f)
                arcTo(12.342f, 12.342f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(12.333f, 12.333f, 0.0f, false, true, 2.044f, 0.181f)
                arcTo(42.608f, 42.608f, 0.0f, false, true, 15.0f, 19.0f)
                close()
                moveTo(21.14f, 12.866f)
                arcTo(17.571f, 17.571f, 0.0f, false, false, 12.0f, 10.0f)
                arcToRelative(17.575f, 17.575f, 0.0f, false, false, -9.141f, 2.866f)
                arcTo(1.629f, 1.629f, 0.0f, false, true, 2.0f, 11.33f)
                curveTo(2.0f, 6.186f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.186f, 10.0f, 9.33f)
                arcTo(1.624f, 1.624f, 0.0f, false, true, 21.14f, 12.866f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
