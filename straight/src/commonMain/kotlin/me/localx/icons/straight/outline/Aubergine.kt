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

public val Icons.Outline.Aubergine: ImageVector
    get() {
        if (_aubergine != null) {
            return _aubergine!!
        }
        _aubergine = Builder(name = "Aubergine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.372f, 3.929f)
                lineToRelative(-0.743f, -1.858f)
                arcTo(15.47f, 15.47f, 0.0f, false, true, 19.0f, 2.946f)
                verticalLineTo(0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.946f)
                arcToRelative(15.47f, 15.47f, 0.0f, false, true, -3.629f, -0.875f)
                lineToRelative(-0.743f, 1.858f)
                arcToRelative(16.254f, 16.254f, 0.0f, false, false, 1.8f, 0.571f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -1.392f, 2.872f)
                arcToRelative(2.518f, 2.518f, 0.0f, false, true, -0.568f, 1.322f)
                curveToRelative(-1.1f, 1.271f, -2.343f, 1.33f, -4.821f, 1.308f)
                lineTo(7.0f, 10.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 7.0f, 24.0f)
                curveToRelative(10.019f, 0.0f, 16.0f, -5.981f, 16.0f, -16.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -1.433f, -3.5f)
                arcTo(16.415f, 16.415f, 0.0f, false, false, 23.372f, 3.929f)
                close()
                moveTo(7.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 12.0f)
                lineToRelative(0.64f, 0.0f)
                curveToRelative(2.466f, 0.014f, 4.6f, 0.023f, 6.345f, -2.0f)
                arcToRelative(4.535f, 4.535f, 0.0f, false, false, 1.038f, -2.379f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 5.172f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.172f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 8.0f)
                curveTo(21.0f, 16.9f, 15.9f, 22.0f, 7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
