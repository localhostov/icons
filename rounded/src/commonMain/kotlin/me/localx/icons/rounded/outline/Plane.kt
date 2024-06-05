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

public val Icons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(17.693f)
                lineTo(13.446f, 1.563f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.812f, 0.0f)
                horizontalLineTo(10.63f)
                arcTo(2.63f, 2.63f, 0.0f, false, false, 8.1f, 3.361f)
                lineTo(10.028f, 10.0f)
                horizontalLineTo(7.644f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.879f)
                lineTo(4.105f, 7.7f)
                arcToRelative(2.409f, 2.409f, 0.0f, false, false, -2.814f, -0.433f)
                arcTo(2.319f, 2.319f, 0.0f, false, false, 0.125f, 8.689f)
                arcToRelative(2.525f, 2.525f, 0.0f, false, false, 0.228f, 1.966f)
                lineTo(1.967f, 13.48f)
                arcTo(5.012f, 5.012f, 0.0f, false, false, 6.308f, 16.0f)
                horizontalLineToRelative(3.711f)
                lineTo(8.351f, 20.447f)
                arcTo(2.629f, 2.629f, 0.0f, false, false, 10.812f, 24.0f)
                arcToRelative(2.972f, 2.972f, 0.0f, false, false, 2.605f, -1.513f)
                lineTo(17.464f, 16.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(10.025f, 2.805f)
                arcTo(0.63f, 0.63f, 0.0f, false, true, 10.63f, 2.0f)
                horizontalLineToRelative(0.182f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, 0.863f, 0.491f)
                lineTo(15.455f, 10.0f)
                horizontalLineTo(12.11f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineTo(16.909f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.848f, 0.471f)
                lineTo(11.69f, 21.479f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.878f, 0.521f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, -0.588f, -0.85f)
                lineToRelative(2.174f, -5.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.461f, 14.0f)
                horizontalLineTo(6.308f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.6f, -1.512f)
                lineTo(2.089f, 9.662f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, true, -0.047f, -0.4f)
                arcTo(0.323f, 0.323f, 0.0f, false, true, 2.2f, 9.051f)
                arcTo(0.437f, 0.437f, 0.0f, false, true, 2.4f, 9.0f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.287f, 0.118f)
                lineToRelative(1.417f, 1.417f)
                arcTo(4.972f, 4.972f, 0.0f, false, false, 7.644f, 12.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
