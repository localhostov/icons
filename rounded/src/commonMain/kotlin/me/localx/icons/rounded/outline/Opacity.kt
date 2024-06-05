package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.886f, 6.836f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.715f, 6.4f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 6.524f, 3.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.1f, -1.672f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 2.06f, 5.275f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.826f, 1.561f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.112f, 10.112f, 0.0f, false, true, 0.193f, -1.969f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 0.232f, 9.639f)
                arcToRelative(12.135f, 12.135f, 0.0f, false, false, 0.0f, 4.728f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.98f, 0.8f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, false, 0.2f, -0.019f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.784f, -1.177f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.528f, 20.372f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.81f, -2.766f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.656f, 1.123f)
                arcToRelative(11.993f, 11.993f, 0.0f, false, false, 3.37f, 3.315f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.1f, -1.672f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.107f, 12.107f, 0.0f, false, false, 9.829f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.179f, 1.984f)
                arcToRelative(1.126f, 1.126f, 0.0f, false, false, 0.181f, -0.016f)
                arcTo(10.033f, 10.033f, 0.0f, false, true, 12.0f, 2.0f)
                verticalLineTo(22.0f)
                arcToRelative(10.033f, 10.033f, 0.0f, false, true, -1.811f, -0.164f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.36f, 1.968f)
                arcTo(12.01f, 12.01f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
