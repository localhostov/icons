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

public val Icons.Outline.Clean: ImageVector
    get() {
        if (_clean != null) {
            return _clean!!
        }
        _clean = Builder(name = "Clean", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.965f, 8.464f)
                lineToRelative(5.029f, -5.029f)
                lineTo(22.565f, 2.006f)
                lineTo(17.519f, 7.051f)
                lineTo(15.313f, 4.895f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, false, -2.724f, -0.073f)
                arcTo(19.71f, 19.71f, 0.0f, false, true, 6.226f, 8.687f)
                lineTo(-0.006f, 10.514f)
                verticalLineToRelative(0.756f)
                arcTo(12.892f, 12.892f, 0.0f, false, false, 13.006f, 24.006f)
                horizontalLineToRelative(1.241f)
                lineToRelative(0.261f, -0.182f)
                arcToRelative(14.98f, 14.98f, 0.0f, false, false, 6.886f, -12.081f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -0.611f, -1.5f)
                close()
                moveTo(13.9f, 6.34f)
                lineToRelative(5.477f, 5.341f)
                arcToRelative(12.652f, 12.652f, 0.0f, false, true, -0.456f, 3.015f)
                lineTo(11.941f, 7.9f)
                arcTo(24.691f, 24.691f, 0.0f, false, false, 13.9f, 6.34f)
                close()
                moveTo(13.606f, 21.985f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(11.153f, 11.153f, 0.0f, false, true, -4.293f, -0.859f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, 4.348f, -3.8f)
                lineToRelative(0.518f, -0.76f)
                lineTo(11.91f, 15.43f)
                lineToRelative(-0.518f, 0.761f)
                arcTo(9.539f, 9.539f, 0.0f, false, true, 7.8f, 19.324f)
                lineToRelative(-1.229f, 0.618f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, true, -2.585f, -2.563f)
                arcToRelative(11.632f, 11.632f, 0.0f, false, false, 4.357f, -2.657f)
                lineTo(6.932f, 13.277f)
                arcToRelative(9.611f, 9.611f, 0.0f, false, true, -3.974f, 2.317f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, -0.921f, -3.575f)
                lineToRelative(4.755f, -1.394f)
                arcToRelative(15.234f, 15.234f, 0.0f, false, false, 3.423f, -1.59f)
                lineToRelative(7.911f, 7.7f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 13.608f, 21.985f)
                close()
            }
        }
        .build()
        return _clean!!
    }

private var _clean: ImageVector? = null
