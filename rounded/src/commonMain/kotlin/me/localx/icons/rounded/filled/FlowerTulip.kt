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

public val Icons.Filled.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.535f, 14.725f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.726f, -0.716f)
                arcTo(10.422f, 10.422f, 0.0f, false, false, 13.0f, 19.951f)
                verticalLineTo(13.916f)
                arcTo(6.009f, 6.009f, 0.0f, false, false, 18.0f, 8.0f)
                curveToRelative(0.0f, -2.793f, -1.943f, -5.152f, -3.844f, -7.091f)
                arcTo(2.865f, 2.865f, 0.0f, false, false, 13.8f, 0.6f)
                arcTo(16.955f, 16.955f, 0.0f, false, false, 12.0f, 7.966f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.068f)
                arcToRelative(18.566f, 18.566f, 0.0f, false, true, 1.846f, -8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, 0.874f)
                curveTo(7.943f, 2.848f, 6.0f, 5.207f, 6.0f, 8.0f)
                arcToRelative(6.009f, 6.009f, 0.0f, false, false, 5.0f, 5.916f)
                verticalLineToRelative(6.036f)
                arcToRelative(10.421f, 10.421f, 0.0f, false, false, -8.809f, -5.943f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, -1.726f, 0.716f)
                arcToRelative(1.971f, 1.971f, 0.0f, false, false, -0.393f, 1.792f)
                curveTo(2.111f, 23.855f, 11.591f, 24.0f, 11.994f, 24.0f)
                horizontalLineToRelative(0.012f)
                curveToRelative(0.4f, 0.0f, 9.884f, -0.145f, 11.923f, -7.483f)
                arcTo(1.975f, 1.975f, 0.0f, false, false, 23.535f, 14.725f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
