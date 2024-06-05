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

public val Icons.Filled.HelicopterSide: ImageVector
    get() {
        if (_helicopterSide != null) {
            return _helicopterSide!!
        }
        _helicopterSide = Builder(name = "HelicopterSide", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 19.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, 4.9f, -4.0f)
                lineTo(17.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(14.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 5.0f)
                reflectiveCurveTo(0.012f, 7.18f, 0.035f, 7.264f)
                arcTo(4.019f, 4.019f, 0.0f, false, false, 2.9f, 10.583f)
                lineTo(7.0f, 11.754f)
                lineTo(7.0f, 13.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, 5.65f)
                lineTo(11.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(21.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 21.0f)
                close()
                moveTo(16.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(16.0f, 12.0f)
                lineTo(16.0f, 6.0f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, true, 7.931f, 7.0f)
                lineTo(17.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _helicopterSide!!
    }

private var _helicopterSide: ImageVector? = null
