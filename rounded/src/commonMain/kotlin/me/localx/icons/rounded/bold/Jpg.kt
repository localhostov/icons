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

public val Icons.Bold.Jpg: ImageVector
    get() {
        if (_jpg != null) {
            return _jpg!!
        }
        _jpg = Builder(name = "Jpg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.258f, 5.473f)
                lineTo(10.252f, 3.75f)
                horizontalLineToRelative(0.838f)
                arcToRelative(0.887f, 0.887f, 0.0f, false, true, 0.889f, 0.86f)
                arcToRelative(0.886f, 0.886f, 0.0f, false, true, -0.889f, 0.859f)
                close()
                moveTo(24.0f, 4.5f)
                verticalLineTo(15.843f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, true, -1.611f, 3.889f)
                lineToRelative(-2.657f, 2.657f)
                arcTo(5.464f, 5.464f, 0.0f, false, true, 15.843f, 24.0f)
                horizontalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 0.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 24.0f, 4.5f)
                close()
                moveTo(14.0f, 6.584f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.0f, 1.985f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.984f)
                verticalLineTo(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.249f)
                verticalLineToRelative(0.084f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.75f, 0.735f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.749f, -0.751f)
                verticalLineTo(4.5f)
                arcTo(0.742f, 0.742f, 0.0f, false, true, 16.0f, 3.75f)
                arcToRelative(0.779f, 0.779f, 0.0f, false, true, 0.662f, 0.409f)
                arcToRelative(0.626f, 0.626f, 0.0f, true, false, 1.11f, -0.58f)
                arcTo(2.022f, 2.022f, 0.0f, false, false, 16.0f, 2.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, -2.0f, 1.985f)
                close()
                moveTo(9.0f, 7.944f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 1.25f, 0.0f)
                verticalLineTo(6.723f)
                lineToRelative(0.84f, 0.0f)
                arcToRelative(2.11f, 2.11f, 0.0f, true, false, 0.0f, -4.219f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(4.072f, 7.4f)
                arcToRelative(2.109f, 2.109f, 0.0f, false, false, 1.849f, 1.17f)
                horizontalLineToRelative(0.0f)
                arcTo(2.069f, 2.069f, 0.0f, false, false, 8.0f, 6.506f)
                verticalLineTo(3.15f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -1.3f, 0.0f)
                lineToRelative(0.0f, 3.34f)
                arcToRelative(0.771f, 0.771f, 0.0f, false, true, -0.778f, 0.781f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, -0.687f, -0.459f)
                arcTo(0.651f, 0.651f, 0.0f, true, false, 4.072f, 7.4f)
                close()
                moveTo(4.5f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 21.0f)
                close()
            }
        }
        .build()
        return _jpg!!
    }

private var _jpg: ImageVector? = null
