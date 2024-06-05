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

public val Icons.Outline.CloudsMoon: ImageVector
    get() {
        if (_cloudsMoon != null) {
            return _cloudsMoon!!
        }
        _cloudsMoon = Builder(name = "CloudsMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.848f, 15.206f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.0f, 16.5f)
                arcToRelative(5.566f, 5.566f, 0.0f, false, false, 0.059f, 0.807f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.348f, -8.794f)
                close()
                moveTo(15.5f, 22.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.145f, -2.993f)
                lineToRelative(1.28f, -0.121f)
                lineTo(8.2f, 17.675f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.778f, -1.54f)
                lineToRelative(0.082f, 0.782f)
                lineToRelative(0.779f, 0.106f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 22.0f)
                close()
                moveTo(2.0f, 16.512f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.713f, 1.277f)
                arcTo(5.508f, 5.508f, 0.0f, false, false, 2.059f, 19.7f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -6.381f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 7.5f, 7.012f)
                arcTo(5.485f, 5.485f, 0.0f, false, true, 11.743f, 9.0f)
                curveToRelative(-0.081f, 0.0f, -0.162f, 0.0f, -0.243f, 0.0f)
                arcTo(7.459f, 7.459f, 0.0f, false, false, 9.1f, 9.4f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.9f, 4.292f)
                lineTo(4.635f, 14.9f)
                lineToRelative(-1.28f, 0.121f)
                arcTo(1.494f, 1.494f, 0.0f, false, false, 2.0f, 16.512f)
                close()
                moveTo(24.0f, 8.857f)
                lineToRelative(-0.742f, 1.618f)
                arcTo(7.229f, 7.229f, 0.0f, false, true, 19.3f, 14.243f)
                arcToRelative(6.393f, 6.393f, 0.0f, false, false, -0.83f, -0.521f)
                arcToRelative(7.369f, 7.369f, 0.0f, false, false, -0.571f, -1.137f)
                arcToRelative(5.053f, 5.053f, 0.0f, false, false, 2.611f, -1.541f)
                arcTo(6.76f, 6.76f, 0.0f, false, true, 15.493f, 7.85f)
                arcToRelative(7.357f, 7.357f, 0.0f, false, true, -0.755f, -5.571f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, -0.966f, 0.475f)
                arcToRelative(5.378f, 5.378f, 0.0f, false, false, -2.452f, 3.3f)
                arcToRelative(7.437f, 7.437f, 0.0f, false, false, -1.856f, -0.776f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, true, 3.281f, -4.242f)
                arcTo(6.625f, 6.625f, 0.0f, false, true, 16.319f, 0.0f)
                horizontalLineToRelative(1.709f)
                lineToRelative(-0.837f, 1.49f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, 0.017f, 5.33f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, false, 5.023f, 2.243f)
                close()
            }
        }
        .build()
        return _cloudsMoon!!
    }

private var _cloudsMoon: ImageVector? = null
