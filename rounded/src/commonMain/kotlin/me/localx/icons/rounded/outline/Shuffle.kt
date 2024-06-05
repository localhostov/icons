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

public val Icons.Outline.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.421f, 16.583f)
                lineTo(20.13f, 13.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.413f, 1.414f)
                lineTo(21.007f, 17.0f)
                arcTo(9.332f, 9.332f, 0.0f, false, true, 14.321f, 14.2f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, false, -1.408f, 0.08f)
                lineTo(12.9f, 14.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.075f, 1.382f)
                arcTo(11.177f, 11.177f, 0.0f, false, false, 21.01f, 19.0f)
                lineToRelative(-2.293f, 2.293f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 20.13f, 22.7f)
                lineToRelative(3.291f, -3.291f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.421f, 16.583f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.007f, 7.0f)
                lineToRelative(-2.29f, 2.29f)
                arcToRelative(0.892f, 0.892f, 0.0f, false, false, -0.054f, 0.082f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 1.467f, 1.332f)
                lineTo(21.836f, 9.0f)
                lineToRelative(1.586f, -1.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.457f, -2.1f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, false, -0.458f, -0.728f)
                lineTo(20.13f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.413f, 1.413f)
                lineTo(21.01f, 5.005f)
                curveToRelative(-4.933f, 0.012f, -7.637f, 2.674f, -10.089f, 5.474f)
                curveTo(8.669f, 7.937f, 6.0f, 5.4f, 1.487f, 5.046f)
                lineTo(1.006f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, 1.0f, 1.0f)
                curveToRelative(0.072f, 0.0f, 0.287f, 0.033f, 0.287f, 0.033f)
                curveTo(5.189f, 7.328f, 7.425f, 9.522f, 9.6f, 12.0f)
                curveToRelative(-2.162f, 2.466f, -4.383f, 4.7f, -8.247f, 4.96f)
                lineToRelative(-0.4f, 0.021f)
                arcToRelative(0.994f, 0.994f, 0.0f, true, false, 0.124f, 1.985f)
                curveToRelative(0.156f, -0.007f, 0.41f, -0.013f, 0.535f, -0.023f)
                curveToRelative(5.02f, -0.387f, 7.743f, -3.6f, 10.171f, -6.409f)
                curveTo(14.235f, 9.7f, 16.551f, 7.018f, 21.007f, 7.0f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
