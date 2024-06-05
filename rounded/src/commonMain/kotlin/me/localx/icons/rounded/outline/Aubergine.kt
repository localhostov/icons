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
                moveTo(22.427f, 4.378f)
                arcToRelative(6.552f, 6.552f, 0.0f, false, false, 1.128f, -0.546f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.1f, -1.668f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 20.0f, 2.931f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.931f)
                arcToRelative(6.526f, 6.526f, 0.0f, false, true, -2.451f, -0.767f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.1f, 1.668f)
                arcToRelative(6.552f, 6.552f, 0.0f, false, false, 1.128f, 0.546f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, -1.534f, 2.994f)
                curveToRelative(-0.524f, 2.77f, -3.486f, 2.6f, -6.388f, 2.63f)
                curveTo(-2.04f, 9.608f, -2.68f, 23.567f, 7.0f, 24.0f)
                curveToRelative(10.327f, 0.0f, 17.0f, -6.28f, 17.0f, -16.0f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 22.427f, 4.378f)
                close()
                moveTo(7.0f, 22.0f)
                curveToRelative(-7.021f, -0.328f, -6.38f, -10.473f, 0.642f, -10.0f)
                curveToRelative(3.542f, 0.151f, 7.836f, -0.36f, 8.381f, -4.38f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 5.178f)
                curveToRelative(0.094f, 0.917f, -0.436f, 2.767f, 1.0f, 2.822f)
                curveToRelative(1.434f, -0.054f, 0.907f, -1.9f, 1.0f, -2.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 8.0f)
                curveTo(22.0f, 16.636f, 16.252f, 22.0f, 7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
