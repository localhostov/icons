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
                moveTo(1.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(14.0f, 5.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.5f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 15.0f)
                close()
                moveTo(2.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 5.5f)
                lineTo(12.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                close()
                moveTo(6.0f, 6.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(4.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 6.0f)
                close()
                moveTo(23.641f, 10.76f)
                lineTo(22.741f, 8.06f)
                curveTo(21.988f, 4.949f, 16.319f, 3.4f, 16.0f, 7.5f)
                lineTo(16.0f, 17.0f)
                lineTo(1.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.857f, 3.482f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 2.12f, -1.059f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 12.0f, 19.5f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineToRelative(-0.769f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 17.0f)
                lineTo(24.0f, 12.974f)
                arcTo(6.989f, 6.989f, 0.0f, false, false, 23.641f, 10.76f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(18.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(18.5f, 7.0f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, true, 2.343f, 1.688f)
                lineTo(21.613f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.5f, 7.0f)
                close()
                moveTo(3.658f, 20.992f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 19.5f)
                lineTo(2.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(0.357f)
                arcTo(1.594f, 1.594f, 0.0f, false, true, 3.658f, 20.992f)
                close()
                moveTo(10.0f, 19.5f)
                arcTo(1.535f, 1.535f, 0.0f, true, true, 7.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 19.5f)
                lineTo(18.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 21.0f)
                close()
            }
        }
        .build()
        return _truckContainer!!
    }

private var _truckContainer: ImageVector? = null
