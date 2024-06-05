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

public val Icons.Outline.TemperatureFrigid: ImageVector
    get() {
        if (_temperatureFrigid != null) {
            return _temperatureFrigid!!
        }
        _temperatureFrigid = Builder(name = "TemperatureFrigid", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.184f)
                lineTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(6.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.0f)
                close()
                moveTo(22.0f, 12.111f)
                lineTo(22.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 5.0f)
                verticalLineToRelative(7.111f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 10.0f, 0.0f)
                close()
                moveTo(17.0f, 22.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -3.332f, -8.719f)
                lineToRelative(0.332f, -0.3f)
                lineTo(14.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(7.983f)
                lineToRelative(0.332f, 0.3f)
                arcTo(4.994f, 4.994f, 0.0f, false, true, 17.0f, 22.0f)
                close()
                moveTo(8.0f, 11.309f)
                lineToRelative(1.732f, 1.732f)
                lineTo(8.318f, 14.455f)
                lineTo(7.0f, 13.137f)
                lineTo(5.682f, 14.455f)
                lineTo(4.268f, 13.041f)
                lineTo(6.0f, 11.309f)
                lineTo(6.0f, 8.946f)
                lineTo(3.95f, 10.122f)
                lineToRelative(-0.641f, 2.363f)
                lineToRelative(-1.93f, -0.523f)
                lineToRelative(0.488f, -1.8f)
                lineToRelative(-1.8f, -0.488f)
                lineToRelative(0.524f, -1.93f)
                lineToRelative(2.364f, 0.641f)
                lineTo(4.99f, 7.22f)
                lineTo(2.955f, 6.054f)
                lineTo(0.592f, 6.7f)
                lineTo(0.068f, 4.765f)
                lineToRelative(1.8f, -0.488f)
                lineToRelative(-0.488f, -1.8f)
                lineToRelative(1.93f, -0.523f)
                lineTo(3.95f, 4.319f)
                lineTo(6.0f, 5.494f)
                lineTo(6.0f, 3.132f)
                lineTo(4.268f, 1.4f)
                lineTo(5.682f, -0.015f)
                lineTo(7.0f, 1.3f)
                lineTo(8.318f, -0.015f)
                lineTo(9.732f, 1.4f)
                lineTo(8.0f, 3.132f)
                lineTo(8.0f, 5.494f)
                lineToRelative(2.0f, -1.146f)
                verticalLineToRelative(2.3f)
                lineToRelative(-0.99f, 0.567f)
                lineToRelative(0.99f, 0.568f)
                verticalLineToRelative(2.3f)
                lineTo(8.0f, 8.946f)
                close()
            }
        }
        .build()
        return _temperatureFrigid!!
    }

private var _temperatureFrigid: ImageVector? = null
