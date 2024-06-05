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

public val Icons.Outline.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 24.0f)
                close()
                moveTo(13.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 20.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                close()
                moveTo(2.67f, 19.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.628f, -0.223f)
                arcTo(5.533f, 5.533f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcTo(8.134f, 8.134f, 0.0f, false, true, 2.113f, 6.64f)
                arcTo(7.945f, 7.945f, 0.0f, false, true, 8.5f, 0.138f)
                arcToRelative(8.049f, 8.049f, 0.0f, false, true, 8.735f, 4.438f)
                arcToRelative(1.039f, 1.039f, 0.0f, false, false, 0.743f, 0.57f)
                curveToRelative(5.824f, 1.034f, 8.092f, 8.769f, 3.718f, 12.765f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.384f, -1.443f)
                arcToRelative(5.538f, 5.538f, 0.0f, false, false, -2.725f, -9.362f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcToRelative(6.159f, 6.159f, 0.0f, false, false, 0.023f, 2.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.963f, 2.762f)
                arcTo(3.523f, 3.523f, 0.0f, false, false, 3.3f, 17.223f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.67f, 19.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 16.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
