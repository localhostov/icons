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

public val Icons.Bold.Grape: ImageVector
    get() {
        if (_grape != null) {
            return _grape!!
        }
        _grape = Builder(name = "Grape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, false, -8.487f, -4.611f)
                curveTo(13.649f, 3.12f, 15.975f, 3.0f, 16.0f, 3.0f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -3.951f, 2.069f)
                arcTo(6.24f, 6.24f, 0.0f, false, false, 9.808f, 0.158f)
                lineTo(8.466f, 2.842f)
                curveToRelative(0.481f, 0.241f, 1.93f, 0.971f, 2.026f, 4.05f)
                arcTo(5.495f, 5.495f, 0.0f, true, false, 6.729f, 16.939f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 10.542f, 0.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 11.5f)
                close()
                moveTo(5.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 11.5f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
