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

public val Icons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 5.0f)
                lineTo(21.121f, 5.0f)
                lineToRelative(1.44f, -1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineTo(19.0f, 2.879f)
                lineTo(19.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(16.0f, 4.537f)
                arcToRelative(7.527f, 7.527f, 0.0f, false, false, -1.829f, -1.18f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.8f, 1.11f)
                curveTo(7.655f, 6.185f, 2.982f, 14.749f, 0.35f, 19.7f)
                arcTo(2.92f, 2.92f, 0.0f, false, false, 4.3f, 23.651f)
                curveToRelative(4.953f, -2.633f, 13.517f, -7.308f, 15.234f, -9.024f)
                curveTo(22.0f, 12.165f, 20.97f, 9.855f, 19.452f, 8.0f)
                lineTo(22.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 5.0f)
                close()
                moveTo(17.412f, 12.505f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -2.835f, 1.951f)
                lineToRelative(-1.016f, -1.017f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(0.48f, 0.479f)
                curveToRelative(-2.39f, 1.389f, -5.414f, 3.074f, -8.846f, 4.928f)
                curveToRelative(0.963f, -1.808f, 1.878f, -3.5f, 2.732f, -5.042f)
                lineToRelative(0.634f, 0.635f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineTo(7.327f, 13.206f)
                curveToRelative(0.8f, -1.4f, 1.513f, -2.626f, 2.127f, -3.631f)
                lineToRelative(0.985f, 0.986f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineTo(11.137f, 7.016f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 0.357f, -0.428f)
                curveToRelative(0.652f, -0.609f, 0.933f, -0.708f, 1.5f, -0.474f)
                arcToRelative(11.314f, 11.314f, 0.0f, false, true, 2.677f, 2.22f)
                curveTo(18.481f, 11.149f, 18.313f, 11.6f, 17.412f, 12.505f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
