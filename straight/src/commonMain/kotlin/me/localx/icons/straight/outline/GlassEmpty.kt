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

public val Icons.Outline.GlassEmpty: ImageVector
    get() {
        if (_glassEmpty != null) {
            return _glassEmpty!!
        }
        _glassEmpty = Builder(name = "GlassEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.111f, 0.0f)
                lineToRelative(1.747f, 21.246f)
                curveToRelative(0.127f, 1.544f, 1.44f, 2.754f, 2.99f, 2.754f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.568f, 0.0f, 2.853f, -1.177f, 2.988f, -2.737f)
                lineTo(22.885f, 0.0f)
                lineTo(1.111f, 0.0f)
                close()
                moveTo(19.023f, 21.088f)
                curveToRelative(-0.045f, 0.52f, -0.474f, 0.912f, -0.996f, 0.912f)
                lineTo(5.848f, 22.0f)
                curveToRelative(-0.517f, 0.0f, -0.954f, -0.403f, -0.997f, -0.918f)
                lineTo(3.282f, 2.0f)
                horizontalLineToRelative(17.419f)
                lineToRelative(-1.678f, 19.088f)
                close()
            }
        }
        .build()
        return _glassEmpty!!
    }

private var _glassEmpty: ImageVector? = null
