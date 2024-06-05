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

public val Icons.Bold.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.946f, 11.339f)
                horizontalLineToRelative(0.0f)
                arcTo(4.106f, 4.106f, 0.0f, false, false, 19.866f, 8.0f)
                lineTo(17.8f, 8.0f)
                lineTo(14.262f, 1.824f)
                curveTo(12.4f, -1.654f, 6.939f, 0.322f, 8.177f, 4.23f)
                lineTo(9.519f, 8.0f)
                lineTo(4.543f, 8.0f)
                lineToRelative(-0.674f, -0.925f)
                curveTo(2.648f, 5.106f, -0.654f, 6.072f, 0.117f, 8.512f)
                lineTo(2.0f, 12.0f)
                lineTo(0.125f, 15.492f)
                arcTo(1.865f, 1.865f, 0.0f, false, false, 1.877f, 18.0f)
                horizontalLineToRelative(0.007f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 3.89f, 16.917f)
                lineTo(4.553f, 16.0f)
                lineTo(9.519f, 16.0f)
                lineToRelative(-1.35f, 3.793f)
                curveToRelative(-1.215f, 3.882f, 4.221f, 5.844f, 6.078f, 2.41f)
                lineTo(17.8f, 16.0f)
                lineTo(20.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.946f, -4.661f)
                close()
                moveTo(20.763f, 12.647f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 13.0f)
                lineTo(16.928f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.3f, 0.755f)
                lineToRelative(-4.0f, 6.984f)
                curveToRelative(-0.112f, 0.189f, -0.4f, 0.378f, -0.593f, 0.182f)
                arcTo(0.171f, 0.171f, 0.0f, false, true, 11.0f, 20.775f)
                lineTo(13.058f, 15.0f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, -1.413f, -2.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(5.645f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, 1.413f, -2.0f)
                lineTo(11.011f, 3.248f)
                arcToRelative(0.177f, 0.177f, 0.0f, false, true, 0.025f, -0.169f)
                curveToRelative(0.207f, -0.2f, 0.477f, -0.009f, 0.608f, 0.209f)
                lineToRelative(3.982f, 6.957f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.3f, 0.755f)
                horizontalLineToRelative(2.938f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 1.119f, 0.821f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.763f, 12.647f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
