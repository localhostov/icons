package me.localx.icons.straight.filled

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
                moveTo(16.0f, 4.0f)
                lineTo(16.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(14.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 4.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(7.931f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 16.0f, 6.0f)
                close()
                moveTo(2.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                verticalLineToRelative(9.0f)
                lineTo(24.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(7.0f, 23.0f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 18.65f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.0f, 13.0f)
                lineTo(7.0f, 11.754f)
                lineToRelative(-7.0f, -2.0f)
                lineTo(0.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 19.0f)
                close()
            }
        }
        .build()
        return _helicopterSide!!
    }

private var _helicopterSide: ImageVector? = null
