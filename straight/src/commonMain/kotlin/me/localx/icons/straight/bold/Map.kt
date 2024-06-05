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

public val Icons.Bold.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.543f, 1.638f)
                lineTo(17.191f, 0.181f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.14f, -0.026f)
                lineTo(8.962f, 1.983f)
                lineTo(4.848f, 0.272f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(21.631f)
                lineTo(8.5f, 24.06f)
                lineToRelative(7.049f, -2.009f)
                lineToRelative(8.47f, 2.063f)
                verticalLineTo(4.983f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 21.543f, 1.638f)
                close()
                moveTo(14.018f, 3.623f)
                verticalLineTo(19.368f)
                lineTo(10.0f, 20.513f)
                verticalLineTo(4.873f)
                curveToRelative(0.035f, -0.01f, 0.07f, -0.013f, 0.1f, -0.023f)
                close()
                moveTo(3.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.694f, -0.461f)
                lineTo(7.0f, 4.416f)
                verticalLineToRelative(16.1f)
                lineTo(3.0f, 19.369f)
                close()
                moveTo(21.018f, 20.3f)
                lineToRelative(-4.0f, -0.974f)
                verticalLineTo(3.286f)
                lineTo(20.655f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.363f, 0.48f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
