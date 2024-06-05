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

public val Icons.Outline.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.973f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.973f, 4.0f)
                close()
                moveTo(13.787f, 9.0f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, false, -4.014f, 1.277f)
                arcToRelative(2.862f, 2.862f, 0.0f, false, false, 2.2f, 0.723f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, -3.65f, -1.35f)
                arcToRelative(6.363f, 6.363f, 0.0f, false, false, -1.081f, 2.086f)
                arcTo(6.507f, 6.507f, 0.0f, false, false, 10.977f, 15.0f)
                verticalLineToRelative(2.0f)
                arcTo(8.235f, 8.235f, 0.0f, false, true, 7.0f, 15.938f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 13.474f, 22.0f)
                lineToRelative(8.873f, -5.418f)
                lineToRelative(0.5f, 0.951f)
                arcTo(9.388f, 9.388f, 0.0f, false, true, 23.963f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-8.99f)
                arcTo(11.995f, 11.995f, 0.0f, false, true, -0.011f, 11.775f)
                arcTo(12.241f, 12.241f, 0.0f, false, true, 12.339f, 0.0f)
                lineTo(23.987f, 0.023f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.082f, 0.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 13.787f, 9.0f)
                close()
                moveTo(17.456f, 22.0f)
                horizontalLineToRelative(3.51f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(5.061f, 5.061f, 0.0f, false, false, -0.431f, -1.551f)
                close()
                moveTo(6.52f, 20.382f)
                arcToRelative(8.441f, 8.441f, 0.0f, false, true, -1.534f, -5.143f)
                curveToRelative(0.0f, -0.087f, 0.016f, -0.172f, 0.021f, -0.259f)
                curveToRelative(-0.214f, 0.02f, -0.429f, 0.041f, -0.628f, 0.041f)
                arcToRelative(5.124f, 5.124f, 0.0f, false, true, -2.045f, -0.409f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, false, 2.512f, 4.394f)
                arcTo(10.107f, 10.107f, 0.0f, false, false, 6.52f, 20.382f)
                close()
                moveTo(6.52f, 10.736f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 3.049f, 7.627f)
                arcToRelative(9.581f, 9.581f, 0.0f, false, false, -1.06f, 4.164f)
                curveToRelative(0.232f, 0.436f, 1.086f, 1.582f, 3.421f, 1.117f)
                arcTo(8.35f, 8.35f, 0.0f, false, true, 6.521f, 10.736f)
                close()
                moveTo(10.32f, 7.703f)
                arcTo(4.427f, 4.427f, 0.0f, false, true, 9.53f, 2.387f)
                arcTo(10.482f, 10.482f, 0.0f, false, false, 4.494f, 5.505f)
                arcTo(4.059f, 4.059f, 0.0f, false, false, 8.11f, 9.04f)
                arcTo(8.939f, 8.939f, 0.0f, false, true, 10.323f, 7.7f)
                close()
                moveTo(13.474f, 7.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.908f, -4.984f)
                lineTo(13.451f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.023f, 5.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
