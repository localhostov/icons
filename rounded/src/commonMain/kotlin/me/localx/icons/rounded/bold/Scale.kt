package me.localx.icons.rounded.bold

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

public val Icons.Bold.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 2.0f)
                horizontalLineToRelative(-2.025f)
                arcToRelative(5.917f, 5.917f, 0.0f, false, false, -5.661f, -1.885f)
                arcToRelative(5.762f, 5.762f, 0.0f, false, false, -3.214f, 1.885f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(-2.9f, 0.0f, -5.0f, 2.313f, -5.0f, 5.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-11.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.417f, 0.1f, -2.5f, 2.0f, -2.5f)
                horizontalLineToRelative(1.135f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -0.122f, 1.214f)
                arcToRelative(2.784f, 2.784f, 0.0f, false, false, 2.7f, 2.778f)
                lineToRelative(2.536f, -4.323f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.5f, 1.664f)
                lineToRelative(-1.433f, 2.667f)
                horizontalLineToRelative(2.912f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 2.785f, -3.0f)
                curveToRelative(0.0f, 0.016f, -0.037f, -0.663f, -0.092f, -1.0f)
                horizontalLineToRelative(0.579f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
