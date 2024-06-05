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

public val Icons.Outline.ThermometerHalf: ImageVector
    get() {
        if (_thermometerHalf != null) {
            return _thermometerHalf!!
        }
        _thermometerHalf = Builder(name = "ThermometerHalf", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.184f)
                lineTo(13.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(6.184f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(17.0f, 12.111f)
                lineTo(17.0f, 5.0f)
                curveTo(16.789f, -1.609f, 7.209f, -1.6f, 7.0f, 5.0f)
                verticalLineToRelative(7.111f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 10.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, true, -3.332f, -8.719f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 12.537f)
                lineTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(7.537f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.332f, 0.744f)
                arcTo(5.018f, 5.018f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
