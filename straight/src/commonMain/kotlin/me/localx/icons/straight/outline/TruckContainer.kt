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

public val Icons.Outline.TruckContainer: ImageVector
    get() {
        if (_truckContainer != null) {
            return _truckContainer!!
        }
        _truckContainer = Builder(name = "TruckContainer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(0.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(4.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(24.0f, 12.649f)
                arcToRelative(4.972f, 4.972f, 0.0f, false, false, -0.257f, -1.581f)
                lineTo(22.4f, 7.051f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.559f, 5.0f)
                lineTo(16.0f, 5.0f)
                lineTo(16.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 6.0f, 2.447f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 12.0f, 19.5f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(23.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(18.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.559f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineTo(21.612f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(3.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 19.5f)
                lineTo(2.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 21.0f)
                close()
                moveTo(10.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(21.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _truckContainer!!
    }

private var _truckContainer: ImageVector? = null
