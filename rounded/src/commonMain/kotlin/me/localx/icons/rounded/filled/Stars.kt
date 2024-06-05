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

public val Icons.Filled.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 24.0f)
                arcToRelative(2.807f, 2.807f, 0.0f, false, true, -1.671f, -0.559f)
                lineTo(9.994f, 21.274f)
                lineTo(7.281f, 23.418f)
                arcToRelative(2.816f, 2.816f, 0.0f, false, true, -3.351f, 0.036f)
                arcTo(2.776f, 2.776f, 0.0f, false, true, 2.9f, 20.3f)
                lineToRelative(0.946f, -3.276f)
                lineTo(1.165f, 15.105f)
                arcTo(2.821f, 2.821f, 0.0f, false, true, 2.822f, 10.0f)
                horizontalLineTo(6.254f)
                lineTo(7.3f, 6.606f)
                arcTo(2.835f, 2.835f, 0.0f, false, true, 12.68f, 6.6f)
                lineTo(13.732f, 10.0f)
                horizontalLineToRelative(3.433f)
                arcToRelative(2.821f, 2.821f, 0.0f, false, true, 1.666f, 5.1f)
                lineToRelative(-2.677f, 1.924f)
                lineToRelative(0.947f, 3.309f)
                arcToRelative(2.769f, 2.769f, 0.0f, false, true, -1.044f, 3.123f)
                arcTo(2.826f, 2.826f, 0.0f, false, true, 14.4f, 24.0f)
                close()
                moveTo(20.0f, 7.146f)
                lineToRelative(1.481f, 1.089f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, 1.25f, -0.9f)
                lineToRelative(-0.572f, -1.771f)
                lineToRelative(1.506f, -1.1f)
                arcTo(0.809f, 0.809f, 0.0f, false, false, 23.188f, 3.0f)
                horizontalLineTo(21.334f)
                lineToRelative(-0.563f, -1.756f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, false, -1.542f, 0.0f)
                lineTo(18.666f, 3.0f)
                horizontalLineTo(16.813f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, -0.478f, 1.463f)
                lineToRelative(1.506f, 1.1f)
                lineToRelative(-0.572f, 1.771f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, false, 0.3f, 0.906f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.953f, -0.005f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
