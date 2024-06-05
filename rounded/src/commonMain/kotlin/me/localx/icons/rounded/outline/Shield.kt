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

public val Icons.Outline.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.581f, 2.14f)
                lineTo(12.316f, 0.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.632f, 0.0f)
                lineTo(5.418f, 2.14f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 2.0f, 6.883f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 7.563f, 9.2f, 11.74f, 9.594f, 11.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.812f, 0.0f)
                curveTo(12.8f, 23.74f, 22.0f, 19.563f, 22.0f, 12.0f)
                verticalLineTo(6.883f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 18.581f, 2.14f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 5.455f, -6.319f, 9.033f, -8.0f, 9.889f)
                curveToRelative(-1.683f, -0.853f, -8.0f, -4.42f, -8.0f, -9.889f)
                verticalLineTo(6.883f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.051f, 4.037f)
                lineTo(12.0f, 2.054f)
                lineToRelative(5.948f, 1.983f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 6.883f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
