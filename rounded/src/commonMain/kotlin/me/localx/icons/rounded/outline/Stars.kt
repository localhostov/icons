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

public val Icons.Outline.Stars: ImageVector
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
                lineTo(6.254f, 10.0f)
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
                moveTo(9.99f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.62f, 0.216f)
                lineToRelative(3.332f, 2.634f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, 0.942f, -0.018f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, false, 0.3f, -0.919f)
                lineTo(14.038f, 16.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.378f, -1.085f)
                lineToRelative(3.24f, -2.331f)
                arcTo(0.821f, 0.821f, 0.0f, false, false, 17.165f, 12.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.955f, -0.7f)
                lineTo(10.772f, 7.2f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, false, -1.561f, 0.01f)
                lineTo(7.947f, 11.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.992f, 12.0f)
                lineTo(2.822f, 12.0f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, -0.485f, 1.485f)
                lineToRelative(3.245f, 2.324f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.379f, 1.09f)
                lineTo(4.809f, 20.884f)
                arcToRelative(0.784f, 0.784f, 0.0f, false, false, 0.292f, 0.948f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, false, 0.967f, 0.0f)
                lineToRelative(3.306f, -2.612f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 9.994f, 19.0f)
                close()
                moveTo(20.0f, 7.146f)
                lineToRelative(1.481f, 1.089f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, 1.25f, -0.9f)
                lineToRelative(-0.572f, -1.771f)
                lineToRelative(1.506f, -1.1f)
                arcTo(0.809f, 0.809f, 0.0f, false, false, 23.188f, 3.0f)
                lineTo(21.334f, 3.0f)
                lineToRelative(-0.563f, -1.756f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, false, -1.542f, 0.0f)
                lineTo(18.666f, 3.0f)
                lineTo(16.813f, 3.0f)
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
