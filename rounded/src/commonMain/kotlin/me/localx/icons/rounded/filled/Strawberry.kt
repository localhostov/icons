package me.localx.icons.rounded.filled

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

public val Icons.Filled.Strawberry: ImageVector
    get() {
        if (_strawberry != null) {
            return _strawberry!!
        }
        _strawberry = Builder(name = "Strawberry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                curveToRelative(-1.855f, 0.0f, -3.495f, -0.012f, -4.792f, -0.795f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.415f, -1.415f)
                lineTo(16.807f, 5.779f)
                curveTo(16.08f, 4.543f, 16.0f, 2.972f, 16.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-1.673f, 0.08f, -0.844f, 2.919f, -0.822f, 4.123f)
                curveTo(7.342f, 0.2f, 2.906f, 7.4f, 0.837f, 13.455f)
                curveTo(-2.124f, 22.23f, 2.968f, 25.8f, 10.545f, 23.164f)
                curveToRelative(6.045f, -2.067f, 13.24f, -6.5f, 9.345f, -13.322f)
                curveTo(21.012f, 9.827f, 23.906f, 10.691f, 24.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.0f)
                close()
                moveTo(8.766f, 7.382f)
                arcToRelative(1.309f, 1.309f, 0.0f, false, true, 1.851f, 1.851f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.968f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.635f, -0.636f)
                arcTo(5.4f, 5.4f, 0.0f, false, true, 8.766f, 7.382f)
                close()
                moveTo(6.616f, 19.235f)
                arcToRelative(5.417f, 5.417f, 0.0f, false, true, -1.967f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.635f, -0.636f)
                arcToRelative(5.418f, 5.418f, 0.0f, false, true, 0.751f, -1.967f)
                arcTo(1.309f, 1.309f, 0.0f, false, true, 6.616f, 19.235f)
                close()
                moveTo(8.616f, 14.235f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.967f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.635f, -0.636f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.752f, -1.967f)
                arcTo(1.309f, 1.309f, 0.0f, false, true, 8.616f, 14.234f)
                close()
                moveTo(11.616f, 17.235f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.967f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.636f, -0.635f)
                arcToRelative(5.417f, 5.417f, 0.0f, false, true, 0.752f, -1.967f)
                arcTo(1.309f, 1.309f, 0.0f, false, true, 11.617f, 17.234f)
                close()
                moveTo(13.616f, 12.235f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.967f, 0.752f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.635f, -0.635f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.752f, -1.967f)
                arcTo(1.308f, 1.308f, 0.0f, false, true, 13.617f, 12.233f)
                close()
                moveTo(16.616f, 15.235f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.968f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.635f, -0.635f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.752f, -1.968f)
                arcTo(1.309f, 1.309f, 0.0f, false, true, 16.618f, 15.234f)
                close()
            }
        }
        .build()
        return _strawberry!!
    }

private var _strawberry: ImageVector? = null
