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

public val Icons.Outline.Garlic: ImageVector
    get() {
        if (_garlic != null) {
            return _garlic!!
        }
        _garlic = Builder(name = "Garlic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.466f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 5.466f)
                curveTo(6.205f, 6.716f, 0.0f, 11.541f, 0.0f, 18.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 7.742f, 3.118f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 8.516f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 24.0f, 18.5f)
                curveTo(24.0f, 11.541f, 17.8f, 6.716f, 16.0f, 5.466f)
                close()
                moveTo(14.0f, 2.0f)
                lineTo(14.0f, 5.816f)
                curveToRelative(-0.086f, 0.232f, -0.259f, 0.708f, -0.54f, 1.521f)
                curveToRelative(-0.376f, -0.577f, -0.639f, -0.91f, -0.68f, -0.962f)
                lineTo(12.0f, 5.4f)
                lineToRelative(-0.781f, 0.976f)
                curveToRelative(-0.041f, 0.052f, -0.3f, 0.385f, -0.68f, 0.962f)
                curveToRelative(-0.28f, -0.81f, -0.453f, -1.286f, -0.539f, -1.519f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(4.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 18.5f)
                curveTo(2.0f, 13.214f, 6.447f, 9.171f, 8.506f, 7.582f)
                curveToRelative(0.178f, 0.507f, 0.414f, 1.192f, 0.716f, 2.091f)
                arcTo(21.542f, 21.542f, 0.0f, false, false, 7.007f, 18.5f)
                lineTo(7.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 21.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                arcTo(20.068f, 20.068f, 0.0f, false, true, 12.0f, 8.78f)
                arcTo(20.068f, 20.068f, 0.0f, false, true, 15.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(19.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 18.5f)
                horizontalLineToRelative(-0.007f)
                arcToRelative(21.542f, 21.542f, 0.0f, false, false, -2.215f, -8.827f)
                curveToRelative(0.3f, -0.9f, 0.538f, -1.584f, 0.716f, -2.091f)
                curveTo(17.553f, 9.171f, 22.0f, 13.214f, 22.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 21.0f)
                close()
            }
        }
        .build()
        return _garlic!!
    }

private var _garlic: ImageVector? = null
